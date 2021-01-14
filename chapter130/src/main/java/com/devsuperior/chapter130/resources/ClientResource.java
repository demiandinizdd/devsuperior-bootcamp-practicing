package com.devsuperior.chapter130.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.chapter130.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource  {

	@GetMapping
	public ResponseEntity<List<Client>> findall() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Fernando Amaral Junior", "36896718647", 18202.76, Instant.parse("2004-11-18T18:35:24.00Z"), 3));
		list.add(new Client(2L, "Antonio Carlos Castro", "46866778847", 22202.76, Instant.parse("1976-04-03T22:35:24.00Z"), 2));

		return ResponseEntity.ok().body(list);
	}
}