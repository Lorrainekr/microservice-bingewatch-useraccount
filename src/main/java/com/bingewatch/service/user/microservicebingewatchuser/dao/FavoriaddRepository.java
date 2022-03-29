package com.bingewatch.service.user.microservicebingewatchuser.dao;

import com.bingewatch.service.user.microservicebingewatchuser.model.Favori;
import com.bingewatch.service.user.microservicebingewatchuser.model.Favorisadd;
import com.bingewatch.service.user.microservicebingewatchuser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FavoriaddRepository extends JpaRepository <Favorisadd, Integer>{
    Optional<Favorisadd> findByTitle(String title);
    Boolean existsByTitle(String title);
    Favorisadd findByimdbIDAndUser(Integer id, User user);
    @SuppressWarnings("unchecked")
    Favorisadd save(Favorisadd favori);
    List<Favorisadd> findByUser(User user);
}