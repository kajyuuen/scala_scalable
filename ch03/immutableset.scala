var jetSet = Set("Boeing", "Airbus") # immutableなのでvarである必要がある
jetSet += "Lear"
println(jetSet.contains("Cessna"))
