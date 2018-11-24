package com.udacity.gradle.builditbigger;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class Frag{

    public View getFrag(LayoutInflater inflater, ViewGroup container
                        ) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        return root;
    }
}
