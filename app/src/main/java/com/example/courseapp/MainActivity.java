package com.example.courseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void front(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("message","FRONTEND WEB DEVELOPMENT");
        intent.putExtra("img", "front");
        intent.putExtra("info", "Front-end web development is the practice of converting data to a graphical interface, through the use of HTML, CSS, and JavaScript, so that users can view and interact with that data.It involves platforms like:\n\nThe HyperText Markup Language, or HTML is the standard markup language for documents designed to be displayed in a web browser.\n\nCascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language such as HTML.[1] CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScrip.\n\nJavaScript (/ˈdʒɑːvəˌskrɪpt/),[8] often abbreviated as JS, is a programming language that conforms to the ECMAScript specification.[9] JavaScript is high-level, often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions\n\nResponsive web design (RWD) is an approach to web design that makes web pages render well on a variety of devices and window or screen sizes from minimum to maximum display size. Recent work also considers the viewer proximity as part of the viewing context as an extension for RWD.[1] Content, design and performance are necessary across all devices to ensure usability and satisfaction.\n\n");

        startActivity(intent);
    }

    public void app(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("message","MOBILE APP DEVELOPMENT");
        intent.putExtra("img", "mobileapp");
        intent.putExtra("info", "Mobile app development is the act or process by which a mobile app is developed for mobile devices, such as personal digital assistants, enterprise digital assistants or mobile phones. These applications can be pre-installed on phones during manufacturing platforms, or delivered as web applications using server-side or client-side processing (e.g., JavaScript) to provide an \"application-like\" experience within a Web browser. Application software developers also must consider a long array of screen sizes, hardware specifications, and configurations because of intense competition in mobile software and changes within each of the platforms. Mobile app development has been steadily growing, in revenues and jobs created. A 2013 analyst report estimates there are 529,000 direct app economy jobs within the EU then 28 members (including the UK), 60 percent of which are mobile app developers\n\n\nIt involves platforms like:\n\nAndroid is an open source and Linux-based operating system for mobile devices such as smartphones and tablet computers. Android was developed by the Open Handset Alliance, led by Google, and other companies. This tutorial will teach you basic Android programming and will also take you through some advance concepts related to Android application development.\n\nAdaptive apps - an app designed to run on different device types, such as mobile and desktop, requires dealing with mouse and keyboard input, as well as touch input. It also means there are different expectations about the app’s visual density, how component selection works (cascading menus vs bottom sheets, for example), using platform-specific features (such as top-level windows), and more.\n\nCross-platform apps with flutter - In computing, cross-platform software (also multi-platform software or platform-independent software) is computer software that is implemented on multiple computing platforms.[1] Cross-platform software may be divided into two types; one requires individual building or compilation for each platform that it supports, and the other one can be directly run on any platform without special preparation, e.g., software written in an interpreted language or pre-compiled portable bytecode for which the interpreters or run-time packages are common or standard components of all platforms.\n\n");

        startActivity(intent);
    }

    public void data(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("message","DATA SCIENCE");
        intent.putExtra("img", "datascience");
        intent.putExtra("info", "Data science is an interdisciplinary field that uses scientific methods, processes, algorithms and systems to extract knowledge and insights from structured and unstructured data,[1][2] and apply knowledge and actionable insights from data across a broad range of application domains. Data science is related to data mining, machine learning and big data.\n\nIt involves :\n\nexploratory data analysis is an approach of analyzing data sets to summarize their main characteristics, often using statistical graphics and other data visualization methods. A statistical model can be used or not, but primarily EDA is for seeing what the data can tell us beyond the formal modeling or hypothesis testing task. Exploratory data analysis was promoted by John Tukey to encourage statisticians to explore the data, and possibly formulate hypotheses that could lead to new data collection and experiments. EDA is different from initial data analysis (IDA),[1] which focuses more narrowly on checking assumptions required for model fitting and hypothesis testing, and handling missing values and making transformations of variables as needed. EDA encompasses IDA.\n\nR is a programming language and free software environment for statistical computing and graphics supported by the R Foundation for Statistical Computing.[6] The R language is widely used among statisticians and data miners for developing statistical software[7] and data analysis.[8] Polls, data mining surveys, and studies of scholarly literature databases show substantial increases in popularity;[9] as of April 2021, R ranks 13th in the TIOBE index, a measure of popularity of programming languages\n\nStatistical inference is the process of using data analysis to infer properties of an underlying distribution of probability.[1] Inferential statistical analysis infers properties of a population, for example by testing hypotheses and deriving estimates. It is assumed that the observed data set is sampled from a larger population.\n\nMachine learning (ML) is the study of computer algorithms that improve automatically through experience and by the use of data.[1] It is seen as a part of artificial intelligence. Machine learning algorithms build a model based on sample data, known as \"training data\", in order to make predictions or decisions without being explicitly programmed to do so.[2] Machine learning algorithms are used in a wide variety of applications, such as in medicine, email filtering, and computer vision, where it is difficult or unfeasible to develop conventional algorithms to perform the needed tasks.");

        startActivity(intent);
    }
}