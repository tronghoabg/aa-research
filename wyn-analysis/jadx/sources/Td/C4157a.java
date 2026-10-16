package td;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import md.I;

/* renamed from: td.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4157a extends InputStream implements I {

    /* renamed from: a, reason: collision with root package name */
    public MessageLite f46032a;

    /* renamed from: b, reason: collision with root package name */
    public final Parser f46033b;

    /* renamed from: c, reason: collision with root package name */
    public ByteArrayInputStream f46034c;

    public C4157a(MessageLite messageLite, Parser parser) {
        this.f46032a = messageLite;
        this.f46033b = parser;
    }

    @Override // java.io.InputStream
    public final int available() {
        MessageLite messageLite = this.f46032a;
        if (messageLite != null) {
            return messageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f46034c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f46032a != null) {
            this.f46034c = new ByteArrayInputStream(this.f46032a.toByteArray());
            this.f46032a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f46034c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        MessageLite messageLite = this.f46032a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.f46032a = null;
                this.f46034c = null;
                return -1;
            }
            if (i10 >= serializedSize) {
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr, i5, serializedSize);
                this.f46032a.writeTo(codedOutputStreamNewInstance);
                codedOutputStreamNewInstance.flush();
                codedOutputStreamNewInstance.checkNoSpaceLeft();
                this.f46032a = null;
                this.f46034c = null;
                return serializedSize;
            }
            this.f46034c = new ByteArrayInputStream(this.f46032a.toByteArray());
            this.f46032a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f46034c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i5, i10);
        }
        return -1;
    }
}
