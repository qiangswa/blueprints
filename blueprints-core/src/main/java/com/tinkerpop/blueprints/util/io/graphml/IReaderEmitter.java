package com.tinkerpop.blueprints.util.io.graphml;

import java.util.Map;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public interface IReaderEmitter {
	public void readInVertex(XMLStreamReader reader,Map<String, Object> vertexProps,Map<String, String> keyIdMap, Map<String, String> keyTypesMaps) throws XMLStreamException;

	public void readInEdge(XMLStreamReader reader,
			Map<String, Object> vertexProps) throws XMLStreamException;

	public void readEvent(XMLStreamReader reader, Integer eventType) throws XMLStreamException ;

	public boolean readElementEnd(XMLStreamReader reader, Integer eventType);

	public void readStartElement(XMLStreamReader reader, Integer eventType) throws XMLStreamException;

	public void readNode(XMLStreamReader reader, Integer eventType, Map<String, Object> vertexProps);
	
	public void readGraph(XMLStreamReader reader);
	
	public void readData(XMLStreamReader reader, String key,String value, String attributeName);

}
