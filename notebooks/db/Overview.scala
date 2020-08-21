// Databricks notebook source
// MAGIC %md
// MAGIC # Spark GDELT Examples
// MAGIC ## Detecting Events and Entities of Interest to OIL/GAS Price Trends
// MAGIC 
// MAGIC Johannes Graner, Albert Nilsson and Raazesh Sainudiin
// MAGIC 
// MAGIC 2020, Uppsala, Sweden
// MAGIC 
// MAGIC 
// MAGIC This project was supported by Combient Mix AB through summer internships at:
// MAGIC 
// MAGIC Combient Competence Centre for Data Engineering Sciences, 
// MAGIC Department of Mathematics, 
// MAGIC Uppsala University, Uppsala, Sweden
// MAGIC 
// MAGIC See Example notebooks to detect events and persons or entities of interest
// MAGIC 
// MAGIC - [notebooks/db/gdelt-EOI-detection](notebooks/db/gdelt-EOI-detection.md)
// MAGIC - [notebooks/db/gdelt-POI-detection](notebooks/db/gdelt-POI-detection.md)
// MAGIC 
// MAGIC # Resources
// MAGIC 
// MAGIC This builds on the following libraries and its antecedents therein:
// MAGIC 
// MAGIC - [https://github.com/aamend/spark-gdelt](https://github.com/aamend/spark-gdelt) 
// MAGIC - [https://github.com/lamastex/spark-trend-calculus](https://github.com/lamastex/spark-trend-calculus)
// MAGIC 
// MAGIC 
// MAGIC ## This work was inspired by:
// MAGIC 
// MAGIC - Antoine Aamennd's [texata-2017](https://github.com/aamend/texata-r2-2017)
// MAGIC - Andrew Morgan's [Trend Calculus Library](https://github.com/ByteSumoLtd/TrendCalculus-lua)

// COMMAND ----------

//