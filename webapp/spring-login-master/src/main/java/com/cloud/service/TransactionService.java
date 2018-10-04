package com.cloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.model.Transaction;
import com.cloud.repository.TransactionRepository;
import com.cloud.repository.UserRepository;

@Service("transactionService")
public class TransactionService{
	@Autowired
	private TransactionRepository transactionRepository;
	
	 
	    public TransactionService(TransactionRepository transactionRepository,UserRepository userRepository) {
	        this.transactionRepository = transactionRepository;
	      
	    }
	 
	    public void deleteById(int id) {
	       transactionRepository.deleteById(id);
	      
	    }
	    
	    public List<Transaction> findByUserId(int userId) { 
	      List<Transaction> transactions = transactionRepository.findByUserId(userId);
	      return transactions;
	    }
}
