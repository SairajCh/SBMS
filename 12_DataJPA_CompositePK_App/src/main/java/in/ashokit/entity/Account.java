package in.ashokit.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "account_tbl")

public class Account {

	@EmbeddedId
	private AccountPK accountPK;

	private String holderName;

	private String branch;
}
