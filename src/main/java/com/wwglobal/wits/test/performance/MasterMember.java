package com.wwglobal.wits.test.performance;

import java.util.Iterator;
import java.util.Set;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;
import com.hazelcast.core.Member;

public class MasterMember {
	public static void main( String[] args ) throws Exception {
	    HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();
	    HazelcastInstance hazelcastInstance2 = Hazelcast.newHazelcastInstance();
	    HazelcastInstance hazelcastInstance3 = Hazelcast.newHazelcastInstance();
	    HazelcastInstance hazelcastInstance4 = Hazelcast.newHazelcastInstance();
//	    HazelcastInstance hazelcastInstance5 = Hazelcast.newHazelcastInstance();
	    IExecutorService executor = hazelcastInstance.getExecutorService( "executor" );
	    Set<Member> members = hazelcastInstance.getCluster().getMembers();
	    
	   // Iterator<E> 
	    Iterator<Member> iter = members.iterator();
	    while(iter.hasNext()){
	    	Member member = iter.next();
	    	//executor.ex
	    }
	    long t = System.currentTimeMillis();
	    for ( int k = 1; k <= 100; k++ ) {
	     // Thread.sleep( 1000 );
	      System.out.println( "Producing echo task: " + k );
	      executor.execute( new EchoTask( String.valueOf( k ) ) );
	    }
	    System.out.println(System.currentTimeMillis()-t);
	    System.out.println( "EchoTaskMain finished!" );
	    
	    
	   /* executor = new Executorser
	    t = System.currentTimeMillis();
	    for ( int k = 1; k <= 1000; k++ ) {
	     // Thread.sleep( 1000 );
	      System.out.println( "Producing echo task: " + k );
	      executor.execute( new EchoTask( String.valueOf( k ) ) );
	    }
	    */
	    
	  }
}
