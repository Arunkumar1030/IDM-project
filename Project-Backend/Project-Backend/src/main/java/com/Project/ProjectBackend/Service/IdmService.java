package com.Project.ProjectBackend.Service;

import com.Project.ProjectBackend.DTO.IdmDTO;
import com.Project.ProjectBackend.DTO.IdmSaveDTO;
import com.Project.ProjectBackend.DTO.IdmUpdateDTO;
import com.Project.ProjectBackend.IdmRepo.IdmRepo;
import com.Project.ProjectBackend.entity.Idm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class IdmService implements IdmServiceIMPL {

    @Autowired
    private IdmRepo idmRepo;

    @Override
    public String addIdm(IdmSaveDTO idmSaveDTO) {
        Idm idm = new Idm(

                idmSaveDTO.getIdmname(),
                idmSaveDTO.getIdmemail(),
                idmSaveDTO.getIdmphonenumber()

        );
        idmRepo.save(idm);
        return idm.getIdmname();
    }

    @Override
    public List<IdmDTO>getAllIdm() {
        List<Idm> getIdm = idmRepo.findAll();
        List<IdmDTO> idmDTOList = new ArrayList<>();
        for (Idm a:getIdm) {
            IdmDTO idmDTO =  new IdmDTO(
                    a.getIdmid(),
                    a.getIdmname(),
                    a.getIdmphonenumber(),
                    a.getIdmemail()

            );
            idmDTOList.add(idmDTO);
        }

        return idmDTOList;

    }

     @Override
    public String updateIdm(IdmUpdateDTO idmUpdateDTO) {
        if(idmRepo.existsById(idmUpdateDTO.getIdmid())) {
            Idm idm = idmRepo.getById(idmUpdateDTO.getIdmid());
            idm.setIdmname(idmUpdateDTO.getIdmname());
            idm.setIdmphonenumber(idmUpdateDTO.getIdmphonenumber());
            idm.setIdmemail(idmUpdateDTO.getIdmemail());

            idmRepo.save(idm);
        }
        else
        {
            System.out.println("id not found...");
        }
        return null;
    }

    @Override
    public boolean deleteIdm(int id) {
        if(idmRepo.existsById(id))
        {
            idmRepo.deleteById(id);
        }
        else {
            System.out.println("id not found...");
        }
        return true;
    }
}