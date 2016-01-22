
 //[START begin]
package com.example.helloendpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.users.User;

import java.util.ArrayList;

import javax.inject.Named;

@Api(name = "freeapi",
    version = "v1",
    scopes = {Constants.EMAIL_SCOPE},
    clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
    audiences = {Constants.ANDROID_AUDIENCE}
)
public class FreeApi {

  public Free getGreeting(Object raw) throws NotFoundException {
	  return new Free("received " + raw.toString());
 }
  
  @ApiMethod(name = "greetings.oleta", httpMethod = "post")
  public Free set(Free resource){
	  return new Free("received " + resource.getMessage());
	  
  }

}
