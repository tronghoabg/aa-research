package com.google.firebase.d.c;

import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f9841a = 0;

    c() {
    }

    final long a() {
        return this.f9841a;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        int length;
        int i4;
        if (i2 < 0 || i2 > (length = bArr.length) || i3 < 0 || (i4 = i2 + i3) > length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f9841a += i3;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f9841a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f9841a++;
    }
}
