package dev.obrienlabs.ml.neural_network.service;

public class NeuralNetworkImplTest {

	public void testIteration1() {
		NeuralNetwork nn = new NeuralNetworkImpl();
		nn.init();
		nn.configureFullMesh(3, 3);
		nn.trainFor(10L);
		
	}
	
	public static void main(String[] args) {
		NeuralNetworkImplTest nn = new NeuralNetworkImplTest();
		nn.testIteration1();
	}

}
