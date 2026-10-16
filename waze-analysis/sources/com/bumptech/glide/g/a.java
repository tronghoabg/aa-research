package com.bumptech.glide.g;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f2883a;

    /* renamed from: b, reason: collision with root package name */
    private int f2884b = -1;

    a(ByteBuffer byteBuffer) {
        this.f2883a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2883a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i2) {
        this.f2884b = this.f2883a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        ByteBuffer byteBuffer = this.f2883a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i3, available());
        byteBuffer.get(bArr, i2, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i2 = this.f2884b;
        if (i2 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f2883a.position(i2);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        ByteBuffer byteBuffer = this.f2883a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j2, available());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f2883a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }
}
