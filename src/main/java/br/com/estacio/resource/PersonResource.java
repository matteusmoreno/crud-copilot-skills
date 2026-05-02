package br.com.estacio.resource;

import br.com.estacio.dto.PersonRequest;
import br.com.estacio.dto.PersonResponse;
import br.com.estacio.service.PersonService;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/api/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Person API", description = "CRUD operations for persons")
public class PersonResource {

    @Inject
    PersonService service;

    @GET
    @Operation(summary = "List all persons")
    @APIResponse(responseCode = "200", description = "List of persons", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PersonResponse.class)))
    public List<PersonResponse> listAll() {
        return service.listAll();
    }

    @GET
    @Path("{id}")
    @Operation(summary = "Get person by id")
    @APIResponse(responseCode = "200", description = "Person found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PersonResponse.class)))
    @APIResponse(responseCode = "404", description = "Person not found")
    public PersonResponse getById(@PathParam("id") String id) {
        return service.findById(id);
    }

    @POST
    @Operation(summary = "Create a new person")
    @APIResponse(responseCode = "201", description = "Person created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PersonResponse.class)))
    public Response create(@Valid @RequestBody(description = "Person payload", required = true) PersonRequest req) {
        PersonResponse created = service.create(req);
        URI uri = URI.create("/api/persons/" + created.getId());
        return Response.created(uri).entity(created).build();
    }

    @PUT
    @Path("{id}")
    @Operation(summary = "Update a person")
    @APIResponse(responseCode = "200", description = "Person updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PersonResponse.class)))
    @APIResponse(responseCode = "404", description = "Person not found")
    public PersonResponse update(@PathParam("id") String id, @Valid @RequestBody(description = "Person payload", required = true) PersonRequest req) {
        return service.update(id, req);
    }

    @DELETE
    @Path("{id}")
    @Operation(summary = "Delete a person")
    @APIResponse(responseCode = "204", description = "Person deleted")
    @APIResponse(responseCode = "404", description = "Person not found")
    public Response delete(@PathParam("id") String id) {
        service.delete(id);
        return Response.noContent().build();
    }
}

