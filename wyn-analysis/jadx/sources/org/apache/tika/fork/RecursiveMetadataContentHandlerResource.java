package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import ka.AbstractC3256n;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.sax.AbstractRecursiveParserWrapperHandler;
import org.apache.tika.sax.RecursiveParserWrapperHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes5.dex */
class RecursiveMetadataContentHandlerResource implements ForkResource {
    private static final ContentHandler DEFAULT_HANDLER = new DefaultHandler();
    private final AbstractRecursiveParserWrapperHandler handler;

    public RecursiveMetadataContentHandlerResource(RecursiveParserWrapperHandler recursiveParserWrapperHandler) {
        this.handler = recursiveParserWrapperHandler;
    }

    private void internalProcess(DataInputStream dataInputStream) throws SAXException, IOException {
        byte b5 = dataInputStream.readByte();
        byte b10 = dataInputStream.readByte();
        ContentHandler contentHandler = DEFAULT_HANDLER;
        if (b10 == 3) {
            contentHandler = (ContentHandler) readObject(dataInputStream);
        } else if (b10 != 4) {
            throw new IllegalArgumentException(AbstractC3256n.g(b10, "Expected HANDLER_AND_METADATA or METADATA_ONLY, but got:"));
        }
        Metadata metadata = (Metadata) readObject(dataInputStream);
        if (b5 == 1) {
            this.handler.endEmbeddedDocument(contentHandler, metadata);
        } else {
            if (b5 != 2) {
                throw new IllegalArgumentException(AbstractC3256n.g(b5, "Expected either 0x01 or 0x02, but got: "));
            }
            this.handler.endDocument(contentHandler, metadata);
        }
        byte b11 = dataInputStream.readByte();
        if (b11 != 5) {
            throw new IOException(AbstractC3256n.g(b11, "Expected the 'complete' signal, but got: "));
        }
    }

    private Object readObject(DataInputStream dataInputStream) throws IOException {
        try {
            return ForkObjectInputStream.readObject(dataInputStream, getClass().getClassLoader());
        } catch (ClassNotFoundException e7) {
            throw new IOException(e7);
        }
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
