package expertostech.autenticacao.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import expertostech.autenticacao.jwt.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

	// Evitar NullPointerException
	public Optional<UsuarioModel> findByLogin(String login);

}
