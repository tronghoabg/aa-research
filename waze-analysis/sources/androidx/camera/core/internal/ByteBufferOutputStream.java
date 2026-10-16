package androidx.camera.core.internal;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws EOFException {
        int length;
        int i4;
        bArr.getClass();
        if (i2 < 0 || i2 > (length = bArr.length) || i3 < 0 || (i4 = i2 + i3) > length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return;
        }
        if (this.mByteBuffer.remaining() < i3) {
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
        this.mByteBuffer.put(bArr, i2, i3);
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws EOFException {
        if (this.mByteBuffer.hasRemaining()) {
            this.mByteBuffer.put((byte) i2);
            return;
        }
        throw new EOFException("Output ByteBuffer has no bytes remaining.");
    }
}
