package org.broadleafcommerce.payment.service;

import org.broadleafcommerce.payment.service.exception.PaymentException;
import org.broadleafcommerce.payment.service.exception.PaymentProcessorException;
import org.broadleafcommerce.payment.service.module.PaymentResponse;

public interface PaymentService {

    public Boolean isValidCandidate(String paymentType);

    public PaymentResponse authorize(PaymentContext paymentContext) throws PaymentException, PaymentProcessorException;

    public PaymentResponse debit(PaymentContext paymentContext) throws PaymentException, PaymentProcessorException;

    public PaymentResponse authorizeAndDebit(PaymentContext paymentContext) throws PaymentException, PaymentProcessorException;

    public PaymentResponse credit(PaymentContext paymentContext) throws PaymentException, PaymentProcessorException;

    public PaymentResponse voidPayment(PaymentContext paymentContext) throws PaymentException, PaymentProcessorException;

    public PaymentResponse balance(PaymentContext paymentContext) throws PaymentException, PaymentProcessorException;

}
