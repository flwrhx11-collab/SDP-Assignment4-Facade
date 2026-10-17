package client;

import facade.MediaConversionFacade;

public class Main {
    public static void main(String[] args) {
        MediaConversionFacade converter = new MediaConversionFacade();

        converter.convert("holiday_video.avi", "mp4");
        converter.convert("lecture_audio.wav", "mp3");
    }
}