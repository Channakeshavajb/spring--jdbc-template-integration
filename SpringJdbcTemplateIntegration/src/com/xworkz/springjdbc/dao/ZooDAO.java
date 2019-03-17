package com.xworkz.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.xworkz.springjdbc.dto.ZooDTO;

public class ZooDAO {

	private JdbcTemplate jdbcTemplate;

	public ZooDAO() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveZoo(ZooDTO z) {
		String query = "insert into zoo values('" + z.getAnimalType() + "','" + z.getQuantity() + "','" + z.getShellNo()
				+ "','" + z.isVeg() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateZoo(ZooDTO z) {
		String query = "update zoo set animalType='" + z.getAnimalType() + "',quantity='" + z.getQuantity() + "',veg='" + z.isVeg()
				+ "'where shellNo='" + z.getShellNo() + "'";

		return jdbcTemplate.update(query);
	}
	
	public int deleteZoo(ZooDTO z) {
		String query="delete from zoo where shellNo='"+z.getShellNo()+"'";
		return jdbcTemplate.update(query);
	}

	public void fetchZoo() {
		String sql="select * from zoo";
        List<ZooDTO> z=jdbcTemplate.query(sql, rowMapper);
		System.out.println(z);
		return;
	}
}
