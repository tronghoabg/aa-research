package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class zzauf extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzauf(InputStream inputStream, long j8) {
        super(inputStream);
        this.zza = j8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i5 = super.read();
        if (i5 != -1) {
            this.zzb++;
        }
        return i5;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = super.read(bArr, i5, i10);
        if (i11 != -1) {
            this.zzb += i11;
        }
        return i11;
    }
}
