package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersUriSpec;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	private String BOOK_TICKET_URL = "";

	private String GET_TICKET_URL = "";

	@Override
	public Ticket bookTicket(Passenger passenger) {

		/*
		 * 
		 * 
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> respEntity =
		 * rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class); Ticket ticket =
		 * respEntity.getBody();
		 */
		
		
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
			.uri(BOOK_TICKET_URL)
			.bodyValue(passenger)
			.retrieve()
			.bodyToMono(Ticket.class)
			.block();
		return ticket;
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {

		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> responseEntity =
		 * rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);
		 * 
		 * Ticket ticket = responseEntity.getBody();
		 */
		// get the instance of the webclient (imp class)
		WebClient webClient = WebClient.create();

		// send the request and map response to Ticket obj

		Ticket ticket = webClient.get()
								.uri(GET_TICKET_URL)
								.retrieve()
								.bodyToMono(Ticket.class)
								.block();// sync call

		return null;
	}

}
