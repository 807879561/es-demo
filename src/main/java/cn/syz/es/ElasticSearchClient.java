package cn.syz.es;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author shiyizhen
 * @date 2017/11/17
 * \
 */
public class ElasticSearchClient {
    private static TransportClient transportClient=null;

    public static TransportClient getClient(){
        if(transportClient==null){
            Settings settings = Settings.builder().put("cluster.name", "my-application")
                    .build();
            transportClient = new PreBuiltTransportClient(settings);
            try {
                transportClient.addTransportAddresses(new InetSocketTransportAddress(InetAddress.getByName("121.196.222.214"),
                        9300));
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        return transportClient;
    }
}
