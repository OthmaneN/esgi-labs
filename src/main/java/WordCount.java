import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WordCount {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: WordCount <datasetLocation> <outputLocation>");
            System.exit(1);
        }

        SparkConf sparkConf = new SparkConf().setAppName("WordCount").setMaster("local[*]");

        SparkContext sc = SparkContext.getOrCreate(sparkConf);

        //Write your code here
        JavaRDD<String> textLines = sc.textFile(args[0], 10).toJavaRDD();
    }
}
