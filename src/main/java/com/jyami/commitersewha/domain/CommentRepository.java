package com.jyami.commitersewha.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jyami on 2020/09/30
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
