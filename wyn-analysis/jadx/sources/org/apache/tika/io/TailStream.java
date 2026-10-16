package org.apache.tika.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class TailStream extends FilterInputStream {
    private static final int SKIP_SIZE = 4096;
    private long bytesRead;
    private int currentIndex;
    private byte[] markBuffer;
    private long markBytesRead;
    private int markIndex;
    private final byte[] tailBuffer;
    private final int tailSize;

    public TailStream(InputStream inputStream, int i5) {
        super(inputStream);
        this.tailSize = i5;
        this.tailBuffer = new byte[i5];
    }

    private void appendBuf(byte[] bArr, int i5, int i10) {
        if (i10 >= this.tailSize) {
            replaceTailBuffer(bArr, i5, i10);
        } else {
            copyToTailBuffer(bArr, i5, i10);
        }
        this.bytesRead += i10;
    }

    private void appendByte(byte b5) {
        byte[] bArr = this.tailBuffer;
        int i5 = this.currentIndex;
        int i10 = i5 + 1;
        this.currentIndex = i10;
        bArr[i5] = b5;
        if (i10 >= this.tailSize) {
            this.currentIndex = 0;
        }
        this.bytesRead++;
    }

    private void copyToTailBuffer(byte[] bArr, int i5, int i10) {
        int iMin = Math.min(this.tailSize - this.currentIndex, i10);
        System.arraycopy(bArr, i5, this.tailBuffer, this.currentIndex, iMin);
        System.arraycopy(bArr, i5 + iMin, this.tailBuffer, 0, i10 - iMin);
        this.currentIndex = (this.currentIndex + i10) % this.tailSize;
    }

    private void replaceTailBuffer(byte[] bArr, int i5, int i10) {
        int i11 = i5 + i10;
        int i12 = this.tailSize;
        System.arraycopy(bArr, i11 - i12, this.tailBuffer, 0, i12);
        this.currentIndex = 0;
    }

    public byte[] getTail() {
        int iMin = (int) Math.min(this.tailSize, this.bytesRead);
        byte[] bArr = new byte[iMin];
        byte[] bArr2 = this.tailBuffer;
        int i5 = this.currentIndex;
        System.arraycopy(bArr2, i5, bArr, 0, iMin - i5);
        byte[] bArr3 = this.tailBuffer;
        int i10 = this.currentIndex;
        System.arraycopy(bArr3, 0, bArr, iMin - i10, i10);
        return bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i5) {
        int i10 = this.tailSize;
        byte[] bArr = new byte[i10];
        this.markBuffer = bArr;
        System.arraycopy(this.tailBuffer, 0, bArr, 0, i10);
        this.markIndex = this.currentIndex;
        this.markBytesRead = this.bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i5 = super.read();
        if (i5 != -1) {
            appendByte((byte) i5);
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        byte[] bArr = this.markBuffer;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.tailBuffer, 0, this.tailSize);
            this.currentIndex = this.markIndex;
            this.bytesRead = this.markBytesRead;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) throws IOException {
        int iMin = (int) Math.min(j8, 4096L);
        byte[] bArr = new byte[iMin];
        long j10 = 0;
        int i5 = 0;
        while (j10 < j8 && i5 != -1) {
            i5 = read(bArr, 0, (int) Math.min(iMin, j8 - j10));
            if (i5 != -1) {
                j10 += i5;
            }
        }
        if (i5 >= 0 || j10 != 0) {
            return j10;
        }
        return -1L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i5 = super.read(bArr);
        if (i5 > 0) {
            appendBuf(bArr, 0, i5);
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = super.read(bArr, i5, i10);
        if (i11 > 0) {
            appendBuf(bArr, i5, i11);
        }
        return i11;
    }
}
