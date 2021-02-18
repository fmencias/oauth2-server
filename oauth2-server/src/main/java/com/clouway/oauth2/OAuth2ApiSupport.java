package com.clouway.oauth2;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Mihail Lesikov (mihail.lesikov@clouway.com)
 */
public interface OAuth2ApiSupport {

  void serve(HttpServletRequest req, HttpServletResponse resp) throws IOException;

}
