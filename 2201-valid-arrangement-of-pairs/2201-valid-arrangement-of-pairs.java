import java.util.*;

class Solution {
    public int[][] validArrangement(int[][] pairs) {
        // Step 1: Build the graph and track in-degrees and out-degrees
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> outDegree = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();

        for (int[] pair : pairs) {
            int start = pair[0], end = pair[1];
            graph.computeIfAbsent(start, k -> new ArrayList<>()).add(end);
            outDegree.put(start, outDegree.getOrDefault(start, 0) + 1);
            inDegree.put(end, inDegree.getOrDefault(end, 0) + 1);
        }

        // Step 2: Find the starting vertex
        int startVertex = pairs[0][0]; // Default to the first pair's start
        for (int node : graph.keySet()) {
            if (outDegree.getOrDefault(node, 0) > inDegree.getOrDefault(node, 0)) {
                startVertex = node;
                break;
            }
        }

        // Step 3: Perform Hierholzer's algorithm to find Eulerian path
        Stack<Integer> stack = new Stack<>();
        List<int[]> result = new ArrayList<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int current = stack.peek();
            if (graph.containsKey(current) && !graph.get(current).isEmpty()) {
                stack.push(graph.get(current).remove(graph.get(current).size() - 1));
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    result.add(new int[]{stack.peek(), current});
                }
            }
        }

        // Step 4: Convert result to array
        Collections.reverse(result);
        return result.toArray(new int[result.size()][]);
    }
}
