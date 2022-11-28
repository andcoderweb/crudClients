package com.crudClients.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudClients.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Ana", "456.222.312-05", 1055.34, Instant.parse("1997-08-03T10:15:22.30Z"), 2));
		list.add(new Client(2L, "João", "450.240.323-07", 105.34, Instant.parse("1978-05-07T12:11:25.31Z"), 2));
		return ResponseEntity.ok().body(list);
	}

}