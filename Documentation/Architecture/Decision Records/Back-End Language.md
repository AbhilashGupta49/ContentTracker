## Summary

### Issue

I want to pick out back-end language and framework for the project.

### Decision

Use **Java with SpringBoot** for developing the back-end of the project.

### Status

ADOPTED

## Details

### Assumptions

1. I want to use a framework that I am familiar with to regain back-end development knowledge.

### Constraints
-

### Positions

As I am starting on a new project, I would need a back-end application to serve data to the UI screens.

I started with revisiting 3 languages - **Java with SpringBoot**, **TS with Node.js** and **Python with FastAPI**.

Java with SpringBoot is the one that I am most familiar with as I was using it for a project relatively recently (`Java 17 with SpringBoot 3`) but have not used the newer features.
Using Java is relatively simple once the initial setup is done using `jenv`.

Using TS on top of Node.js with Express.js as the back-end application is one of the simplest things to set up. Although I have never used Node.js for a huge monolith application,
I felt it was more performant and had a smaller memory footprint when I used it for building microservices, when compared to Java with SpringBoot.

Having used Python with FastAPI recently, I must admit that I have never been fond of using Python for anything other than as a scripting language. Python project is easy to set up with `pipenv`.
FastAPI has also been easy to use as per my limited experience with it.

### Arguments

1. I will be using Java with SpringBoot to gain knowledge about the newer versions of both Java and SpringBoot. Selection is based on nothing other than personal preference.

### Implications
There should not be any significant learning curve for me to start using Java with SpringBoot because of familiarity. Once I start using it, changing to another language and framework will 
be very difficult.

## Notes
1. Tutorial for SpringBoot - https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html
