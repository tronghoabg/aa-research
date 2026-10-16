package com.google.firebase.messaging;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private long f10070a;

    /* renamed from: b, reason: collision with root package name */
    private long f10071b;

    a(InputStream inputStream) {
        super(inputStream);
        this.f10071b = -1L;
        this.f10070a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(this.in.available(), this.f10070a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        this.in.mark(i2);
        this.f10071b = this.f10070a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f10070a;
        if (j2 == 0) {
            return -1;
        }
        int i4 = this.in.read(bArr, i2, (int) Math.min(i3, j2));
        if (i4 != -1) {
            this.f10070a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f10071b == -1) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.f10070a = this.f10071b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = this.in.skip(Math.min(j2, this.f10070a));
        this.f10070a -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f10070a == 0) {
            return -1;
        }
        int i2 = this.in.read();
        if (i2 != -1) {
            this.f10070a--;
        }
        return i2;
    }
}
