var i = 0
val foundIt = false
while(i < args.length && !foundIt){
  if(!args(i).startsWith("-")){
    if(args(i).endsWith(.scala"))
      foundIt = true
  }
  i = i + 1
}
