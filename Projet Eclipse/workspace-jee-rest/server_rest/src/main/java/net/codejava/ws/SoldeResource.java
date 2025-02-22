package net.codejava.ws;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

// On va exposer des opérations avec l'annotation "@Path"
@Path("/soldes")
public class SoldeResource {
	// On utilise le système de singleton pour le DAO de stockage des comptes bancaires 
	private CompteDAO m_ref_dao = CompteDAO.getInstance();
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSolde(@PathParam("id") long i_long_id) throws Exception {
		try {
			double l_dbl_montant = m_ref_dao.getSolde(i_long_id);
		
			// On prépare un objet en sortie pour le montant
			Montant l_obj_montant = new Montant(l_dbl_montant);
			
			return Response.ok(l_obj_montant, MediaType.APPLICATION_JSON).build();
		}
		catch(Exception e) {
			return Response.status(Response.Status.NOT_FOUND).build();			
		} 
	}
	

}
