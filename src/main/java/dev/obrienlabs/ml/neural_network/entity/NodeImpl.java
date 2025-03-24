package dev.obrienlabs.ml.neural_network.entity;

import java.util.List;

public class NodeImpl implements Node {
	private long id;
	private long layer;
	private boolean state;
	private Connection input;
	private Connection output;
	private List<Connection> outgoing;
	private List<Connection> incoming;
	private Node left;
	private Node right;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getLayer() {
		return layer;
	}
	public void setLayer(long layer) {
		this.layer = layer;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public Connection getInput() {
		return input;
	}
	public void setInput(Connection input) {
		this.input = input;
	}
	public Connection getOutput() {
		return output;
	}
	public void setOutput(Connection output) {
		this.output = output;
	}
	public List<Connection> getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(List<Connection> outgoing) {
		this.outgoing = outgoing;
	}
	public List<Connection> getIncoming() {
		return incoming;
	}
	public void setIncoming(List<Connection> incoming) {
		this.incoming = incoming;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	

}
