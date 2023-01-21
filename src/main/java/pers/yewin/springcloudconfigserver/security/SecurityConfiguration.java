package pers.yewin.springcloudconfigserver.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author: Ye Win
 * @created: 15/10/2022
 * @project: spring-cloud-config-server
 * @package: pers.yewin.springcloudconfigserver.security
 */

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // disable for csrf protection, allowed to call encrypt endpoint (API) from security block.

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); // set for don't save user session data

        http.authorizeRequests().antMatchers("/encrypt/**", "/decrypt/**").permitAll();
    }
}
