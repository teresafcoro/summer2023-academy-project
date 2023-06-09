package co.empathy.academy.project.service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.cluster.ClusterStatsRequest;
import co.elastic.clients.elasticsearch.cluster.ClusterStatsResponse;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    private ElasticsearchClient esClient;

    public String getClusterName() {
        // TO-DO
        // ClusterStatsResponse response = esClient.cluster().state();
        // response.clusterName()
        return "";
    }

}
