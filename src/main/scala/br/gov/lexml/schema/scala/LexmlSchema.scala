package br.gov.lexml.schema.scala

import br.gov.lexml.schema.scala.data._
import scala.xml._


object LexmlSchema {
  def apply(e : scala.xml.Elem) : LexML = scalaxb.fromXML[LexML](e)
  def apply(f : java.io.File) : LexML = apply(XML.loadFile(f))
  def apply(src : String) : LexML = apply(XML.loadString(src)) 
    
}