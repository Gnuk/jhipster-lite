package tech.jhipster.forge.generator.application;

import org.springframework.stereotype.Service;
import tech.jhipster.forge.generator.domain.core.Project;
import tech.jhipster.forge.generator.domain.server.springboot.web.SpringBootWebService;

@Service
public class SpringBootWebApplicationService {

  private final SpringBootWebService springBootWebService;

  public SpringBootWebApplicationService(SpringBootWebService springBootWebService) {
    this.springBootWebService = springBootWebService;
  }

  public void init(Project project) {
    this.springBootWebService.init(project);
  }

  public void addSpringBootWeb(Project project) {
    springBootWebService.addSpringBootWeb(project);
  }

  public void addSpringBootUndertow(Project project) {
    springBootWebService.addSpringBootUndertow(project);
  }
}
