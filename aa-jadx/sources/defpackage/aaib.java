package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaib extends java.io.FilterInputStream implements java.io.DataInput, j$.io.InputStreamRetargetInterface {
    private final java.io.DataInputStream a;

    public aaib(java.io.InputStream inputStream) {
        super(inputStream);
        this.a = new java.io.DataInputStream(inputStream);
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final float readFloat() throws java.io.IOException {
        int i = read() & 255;
        int i2 = read() & 255;
        int i3 = read() & 255;
        return java.lang.Float.intBitsToFloat(((read() & 255) << 24) | i | (i2 << 8) | (i3 << 16));
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws java.io.IOException {
        defpackage.zlv.n(bArr, "buffer");
        this.a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final long readLong() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() throws java.io.IOException {
        return read() & 255;
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws java.io.IOException {
        return ((read() & 255) << 8) | (read() & 255);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        throw new java.lang.UnsupportedOperationException();
    }
}
