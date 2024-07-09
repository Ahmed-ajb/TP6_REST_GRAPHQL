package org.sid.ebank_account_service.services;

import org.sid.ebank_account_service.dto.BankAccountRequestDTO;
import org.sid.ebank_account_service.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    public BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);

}
