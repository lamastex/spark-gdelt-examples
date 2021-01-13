# Raaz's Minimal GDELT documents

This is a set of minimal docs one needs to digest in order to make sense of GDELT mass media print datasets.

This doc set does not contain the information about other data sets in the GDELT project, including those for TV mass media data, among others.

You should read each PDF in this folder very carefully first!

```
$ ls gdelt-docs/
GDELT-Event-1_CAMEO.Manual.1.1b3.pdf       GDELT-Event-1_Data_Format_Codebook.pdf  GDELT-GKG-1_Global_Knowledge_Graph_Codebook.pdf       README.md
GDELT-Event-1_CSV.header.dailyupdates.txt  GDELT-Event-1_ISA.2013.GDELT.pdf        GDELT-GKG-2_Global_GCAM-MASTER-CODEBOOK.TXT
GDELT-Event-1_CSV.header.historical.txt    GDELT-Event-2_Codebook-V2.0.pdf         GDELT-GKG-2_Global_Knowledge_Graph_Codebook-V2.1.pdf
```

The following is just some minimal notes and reminders for Raaz.

# Version 2 Datasets (v2)

## v2. GKG: GDELT 1.0 GKG - Description

See: [http://data.gdeltproject.org/gkg/index.html](http://data.gdeltproject.org/gkg/index.html)

NOTES from `GDELT-Global_Knowledge_Graph_Codebook.pdf` in this directory (READ it!).

1. "when using the GKG Graph file there is no need to separately
download the Count File for the same day"

```
masterfilelist:
	http://data.gdeltproject.org/gkg/md5sums

039701f6f6ae7f6afc8d414459d52084  20130401.gkgcounts.csv.zip
c8e40ee1b801408cbc52fa382539c46e  20130401.gkg.csv.zip
ee8a6a72ea0658c219bff32ee08e8418  20130402.gkgcounts.csv.zip
524e0fb0a19788698c0f48175424a793  20130402.gkg.csv.zip
4b7c3cfe84ee128cbced6d178c324f18  20130403.gkgcounts.csv.zip
...
4ffccbf6ebe1aec096a85c0fa485b78a  20200323.gkgcounts.csv.zip
609688c91061715f7cf86b94f90d976e  20200323.gkg.csv.zip
6c10835b5c79deea44a72baf1ff77918  20200324.gkgcounts.csv.zip
f75c9fea1ef60b68a6968eea23647c2e  20200324.gkg.csv.zip
```

## v2. GKG: GDELT 1.0 GKG - Description

The GDELT 1.0 Global Knowledge Graph begins April 1, 2013 and consists of two parallel data streams, one encoding the entire knowledge graph with all of its fields, and the other encoding only the subset of the graph that records "counts" of a set of predefined categories like number of protesters, number killed, or number displaced or sickened. Such counts may occur independently of the CAMEO events in the primary GDELT event stream, such as mentions of those killed in industrial accidents (which are not captured in CAMEO) or those displaced by a natural disaster or sickened by a disease epidemic. In this way, the GKG Counts File can be used to produce a daily "Death Tracker" to map all mentions of death across the world each day, or an "Affected Tracker" to indicate how many persons were sickened/displaced/stranded each day (at least as recorded in the global news media). These files are named as "YYYYMMDD.gkg.csv.zip" and posted by 6AM EST each morning seven days a week.

The second file is the full graph file, which contains the actual graph connecting all persons, organizations, locations, emotions, themes, counts, events, and sources together each day. It also contains a list of the EventIDs of each event found in the same article as the extracted information, allowing rich contextualization of events. These files are named as "YYYYMMDD.gkgcounts.csv.zip" and posted by 6AM EST each morning seven days a week.

The Global Knowledge Graph is currently in "alpha" release and may change over time as we introduce new capabilities and expand its underlying algorithms. 

# Version 1 Datasets (v1)

## v1. EVENTS: GDELT 1.0 Events - "All GDELT Event Files"

See [http://data.gdeltproject.org/events/index.html](http://data.gdeltproject.org/events/index.html).

NOTES:

```
normalisation files for number of events:
	http://data.gdeltproject.org/normfiles/daily.csv
	http://data.gdeltproject.org/normfiles/daily_country.csv
	http://data.gdeltproject.org/normfiles/monthly.csv
	http://data.gdeltproject.org/normfiles/monthly_country.csv
	http://data.gdeltproject.org/normfiles/yearly.csv
	http://data.gdeltproject.org/normfiles/yearly_country.csv

masterfilelist: 
	http://data.gdeltproject.org/events/md5sums

example wget:
	http://data.gdeltproject.org/events/20200324.export.CSV.zip

f6fcb7e955e35f93c9dae427c07b545d  GDELT.MASTERREDUCEDV2.1979-2013.zip
7fb1b6ff781aea3d441abf512dc5e0f9  1979.zip
6b4341632bcc8cff1a582c48dac1b6d2  1980.zip
28254bf0ca546d16433b65002b524758  1981.zip
02ccf568a1e94d38423dcd7781f8d216  1982.zip
d639d1f7a316eba8836a68e944cd925d  1983.zip
5b51d6f9286081df185b197119336308  1984.zip
40de0d382fd2f763aefa18d1826aed91  1985.zip
907afa74da5b934049d5a92f446cdb74  1986.zip
958d9c8b07a75aa9230e30b6e40ef452  1987.zip
65feb1e6f0dc9f0b55bedabb1b67fa55  1988.zip
2b2130a07b5f612c3d05c69c8924f37c  1989.zip
9abac8bb156db824eddd34dd36857458  1990.zip
55a82c8bde1c87a43e0c69bb292f8e2f  1991.zip
114e5d725a8c66f040f5f21c4f510167  1992.zip
4eca0f999cb79a852e23aec88fead887  1993.zip
d1f5e4ecb49d2dee25aca8da88e017f8  1994.zip
2338538374b29cea5d7c1475b54febdf  1995.zip
0d721a82f2679b60175dd2acdfc0bf44  1996.zip
8c96a2452529111e9db6e09ba5c16ee1  1997.zip
db9d132fcb9249d7ad4f348df4ed5521  1998.zip
4e14684e8e71e349f5efb50040b338fd  1999.zip
48fde26009b5242885eee7d0064ed342  2000.zip
3c8fd163dd23e460f4e2a7e3504ee2d0  2001.zip
84ad8ba787878f012b5f070ba30ab60c  2002.zip
0d2f3e0b66cef2e622097ab9933f9cd1  2003.zip
f84d8ae8c9e07c11c9b7df0fd8ffeeec  2004.zip
412cb83d1ed2b445eb9797dd6732e060  2005.zip
c3cfe271c7f51eb8b6f8c2ad3ee6c0b0  200601.zip
4284850cddf5405e2c94f0397b205929  200602.zip
84be3c205b8eb21114d6aa7b082f4713  200603.zip
ddae8c6567dbf126f7ef1de44670a897  200604.zip
b8cf5e428c262d68358d4c71a2632274  200605.zip
2efe977b7df61f989e98d6f81ad35309  200606.zip
d093f90111d6dbebdaa42b226be310be  200607.zip
...
d7d6a6071739445cc77ce081a4206f09  20200319.export.CSV.zip
1ff96ba63d1dc3bc715fd84ea09d7062  20200320.export.CSV.zip
02a3b61826f2719966ae3dc23a1bd716  20200321.export.CSV.zip
9a30790ad01663bc07a0f0207715dc0f  20200322.export.CSV.zip
f2a137fd8dc3ac26868ec9543372cd14  20200323.export.CSV.zip
5cab38b5595365007f1e509fbaf7ecf8  20200324.export.CSV.zip
```

## v1. EVENTS: GDELT 1.0 Events - Description

**GDELT 1.0 Event Database**

The GDELT 1.0 Event Database contains over a quarter-billion records organized into a set of tab-delimited files by date. Through March 31, 2013 records are stored in monthly and yearly files by the date the event took place. Beginning with April 1, 2013, files are created daily and records are stored by the date the event was found in the world's news media rather than the date it occurred (97%+ of events are reported within 24 hours of happening, but a small number of events each day are past events being mentioned for the first time - if an event has been seen before it will not be included again). Files are ZIP compressed in tab delimited format, but named with a ".CSV" extension to address some software packages that will not accept .TXT or .TSV files.

Each morning, seven days a week, the latest daily update is posted by 6AM EST. This file is named with the previous day's date in the format "YYYYMMDD.export.CSV.zip" (ie the morning of May 24, 2013 a new file called "20130523.export.CSV.zip" is added). UNIX or Linux users can easily set up a cronjob or other automatic scheduling processes to automatically download the latest daily update each morning and process it for watchboarding, forecasting, early warning, alert services, and other applications.

There is also a special GDELT 1.0 "reduced" event dataset (1.1GB) that uses the "one a day" country-level filtering commonly used in older academic event databases. This version of the data will most closely match the aggregation level users with previous event analysis experience are familiar with and collapses the database on "DATE+ACTOR1+ACTOR2+EVENTCODE" (ie every protest held anywhere in Russia on a given day is collapsed to a single entry). This version is recommended only for those needing compatibility with analyses based on previous generations of academic event databases and covers the period January 1, 1979 to February 17, 2014. It is not updated.
