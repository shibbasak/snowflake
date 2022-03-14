package com.abc.app.edw;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GlobalIdService {
	
	private final SourceToPartyRepository sourceToPartyRepository;
	
	public GlobalIdService(SourceToPartyRepository sourceToPartyRepository) {
		this.sourceToPartyRepository = sourceToPartyRepository;
	}
	
	public List<SourceToParty> getAll() {
		return sourceToPartyRepository.findAll();
	}	

}
