package com.fasterxml.jackson.core.io;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class MergedStream extends InputStream implements InputStreamRetargetInterface {
    private byte[] _b;
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i2, int i3) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this._b = bArr;
        this._ptr = i2;
        this._end = i3;
    }

    private void _free() {
        byte[] bArr = this._b;
        if (bArr != null) {
            this._b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this._b != null ? this._end - this._ptr : this._in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        _free();
        this._in.close();
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i2) {
        if (this._b == null) {
            this._in.mark(i2);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this._b == null && this._in.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this._b;
        if (bArr2 == null) {
            return this._in.read(bArr, i2, i3);
        }
        int i4 = this._end;
        int i5 = this._ptr;
        int i6 = i4 - i5;
        if (i3 > i6) {
            i3 = i6;
        }
        System.arraycopy(bArr2, i5, bArr, i2, i3);
        int i7 = this._ptr + i3;
        this._ptr = i7;
        if (i7 >= this._end) {
            _free();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        if (this._b == null) {
            this._in.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        long j3;
        if (this._b != null) {
            int i2 = this._end;
            int i3 = this._ptr;
            j3 = i2 - i3;
            if (j3 > j2) {
                this._ptr = i3 + ((int) j2);
                return j2;
            }
            _free();
            j2 -= j3;
        } else {
            j3 = 0;
        }
        return j2 > 0 ? j3 + this._in.skip(j2) : j3;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this._b;
        if (bArr == null) {
            return this._in.read();
        }
        int i2 = this._ptr;
        int i3 = i2 + 1;
        this._ptr = i3;
        int i4 = bArr[i2] & 255;
        if (i3 >= this._end) {
            _free();
        }
        return i4;
    }
}
