package ar.com.academy.mfs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ar.com.academy.mfs.model.Role;
import ar.com.academy.mfs.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping("/roles")
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}
	
	@GetMapping("/get-role/{role_id}")
	public Role getRole(@PathVariable int role_id) {
		return roleService.getRol(role_id);
	}
}