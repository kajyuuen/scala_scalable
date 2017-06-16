def searchFrom(i: Int): Int =
  if(i >= args.length) -1
  else if (args(i).startWith("-")) searchFrom(i + 1)
  else if (args(i).endWith(".scala")) i
  else searchFrom(i + 1)

val i = searchFrom(0)
