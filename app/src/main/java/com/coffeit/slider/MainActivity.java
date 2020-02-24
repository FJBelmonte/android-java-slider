package com.coffeit.slider;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new SimpleSlide.Builder()
                .title("Título 1")
                .description("Descrição 1")
                .image(R.drawable.um)
                .background(android.R.color.holo_orange_light)
                .scrollable(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Título 2")
                .description("Descrição 2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .scrollable(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Título 3")
                .description("Descrição 3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .scrollable(false)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Título 4")
                .description("Descrição 4")
                .image(R.drawable.quatro)
                .background(android.R.color.holo_orange_light)
                .scrollable(false)
                .build());
    }
}
