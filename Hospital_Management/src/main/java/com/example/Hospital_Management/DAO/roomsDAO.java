package com.example.Hospital_Management.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital_Management.Entity.rooms;

public interface roomsDAO extends JpaRepository<rooms,Integer> {

	rooms findById(int RiD);
}
