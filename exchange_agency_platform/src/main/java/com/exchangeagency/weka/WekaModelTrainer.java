package com.exchangeagency.weka;

import weka.classifiers.Classifier;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class WekaModelTrainer {
    public static void main(String[] args) throws Exception {
        // Load dataset
        DataSource source = new DataSource("src/main/resources/items.arff");
        Instances dataset = source.getDataSet();
        
        // Set class index
        dataset.setClassIndex(dataset.numAttributes() - 1);

        // Train classifier
        Classifier classifier = new J48();
        classifier.buildClassifier(dataset);

        // Save model
        weka.core.SerializationHelper.write("src/main/resources/weka_model.model", classifier);
    }
}

