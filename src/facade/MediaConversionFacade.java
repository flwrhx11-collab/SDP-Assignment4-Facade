package facade;

import subsystem.AudioMixer;
import subsystem.CodecFactory;
import subsystem.MetadataReader;

public class MediaConversionFacade {
    private final MetadataReader metadataReader;
    private final CodecFactory codecFactory;
    private final AudioMixer audioMixer;

    public MediaConversionFacade() {
        this.metadataReader = new MetadataReader();
        this.codecFactory = new CodecFactory();
        this.audioMixer = new AudioMixer();
    }

    public void convert(String fileName, String targetFormat) {
        System.out.println("\n--- Starting conversion of file '" + fileName + "' to format '" + targetFormat + "' ---");
        try {
            metadataReader.read(fileName);
            String sourceCodec = codecFactory.extractCodec(fileName);
            String targetCodec = codecFactory.getDestinationCodec(targetFormat);
            audioMixer.mix(targetFormat);
            System.out.println("--- Conversion completed successfully! ---\n");
        } catch (Exception e) {
            System.err.println("Conversion error: " + e.getMessage());
        }
    }
}