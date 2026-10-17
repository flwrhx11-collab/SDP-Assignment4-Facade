package subsystem;

public class CodecFactory {
    public String extractCodec(String fileName) {
        System.out.println("CodecFactory: Extracting source codec...");
        return "source_codec";
    }

    public String getDestinationCodec(String targetFormat) {
        System.out.println("CodecFactory: Preparing destination codec for format " + targetFormat + "...");
        return targetFormat + "_codec";
    }
}