package com.google.android.gms.internal.mlkit_common;

import java.io.OutputStream;

/* loaded from: classes4.dex */
final class zzaz extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i5) {
        this.zza++;
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) {
        int length;
        int i11;
        if (i5 >= 0 && i5 <= (length = bArr.length) && i10 >= 0 && (i11 = i5 + i10) <= length && i11 >= 0) {
            this.zza += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
