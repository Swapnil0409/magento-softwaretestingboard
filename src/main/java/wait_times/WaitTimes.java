package wait_times;

import java.time.Duration;

public class WaitTimes {

    public final Duration BRIEF_WAIT = Duration.ofSeconds(5);
    public final Duration DEFAULT_WAIT = Duration.ofSeconds(10);
    public final Duration MEDIUM_WAIT = Duration.ofSeconds(20);
    public final Duration LONG_WAIT = Duration.ofSeconds(40);
    public final Duration UNREASONABLE_WAIT = Duration.ofSeconds(60);
    public final Duration LUDICROUS_WAIT = Duration.ofSeconds(300);
}
