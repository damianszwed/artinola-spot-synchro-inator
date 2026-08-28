package com.github.damianszwed.artinola.spot.synchro.inator;

import org.springframework.boot.SpringApplication;

public class TestArtinolaSpotSynchroInatorApplication {

	public static void main(String[] args) {
		SpringApplication.from(ArtinolaSpotSynchroInatorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
