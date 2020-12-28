package com.endeymus.carsharing.configs;

import com.endeymus.carsharing.models.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.endeymus.carsharing"})
public class MainConfig {

    @Bean
    public Car car1() {
        return new Car(
                "8fDxRwujj8xbwSm21efz",
                "kia-rio",
                "Р175ОИ77RUS",
                54.2355,
                -75.452,
                234.23,
                false
        );
    }
    @Bean
    public Car car2() {
        return new Car(
                "MsXLAP2QysqCrCIKpcrl",
                        "Porsche Cayenne",
                "М157УР58RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car3() {
        return new Car(
                "42fty51fG6YxtJxqJtWs",
                "Ram",
                "Н436КР77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car4() {
        return new Car(
                "hRmSuz4rJyIJPVGVV0Wb",
                "Lexus",
                "Т146ВО77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car5() {
        return new Car(
                "1oCywBnRKKiUsFKG6mkQ",
                "Mazda",
                "Е436КС77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car6() {
        return new Car(
                "6TKPeqyRMo4WCKDgMH4y",
                "Renault",
                "А485КК77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car7() {
        return new Car(
                "2wNdPolC8bpsdfquQnat",
                "Lamborghini",
                "М207ТВ77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car8() {
        return new Car(
                "yHJM0G6n1pMZCICheNTz",
                "Subaru",
                "Н354ЕВ77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car9() {
        return new Car(
                "OaMMZST5r1OlbM5Gfift",
                "Jeep",
                "М351ВН77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
    @Bean
    public Car car10() {
        return new Car(
                "Xj9o593qLalAnJFtogtS",
                "Nissan",
                "Х499ЕУ77RUS",
                54.2355,
                -75.452,
                40.25,
                false
        );
    }
}
