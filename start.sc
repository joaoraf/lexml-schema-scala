import java.util.Arrays
  
interp.load.cp(ammonite.ops.Path("/home/joao/workspace_oxygen2/lexml-schema-scala/target/lexml-schema-scala-0.0.1-SNAPSHOT.jar"))
  
import java.io.File
import scala.xml._
import ammonite.ops._

import $ivy.`com.lihaoyi::pprint:0.5.3`, pprint._
import $ivy.`commons-io:commons-io:2.6`, org.apache.commons.{io => cio}

@

import br.org.lexml.schema.scala._
import scalaxb._

val sampleDir =  wd / 'src / 'test / 'samples
val sampleFiles = ls! sampleDir |? (_.last endsWith ".xml")

def loadSample(p : Path) = { 
  try {
    val c = read(p,"utf-8")
    val x = XML.loadString(c)
    Some((p,scalaxb.fromXML[DocumentTypes](x)))
  } catch {
     case ex : Exception =>
       System.err.println("Error in: " + p.last)
       ex.printStackTrace(System.err)
       None
  }
}

val samples = sampleFiles.flatMap(loadSample).toMap
