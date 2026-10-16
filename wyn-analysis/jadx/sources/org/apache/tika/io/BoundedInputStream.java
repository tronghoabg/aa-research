package org.apache.tika.io;

import gg.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public class BoundedInputStream extends InputStream {
    private static final int EOF = -1;
    private final InputStream in;
    private final long max;
    private long pos;

    public BoundedInputStream(long j8, InputStream inputStream) {
        this.max = j8;
        this.in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    public long getPos() {
        return this.pos;
    }

    public boolean hasHitBound() {
        return this.pos >= this.max;
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        this.in.mark(i5);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j8 = this.max;
        if (j8 >= 0 && this.pos >= j8) {
            return -1;
        }
        int i5 = this.in.read();
        this.pos++;
        return i5;
    }

    @Override // java.io.InputStream
    public byte[] readNBytes(int i5) throws IOException {
        return this.in.readNBytes(i5);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        this.in.reset();
        this.pos = 0L;
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        long j10 = this.max;
        if (j10 >= 0) {
            j8 = Math.min(j8, j10 - this.pos);
        }
        long jSkip = this.in.skip(j8);
        this.pos += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        return c.b(this, outputStream);
    }

    @Override // java.io.InputStream
    public int readNBytes(byte[] bArr, int i5, int i10) throws IOException {
        return this.in.readNBytes(bArr, i5, i10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i10) throws IOException {
        long j8 = this.max;
        if (j8 >= 0 && this.pos >= j8) {
            return -1;
        }
        int i11 = this.in.read(bArr, i5, (int) (j8 >= 0 ? Math.min(i10, j8 - this.pos) : i10));
        if (i11 == -1) {
            return -1;
        }
        this.pos += i11;
        return i11;
    }
}
