package test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @author D-KK07MJ
 * @since 3/03/2017
 */
@Validated
@ConfigurationProperties(prefix = "security.oauth2")
public class ClientDetailsProperties {

	@NestedConfigurationProperty
	private List<BaseClientDetails> clients;

	public List<BaseClientDetails> getClients() {
		return clients;
	}

	public void setClients(List<BaseClientDetails> clients) {
		this.clients = clients;
	}

}
