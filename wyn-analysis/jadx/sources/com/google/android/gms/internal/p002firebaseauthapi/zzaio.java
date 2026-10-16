package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzaio extends zzaiq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzaip zzc;

    public zzaio(zzaip zzaipVar) {
        this.zzc = zzaipVar;
        this.zzb = zzaipVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final byte zza() {
        int i5 = this.zza;
        if (i5 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i5 + 1;
        return this.zzc.zzb(i5);
    }
}
