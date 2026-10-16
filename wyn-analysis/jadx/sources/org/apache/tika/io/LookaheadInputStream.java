package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public class LookaheadInputStream extends InputStream {
    private final byte[] buffer;
    private InputStream stream;
    private int buffered = 0;
    private int position = 0;
    private int mark = 0;

    public LookaheadInputStream(InputStream inputStream, int i5) {
        this.stream = inputStream;
        this.buffer = new byte[i5];
        if (inputStream != null) {
            inputStream.mark(i5);
        }
    }

    private void fill() throws IOException {
        InputStream inputStream;
        if (available() == 0) {
            int i5 = this.buffered;
            byte[] bArr = this.buffer;
            if (i5 >= bArr.length || (inputStream = this.stream) == null) {
                return;
            }
            int i10 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i10 != -1) {
                this.buffered += i10;
            } else {
                close();
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.buffered - this.position;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            inputStream.reset();
            this.stream = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        this.mark = this.position;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        fill();
        int i5 = this.buffered;
        int i10 = this.position;
        if (i5 <= i10) {
            return -1;
        }
        byte[] bArr = this.buffer;
        this.position = i10 + 1;
        return bArr[i10] & ForkServer.ERROR;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.position = this.mark;
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        fill();
        long jMin = Math.min(j8, available());
        this.position = (int) (this.position + jMin);
        return jMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i10) throws IOException {
        fill();
        int i11 = this.buffered;
        int i12 = this.position;
        if (i11 <= i12) {
            return -1;
        }
        int iMin = Math.min(i10, i11 - i12);
        System.arraycopy(this.buffer, this.position, bArr, i5, iMin);
        this.position += iMin;
        return iMin;
    }
}
