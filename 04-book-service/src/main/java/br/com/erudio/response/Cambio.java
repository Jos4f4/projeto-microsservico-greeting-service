package br.com.erudio.response;

import java.io.Serializable;

public class Cambio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id	;
	private String from;
	private String to;
	private Double conversationFactor;
	private Double convertedValue;	
	private String environment;
	
	private Cambio() {}

	public Cambio(Long id, String from, String to, Double conversationFactor, Double convertedValue,
			String environment) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversationFactor = conversationFactor;
		this.convertedValue = convertedValue;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getConversionFactor() {
		return conversationFactor;
	}

	public void setConversionFactor(Double conversationFactor) {
		this.conversationFactor = conversationFactor;
	}

	public Double getConvertedValue() {
		return convertedValue;
	}

	public void setConvertedValue(Double convertedValue) {
		this.convertedValue = convertedValue;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conversationFactor == null) ? 0 : conversationFactor.hashCode());
		result = prime * result + ((convertedValue == null) ? 0 : convertedValue.hashCode());
		result = prime * result + ((environment == null) ? 0 : environment.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cambio other = (Cambio) obj;
		if (conversationFactor == null) {
			if (other.conversationFactor != null)
				return false;
		} else if (!conversationFactor.equals(other.conversationFactor))
			return false;
		if (convertedValue == null) {
			if (other.convertedValue != null)
				return false;
		} else if (!convertedValue.equals(other.convertedValue))
			return false;
		if (environment == null) {
			if (other.environment != null)
				return false;
		} else if (!environment.equals(other.environment))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	};
	
	
}
