package org.apache.tika.parser;

import N0.a;
import R8.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import ka.AbstractC3256n;
import org.apache.tika.exception.CorruptedFileException;
import org.apache.tika.exception.EncryptedDocumentException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.exception.ZeroByteFileException;
import org.apache.tika.extractor.ParentContentHandler;
import org.apache.tika.io.FilenameUtils;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MediaType;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.SecureContentHandler;
import org.apache.tika.utils.ParserUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class RecursiveParserWrapper extends ParserDecorator {
    private static final long serialVersionUID = 9086536568120690938L;
    private final boolean catchEmbeddedExceptions;
    private final boolean inlineContent;

    public class EmbeddedParserDecorator extends StatefulParser {
        private static final long serialVersionUID = 207648200464263337L;
        private String embeddedIdPath;
        private String location;
        private final ParserState parserState;

        public /* synthetic */ EmbeddedParserDecorator(RecursiveParserWrapper recursiveParserWrapper, Parser parser, ParserState parserState) {
            this(parser, "/", "/", parserState);
        }

        @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
        public void parse(InputStream inputStream, ContentHandler contentHandler, Metadata metadata, ParseContext parseContext) throws TikaException, SAXException, IOException {
            String str;
            TemporaryResources temporaryResources;
            if (this.parserState.recursiveParserWrapperHandler.hasHitMaximumEmbeddedResources()) {
                return;
            }
            String strF = a.f(this.location, RecursiveParserWrapper.getResourceName(metadata, this.parserState.unknownCount));
            metadata.add(TikaCoreProperties.EMBEDDED_RESOURCE_PATH, strF);
            if (this.embeddedIdPath.equals("/")) {
                String str2 = this.embeddedIdPath;
                ParserState parserState = this.parserState;
                int i5 = parserState.embeddedCount + 1;
                parserState.embeddedCount = i5;
                str = str2 + i5;
            } else {
                String str3 = this.embeddedIdPath;
                ParserState parserState2 = this.parserState;
                int i10 = parserState2.embeddedCount + 1;
                parserState2.embeddedCount = i10;
                str = str3 + "/" + i10;
            }
            String str4 = str;
            metadata.add(TikaCoreProperties.EMBEDDED_ID_PATH, str4);
            metadata.set(TikaCoreProperties.EMBEDDED_ID, this.parserState.embeddedCount);
            ContentHandler newContentHandler = this.parserState.recursiveParserWrapperHandler.getNewContentHandler();
            this.parserState.recursiveParserWrapperHandler.startEmbeddedDocument(newContentHandler, metadata);
            Parser parser = (Parser) parseContext.get(Parser.class);
            parseContext.set(Parser.class, RecursiveParserWrapper.this.new EmbeddedParserDecorator(getWrappedParser(), strF, str4, this.parserState));
            long jCurrentTimeMillis = System.currentTimeMillis();
            RecursivelySecureContentHandler recursivelySecureContentHandler = (RecursivelySecureContentHandler) parseContext.get(RecursivelySecureContentHandler.class);
            ParentContentHandler parentContentHandler = (ParentContentHandler) parseContext.get(ParentContentHandler.class);
            parseContext.set(ParentContentHandler.class, new ParentContentHandler(recursivelySecureContentHandler));
            TikaInputStream tikaInputStreamCast = TikaInputStream.cast(inputStream);
            if (tikaInputStreamCast == null) {
                TemporaryResources temporaryResources2 = new TemporaryResources();
                temporaryResources = temporaryResources2;
                tikaInputStreamCast = TikaInputStream.get(new kg.a(inputStream), temporaryResources2, metadata);
            } else {
                temporaryResources = null;
            }
            TikaInputStream tikaInputStream = tikaInputStreamCast;
            try {
                try {
                    try {
                        super.parse(inputStream, new RecursivelySecureContentHandler(newContentHandler, tikaInputStream, recursivelySecureContentHandler.handlerCounter, recursivelySecureContentHandler.throwOnWriteLimitReached, parseContext), metadata, parseContext);
                        parseContext.set(Parser.class, parser);
                        parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                        parseContext.set(ParentContentHandler.class, parentContentHandler);
                        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                        this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                        if (temporaryResources != null) {
                            tikaInputStream.close();
                        }
                    } catch (SAXException e7) {
                        if (WriteLimitReachedException.isWriteLimitReached(e7)) {
                            metadata.add(TikaCoreProperties.WRITE_LIMIT_REACHED, "true");
                            throw e7;
                        }
                        if (!RecursiveParserWrapper.this.catchEmbeddedExceptions) {
                            throw e7;
                        }
                        ParserUtils.recordParserFailure(this, e7, metadata);
                        parseContext.set(Parser.class, parser);
                        parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                        parseContext.set(ParentContentHandler.class, parentContentHandler);
                        metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                        this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                        if (temporaryResources == null) {
                            return;
                        }
                        tikaInputStream.close();
                    }
                } catch (CorruptedFileException e10) {
                    throw e10;
                } catch (TikaException e11) {
                    if (e11 instanceof EncryptedDocumentException) {
                        metadata.set(TikaCoreProperties.IS_ENCRYPTED, true);
                    }
                    if (parseContext.get(ZeroByteFileException.IgnoreZeroByteFileException.class) == null || !(e11 instanceof ZeroByteFileException)) {
                        if (!RecursiveParserWrapper.this.catchEmbeddedExceptions) {
                            throw e11;
                        }
                        ParserUtils.recordParserFailure(this, e11, metadata);
                    }
                    parseContext.set(Parser.class, parser);
                    parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                    parseContext.set(ParentContentHandler.class, parentContentHandler);
                    metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                    this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                    if (temporaryResources == null) {
                        return;
                    }
                    tikaInputStream.close();
                }
            } catch (Throwable th) {
                parseContext.set(Parser.class, parser);
                parseContext.set(RecursivelySecureContentHandler.class, recursivelySecureContentHandler);
                parseContext.set(ParentContentHandler.class, parentContentHandler);
                metadata.set(TikaCoreProperties.PARSE_TIME_MILLIS, Long.toString(System.currentTimeMillis() - jCurrentTimeMillis));
                this.parserState.recursiveParserWrapperHandler.endEmbeddedDocument(newContentHandler, metadata);
                if (temporaryResources != null) {
                    tikaInputStream.close();
                }
                throw th;
            }
        }

        private EmbeddedParserDecorator(Parser parser, String str, String str2, ParserState parserState) {
            super(parser);
            this.embeddedIdPath = null;
            this.location = str;
            if (!str.endsWith("/")) {
                this.location = a.f(this.location, "/");
            }
            this.embeddedIdPath = str2;
            this.parserState = parserState;
        }
    }

    public static class ParserState {
        private int embeddedCount;
        private final AbstractRecursiveParserWrapperHandler recursiveParserWrapperHandler;
        private AtomicInteger unknownCount;

        public /* synthetic */ ParserState(AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler, int i5) {
            this(abstractRecursiveParserWrapperHandler);
        }

        private ParserState(AbstractRecursiveParserWrapperHandler abstractRecursiveParserWrapperHandler) {
            this.unknownCount = new AtomicInteger(0);
            this.embeddedCount = 0;
            this.recursiveParserWrapperHandler = abstractRecursiveParserWrapperHandler;
        }
    }

    public static class RecursivelySecureContentHandler extends SecureContentHandler {
        private static AtomicInteger COUNTER = new AtomicInteger();
        private final ContentHandler handler;
        private final SecureHandlerCounter handlerCounter;

        /* renamed from: id, reason: collision with root package name */
        private final int f42940id;
        private final ParseContext parseContext;
        private final boolean throwOnWriteLimitReached;

        public RecursivelySecureContentHandler(ContentHandler contentHandler, TikaInputStream tikaInputStream, SecureHandlerCounter secureHandlerCounter, boolean z2, ParseContext parseContext) {
            super(contentHandler, tikaInputStream);
            this.f42940id = COUNTER.getAndIncrement();
            this.handler = contentHandler;
            this.handlerCounter = secureHandlerCounter;
            this.throwOnWriteLimitReached = z2;
            this.parseContext = parseContext;
        }

        private void handleWriteLimitReached() throws WriteLimitReachedException {
            this.handlerCounter.writeLimitReached = true;
            if (this.throwOnWriteLimitReached) {
                throw new WriteLimitReachedException(this.handlerCounter.totalWriteLimit);
            }
            ParseRecord parseRecord = (ParseRecord) this.parseContext.get(ParseRecord.class);
            if (parseRecord != null) {
                parseRecord.setWriteLimitReached(true);
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i5, int i10) throws SAXException {
            if (this.handlerCounter.writeLimitReached) {
                return;
            }
            if (this.handlerCounter.totalWriteLimit < 0) {
                super.characters(cArr, i5, i10);
                return;
            }
            int available = this.handlerCounter.getAvailable(i10);
            super.characters(cArr, i5, available);
            this.handlerCounter.addChars(available);
            if (available < i10) {
                handleWriteLimitReached();
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            this.handler.endElement(str, str2, str3);
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i5, int i10) throws SAXException {
            if (this.handlerCounter.writeLimitReached) {
                return;
            }
            if (this.handlerCounter.totalWriteLimit < 0) {
                super.ignorableWhitespace(cArr, i5, i10);
                return;
            }
            int available = this.handlerCounter.getAvailable(i10);
            super.ignorableWhitespace(cArr, i5, available);
            this.handlerCounter.addChars(available);
            if (available < i10) {
                handleWriteLimitReached();
            }
        }

        @Override // org.apache.tika.sax.SecureContentHandler, org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            this.handler.startElement(str, str2, str3, attributes);
        }
    }

    public static class SecureHandlerCounter {
        private int totalChars;
        private final int totalWriteLimit;
        private boolean writeLimitReached;

        public /* synthetic */ SecureHandlerCounter(int i5, int i10) {
            this(i5);
        }

        public void addChars(int i5) {
            this.totalChars += i5;
        }

        public int getAvailable(int i5) {
            return Math.min(this.totalWriteLimit - this.totalChars, i5);
        }

        private SecureHandlerCounter(int i5) {
            this.writeLimitReached = false;
            this.totalChars = 0;
            this.totalWriteLimit = i5;
        }
    }

    public RecursiveParserWrapper(Parser parser) {
        this(parser, true);
    }

    public static String getResourceName(Metadata metadata, AtomicInteger atomicInteger) {
        String strF;
        if (metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY) != null) {
            strF = metadata.get(TikaCoreProperties.RESOURCE_NAME_KEY);
        } else if (metadata.get(TikaCoreProperties.EMBEDDED_RELATIONSHIP_ID) != null) {
            strF = metadata.get(TikaCoreProperties.EMBEDDED_RELATIONSHIP_ID);
        } else {
            Property property = TikaCoreProperties.VERSION_NUMBER;
            strF = metadata.get(property) != null ? v.f("version-number-", metadata.get(property)) : AbstractC3256n.g(atomicInteger.incrementAndGet(), "embedded-");
        }
        return FilenameUtils.getName(strF);
    }

    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    public Set<MediaType> getSupportedTypes(ParseContext parseContext) {
        return getWrappedParser().getSupportedTypes(parseContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    @Override // org.apache.tika.parser.ParserDecorator, org.apache.tika.parser.Parser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void parse(java.io.InputStream r17, org.xml.sax.ContentHandler r18, org.apache.tika.metadata.Metadata r19, org.apache.tika.parser.ParseContext r20) throws org.apache.tika.exception.TikaException, org.xml.sax.SAXException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.parser.RecursiveParserWrapper.parse(java.io.InputStream, org.xml.sax.ContentHandler, org.apache.tika.metadata.Metadata, org.apache.tika.parser.ParseContext):void");
    }

    public RecursiveParserWrapper(Parser parser, boolean z2) {
        super(parser);
        this.inlineContent = false;
        this.catchEmbeddedExceptions = z2;
    }
}
