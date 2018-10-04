package com.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.model.Transaction;
import com.cloud.service.TransactionService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TransactionController {
	
	@Autowired
    private TransactionService transactionService;
	
	@RequestMapping(value={"/transaction"}, method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Transaction> findByUserId(){		
		List<Transaction> getAllTransaction;
		getAllTransaction = transactionService.findByUserId(userId);
        return getAllTransaction;
    }
	
	@RequestMapping(value={"/transaction/{id}"})
	@ResponseBody
	public void deleteById(@PathVariable int id) {
		transactionService.deleteById(id);
	}	
}
