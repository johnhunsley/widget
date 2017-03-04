package com.johnhunsley.widget;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <p>
 *     Access to the API via Basic authentication only. default user and pass configuration in application.properties
 * </p>
 *
 * @author John Hunsley
 *         jphunsley@gmail.com
 *         Date : 17/11/2016
 *         Time : 14:32
 */
@Configuration
public class ApiSecurityConfig extends WebSecurityConfigurerAdapter {
    final String SERVICE_PROVIDER = "https://api.stormpath.com/v1/groups/uCPsT96vEtrEh6R64kWZO";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/widgets/*").authenticated()
                .antMatchers("/user/").authenticated()
                .antMatchers("/**").permitAll();

    }
}
