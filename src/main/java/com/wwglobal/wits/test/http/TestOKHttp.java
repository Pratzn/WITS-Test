package com.wwglobal.wits.test.http;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestOKHttp {

	OkHttpClient client = new OkHttpClient();
/*
	  String run(String url) throws IOException {
	    Request request = new Request.Builder()
	        .url(url)
	        .build();

	    try (Response response = client.newCall(request).execute()) {
	      return response.body().string();
	    }
	  }

	  public static void main(String[] args) throws IOException {
		  TestOKHttp example = new TestOKHttp();
	    String response = example.run("https://google.co.th");
	    System.out.println(response);
	  }
*/
}
