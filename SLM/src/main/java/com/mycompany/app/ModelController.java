package com.mycompany.app;

import ai.djl.Application;
import ai.djl.ModelException;
import ai.djl.inference.Predictor;
import ai.djl.repository.zoo.Criteria;
import ai.djl.repository.zoo.ZooModel;
import ai.djl.training.util.ProgressBar;
import ai.djl.translate.TranslateException;

import java.io.IOException;

public class ModelController {

    private ZooModel<String, String> model;
    private Predictor<String, String> predictor;

    public ModelController() {
        System.out.println("[ModelController] Initializing... This may take a moment.");
        try {
            // 1. Define the criteria to find the model
            Criteria<String, String> criteria = Criteria.builder()
                    .optApplication(Application.NLP.TEXT_GENERATION) // We want a text generation model
                    .setTypes(String.class, String.class)           // It takes a String in and gives a String out
                    .optFilter("backbone", "distilgpt2")            // We'll use the small "distilgpt2" model
                    .optProgress(new ProgressBar())                 // Show a download progress bar in the console
                    .build();

            // 2. Load the model from the Hugging Face hub
            this.model = criteria.loadModel();

            // 3. Create a predictor to run inference
            this.predictor = model.newPredictor();

            System.out.println("[ModelController] Model loaded successfully!");

        } catch (ModelException | IOException e) {
            e.printStackTrace();
            System.err.println("Failed to load the AI model. Exiting.");
            System.exit(1); // Exit if the model can't be loaded
        }
    }

    public String generateResponse(String prompt) {
        try {
            // 4. Use the predictor to generate text
            // We're just running a simple generation here.
            // For a true Q&A, fine-tuning is needed, but this proves the model works.
            return predictor.predict(prompt);
        } catch (TranslateException e) {
            e.printStackTrace();
            return "Error: Could not generate a response.";
        }
    }

    // A method to close the model resources when the app exits
    public void close() {
        if (predictor != null) {
            predictor.close();
        }
        if (model != null) {
            model.close();
        }
        System.out.println("[ModelController] Model resources closed.");
    }
}