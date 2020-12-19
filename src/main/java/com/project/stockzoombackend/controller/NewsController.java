package com.project.stockzoombackend.controller;

import lombok.AllArgsConstructor;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
@AllArgsConstructor
public class NewsController {

    @ResponseBody
    @GetMapping("/api/news")
    public JSONObject getNews() throws NullPointerException{
        RestTemplate template = new RestTemplate();
        return (JSONObject)JSONValue.parse(template.getForObject("https://newsapi.org/v2/top-headlines?country=kr&apiKey=32fba1abc7b94ba4b20ee261901ee14d", String.class));
    }

    @ResponseBody
    @GetMapping("/api/news/{category}")
    public JSONObject getNewsParam(@PathVariable String category) throws NullPointerException{
        RestTemplate template = new RestTemplate();
        String url = "https://newsapi.org/v2/top-headlines?country=kr&apiKey=32fba1abc7b94ba4b20ee261901ee14d&category={category}";

        return (JSONObject)JSONValue.parse(template.getForObject(url, String.class, category));
    }
}
