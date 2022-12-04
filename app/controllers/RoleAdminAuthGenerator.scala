package controllers

import org.pac4j.core.authorization.generator.AuthorizationGenerator
import org.pac4j.core.context.WebContext
import org.pac4j.core.context.session.SessionStore
import org.pac4j.core.profile.UserProfile

import java.util.Optional

class RoleAdminAuthGenerator extends AuthorizationGenerator{
  override def generate(context: WebContext, sessionStore: SessionStore, profile: UserProfile): Optional[UserProfile] ={
    profile.addRole("ROLE_ADMIN")
    Optional.of(profile)
  }
}
