package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class aagy extends FilterInputStream implements DataInput, InputStreamRetargetInterface {
    private final DataInputStream a;

    public aagy(InputStream inputStream) {
        super(inputStream);
        this.a = new DataInputStream(inputStream);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    @ResultIgnorabilityUnspecified
    public final float readFloat() throws IOException {
        int i = read() & 255;
        int i2 = read() & 255;
        int i3 = read() & 255;
        return Float.intBitsToFloat(((read() & 255) << 24) | i | (i2 << 8) | (i3 << 16));
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        zkt.n(bArr, "buffer");
        this.a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final long readLong() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws IOException {
        return read() & 255;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        return ((read() & 255) << 8) | (read() & 255);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
