package org.apache.tika.parser.external;

import R8.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import org.apache.tika.exception.TikaException;
import org.apache.tika.mime.MediaType;
import org.apache.tika.mime.MimeTypeException;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public final class ExternalParsersConfigReader implements ExternalParsersConfigReaderMetKeys {
    private static String getString(Element element) {
        StringBuilder sb2 = new StringBuilder();
        NodeList childNodes = element.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 3) {
                sb2.append(nodeItem.getNodeValue());
            }
        }
        return sb2.toString();
    }

    public static List<ExternalParser> read(InputStream inputStream) throws TikaException, IOException {
        try {
            return read(XMLReaderUtils.getDocumentBuilder().parse(new InputSource(inputStream)));
        } catch (SAXException e7) {
            throw new TikaException("Invalid parser configuration", e7);
        }
    }

    private static boolean readCheckTagAndCheck(Element element) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = element.getChildNodes();
        String string = null;
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1) {
                Element element2 = (Element) nodeItem;
                if (element2.getTagName().equals(ExternalParsersConfigReaderMetKeys.COMMAND_TAG)) {
                    string = getString(element2);
                }
                if (element2.getTagName().equals(ExternalParsersConfigReaderMetKeys.ERROR_CODES_TAG)) {
                    StringTokenizer stringTokenizer = new StringTokenizer(getString(element2), ",");
                    while (stringTokenizer.hasMoreElements()) {
                        try {
                            arrayList.add(Integer.valueOf(Integer.parseInt(stringTokenizer.nextToken())));
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
        }
        if (string == null) {
            return true;
        }
        String[] strArrSplit = string.split(StringUtils.SPACE);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return ExternalParser.check(strArrSplit, iArr);
    }

    private static Map<Pattern, String> readMetadataPatterns(Element element) {
        HashMap map = new HashMap();
        NodeList childNodes = element.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1) {
                Element element2 = (Element) nodeItem;
                if (element2.getTagName().equals("match")) {
                    map.put(Pattern.compile(getString(element2)), element2.getAttribute(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR));
                }
            }
        }
        return map;
    }

    private static Set<MediaType> readMimeTypes(Element element) {
        HashSet hashSet = new HashSet();
        NodeList childNodes = element.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1) {
                Element element2 = (Element) nodeItem;
                if (element2.getTagName().equals("mime-type")) {
                    hashSet.add(MediaType.parse(getString(element2)));
                }
            }
        }
        return hashSet;
    }

    private static ExternalParser readParser(Element element) throws TikaException {
        Element element2;
        ExternalParser externalParser = new ExternalParser();
        NodeList childNodes = element.getChildNodes();
        for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
            Node nodeItem = childNodes.item(i5);
            if (nodeItem.getNodeType() == 1) {
                element2 = (Element) nodeItem;
                String tagName = element2.getTagName();
                tagName.getClass();
                switch (tagName) {
                    case "metadata":
                        externalParser.setMetadataExtractionPatterns(readMetadataPatterns(element2));
                        break;
                    case "check":
                        if (!readCheckTagAndCheck(element2)) {
                            return null;
                        }
                        break;
                    case "command":
                        externalParser.setCommand(getString(element2));
                        break;
                    case "mime-types":
                        externalParser.setSupportedTypes(readMimeTypes(element2));
                        break;
                    default:
                        throw new IllegalArgumentException(v.f("reaction not defined for ", element2.getTagName()));
                }
            }
        }
        return externalParser;
    }

    public static List<ExternalParser> read(Document document) throws TikaException, IOException {
        return read(document.getDocumentElement());
    }

    public static List<ExternalParser> read(Element element) throws TikaException, IOException {
        ExternalParser parser;
        ArrayList arrayList = new ArrayList();
        if (element != null && element.getTagName().equals(ExternalParsersConfigReaderMetKeys.EXTERNAL_PARSERS_TAG)) {
            NodeList childNodes = element.getChildNodes();
            for (int i5 = 0; i5 < childNodes.getLength(); i5++) {
                Node nodeItem = childNodes.item(i5);
                if (nodeItem.getNodeType() == 1) {
                    Element element2 = (Element) nodeItem;
                    if (element2.getTagName().equals(ExternalParsersConfigReaderMetKeys.PARSER_TAG) && (parser = readParser(element2)) != null) {
                        arrayList.add(parser);
                    }
                }
            }
            return arrayList;
        }
        throw new MimeTypeException(v.f("Not a <external-parsers/> configuration document: ", element != null ? element.getTagName() : "n/a"));
    }
}
