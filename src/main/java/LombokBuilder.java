import lombok.Value;
import lombok.experimental.Builder;

@Builder
@Value
public class LombokBuilder {
    private String name;
    private String surname;
    private int age;
    private String socialNumber;
    private String motherName;
    private String fatherName;
    private String address;
}
