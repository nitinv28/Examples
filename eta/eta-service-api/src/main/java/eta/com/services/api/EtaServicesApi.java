package eta.com.services.api;

import eta.com.domin.api.details.EtaDetails;

public interface EtaServicesApi {

	public EtaDetails getDetails(int id);
	
	public void saveData(EtaDetails etaDetails);
}
