package ar.edu.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ar.edu.unju.edm.service.LoginUsuarioServiceImp;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private AutenticationSuccessHandler autenticacion;
	
	String[] resources = new String[] {
			"/include/**","/css/**","/icons/**","/img/**","/js/**","/layer/**","/webjars/**"
			
	};
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		      .antMatchers(resources).permitAll()
		      .antMatchers("/","/home/altausuario","/usuario/saveUsuario","/reserva/listadoReserva","/home/altahabitacion","/Habitacion/saveHabitacion","/home/altareserva","/reserva/saveReserva","/home/altareserva").permitAll()
		      
		      .anyRequest().authenticated()
		      .and()
		.formLogin()
		      .loginPage("/home/login")
		      .permitAll()
		      .successHandler(autenticacion)
		      .failureForwardUrl("/login?error=true")
		      .usernameParameter("username")
		      .passwordParameter("password")
		      .and()
		 .logout()
		      .permitAll()
		      .logoutSuccessUrl("/login?logout");
	}

	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		return bCryptPasswordEncoder;
	}
	
	@Autowired
	LoginUsuarioServiceImp userDetailsService;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
}
