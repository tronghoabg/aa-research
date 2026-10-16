package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class zzgzs extends FilterInputStream {
    private long zza;
    private long zzb;

    public zzgzs(InputStream inputStream, long j8) {
        super(inputStream);
        this.zzb = -1L;
        inputStream.getClass();
        zzgtr.zzb(j8 >= 0, "limit must be non-negative");
        this.zza = j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        ((FilterInputStream) this).in.mark(i5);
        this.zzb = this.zza;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza == 0) {
            return -1;
        }
        int i5 = ((FilterInputStream) this).in.read();
        if (i5 != -1) {
            this.zza--;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.zzb == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.zza = this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j8, this.zza));
        this.zza -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        long j8 = this.zza;
        if (j8 == 0) {
            return -1;
        }
        int i11 = ((FilterInputStream) this).in.read(bArr, i5, (int) Math.min(i10, j8));
        if (i11 != -1) {
            this.zza -= i11;
        }
        return i11;
    }
}
