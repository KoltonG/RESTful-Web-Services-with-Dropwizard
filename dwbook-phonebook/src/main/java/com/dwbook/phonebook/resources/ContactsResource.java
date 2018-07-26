package com.dwbook.phonebook.resources;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Creation of the /contact endpoint that responds with the JSON media type
 */
@Path("/contacts")
@Produces(MediaType.APPLICATION_JSON)
public class ContactsResource {
    /**
     * Get endpoint at /contacts/{id} which returns the contact with the given id
     * @param id Contact identifier
     * @return Contact information with the id, name and phone number
     */
    @GET
    @Path("/{id}")
    public Response getContact(
        @PathParam("id") int id
    ) {
        // Retrieve information about the contact with the provided id
        // code ...

        return Response
            .ok("{contact_id: " + id + ", name: \"Dummy Name\", phone: \"+0123456789\" }") // This sends back a 200
                // OK status code
            .build();
    }

    /**
     * POST endpoint at /contacts used to create a new contact taking the name and phone as inputs.
     *
     * @param name The name of the contact
     * @param phone The phone number of the contact
     * @return
     */
    @POST
    public Response createContact(
        @FormParam("name") String name,
        @FormParam("phone") String phone
    ) {
        // Store the new contact
        // Code here

        return Response
            .created(null) // This send back a 201 created status code
            .build();
    }

    /**
     * Delete endpoint at /contacts/{id}
     *
     * @param id The identifer of the contact
     * @return
     */
    @DELETE
    @Path("/{id}")
    public Response deleteContact(
        @PathParam("id") int id
    ) {
        // Delete the contact with the id
        // Code...

        return Response
            .noContent() // This sends back a 204 no content status code
            .build();
    }

    /**
     * Update endpoint at /contacts/{id} that updates the contact information for the contact with the same id
     *
     * @param id Identifier of the contact
     * @param name New name for the contact
     * @param phone New phone number for the contact
     * @return
     */
    @PUT
    @Path("/{id}")
    public Response updateContact(
        @PathParam("id") int id,
        @FormParam("name") String name,
        @FormParam("phone") String phone
    ) {
        // Update the contact with the provided ID with a new name and phone number
        // Code ...

        return Response
            .ok("{contact_id: "+ id +", name: \""+ name +"\",phone: \""+ phone +"\" }") // This sends back a 200
                // OK status code
            .build();
    }
}
