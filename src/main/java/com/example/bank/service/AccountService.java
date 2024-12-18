package com.example.bank.service;

import com.example.bank.dto.BankAccountRequestDTO;
import com.example.bank.dto.BankAccountResponseDTO;

public interface AccountService {

    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);
}
