package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class zzics extends FilterInputStream {
    private int zza;

    public zzics(InputStream inputStream, int i5) {
        super(inputStream);
        this.zza = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int i5 = super.read();
        if (i5 >= 0) {
            this.zza--;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        int iSkip = (int) super.skip(Math.min(j8, this.zza));
        if (iSkip >= 0) {
            this.zza -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = this.zza;
        if (i11 <= 0) {
            return -1;
        }
        int i12 = super.read(bArr, i5, Math.min(i10, i11));
        if (i12 >= 0) {
            this.zza -= i12;
        }
        return i12;
    }
}
