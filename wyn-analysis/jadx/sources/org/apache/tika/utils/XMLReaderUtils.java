package org.apache.tika.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import org.apache.tika.exception.TikaException;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.OfflineContentHandler;
import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import vg.d;

/* loaded from: classes5.dex */
public class XMLReaderUtils implements Serializable {
    public static final int DEFAULT_MAX_ENTITY_EXPANSIONS = 20;
    public static final int DEFAULT_POOL_SIZE = 10;
    private static final String JAXP_ENTITY_EXPANSION_LIMIT_KEY = "jdk.xml.entityExpansionLimit";
    private static final String XERCES_SECURITY_MANAGER = "org.apache.xerces.util.SecurityManager";
    private static final String XERCES_SECURITY_MANAGER_PROPERTY = "http://apache.org/xml/properties/security-manager";
    private static final long serialVersionUID = 6110455808615143122L;
    private static final vg.b LOG = d.b(XMLReaderUtils.class);
    private static final AtomicBoolean HAS_WARNED_STAX = new AtomicBoolean(false);
    private static final ContentHandler IGNORING_CONTENT_HANDLER = new DefaultHandler();
    private static final DTDHandler IGNORING_DTD_HANDLER = new DTDHandler() { // from class: org.apache.tika.utils.XMLReaderUtils.1
        @Override // org.xml.sax.DTDHandler
        public void notationDecl(String str, String str2, String str3) throws SAXException {
        }

        @Override // org.xml.sax.DTDHandler
        public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
        }
    };
    private static final ErrorHandler IGNORING_ERROR_HANDLER = new ErrorHandler() { // from class: org.apache.tika.utils.XMLReaderUtils.2
        @Override // org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) throws SAXException {
        }

        @Override // org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
        }

        @Override // org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) throws SAXException {
        }
    };
    private static final ReentrantReadWriteLock SAX_POOL_LOCK = new ReentrantReadWriteLock();
    private static final ReentrantReadWriteLock DOM_POOL_LOCK = new ReentrantReadWriteLock();
    private static final AtomicInteger POOL_GENERATION = new AtomicInteger();
    private static final EntityResolver IGNORING_SAX_ENTITY_RESOLVER = new b();
    private static final XMLResolver IGNORING_STAX_ENTITY_RESOLVER = new c();
    private static int POOL_SIZE = 10;
    private static long LAST_LOG = -1;
    private static volatile int MAX_ENTITY_EXPANSIONS = determineMaxEntityExpansions();
    private static ArrayBlockingQueue<PoolSAXParser> SAX_PARSERS = new ArrayBlockingQueue<>(POOL_SIZE);
    private static ArrayBlockingQueue<PoolDOMBuilder> DOM_BUILDERS = new ArrayBlockingQueue<>(POOL_SIZE);

    public static class BuiltInPoolSAXParser extends PoolSAXParser {
        public BuiltInPoolSAXParser(int i5, SAXParser sAXParser) {
            super(i5, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() {
            this.saxParser.reset();
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    public static class PoolDOMBuilder {
        private final DocumentBuilder documentBuilder;
        private final int poolGeneration;

        public PoolDOMBuilder(int i5, DocumentBuilder documentBuilder) {
            this.poolGeneration = i5;
            this.documentBuilder = documentBuilder;
        }

        public DocumentBuilder getDocumentBuilder() {
            return this.documentBuilder;
        }

        public int getPoolGeneration() {
            return this.poolGeneration;
        }

        public void reset() {
            this.documentBuilder.reset();
            this.documentBuilder.setEntityResolver(XMLReaderUtils.IGNORING_SAX_ENTITY_RESOLVER);
            this.documentBuilder.setErrorHandler(null);
        }
    }

    public static abstract class PoolSAXParser {
        final int poolGeneration;
        final SAXParser saxParser;

        public PoolSAXParser(int i5, SAXParser sAXParser) {
            this.poolGeneration = i5;
            this.saxParser = sAXParser;
        }

        public int getGeneration() {
            return this.poolGeneration;
        }

        public SAXParser getSAXParser() {
            return this.saxParser;
        }

        public abstract void reset();
    }

    public static class UnrecognizedPoolSAXParser extends PoolSAXParser {
        public UnrecognizedPoolSAXParser(int i5, SAXParser sAXParser) {
            super(i5, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() throws SAXNotRecognizedException, SAXNotSupportedException {
            try {
                this.saxParser.reset();
            } catch (UnsupportedOperationException unused) {
            }
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused2) {
            }
            XMLReaderUtils.trySetXercesSecurityManager(this.saxParser);
        }
    }

    public static class Xerces2PoolSAXParser extends PoolSAXParser {
        public Xerces2PoolSAXParser(int i5, SAXParser sAXParser) {
            super(i5, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() throws SAXNotRecognizedException, SAXNotSupportedException {
            try {
                Object property = this.saxParser.getProperty(XMLReaderUtils.XERCES_SECURITY_MANAGER_PROPERTY);
                this.saxParser.reset();
                this.saxParser.setProperty(XMLReaderUtils.XERCES_SECURITY_MANAGER_PROPERTY, property);
            } catch (SAXException e7) {
                XMLReaderUtils.LOG.h("problem resetting sax parser", e7);
            }
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    public static class XercesPoolSAXParser extends PoolSAXParser {
        public XercesPoolSAXParser(int i5, SAXParser sAXParser) {
            super(i5, sAXParser);
        }

        @Override // org.apache.tika.utils.XMLReaderUtils.PoolSAXParser
        public void reset() {
            try {
                XMLReaderUtils.clearReader(this.saxParser.getXMLReader());
            } catch (SAXException unused) {
            }
        }
    }

    static {
        try {
            setPoolSize(POOL_SIZE);
        } catch (TikaException e7) {
            throw new RuntimeException("problem initializing SAXParser and DOMBuilder pools", e7);
        }
    }

    private static PoolDOMBuilder acquireDOMBuilder() throws TikaException {
        ReentrantReadWriteLock reentrantReadWriteLock = DOM_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            PoolDOMBuilder poolDOMBuilderPoll = DOM_BUILDERS.poll();
            reentrantReadWriteLock.readLock().unlock();
            if (poolDOMBuilderPoll == null) {
                LOG.warn("Contention waiting for a DOMBuilder. Consider increasing the XMLReaderUtils.POOL_SIZE");
            }
            return poolDOMBuilderPoll;
        } catch (Throwable th) {
            DOM_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    private static PoolSAXParser acquireSAXParser() throws TikaException {
        ReentrantReadWriteLock reentrantReadWriteLock = SAX_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            PoolSAXParser poolSAXParserPoll = SAX_PARSERS.poll();
            reentrantReadWriteLock.readLock().unlock();
            if (poolSAXParserPoll == null) {
                LOG.warn("Contention waiting for a SAXParser. Consider increasing the XMLReaderUtils.POOL_SIZE");
            }
            return poolSAXParserPoll;
        } catch (Throwable th) {
            SAX_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static Document buildDOM(InputStream inputStream, ParseContext parseContext) throws TikaException, SAXException, IOException {
        PoolDOMBuilder poolDOMBuilder;
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        if (documentBuilder == null) {
            PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder();
            poolDOMBuilder = poolDOMBuilderAcquireDOMBuilder;
            documentBuilder = poolDOMBuilderAcquireDOMBuilder != null ? poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder() : getDocumentBuilder();
        } else {
            poolDOMBuilder = null;
        }
        try {
            return documentBuilder.parse(inputStream);
        } finally {
            if (poolDOMBuilder != null) {
                releaseDOMBuilder(poolDOMBuilder);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.apache.tika.utils.XMLReaderUtils.PoolSAXParser buildPoolParser(int r13, javax.xml.parsers.SAXParser r14) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "SAX Security Manager could not be setup [log suppressed for 5 minutes]"
            r14.reset()     // Catch: java.lang.UnsupportedOperationException -> L9
            r3 = r1
            goto La
        L9:
            r3 = r0
        La:
            r4 = 5
            java.lang.String r6 = "org.apache.xerces.util.SecurityManager"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.Object r6 = r6.newInstance(r7)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.Class r7 = r6.getClass()     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.String r8 = "setEntityExpansionLimit"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            r9[r0] = r10     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            int r8 = org.apache.tika.utils.XMLReaderUtils.MAX_ENTITY_EXPANSIONS     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            r9[r0] = r8     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            r7.invoke(r6, r9)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            java.lang.String r7 = "http://apache.org/xml/properties/security-manager"
            r14.setProperty(r7, r6)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L5f java.lang.SecurityException -> Lb2
            r6 = r1
            goto L60
        L42:
            r6 = move-exception
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = org.apache.tika.utils.XMLReaderUtils.LAST_LOG
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r11 = r11.toMillis(r4)
            long r11 = r11 + r9
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L5f
            vg.b r7 = org.apache.tika.utils.XMLReaderUtils.LOG
            r7.h(r2, r6)
            long r6 = java.lang.System.currentTimeMillis()
            org.apache.tika.utils.XMLReaderUtils.LAST_LOG = r6
        L5f:
            r6 = r0
        L60:
            if (r6 != 0) goto L8c
            java.lang.String r7 = "http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit"
            int r8 = org.apache.tika.utils.XMLReaderUtils.MAX_ENTITY_EXPANSIONS     // Catch: org.xml.sax.SAXException -> L6f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: org.xml.sax.SAXException -> L6f
            r14.setProperty(r7, r8)     // Catch: org.xml.sax.SAXException -> L6f
            r0 = r1
            goto L8c
        L6f:
            r1 = move-exception
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = org.apache.tika.utils.XMLReaderUtils.LAST_LOG
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r4 = r11.toMillis(r4)
            long r4 = r4 + r9
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L8c
            vg.b r4 = org.apache.tika.utils.XMLReaderUtils.LOG
            r4.h(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            org.apache.tika.utils.XMLReaderUtils.LAST_LOG = r1
        L8c:
            if (r3 != 0) goto L96
            if (r6 == 0) goto L96
            org.apache.tika.utils.XMLReaderUtils$XercesPoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$XercesPoolSAXParser
            r0.<init>(r13, r14)
            return r0
        L96:
            if (r3 == 0) goto La0
            if (r6 == 0) goto La0
            org.apache.tika.utils.XMLReaderUtils$Xerces2PoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$Xerces2PoolSAXParser
            r0.<init>(r13, r14)
            return r0
        La0:
            if (r3 == 0) goto Lac
            if (r6 != 0) goto Lac
            if (r0 == 0) goto Lac
            org.apache.tika.utils.XMLReaderUtils$BuiltInPoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$BuiltInPoolSAXParser
            r0.<init>(r13, r14)
            return r0
        Lac:
            org.apache.tika.utils.XMLReaderUtils$UnrecognizedPoolSAXParser r0 = new org.apache.tika.utils.XMLReaderUtils$UnrecognizedPoolSAXParser
            r0.<init>(r13, r14)
            return r0
        Lb2:
            r13 = move-exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.utils.XMLReaderUtils.buildPoolParser(int, javax.xml.parsers.SAXParser):org.apache.tika.utils.XMLReaderUtils$PoolSAXParser");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearReader(XMLReader xMLReader) {
        if (xMLReader == null) {
            return;
        }
        xMLReader.setContentHandler(IGNORING_CONTENT_HANDLER);
        xMLReader.setDTDHandler(IGNORING_DTD_HANDLER);
        xMLReader.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
        xMLReader.setErrorHandler(IGNORING_ERROR_HANDLER);
    }

    private static int determineMaxEntityExpansions() {
        String property = System.getProperty(JAXP_ENTITY_EXPANSION_LIMIT_KEY);
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException unused) {
                LOG.j(property, "Couldn't parse an integer for the entity expansion limit: {}; backing off to default: {}", 20);
            }
        }
        return 20;
    }

    public static String getAttrValue(String str, Attributes attributes) {
        for (int i5 = 0; i5 < attributes.getLength(); i5++) {
            if (str.equals(attributes.getLocalName(i5))) {
                return attributes.getValue(i5);
            }
        }
        return null;
    }

    public static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException, TikaException {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = getDocumentBuilderFactory().newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
            documentBuilderNewDocumentBuilder.setErrorHandler(null);
            return documentBuilderNewDocumentBuilder;
        } catch (ParserConfigurationException e7) {
            throw new TikaException("XML parser not available", e7);
        }
    }

    public static DocumentBuilderFactory getDocumentBuilderFactory() throws ParserConfigurationException, IllegalArgumentException {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        vg.b bVar = LOG;
        if (bVar.b()) {
            bVar.u(documentBuilderFactoryNewInstance.getClass(), "DocumentBuilderFactory class {}");
        }
        documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setValidating(false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://javax.xml.XMLConstants/feature/secure-processing", true);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://xml.org/sax/features/external-general-entities", false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://xml.org/sax/features/external-parameter-entities", false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        trySetSAXFeature(documentBuilderFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        trySetXercesSecurityManager(documentBuilderFactoryNewInstance);
        return documentBuilderFactoryNewInstance;
    }

    public static int getMaxEntityExpansions() {
        return MAX_ENTITY_EXPANSIONS;
    }

    public static int getPoolSize() {
        return POOL_SIZE;
    }

    public static SAXParser getSAXParser() throws ParserConfigurationException, TikaException, SAXException {
        try {
            SAXParser sAXParserNewSAXParser = getSAXParserFactory().newSAXParser();
            trySetXercesSecurityManager(sAXParserNewSAXParser);
            return sAXParserNewSAXParser;
        } catch (ParserConfigurationException e7) {
            throw new TikaException("Unable to configure a SAX parser", e7);
        } catch (SAXException e10) {
            throw new TikaException("Unable to create a SAX parser", e10);
        }
    }

    public static SAXParserFactory getSAXParserFactory() throws SAXNotRecognizedException, SAXNotSupportedException, ParserConfigurationException {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        vg.b bVar = LOG;
        if (bVar.b()) {
            bVar.u(sAXParserFactoryNewInstance.getClass(), "SAXParserFactory class {}");
        }
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        sAXParserFactoryNewInstance.setValidating(false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://javax.xml.XMLConstants/feature/secure-processing", true);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://xml.org/sax/features/external-general-entities", false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://xml.org/sax/features/external-parameter-entities", false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        trySetSAXFeature(sAXParserFactoryNewInstance, "http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        return sAXParserFactoryNewInstance;
    }

    public static Transformer getTransformer() throws TikaException, TransformerConfigurationException, TransformerFactoryConfigurationError {
        try {
            TransformerFactory transformerFactoryNewInstance = TransformerFactory.newInstance();
            transformerFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            trySetTransformerAttribute(transformerFactoryNewInstance, "http://javax.xml.XMLConstants/property/accessExternalDTD", "");
            trySetTransformerAttribute(transformerFactoryNewInstance, "http://javax.xml.XMLConstants/property/accessExternalStylesheet", "");
            return transformerFactoryNewInstance.newTransformer();
        } catch (TransformerConfigurationException | TransformerFactoryConfigurationError e7) {
            throw new TikaException("Transformer not available", e7);
        }
    }

    public static XMLInputFactory getXMLInputFactory() {
        XMLInputFactory xMLInputFactoryNewFactory = XMLInputFactory.newFactory();
        vg.b bVar = LOG;
        if (bVar.b()) {
            bVar.u(xMLInputFactoryNewFactory.getClass(), "XMLInputFactory class {}");
        }
        tryToSetStaxProperty(xMLInputFactoryNewFactory, "javax.xml.stream.isNamespaceAware", true);
        tryToSetStaxProperty(xMLInputFactoryNewFactory, "javax.xml.stream.isValidating", false);
        xMLInputFactoryNewFactory.setXMLResolver(IGNORING_STAX_ENTITY_RESOLVER);
        trySetStaxSecurityManager(xMLInputFactoryNewFactory);
        return xMLInputFactoryNewFactory;
    }

    public static XMLReader getXMLReader() throws TikaException, SAXException {
        try {
            XMLReader xMLReader = getSAXParser().getXMLReader();
            xMLReader.setEntityResolver(IGNORING_SAX_ENTITY_RESOLVER);
            return xMLReader;
        } catch (SAXException e7) {
            throw new TikaException("Unable to create an XMLReader", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InputSource lambda$static$0(String str, String str2) throws SAXException, IOException {
        return new InputSource(new StringReader(""));
    }

    private static /* synthetic */ Object lambda$static$1(String str, String str2, String str3, String str4) throws XMLStreamException {
        return "";
    }

    public static void parseSAX(InputStream inputStream, ContentHandler contentHandler, ParseContext parseContext) throws TikaException, SAXException, IOException {
        PoolSAXParser poolSAXParser;
        SAXParser sAXParser = (SAXParser) parseContext.get(SAXParser.class);
        if (sAXParser == null) {
            PoolSAXParser poolSAXParserAcquireSAXParser = acquireSAXParser();
            poolSAXParser = poolSAXParserAcquireSAXParser;
            sAXParser = poolSAXParserAcquireSAXParser != null ? poolSAXParserAcquireSAXParser.getSAXParser() : getSAXParser();
        } else {
            poolSAXParser = null;
        }
        try {
            sAXParser.parse(inputStream, new OfflineContentHandler(contentHandler));
        } finally {
            if (poolSAXParser != null) {
                releaseParser(poolSAXParser);
            }
        }
    }

    private static void releaseDOMBuilder(PoolDOMBuilder poolDOMBuilder) {
        if (poolDOMBuilder.getPoolGeneration() != POOL_GENERATION.get()) {
            return;
        }
        try {
            poolDOMBuilder.reset();
        } catch (UnsupportedOperationException unused) {
        }
        ReentrantReadWriteLock reentrantReadWriteLock = DOM_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (!DOM_BUILDERS.offer(poolDOMBuilder)) {
                LOG.warn("DocumentBuilder not taken back into pool.  If you haven't resized the pool, this could be a sign that there are more calls to 'acquire' than to 'release'");
            }
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            DOM_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    private static void releaseParser(PoolSAXParser poolSAXParser) {
        try {
            poolSAXParser.reset();
        } catch (UnsupportedOperationException unused) {
        }
        if (poolSAXParser.getGeneration() != POOL_GENERATION.get()) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = SAX_POOL_LOCK;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (!SAX_PARSERS.offer(poolSAXParser)) {
                LOG.warn("SAXParser not taken back into pool.  If you haven't resized the pool this could be a sign that there are more calls to 'acquire' than to 'release'");
            }
            reentrantReadWriteLock.readLock().unlock();
        } catch (Throwable th) {
            SAX_POOL_LOCK.readLock().unlock();
            throw th;
        }
    }

    public static void setMaxEntityExpansions(int i5) {
        MAX_ENTITY_EXPANSIONS = i5;
    }

    public static void setPoolSize(int i5) throws TikaException {
        SAX_POOL_LOCK.writeLock().lock();
        try {
            Iterator<PoolSAXParser> it = SAX_PARSERS.iterator();
            while (it.hasNext()) {
                it.next().reset();
            }
            SAX_PARSERS.clear();
            SAX_PARSERS = new ArrayBlockingQueue<>(i5);
            int iIncrementAndGet = POOL_GENERATION.incrementAndGet();
            for (int i10 = 0; i10 < i5; i10++) {
                try {
                    SAX_PARSERS.offer(buildPoolParser(iIncrementAndGet, getSAXParserFactory().newSAXParser()));
                } catch (ParserConfigurationException | SAXException e7) {
                    throw new TikaException("problem creating sax parser", e7);
                }
            }
            SAX_POOL_LOCK.writeLock().unlock();
            DOM_POOL_LOCK.writeLock().lock();
            try {
                DOM_BUILDERS.clear();
                DOM_BUILDERS = new ArrayBlockingQueue<>(i5);
                for (int i11 = 0; i11 < i5; i11++) {
                    DOM_BUILDERS.offer(new PoolDOMBuilder(POOL_GENERATION.get(), getDocumentBuilder()));
                }
                DOM_POOL_LOCK.writeLock().unlock();
                POOL_SIZE = i5;
            } catch (Throwable th) {
                DOM_POOL_LOCK.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            SAX_POOL_LOCK.writeLock().unlock();
            throw th2;
        }
    }

    private static void trySetSAXFeature(SAXParserFactory sAXParserFactory, String str, boolean z2) throws SAXNotRecognizedException, SAXNotSupportedException, ParserConfigurationException {
        try {
            sAXParserFactory.setFeature(str, z2);
        } catch (AbstractMethodError e7) {
            LOG.j(str, "Cannot set SAX feature because outdated XML parser in classpath: {}", e7);
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            LOG.j(str, "SAX Feature unsupported: {}", e11);
        }
    }

    private static void trySetStaxSecurityManager(XMLInputFactory xMLInputFactory) {
        try {
            try {
                xMLInputFactory.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (IllegalArgumentException unused) {
                xMLInputFactory.setProperty("com.ctc.wstx.maxEntityCount", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            }
        } catch (IllegalArgumentException unused2) {
            if (HAS_WARNED_STAX.getAndSet(true)) {
                return;
            }
            LOG.warn("Could not set limit on maximum entity expansions for: " + xMLInputFactory.getClass());
        }
    }

    private static void trySetTransformerAttribute(TransformerFactory transformerFactory, String str, String str2) {
        try {
            transformerFactory.setAttribute(str, str2);
        } catch (AbstractMethodError e7) {
            LOG.j(str, "Cannot set Transformer attribute because outdated XML parser in classpath: {}", e7);
        } catch (SecurityException e10) {
            throw e10;
        } catch (Exception e11) {
            LOG.j(str, "Transformer Attribute unsupported: {}", e11);
        }
    }

    private static void trySetXercesSecurityManager(DocumentBuilderFactory documentBuilderFactory) throws IllegalArgumentException {
        try {
            Object objNewInstance = Class.forName(new String[]{XERCES_SECURITY_MANAGER}[0]).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            objNewInstance.getClass().getMethod("setEntityExpansionLimit", Integer.TYPE).invoke(objNewInstance, Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            documentBuilderFactory.setAttribute(XERCES_SECURITY_MANAGER_PROPERTY, objNewInstance);
        } catch (ClassNotFoundException unused) {
            try {
                documentBuilderFactory.setAttribute("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (IllegalArgumentException e7) {
                if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                    LOG.h("SAX Security Manager could not be setup [log suppressed for 5 minutes]", e7);
                    LAST_LOG = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                LOG.h("SAX Security Manager could not be setup [log suppressed for 5 minutes]", th);
                LAST_LOG = System.currentTimeMillis();
            }
            documentBuilderFactory.setAttribute("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
        }
    }

    private static void tryToSetStaxProperty(XMLInputFactory xMLInputFactory, String str, boolean z2) {
        try {
            xMLInputFactory.setProperty(str, Boolean.valueOf(z2));
        } catch (IllegalArgumentException e7) {
            LOG.j(str, "StAX Feature unsupported: {}", e7);
        }
    }

    private static void trySetSAXFeature(DocumentBuilderFactory documentBuilderFactory, String str, boolean z2) throws ParserConfigurationException {
        try {
            documentBuilderFactory.setFeature(str, z2);
        } catch (AbstractMethodError e7) {
            LOG.j(str, "Cannot set SAX feature because outdated XML parser in classpath: {}", e7);
        } catch (Exception e10) {
            LOG.j(str, "SAX Feature unsupported: {}", e10);
        }
    }

    public static DocumentBuilder getDocumentBuilder(ParseContext parseContext) throws TikaException {
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        return documentBuilder != null ? documentBuilder : getDocumentBuilder();
    }

    public static Transformer getTransformer(ParseContext parseContext) throws TikaException {
        Transformer transformer = (Transformer) parseContext.get(Transformer.class);
        return transformer != null ? transformer : getTransformer();
    }

    public static Document buildDOM(Reader reader, ParseContext parseContext) throws TikaException, SAXException, IOException {
        PoolDOMBuilder poolDOMBuilder;
        DocumentBuilder documentBuilder = (DocumentBuilder) parseContext.get(DocumentBuilder.class);
        if (documentBuilder == null) {
            PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder();
            poolDOMBuilder = poolDOMBuilderAcquireDOMBuilder;
            documentBuilder = poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder();
        } else {
            poolDOMBuilder = null;
        }
        try {
            return documentBuilder.parse(new InputSource(reader));
        } finally {
            if (poolDOMBuilder != null) {
                releaseDOMBuilder(poolDOMBuilder);
            }
        }
    }

    public static XMLInputFactory getXMLInputFactory(ParseContext parseContext) {
        XMLInputFactory xMLInputFactory = (XMLInputFactory) parseContext.get(XMLInputFactory.class);
        return xMLInputFactory != null ? xMLInputFactory : getXMLInputFactory();
    }

    public static void parseSAX(Reader reader, ContentHandler contentHandler, ParseContext parseContext) throws TikaException, ParserConfigurationException, SAXException, IOException {
        PoolSAXParser poolSAXParser;
        SAXParser sAXParser;
        SAXParser sAXParser2 = (SAXParser) parseContext.get(SAXParser.class);
        if (sAXParser2 == null) {
            PoolSAXParser poolSAXParserAcquireSAXParser = acquireSAXParser();
            if (poolSAXParserAcquireSAXParser != null) {
                sAXParser = poolSAXParserAcquireSAXParser.getSAXParser();
            } else {
                sAXParser = getSAXParser();
            }
            SAXParser sAXParser3 = sAXParser;
            poolSAXParser = poolSAXParserAcquireSAXParser;
            sAXParser2 = sAXParser3;
        } else {
            poolSAXParser = null;
        }
        try {
            sAXParser2.parse(new InputSource(reader), new OfflineContentHandler(contentHandler));
        } finally {
            if (poolSAXParser != null) {
                releaseParser(poolSAXParser);
            }
        }
    }

    public static Document buildDOM(Path path) throws TikaException, SAXException, IOException {
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            Document documentBuildDOM = buildDOM(inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            return documentBuildDOM;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void trySetXercesSecurityManager(SAXParser sAXParser) throws SAXNotRecognizedException, SAXNotSupportedException {
        try {
            Object objNewInstance = Class.forName(new String[]{XERCES_SECURITY_MANAGER}[0]).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            objNewInstance.getClass().getMethod("setEntityExpansionLimit", Integer.TYPE).invoke(objNewInstance, Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            sAXParser.setProperty(XERCES_SECURITY_MANAGER_PROPERTY, objNewInstance);
        } catch (ClassNotFoundException unused) {
            try {
                sAXParser.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
            } catch (SAXException e7) {
                if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                    LOG.h("SAX Security Manager could not be setup [log suppressed for 5 minutes]", e7);
                    LAST_LOG = System.currentTimeMillis();
                }
            }
        } catch (Throwable th) {
            if (System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(5L) + LAST_LOG) {
                LOG.h("SAX Security Manager could not be setup [log suppressed for 5 minutes]", th);
                LAST_LOG = System.currentTimeMillis();
            }
            sAXParser.setProperty("http://www.oracle.com/xml/jaxp/properties/entityExpansionLimit", Integer.valueOf(MAX_ENTITY_EXPANSIONS));
        }
    }

    public static Document buildDOM(String str) throws TikaException, SAXException, IOException {
        PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder();
        try {
            return poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder().parse(str);
        } finally {
            releaseDOMBuilder(poolDOMBuilderAcquireDOMBuilder);
        }
    }

    public static Document buildDOM(InputStream inputStream) throws TikaException, SAXException, IOException {
        PoolDOMBuilder poolDOMBuilderAcquireDOMBuilder = acquireDOMBuilder();
        try {
            return poolDOMBuilderAcquireDOMBuilder.getDocumentBuilder().parse(inputStream);
        } finally {
            releaseDOMBuilder(poolDOMBuilderAcquireDOMBuilder);
        }
    }
}
