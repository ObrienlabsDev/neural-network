package dev.obrienlabs.ml.neural_network.entity;

public class ConnectionImpl {

	private long id;
	private double weight;
	private double bias;
	private Node source;
	private Node target;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBias() {
		return bias;
	}
	public void setBias(double bias) {
		this.bias = bias;
	}
	public Node getSource() {
		return source;
	}
	public void setSource(Node source) {
		this.source = source;
	}
	public Node getTarget() {
		return target;
	}
	public void setTarget(Node target) {
		this.target = target;
	}
	
	
}
