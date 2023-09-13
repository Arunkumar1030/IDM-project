package com.Project.ProjectBackend.Service;

import com.Project.ProjectBackend.DTO.IdmDTO;
import com.Project.ProjectBackend.DTO.IdmSaveDTO;
import com.Project.ProjectBackend.DTO.IdmUpdateDTO;

import java.util.List;

public interface IdmServiceIMPL {

    String addIdm(IdmSaveDTO idmSaveDTO);

    List<IdmDTO> getAllIdm();


    String updateIdm(IdmUpdateDTO idmUpdateDTO);

    boolean deleteIdm(int id);
}
