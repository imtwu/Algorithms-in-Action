package me.imtt.graph.weighted;

/**
 * 带权图的边
 */
public class Edge<Weight extends Number & Comparable> implements Comparable<Edge> {
    /**
     * 边的两个端点
     */
    private int a, b; 

    /**
     * 边的权值
     */
    private Weight weight;  

    public Edge(int a, int b, Weight weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }

    public Edge(Edge<Weight> e) {
        this.a = e.a;
        this.b = e.b;
        this.weight = e.weight;
    }

    /**
     * 返回第一个顶点
     */
    public int getV() {
        return a;
    }

    /**
     * 返回第二个顶点
     */
    public int getW() {
        return b;
    }

    /**
     * 返回权值
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * 给定一个顶点, 返回另一个顶点
     */
    public int other(int x) {
        assert x == a || x == b;
        return x == a ? b : a;
    }

    @Override
    public String toString() {
        return "" + a + "-" + b + ": " + weight;
    }

    @Override
    public int compareTo(Edge o) {
        if (weight.compareTo(o.getWeight()) < 0) {
            return -1;
        } else if (weight.compareTo(o.getWeight()) > 0) {
            return +1;
        } else {
            return 0;
        }
    }
}
