package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class TvSeriesController {

    private static List<String> tvSeries = new ArrayList<>();

    static {
        tvSeries.add("Game of Thrones");
        tvSeries.add("Friends");
        tvSeries.add("The Big Bang Theory");
        tvSeries.add("Suits");
        tvSeries.add("The Mentalist");
        tvSeries.add("House of Cards");
        tvSeries.add("House MD");
    }

    @RequestMapping("/allTvSeries")
    public String allTvSeries(ModelMap model) {
        model.put("seriesList", tvSeries);
        return "tvseries" ;
    }

    @RequestMapping("/bestSeries")
    public @ResponseBody String bestTvSeries() {
        System.out.println("TvSeriesController.bestTvSeries");
        return randomTvSeries();
    }

    private String randomTvSeries() {
        Random rnd = new Random();
        return tvSeries.get(rnd.nextInt(tvSeries.size()));
    }

}
