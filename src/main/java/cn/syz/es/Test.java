package cn.syz.es;

import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentType;

/**
 * @author shiyizhen
 * @date 2017/11/17
 */
public class Test {
    public static void main(String[] args) {
        TransportClient client=ElasticSearchClient.getClient();
//        IndexRequestBuilder indexRequestBuilder = client.prepareIndex("website","blog").setSource("{\"title\":\"My second blog entry\",\"text\":\"Just trying this out...\",\"date\":\"2017/11/17\"}", XContentType.JSON);
//        System.out.println(indexRequestBuilder.execute().actionGet());
    }
}
