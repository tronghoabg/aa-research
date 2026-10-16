package org.apache.tika.sax;

import java.io.StringWriter;
import java.io.Writer;
import org.apache.tika.exception.WriteLimitReachedException;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.ParseRecord;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class WriteOutContentHandler extends ContentHandlerDecorator {
    private ParseContext parseContext;
    private boolean throwOnWriteLimitReached;
    private int writeCount;
    private final int writeLimit;
    private boolean writeLimitReached;

    public WriteOutContentHandler(ContentHandler contentHandler, int i5) {
        super(contentHandler);
        this.writeCount = 0;
        this.throwOnWriteLimitReached = true;
        this.parseContext = null;
        this.writeLimit = i5;
    }

    private void handleWriteLimitReached() throws WriteLimitReachedException {
        this.writeLimitReached = true;
        this.writeCount = this.writeLimit;
        if (this.throwOnWriteLimitReached) {
            throw new WriteLimitReachedException(this.writeLimit);
        }
        ParseRecord parseRecord = (ParseRecord) this.parseContext.get(ParseRecord.class);
        if (parseRecord != null) {
            parseRecord.setWriteLimitReached(true);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i5, int i10) throws SAXException {
        if (this.writeLimitReached) {
            return;
        }
        int i11 = this.writeLimit;
        if (i11 != -1) {
            int i12 = this.writeCount;
            if (i12 + i10 > i11) {
                super.characters(cArr, i5, i11 - i12);
                handleWriteLimitReached();
                return;
            }
        }
        super.characters(cArr, i5, i10);
        this.writeCount += i10;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i5, int i10) throws SAXException {
        if (this.writeLimitReached) {
            return;
        }
        int i11 = this.writeLimit;
        if (i11 != -1) {
            int i12 = this.writeCount;
            if (i12 + i10 > i11) {
                super.ignorableWhitespace(cArr, i5, i11 - i12);
                handleWriteLimitReached();
                return;
            }
        }
        super.ignorableWhitespace(cArr, i5, i10);
        this.writeCount += i10;
    }

    public WriteOutContentHandler(Writer writer, int i5) {
        this(new ToTextContentHandler(writer), i5);
    }

    public WriteOutContentHandler(Writer writer) {
        this(writer, -1);
    }

    public WriteOutContentHandler(int i5) {
        this(new StringWriter(), i5);
    }

    public WriteOutContentHandler() {
        this(100000);
    }

    public WriteOutContentHandler(ContentHandler contentHandler, int i5, boolean z2, ParseContext parseContext) {
        super(contentHandler);
        this.writeCount = 0;
        this.writeLimit = i5;
        this.throwOnWriteLimitReached = z2;
        this.parseContext = parseContext;
    }
}
