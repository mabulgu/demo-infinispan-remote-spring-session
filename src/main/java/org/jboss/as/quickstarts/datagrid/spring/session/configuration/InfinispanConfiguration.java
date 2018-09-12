package org.jboss.as.quickstarts.datagrid.spring.session.configuration;

import org.infinispan.spring.provider.SpringRemoteCacheManagerFactoryBean;
import org.infinispan.spring.session.configuration.EnableInfinispanRemoteHttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//this enables spring-session
@EnableInfinispanRemoteHttpSession
@Configuration
public class InfinispanConfiguration {

   /*
    * Spring Session is based on Spring Caching for JDG/Infinispan. We need to configure it.
    */
   @Bean
   public SpringRemoteCacheManagerFactoryBean springCache() {
      return new SpringRemoteCacheManagerFactoryBean();
   }


}
