package com.ds.Graph;

import java.util.*;

public class Graph {
	
	private HashMap<String, ArrayList<String>> adjList=new HashMap();

	//print
	public void printGraph() {
		System.out.println(adjList);
	}
	
	//add Vertex
	public boolean addVertex(String ver) {
		if(adjList.get(ver)==null) {
		adjList.put(ver, new ArrayList<String>());
		return true;
		}
		return false;
	}

	//add connections
	public boolean addEdge(String v1,String v2) {
		if(adjList.get(v1)!=null && adjList.get(v2)!=null) {
			adjList.get(v1).add(v2);
			adjList.get(v2).add(v1);
			return true;
		}
		return false;
	}
	
	//remove connections
	public boolean removeEdge(String v1,String v2) {
		if(adjList.get(v1)!=null && adjList.get(v2)!=null) {
			adjList.get(v1).remove(v2);
			adjList.get(v2).remove(v1);
			return true;
		}
		return false;
	}
	
	//remove vertex
	public boolean removeVertex(String v) {
		if(adjList.containsKey(v)) {
		if(adjList.get(v)!=null) {
			for(String other:adjList.get(v)) {
				adjList.get(other).remove(v);
			}
		}
		adjList.remove(v);
		return true;
		}
		return false;
	}

}
