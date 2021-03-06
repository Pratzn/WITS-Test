package com.wwglobal.wits.test.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.IQueue;

public class Second {

	public static void main(String[] args) {
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("127.0.0.1:5701");
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		IMap map = client.getMap("customers");
		System.out.println("Map Size:" + map.size());
		System.out.println();
		IQueue<String> queueCustomers = client.getQueue("customers");
		System.out.println("Queue Size:" + queueCustomers.size());
	}
}
