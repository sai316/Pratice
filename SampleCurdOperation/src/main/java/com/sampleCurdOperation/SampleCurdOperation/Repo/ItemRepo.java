package com.sampleCurdOperation.SampleCurdOperation.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sampleCurdOperation.SampleCurdOperation.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, String> {

}
