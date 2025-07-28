package movReplayTest;

import static play.server.Starter.start;

public class Application {
    public static void main(String[] args) {
        start(System.getProperty("play.id", ""));
    }
}
