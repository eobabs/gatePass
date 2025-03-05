package org.bytebuilders.estateManger.controllers;



import org.bytebuilders.estateManger.dtos.requests.ResidentRequestDTO;
import org.bytebuilders.estateManger.dtos.responses.ResidentResponseDTO;
import org.bytebuilders.estateManger.services.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/residents")
public class ResidentController {
    @Autowired
    private ResidentService residentService;

    @PostMapping("/register")
    public ResponseEntity<ResidentResponseDTO> registerResident(
            @RequestBody ResidentRequestDTO requestDTO
    ) {
        ResidentResponseDTO registeredResident = residentService.registerResident(requestDTO);
        return ResponseEntity.ok(registeredResident);
    }
}




