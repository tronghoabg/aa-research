package com.bytedance.sdk.component.oa.uef.uef.uef;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class xs extends InputStream {

    /* renamed from: oa, reason: collision with root package name */
    HttpURLConnection f25071oa;
    InputStream uef;

    public xs(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.uef = inputStream;
        this.f25071oa = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            inputStream.close();
            this.uef = null;
        }
        HttpURLConnection httpURLConnection = this.f25071oa;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f25071oa = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i5) {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            inputStream.mark(i5);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws IOException {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            return inputStream.skip(j8);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i10) throws IOException {
        InputStream inputStream = this.uef;
        if (inputStream != null) {
            return inputStream.read(bArr, i5, i10);
        }
        return 0;
    }
}
