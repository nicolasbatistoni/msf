package ar.com.academy.mfs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.academy.mfs.model.Form;
import ar.com.academy.mfs.repository.FormRepository;

@Service("formService")
public class FormService {
	
	@Autowired
	FormRepository formRepository;
	
	public Form createForm(Form inputForm) {
		Form form = formRepository.save(inputForm);
		return form;
	}

	public Form getFormByDni(int dni) {
		return formRepository.findByDni(dni);
	}

	
}
