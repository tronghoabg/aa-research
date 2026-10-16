package org.apache.tika.sax;

import com.applovin.shadow.okio.Utf8;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: classes5.dex */
public class SafeContentHandler extends ContentHandlerDecorator {
    private static final char[] REPLACEMENT = {Utf8.REPLACEMENT_CHARACTER};
    private final Output charactersOutput;
    private final Output ignorableWhitespaceOutput;

    public interface Output {
        void write(char[] cArr, int i5, int i10) throws SAXException;
    }

    public static class StringOutput implements Output {
        private final StringBuilder builder;

        public /* synthetic */ StringOutput(int i5) {
            this();
        }

        public String toString() {
            return this.builder.toString();
        }

        @Override // org.apache.tika.sax.SafeContentHandler.Output
        public void write(char[] cArr, int i5, int i10) {
            this.builder.append(cArr, i5, i10);
        }

        private StringOutput() {
            this.builder = new StringBuilder();
        }
    }

    public SafeContentHandler(ContentHandler contentHandler) {
        super(contentHandler);
        final int i5 = 0;
        this.charactersOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f42950b;

            {
                this.f42950b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i10, int i11) throws SAXException {
                switch (i5) {
                    case 0:
                        this.f42950b.lambda$new$0(cArr, i10, i11);
                        break;
                    default:
                        this.f42950b.lambda$new$1(cArr, i10, i11);
                        break;
                }
            }
        };
        final int i10 = 1;
        this.ignorableWhitespaceOutput = new Output(this) { // from class: org.apache.tika.sax.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafeContentHandler f42950b;

            {
                this.f42950b = this;
            }

            @Override // org.apache.tika.sax.SafeContentHandler.Output
            public final void write(char[] cArr, int i102, int i11) throws SAXException {
                switch (i10) {
                    case 0:
                        this.f42950b.lambda$new$0(cArr, i102, i11);
                        break;
                    default:
                        this.f42950b.lambda$new$1(cArr, i102, i11);
                        break;
                }
            }
        };
    }

    private void filter(char[] cArr, int i5, int i10, Output output) throws SAXException {
        int i11 = i10 + i5;
        int i12 = i5;
        while (i5 < i11) {
            int iCodePointAt = Character.codePointAt(cArr, i5, i11);
            int iCharCount = Character.charCount(iCodePointAt) + i5;
            if (isInvalid(iCodePointAt)) {
                if (i5 > i12) {
                    output.write(cArr, i12, i5 - i12);
                }
                writeReplacement(output);
                i12 = iCharCount;
            }
            i5 = iCharCount;
        }
        output.write(cArr, i12, i11 - i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(char[] cArr, int i5, int i10) throws SAXException {
        super.characters(cArr, i5, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(char[] cArr, int i5, int i10) throws SAXException {
        super.ignorableWhitespace(cArr, i5, i10);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i5, int i10) throws SAXException {
        filter(cArr, i5, i10, this.charactersOutput);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i5, int i10) throws SAXException {
        filter(cArr, i5, i10, this.ignorableWhitespaceOutput);
    }

    public boolean isInvalid(int i5) {
        return i5 < 32 ? (i5 == 9 || i5 == 10 || i5 == 13) ? false : true : i5 < 57344 ? i5 > 55295 : i5 < 65536 ? i5 > 65533 : i5 > 1114111;
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        int i5 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= attributes.getLength()) {
                break;
            }
            if (isInvalid(attributes.getValue(i10))) {
                AttributesImpl attributesImpl = new AttributesImpl();
                for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                    String value = attributes.getValue(i11);
                    if (i11 >= i10 && isInvalid(value)) {
                        StringOutput stringOutput = new StringOutput(i5);
                        filter(value.toCharArray(), 0, value.length(), stringOutput);
                        value = stringOutput.toString();
                    }
                    attributesImpl.addAttribute(attributes.getURI(i11), attributes.getLocalName(i11), attributes.getQName(i11), attributes.getType(i11), value);
                }
                attributes = attributesImpl;
            } else {
                i10++;
            }
        }
        super.startElement(str, str2, str3, attributes);
    }

    public void writeReplacement(Output output) throws SAXException {
        char[] cArr = REPLACEMENT;
        output.write(cArr, 0, cArr.length);
    }

    private boolean isInvalid(String str) {
        char[] charArray = str.toCharArray();
        int iCharCount = 0;
        while (iCharCount < charArray.length) {
            int iCodePointAt = Character.codePointAt(charArray, iCharCount);
            if (isInvalid(iCodePointAt)) {
                return true;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return false;
    }
}
