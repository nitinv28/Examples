package eta.com.services.impl;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eta.dao.api.EtaDaoApi;

import eta.com.domain.impl.EtaDetailsImpl;
import eta.com.domin.api.details.EtaDetails;
import eta.com.services.api.EtaServicesApi;

@Service
@Transactional
public class EtaServicesImpl implements EtaServicesApi {

	@Autowired
	EtaDaoApi etaDaoApi;
	public EtaDetails getDetails(int id) {
		EtaDetails etaDetails = new EtaDetails();
		EtaDetailsImpl  etaDetailsImpl = etaDaoApi.getDetails(id);
		
		etaDetails.setId(etaDetailsImpl.getSno());
		etaDetails.setFirstName(etaDetailsImpl.getFirstName());
		etaDetails.setLastName(etaDetailsImpl.getLastName());
		
		return etaDetails;
	}
	
	public void saveData(EtaDetails etaDetails){
		
		EtaDetailsImpl etaDetailsImpl = new EtaDetailsImpl();
		etaDetailsImpl.setSno(etaDetails.getId());
		etaDetailsImpl.setFirstName(etaDetails.getFirstName());
		etaDetailsImpl.setLastName(etaDetails.getLastName());
		etaDaoApi.save(etaDetailsImpl);
	}

}
