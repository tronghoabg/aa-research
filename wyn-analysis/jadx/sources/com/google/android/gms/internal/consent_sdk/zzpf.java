package com.google.android.gms.internal.consent_sdk;

import j$.util.Objects;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzpf extends zzpg {
    final /* synthetic */ zzpm zza;
    private int zzb;
    private final int zzc;

    public zzpf(zzpm zzpmVar) {
        Objects.requireNonNull(zzpmVar);
        this.zza = zzpmVar;
        this.zzb = 0;
        this.zzc = zzpmVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpi
    public final byte zza() {
        int i5 = this.zzb;
        if (i5 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i5 + 1;
        return this.zza.zzb(i5);
    }
}
