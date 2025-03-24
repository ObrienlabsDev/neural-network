package dev.obrienlabs.ml.neural_network.service;

import java.util.List;
import java.util.stream.LongStream;

import dev.obrienlabs.ml.neural_network.entity.Connection;
import dev.obrienlabs.ml.neural_network.entity.Node;
import dev.obrienlabs.ml.neural_network.entity.NodeImpl;

public class NeuralNetworkImpl implements NeuralNetwork {

	
	
	@Override
	public void iterate() {
		
	}

	@Override
	public long init() {
		return 0;
	}
	
	@Override
	/**
	 * Create all the neurons for all layers first, then link them with connections, inputs, outputs
	 */
	public long configureFullMesh(long neurons, long layers) {
		LongStream.range(0, layers).forEach(layer ->
			LongStream.range(0, neurons).forEach(neuron -> {
				System.out.println(layer + ":" + neuron);
				// TODO: use a factory method
				Node node = new NodeImpl();
				
				
			}
			));
		return 0;
	}

	@Override
	public long train() {
		long result = 0L;
		
		return result;
	}
	@Override
	public long trainFor(long iterations) {
		long result = 0;
		LongStream.range(0, iterations).forEach(n -> train());
		return result;
	}

	@Override
	public long inference() {
		return 0;
	}
	
	
	public static void main(String[] vars) {
		NeuralNetwork nn = new NeuralNetworkImpl();
		nn.iterate();

	}

	@Override
	public List<Node> getNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNodes(List<Node> nodes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node getNode(long neuron, long layer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addNode(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node removeNode(Node node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node removeNodeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addConnectionFromTo(Node from, Node to) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Connection removeConnectionFromTo(Node from, Node to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getConnectionFromTo(Node from, Node to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Connection> getConnectionsFrom(Node from) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Connection> getConnectionsTo(Node to) {
		// TODO Auto-generated method stub
		return null;
	}

}
