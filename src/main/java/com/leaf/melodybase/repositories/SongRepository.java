package com.leaf.melodybase.repositories;

import com.leaf.melodybase.models.SongModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<SongModel, Long> {
}
