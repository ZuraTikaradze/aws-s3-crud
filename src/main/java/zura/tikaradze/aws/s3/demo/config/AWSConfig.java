package zura.tikaradze.aws.s3.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class AWSConfig {
    @Value("${aws.region}")
    private String REGION;
    @Value("${aws.access_key}")
    private String ACCESS_KEY;
    @Value("${aws.secret_key}")
    private String SECRET_KEY;
}
