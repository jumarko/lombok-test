import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LomboLogger {

    public void loggingMethod(String name) {
        log.info("action=log name={}", name);
        System.out.println(name);
        log.info("action=log status=finish name={}", name);
    }
}
