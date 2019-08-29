package com.petruta.journal.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petruta.journal.model.AboutFather;
import com.petruta.journal.model.repository.AboutFatherRepository;

@Service
@Transactional
public class JournalServices {
	
@Autowired	
private AboutFatherRepository repoFather;

public List<AboutFather> listAll() {
    return repoFather.findAll();
}


public void save(AboutFather repo) {
	repoFather.save(repo);
	
}

public AboutFather get(long id) {
    return repoFather.findById(id).get();
}
 
public void delete(long id) {
	repoFather.deleteById(id);
}

}



