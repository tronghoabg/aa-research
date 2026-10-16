package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzaun extends ByteArrayOutputStream {
    private final zzauc zza;

    public zzaun(zzauc zzaucVar, int i5) {
        this.zza = zzaucVar;
        ((ByteArrayOutputStream) this).buf = zzaucVar.zza(Math.max(i5, 256));
    }

    private final void zza(int i5) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i5 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        zzauc zzaucVar = this.zza;
        int i11 = i10 + i5;
        byte[] bArrZza = zzaucVar.zza(i11 + i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrZza, 0, ((ByteArrayOutputStream) this).count);
        zzaucVar.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrZza;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.zza.zzb(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i5) {
        zza(1);
        super.write(i5);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i5, int i10) {
        zza(i10);
        super.write(bArr, i5, i10);
    }
}
