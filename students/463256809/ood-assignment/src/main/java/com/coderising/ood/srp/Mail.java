package com.coderising.ood.srp;

/**
 * Created by wenwei on 2017/6/14.
 */
public class Mail {

    private String sendMailQuery = null;


    private String smtpHost = null;
    private String altSmtpHost = null;
    private String fromAddress = null;
    private String toAddress = null;
    private String subject = null;
    private String message = null;

    public String getSendMailQuery() {
        return sendMailQuery;
    }

    public void setSendMailQuery(String sendMailQuery) {
        this.sendMailQuery = sendMailQuery;
    }

    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public String getAltSmtpHost() {
        return altSmtpHost;
    }

    public void setAltSmtpHost(String altSmtpHost) {
        this.altSmtpHost = altSmtpHost;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
