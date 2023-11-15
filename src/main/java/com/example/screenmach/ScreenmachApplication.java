package com.example.screenmach;

import com.example.screenmach.domain.Episode;
import com.example.screenmach.domain.Series;
import com.example.screenmach.service.ConsumoAPI;
import com.example.screenmach.service.DataConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmachApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmachApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DataConverter converter = new DataConverter();
		ConsumoAPI consumo = new ConsumoAPI();
		var json = consumo.obterDados("https://www.omdbapi.com/?t=euphoria&apikey=c17dff97");
		var json2 = consumo.obterDados("https://www.omdbapi.com/?t=euphoria&season=2&episode=1&apikey=c17dff97");
		System.out.println();
		System.out.println("Dados da serie em JSON:");
		System.out.println(json);
		System.out.println();
		System.out.println("Dados do episodio em JSON:");
		System.out.println(json2);
		Series data = converter.obtainData(json, Series.class);
		Episode data2 = converter.obtainData(json2, Episode.class);
		System.out.println();
		System.out.println("Dados da serie em toString():");
		System.out.println(data);
		System.out.println();
		System.out.println("Dados do episodio em toString():");
		System.out.println(data2);
	}
}
