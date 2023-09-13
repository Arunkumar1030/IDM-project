package com.Project.ProjectBackend.IdmController;

import com.Project.ProjectBackend.DTO.IdmDTO;
import com.Project.ProjectBackend.DTO.IdmSaveDTO;
import com.Project.ProjectBackend.DTO.IdmUpdateDTO;
import com.Project.ProjectBackend.Service.IdmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("api/v1/idm")
public class IdmController {
    @Autowired
    private IdmService idmService;

    @PostMapping(path = "/save")
    public String saveIdm(@RequestBody IdmSaveDTO idmSaveDTO)
    {
        String id = idmService.addIdm(idmSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllIdm")
    public List<IdmDTO> getAllIdm()
    {
        List<IdmDTO>allIdm = idmService.getAllIdm();
        return allIdm;
    }

    @PutMapping(path = "/update")
    public String updateIdm(@RequestBody IdmUpdateDTO idmUpdateDTO)
    {
        String id = idmService.updateIdm(idmUpdateDTO);
        return id;
    }
    @DeleteMapping(path = "/deleteidm/{id}")
    public String deleteIdm(@PathVariable(value = "id") int id)
    {
        boolean deleteidm = idmService.deleteIdm(id);
        return "deleted";
    }


}
