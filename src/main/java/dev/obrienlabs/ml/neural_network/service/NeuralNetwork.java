package dev.obrienlabs.ml.neural_network.service;

public interface NeuralNetwork {
	
	long init();
	long configureFullMesh(long neurons, long layers);
	long train();
	long trainFor(long iterations);
	long inference();
	void iterate();
	


}
