package org.apache.tika.sax;

import java.util.Arrays;
import java.util.Iterator;
import org.apache.tika.metadata.Metadata;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes5.dex */
public class StandardsExtractingContentHandler extends ContentHandlerDecorator {
    public static final String STANDARD_REFERENCES = "standard_references";
    private int maxBufferLength;
    private final Metadata metadata;
    private final StringBuilder stringBuilder;
    private double threshold;

    public StandardsExtractingContentHandler(ContentHandler contentHandler, Metadata metadata) {
        super(contentHandler);
        this.maxBufferLength = 100000;
        this.threshold = 0.0d;
        this.metadata = metadata;
        this.stringBuilder = new StringBuilder();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i5, int i10) throws SAXException {
        int length;
        try {
            int i11 = this.maxBufferLength;
            if (i11 > -1 && (length = i11 - this.stringBuilder.length()) <= i10) {
                i10 = length;
            }
            this.stringBuilder.append(new String(Arrays.copyOfRange(cArr, i5, i5 + i10)));
            super.characters(cArr, i5, i10);
        } catch (SAXException e7) {
            handleException(e7);
        }
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
        Iterator<StandardReference> it = StandardsText.extractStandardReferences(this.stringBuilder.toString(), this.threshold).iterator();
        while (it.hasNext()) {
            this.metadata.add(STANDARD_REFERENCES, it.next().toString());
        }
    }

    public double getThreshold() {
        return this.threshold;
    }

    public void setMaxBufferLength(int i5) {
        this.maxBufferLength = i5;
    }

    public void setThreshold(double d3) {
        this.threshold = d3;
    }

    public StandardsExtractingContentHandler() {
        this(new DefaultHandler(), new Metadata());
    }
}
