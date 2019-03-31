import pprint._

import br.gov.lexml.schema.scala.LexmlSchema

import br.gov.lexml.schema.scala.data._

import scala.xml._

object Test extends App {
  import scala.xml._
 
  val obj = LexmlSchema(new java.io.File("src/test/samples/senado.federal#proposta.emenda.constitucional=pec#2017=7@data.evento=leitura=2017-03-07t14.00.xml"))
  
  pprint.pprintln(obj,height=999999)
 
  val metadado = obj.Metadado
  
  println("URN = " + metadado.Identificacao.URN)
  
}