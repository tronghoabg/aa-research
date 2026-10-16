package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: classes5.dex */
class ContentHandlerResource implements ForkResource {
    private final ContentHandler handler;

    public ContentHandlerResource(ContentHandler contentHandler) {
        this.handler = contentHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) throws SAXException, IOException {
        AttributesImpl attributesImpl;
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 1) {
            this.handler.startDocument();
            return;
        }
        if (unsignedByte == 2) {
            this.handler.endDocument();
            return;
        }
        if (unsignedByte == 3) {
            this.handler.startPrefixMapping(readString(dataInputStream), readString(dataInputStream));
            return;
        }
        if (unsignedByte == 4) {
            this.handler.endPrefixMapping(readString(dataInputStream));
            return;
        }
        if (unsignedByte == 5) {
            String string = readString(dataInputStream);
            String string2 = readString(dataInputStream);
            String string3 = readString(dataInputStream);
            int i5 = dataInputStream.readInt();
            if (i5 >= 0) {
                attributesImpl = new AttributesImpl();
                for (int i10 = 0; i10 < i5; i10++) {
                    attributesImpl.addAttribute(readString(dataInputStream), readString(dataInputStream), readString(dataInputStream), readString(dataInputStream), readString(dataInputStream));
                }
            } else {
                attributesImpl = null;
            }
            this.handler.startElement(string, string2, string3, attributesImpl);
            return;
        }
        if (unsignedByte == 6) {
            this.handler.endElement(readString(dataInputStream), readString(dataInputStream), readString(dataInputStream));
            return;
        }
        if (unsignedByte == 7) {
            char[] characters = readCharacters(dataInputStream);
            this.handler.characters(characters, 0, characters.length);
        } else if (unsignedByte == 8) {
            char[] characters2 = readCharacters(dataInputStream);
            this.handler.characters(characters2, 0, characters2.length);
        } else if (unsignedByte == 9) {
            this.handler.processingInstruction(readString(dataInputStream), readString(dataInputStream));
        } else if (unsignedByte == 10) {
            this.handler.skippedEntity(readString(dataInputStream));
        }
    }

    private char[] readCharacters(DataInputStream dataInputStream) throws IOException {
        return readStringUTF(dataInputStream).toCharArray();
    }

    private String readString(DataInputStream dataInputStream) throws IOException {
        if (dataInputStream.readBoolean()) {
            return readStringUTF(dataInputStream);
        }
        return null;
    }

    private String readStringUTF(DataInputStream dataInputStream) throws IOException {
        int i5 = dataInputStream.readInt();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i5; i10++) {
            sb2.append(dataInputStream.readUTF());
        }
        return sb2.toString();
    }

    @Override // org.apache.tika.fork.ForkResource
    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        try {
            internalProcess(dataInputStream);
            return null;
        } catch (SAXException e7) {
            return e7;
        }
    }
}
