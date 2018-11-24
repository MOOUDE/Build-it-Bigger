package androidTest;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;
import android.util.Pair;

import com.example.jokelib.Joke;
import com.udacity.gradle.builditbigger.DataColletor;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getTargetContext;

public class AppTest extends TestCase {

    public final String TAG = ".AppTest";
    private Context context;

    public AppTest(){

    }


    @Before
    public void setup(){
        context = getTargetContext();
        MultiDex.install(getTargetContext());

    }


    @Test
    public void testApp(){

    Joke joke = new Joke();

    String data = null;
    DataColletor coolecter = new DataColletor();

    coolecter.execute(new Pair<Context, String>(context, joke.getRandomJoke()));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            data = coolecter.get();
            if (data != null) {
                if (data.equals("Connection refused")) {
                    Log.d(TAG, "No DATA FOUND ");
                } else {
                    Log.d(TAG, "DATA FOUND " + data);
                }
            }else{
                Log.d(TAG, "Null DATA ");
            }

        }catch(Exception e){
                Log.d(TAG, "No DATA FOUND ");

                e.printStackTrace();
            }
        assertNotNull(data);


    }
}
