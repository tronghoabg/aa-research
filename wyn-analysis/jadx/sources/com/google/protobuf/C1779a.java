package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1779a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f27643a;

    public C1779a(InputStream inputStream, int i5) {
        super(inputStream);
        this.f27643a = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f27643a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f27643a <= 0) {
            return -1;
        }
        int i5 = super.read();
        if (i5 >= 0) {
            this.f27643a--;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) {
        int iSkip = (int) super.skip(Math.min(j8, this.f27643a));
        if (iSkip >= 0) {
            this.f27643a -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = this.f27643a;
        if (i11 <= 0) {
            return -1;
        }
        int i12 = super.read(bArr, i5, Math.min(i10, i11));
        if (i12 >= 0) {
            this.f27643a -= i12;
        }
        return i12;
    }
}
