package org.usergrid.rest.exceptions;

import java.net.URI;
import java.net.URISyntaxException;

public class RedirectionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	URI uri = null;

	public RedirectionException(String location) {
		try {
			URI redirectURI = new URI(location);

			uri = new URI(redirectURI.getScheme(), redirectURI.getUserInfo(), redirectURI.getHost(), redirectURI.getPort(), redirectURI.getPath(), redirectURI.getQuery(), redirectURI.getFragment());
		} catch (URISyntaxException e) {
		}
	}

	public URI getUri() {
		return uri;
	}

}
