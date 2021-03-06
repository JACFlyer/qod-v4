package edu.cnm.deepdive.qod.view;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URI;
import java.util.Date;
import java.util.UUID;
import javax.management.relation.Role;
import org.springframework.lang.NonNull;

@JsonPropertyOrder({"id", "created", "updated", "displayName", "role", "href"})
public interface FlatUser {

  UUID getId();

  Date getCreated();

  Date getUpdated();

  @NonNull
  String getDisplayName();

  @NonNull
  Role getRole();

  URI getHref();

}
