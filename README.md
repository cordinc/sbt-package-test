# SBT Packaging test

The is an example of how to publish a package to Github and then use that package in other projects.

* [guide](https://dev.to/gjuoun/publish-your-scala-library-to-github-packages-4p80)
* [sbt-github-packages sbt plugin](https://github.com/djspiewak/sbt-github-packages)

access token - use a Personal Access Token with all repo permissions and read/write package (both are always needed). Add this as a repo secret with the name TOKEN_WITH_READ_PACKAGES_SCOPE. This token should also be a dev environment variable (eg. "export GITHUB_TOKEN=__tokenValue__"). In the Github env it is referenced with the line in the action "GITHUB_TOKEN: ${{ secrets.TOKEN_WITH_READ_PACKAGES_SCOPE }}".

Adjust the Github action to only run the required sbt actions - probably want "test" to always trigger on commit, but "publish" to be manually triggered, and "run" to never happen.
