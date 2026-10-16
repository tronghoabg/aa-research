package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f24376a;

    /* renamed from: b, reason: collision with root package name */
    private long f24377b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f24376a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jB = this.f24376a.b() - this.f24376a.c();
        return jB > 2147483647L ? f.API_PRIORITY_OTHER : (int) jB;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i5) {
        this.f24377b = i5;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f24376a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f24376a.b(this.f24377b);
    }

    @Override // java.io.InputStream
    public final long skip(long j8) throws IOException {
        return this.f24376a.a(j8);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        return this.f24376a.b(bArr, i5, i10);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f24376a.d();
    }
}
