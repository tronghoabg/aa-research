package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class ByteOrderedDataOutputStream extends FilterOutputStream {
    private ByteOrder mByteOrder;
    final OutputStream mOutputStream;

    ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mOutputStream.write(bArr);
    }

    public void writeByte(int i2) throws IOException {
        this.mOutputStream.write(i2);
    }

    public void writeInt(int i2) throws IOException {
        if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
            int i3 = i2 >>> 8;
            int i4 = i2 >>> 16;
            int i5 = i2 >>> 24;
            this.mOutputStream.write(i2 & 255);
            this.mOutputStream.write(i3 & 255);
            this.mOutputStream.write(i4 & 255);
            this.mOutputStream.write(i5);
            return;
        }
        if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write(i2 >>> 24);
            OutputStream outputStream = this.mOutputStream;
            outputStream.write((i2 >>> 16) & 255);
            OutputStream outputStream2 = this.mOutputStream;
            outputStream2.write((i2 >>> 8) & 255);
            this.mOutputStream.write(i2 & 255);
        }
    }

    public void writeShort(short s) throws IOException {
        if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write(s & 255);
            OutputStream outputStream = this.mOutputStream;
            outputStream.write((s >>> 8) & 255);
            return;
        }
        if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
            OutputStream outputStream2 = this.mOutputStream;
            outputStream2.write((s >>> 8) & 255);
            this.mOutputStream.write(s & 255);
        }
    }

    public void writeUnsignedInt(long j2) throws IOException {
        writeInt((int) j2);
    }

    public void writeUnsignedShort(int i2) throws IOException {
        writeShort((short) i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.mOutputStream.write(bArr, i2, i3);
    }
}
