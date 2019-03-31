package br.gov.lexml.schema.scala

import br.gov.lexml.schema.scala.data._
import scala.xml._


object LexmlSchema {
  def apply(e : scala.xml.Elem) : DocumentTypes = scalaxb.fromXML[DocumentTypes](e)
  def apply(f : java.io.File) : DocumentTypes = apply(XML.loadFile(f))
  def apply(src : String) : DocumentTypes = apply(XML.loadString(src)) 
    
}