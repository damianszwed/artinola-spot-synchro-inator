package com.github.damianszwed.artinola_spot_synchro_inator;

import org.springframework.boot.SpringApplication;

public class TestArtinolaSpotSynchroInatorApplication {

	public static void main(String[] args) {
		SpringApplication.from(ArtinolaSpotSynchroInatorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
