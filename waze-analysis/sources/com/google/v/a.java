package com.google.v;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private int f12619a;

    a(InputStream inputStream, int i2) {
        super(inputStream);
        this.f12619a = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f12619a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f12619a;
        if (i4 <= 0) {
            return -1;
        }
        int i5 = super.read(bArr, i2, Math.min(i3, i4));
        if (i5 >= 0) {
            this.f12619a -= i5;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) {
        int iSkip = (int) super.skip(Math.min(j2, this.f12619a));
        if (iSkip >= 0) {
            this.f12619a -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f12619a <= 0) {
            return -1;
        }
        int i2 = super.read();
        if (i2 >= 0) {
            this.f12619a--;
        }
        return i2;
    }
}
