package edu.scala01

class Assignment2 {

  //finding doubles in a string
  def findDoubles(s: String): String = {

    def findDoubles1(s: String, pos: Int, output: String): String = {
      if(pos >= s.length()-1)
        output
      else if(s(pos)==s(pos+1)){
        val ch = s(pos)+ ""+ s(pos)
        findDoubles1(s,pos+2,output+ch)
      }
      else
        findDoubles1(s, pos+1, output)
    }

    findDoubles1(s,0,"")
  }

}
