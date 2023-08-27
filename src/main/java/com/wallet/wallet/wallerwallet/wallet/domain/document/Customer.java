package com.wallet.wallet.wallerwallet.wallet.domain.document;

import lombok.Data;
import org.apache.tomcat.websocket.PojoHolder;

@Data
public class Customer {
    private int customerId;
    private String documentNumber;
    private String phoneNumer;
    private String typeDocument;
    private String String;
    private String givenNames;
    private String surNames;
}
