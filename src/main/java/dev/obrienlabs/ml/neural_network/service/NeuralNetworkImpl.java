package dev.obrienlabs.ml.neural_network.service;

public class NeuralNetworkImpl implements NeuralNetwork {

	
	@Override
	public void iterate() {
		
	}

	@Override
	public int init() {
		return 0;
	}

	@Override
	public int train() {
		return 0;
	}

	@Override
	public int inference() {
		return 0;
	}
	
	
	public static void main(String[] vars) {
		NeuralNetwork nn = new NeuralNetworkImpl();
		nn.iterate();

	}
}
