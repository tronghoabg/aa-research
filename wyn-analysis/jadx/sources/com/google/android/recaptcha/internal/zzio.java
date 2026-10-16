package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class zzio extends zzip {
    final /* synthetic */ zziv zza;
    private int zzb = 0;
    private final int zzc;

    public zzio(zziv zzivVar) {
        this.zza = zzivVar;
        this.zzc = zzivVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzir
    public final byte zza() {
        int i5 = this.zzb;
        if (i5 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i5 + 1;
        return this.zza.zzb(i5);
    }
}
