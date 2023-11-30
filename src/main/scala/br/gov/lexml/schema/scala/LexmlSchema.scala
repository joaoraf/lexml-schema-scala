package br.gov.lexml.schema.scala

import br.gov.lexml.schema.scala.data.*
import scala.xml.*

object LexmlSchema:
  def apply(e: scala.xml.Elem): LexML = scalaxb.fromXML[LexML](e)
  def apply(f: java.io.File): LexML = apply(XML.loadFile(f))
  def apply(d: Array[Byte]): LexML = apply(
    XML.loadString(new String(d, "utf-8"))
  )
  def apply(src: String): LexML = apply(XML.loadString(src))
