package co.empathy.academy.project.controller;

import co.empathy.academy.project.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @Value("${elasticsearch.cluster-name}")
    private String clusterName;

    @GetMapping("/search")
    public HashMap<String, String> search(@RequestParam String query) {
        HashMap<String, String> response = new HashMap<>();
        response.put("query", query);
        response.put("clusterName", searchService.getClusterName());
        return response;
    }
}