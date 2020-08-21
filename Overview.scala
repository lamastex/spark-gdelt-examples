// Databricks notebook source
// MAGIC %md
// MAGIC # Events and Entities of Interest to OIL/GAS Trends
// MAGIC 
// MAGIC Johannes Graner, Albert Nilsson and Raazesh Sainudiin
// MAGIC 
// MAGIC 2020, Uppsala, Sweden
// MAGIC 
// MAGIC This work was inspired by Antoine Aamennd's texata-2017 repository forked here:
// MAGIC 
// MAGIC - https://github.com/lamastex/spark-texata-2020/
// MAGIC 
// MAGIC The following libraries were developed to detect events and entities (persons, organisations, etc.) in GDELT mass media intelligence metadata that may be of potential interest to trends and their reversals in oil prices.
// MAGIC 
// MAGIC - The spark-gdelt library was extended to be an exhaustive scraper of GDELT version 1 and 2 files
// MAGIC - spark-trend-calculus library was written for structured streams
// MAGIC 
// MAGIC This project was supported by Combient Mix AB through summer internships at:
// MAGIC 
// MAGIC Combient Competence Centre for Data Engineering Sciences, 
// MAGIC Department of Mathematics, 
// MAGIC Uppsala University, Uppsala, Sweden

// COMMAND ----------

