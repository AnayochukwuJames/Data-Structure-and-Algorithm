package org.example;

import java.util.*;

public class RogueAgentTracker {
    public List<String> findCompleteRoute(String[][] routes) {
        Map<String, List<String>> graph = new HashMap<>();
        
        // Build the graph using the given itineraries
        for (String[] route : routes) {
            String source = route[0];
            String destination = route[1];
            
            if (!graph.containsKey(source)) {
                graph.put(source, new ArrayList<>());
            }
            graph.get(source).add(destination);
        }
        
        List<String> completeRoute = new ArrayList<>();
        dfs("start", graph, completeRoute);
        return completeRoute;
    }
    
    private void dfs(String node, Map<String, List<String>> graph, List<String> completeRoute) {
        if (!graph.containsKey(node)) {
            return;
        }
        
        List<String> destinations = graph.get(node);
        while (!destinations.isEmpty()) {
            String nextDestination = destinations.remove(0);
            dfs(nextDestination, graph, completeRoute);
        }
        
        completeRoute.add(0, node); // Add the current node to the beginning of the route
    }
    
    public static void main(String[] args) {
        RogueAgentTracker tracker = new RogueAgentTracker();
        
        String[][] routes = {
            {"A", "B"},
            {"C", "D"},
            {"B", "C"},
            {"D", "E"}
        };
        
        List<String> completeRoute = tracker.findCompleteRoute(routes);
        System.out.println("Complete Route: " + completeRoute);
    }
}
