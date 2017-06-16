object FileMatcher{
  private def filesHere = (new java.io.File(".")).lastFiles
  private def filesEnding(query: String) =
    for(file <- filesHere; if file.getName.endsWith(query))
      yield file
  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))
  def filesContaining(query: String) =
    filesMatching(_.contains(query))
  def filesRegex(query: query) =
    filesMatching(_.matches(query))
}
