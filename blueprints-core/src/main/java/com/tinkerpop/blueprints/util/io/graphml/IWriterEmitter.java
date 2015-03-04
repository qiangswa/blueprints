package com.tinkerpop.blueprints.util.io.graphml;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;

public interface IWriterEmitter {
	public void endVertexKeyTypes(XMLStreamWriter writer) throws XMLStreamException;

	public void endVertex(XMLStreamWriter writer, Vertex value, String type, String type2) throws XMLStreamException;

	public void endEdgeKeyTypes(XMLStreamWriter writer) throws XMLStreamException;

	public void endEdge(XMLStreamWriter writer, Object value, String type) throws XMLStreamException;

	public void endGraphMLProperties(XMLStreamWriter writer) throws XMLStreamException;

	public void endGraph(XMLStreamWriter writer, Graph graph) throws XMLStreamException;

	public void endGraphML(XMLStreamWriter writer) throws XMLStreamException;

}
