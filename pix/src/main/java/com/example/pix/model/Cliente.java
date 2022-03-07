package com.example.pix.model;

import java.util.List;

public class Cliente {

    private String bank;
    private List<DadosCliente> customers;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public List<DadosCliente> getCustomers() {
        return customers;
    }

    public void setCustomers(List<DadosCliente> customers) {
        this.customers = customers;
    }
}
