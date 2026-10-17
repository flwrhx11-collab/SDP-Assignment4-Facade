# SDP Assignment 4 - Media Conversion Facade

## Description
This repository contains the implementation of the Facade design pattern in Java for the Software Design Patterns course (ShP-2216).
It simulates a media conversion process (Option A) where a `MediaConversionFacade` simplifies the interaction with a complex subsystem (`MetadataReader`, `CodecFactory`, `AudioMixer`).

## Structure
- `src/subsystem/` - Complex subsystem classes.
- `src/facade/` - The Facade class coordinating the subsystem.
- `src/client/` - Client code that interacts only with the Facade.

## How to Run
Compile and run the `Main.java` class in the `client` package using JDK 17.