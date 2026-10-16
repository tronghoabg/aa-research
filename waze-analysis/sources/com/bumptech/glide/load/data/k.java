package com.bumptech.glide.load.data;

import androidx.compose.foundation.style.StylePropertiesKt;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3476a = {-1, -31, 0, StylePropertiesKt.RotationZId, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, StylePropertiesKt.MinHeightId, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final int f3477b = 31;

    /* renamed from: c, reason: collision with root package name */
    private final byte f3478c;

    /* renamed from: d, reason: collision with root package name */
    private int f3479d;

    public k(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 >= -1 && i2 <= 8) {
            this.f3478c = (byte) i2;
        } else {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i2);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f3479d;
        int i6 = f3477b;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f3478c;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int iMin = Math.min(i6 - i5, i3);
            System.arraycopy(f3476a, this.f3479d - 2, bArr, i2, iMin);
            i4 = iMin;
        }
        if (i4 > 0) {
            this.f3479d += i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j2) throws IOException {
        long jSkip = super.skip(j2);
        if (jSkip > 0) {
            this.f3479d = (int) (this.f3479d + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2;
        int i3;
        int i4 = this.f3479d;
        if (i4 >= 2 && i4 <= (i3 = f3477b)) {
            i2 = i4 == i3 ? this.f3478c : f3476a[i4 - 2] & 255;
        } else {
            i2 = super.read();
        }
        if (i2 != -1) {
            this.f3479d++;
        }
        return i2;
    }
}
