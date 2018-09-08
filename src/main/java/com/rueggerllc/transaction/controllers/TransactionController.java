package com.rueggerllc.transaction.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rueggerllc.transaction.beans.BackendTransaction;
import com.rueggerllc.transaction.beans.BackendTransactionResponse;

@RestController
@RequestMapping("/")
public class TransactionController {
	
	
	public TransactionController() {
	}
	
	@GetMapping("/transactions")
	public BackendTransactionResponse getTransactions() {
		
		BackendTransactionResponse response = new BackendTransactionResponse();
		List<BackendTransaction> transactions = new ArrayList<BackendTransaction>();
		response.setTransactions(transactions);
		for (int i = 0; i < 3; i++) {
			BackendTransaction transaction = new BackendTransaction();
			transaction.setTransactionID("Transaction_" + i);
			transaction.setReferenceNumber("TXN: 100" + i);
			transactions.add(transaction);
		}
		
		// Done
		return response;
		
	}
	
	private long getNow() {
		return System.currentTimeMillis();
	}
  

}
