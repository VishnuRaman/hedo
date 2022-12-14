package controllers

import org.apache.commons.lang3.StringUtils
import org.pac4j.core.authorization.authorizer.ProfileAuthorizer
import org.pac4j.core.context.WebContext
import org.pac4j.core.context.session.SessionStore
import org.pac4j.core.profile.UserProfile

import java.util
modules
class CustomAuthorizer extends ProfileAuthorizer{
  override def isProfileAuthorized(context: WebContext, sessionStore: SessionStore, profile: UserProfile): Boolean = {
    if (profile == null) {
      false
    } else {
      StringUtils.startsWith(profile.getUsername, "jle")
    }

  }

  override def isAuthorized(context: WebContext, sessionStore: SessionStore, profiles: util.List[UserProfile]): Boolean = {
    return isAnyAuthorized(context, sessionStore, profiles)
  }
}
