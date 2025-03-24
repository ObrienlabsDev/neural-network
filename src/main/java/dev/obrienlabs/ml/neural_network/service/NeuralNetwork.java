package dev.obrienlabs.ml.neural_network.service;

import java.util.List;

import dev.obrienlabs.ml.neural_network.entity.Node;
import dev.obrienlabs.ml.neural_network.entity.Connection;

public interface NeuralNetwork {
		
	List<Node> getNodes();
	void setNodes(List<Node> nodes);
	Node getNode(long neuron, long layer);
	void addNode(Node node);
	Node removeNode(Node node);
	Node removeNodeById(long id);
	void addConnectionFromTo(Node from, Node to);
	Connection removeConnectionFromTo(Node from, Node to);
	Connection getConnectionFromTo(Node from, Node to);
	List<Connection> getConnectionsFrom(Node from);
	List<Connection> getConnectionsTo(Node to);
	
	
	long init();
	long configureFullMesh(long neurons, long layers);
	long train();
	long trainFor(long iterations);
	long inference();
	void iterate();
	


}
