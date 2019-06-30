package com.devd.spring.bookstoreaccountservice.repository.dao;

import com.devd.spring.bookstoreaccountservice.model.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: Devaraj Reddy,
 * Date : 2019-05-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "oauth_client_details")
@Builder
public class OAuthClient extends DateAudit {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "CLIENT_ID", updatable = false, nullable = false)
    private String client_id;

    @Column(name = "CLIENT_SECRET", updatable = false, nullable = false)
    private String client_secret;
    private String authorized_grant_types;
    private String authorities;
    private String scope;
    private String resource_ids;

}