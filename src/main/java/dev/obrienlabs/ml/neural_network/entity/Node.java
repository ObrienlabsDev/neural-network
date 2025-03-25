package dev.obrienlabs.ml.neural_network.entity;

import java.util.List;

public interface Node {
	
	long getId();

	void setId(long id);

	long getLayer();

	void setLayer(long layer);

	boolean isState();

	void setState(boolean state);

	Connection getInput();

	void setInput(Connection input);

	Connection getOutput();

	void setOutput(Connection output);

	List<Connection> getOutgoing();

	void setOutgoing(List<Connection> outgoing);
	
	List<Connection> getIncoming();
	
	void setIncoming(List<Connection> incoming);

	Node getLeft();

	void setLeft(Node left);

	Node getRight();

	void setRight(Node right);
	

}
