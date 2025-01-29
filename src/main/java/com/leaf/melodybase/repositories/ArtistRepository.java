package com.leaf.melodybase.repositories;

import com.leaf.melodybase.models.ArtistModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistModel, Long> {

}
