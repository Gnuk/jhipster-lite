Feature: Prettier

  Scenario: Should prettier from module
    When I apply "prettier" module to default project with package json
      | packageName | tech.jhipster.chips |
      | baseName    | jhipster            |
      | endOfLine   | lf                  |
    Then I should have files in ""
      | .prettierignore |
      | .prettierrc     |
