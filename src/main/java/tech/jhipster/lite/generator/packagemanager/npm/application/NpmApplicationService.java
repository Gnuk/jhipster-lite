package tech.jhipster.lite.generator.packagemanager.npm.application;

import org.springframework.stereotype.Service;
import tech.jhipster.lite.generator.packagemanager.npm.domain.NpmService;
import tech.jhipster.lite.generator.project.domain.Project;

@Service
public class NpmApplicationService {

  private final NpmService npmService;

  public void addDependency(Project project, String dependency, String version) {
    this.npmService.addDependency(project, dependency, version);
  }

  public NpmApplicationService(NpmService npmService) {
    this.npmService = npmService;
  }

  public void install(Project project) {
    npmService.install(project);
  }

  public void prettify(Project project) {
    npmService.prettify(project);
  }
}
