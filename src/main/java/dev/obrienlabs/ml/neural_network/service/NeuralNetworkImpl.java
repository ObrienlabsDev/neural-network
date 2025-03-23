package dev.obrienlabs.ml.neural_network.service;

import java.util.stream.LongStream;

public class NeuralNetworkImpl implements NeuralNetwork {

	
	
	@Override
	public void iterate() {
		
	}

	@Override
	public long init() {
		return 0;
	}
	
	@Override
	public long configureFullMesh(long neurons, long layers) {
		LongStream.range(0, neurons).forEach(n -> System.out.println(n));
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

}
