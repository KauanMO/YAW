package com.yaw.server.service;

import com.yaw.server.dto.administrador.LoginAdministradorDTO;
import com.yaw.server.service.exceptions.LoginOuSenhaIncorreta;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdministradorService {
    @Value("${admin.login}")
    private String loginAdm;
    @Value("${admin.senha}")
    private String senhaAdm;

    public void loginAdministrador(LoginAdministradorDTO dto) {
        if(!dto.login().equals(loginAdm) || !dto.senha().equals(senhaAdm)) throw new LoginOuSenhaIncorreta();
    }
}
