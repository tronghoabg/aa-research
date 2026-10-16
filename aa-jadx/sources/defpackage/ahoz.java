package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahoz extends java.io.OutputStream {
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private byte[] buffer;
    private int bufferPos;
    private final java.util.ArrayList<defpackage.ahpa> flushedBuffers;
    private int flushedBuffersTotalBytes;
    private final int initialCapacity;

    public ahoz(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Buffer size < 0");
        }
        this.initialCapacity = i;
        this.flushedBuffers = new java.util.ArrayList<>();
        this.buffer = new byte[i];
    }

    private byte[] copyArray(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, java.lang.Math.min(bArr.length, i));
        return bArr2;
    }

    private void flushFullBuffer(int i) {
        this.flushedBuffers.add(new defpackage.ahqe(this.buffer));
        int length = this.flushedBuffersTotalBytes + this.buffer.length;
        this.flushedBuffersTotalBytes = length;
        this.buffer = new byte[java.lang.Math.max(this.initialCapacity, java.lang.Math.max(i, length >>> 1))];
        this.bufferPos = 0;
    }

    private void flushLastBuffer() {
        int i = this.bufferPos;
        byte[] bArr = this.buffer;
        if (i >= bArr.length) {
            this.flushedBuffers.add(new defpackage.ahqe(this.buffer));
            this.buffer = EMPTY_BYTE_ARRAY;
        } else if (i > 0) {
            this.flushedBuffers.add(new defpackage.ahqe(copyArray(bArr, i)));
        }
        this.flushedBuffersTotalBytes += this.bufferPos;
        this.bufferPos = 0;
    }

    public synchronized int size() {
        return this.flushedBuffersTotalBytes + this.bufferPos;
    }

    public synchronized defpackage.ahpa toByteString() {
        flushLastBuffer();
        return defpackage.ahpa.copyFrom(this.flushedBuffers);
    }

    public java.lang.String toString() {
        return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.buffer;
        int length = bArr2.length;
        int i3 = this.bufferPos;
        int i4 = length - i3;
        if (i2 <= i4) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.bufferPos += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        flushFullBuffer(i5);
        java.lang.System.arraycopy(bArr, i + i4, this.buffer, 0, i5);
        this.bufferPos = i5;
    }

    @Override // java.io.OutputStream
    public synchronized void write(int i) {
        if (this.bufferPos == this.buffer.length) {
            flushFullBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.bufferPos;
        this.bufferPos = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
