package com.udacity.gradle.builditbigger.backend;



import com.example.jokelib.Joke;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.jokeapp.karthik.com",
                ownerName = "backend.jokeapp.karthik.com",
                packagePath=""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
  /*  @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }
    */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke(){
        MyBean response = new MyBean();
        Joke joke = new Joke();
        response.setData(joke.getRandomJoke());
        return response;
    }

}
