package com.bumptech.glide.g;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final long f2896a;

    /* renamed from: b, reason: collision with root package name */
    private int f2897b;

    private e(InputStream inputStream, long j2) {
        super(inputStream);
        this.f2896a = j2;
    }

    public static InputStream a(InputStream inputStream, long j2) {
        return new e(inputStream, j2);
    }

    private final void b(int i2) throws IOException {
        if (i2 >= 0) {
            this.f2897b += i2;
            return;
        }
        long j2 = this.f2896a;
        int i3 = this.f2897b;
        if (j2 - i3 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j2 + ", but read: " + i3);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f2896a - this.f2897b, this.in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i2;
        i2 = super.read();
        b(i2 >= 0 ? 1 : -1);
        return i2;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        i4 = super.read(bArr, i2, i3);
        b(i4);
        return i4;
    }
}
