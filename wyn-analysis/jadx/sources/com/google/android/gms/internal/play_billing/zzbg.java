package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class zzbg extends zzbi {
    final /* synthetic */ zzbq zza;
    private int zzb = 0;
    private final int zzc;

    public zzbg(zzbq zzbqVar) {
        this.zza = zzbqVar;
        this.zzc = zzbqVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbk
    public final byte zza() {
        int i5 = this.zzb;
        if (i5 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i5 + 1;
        return this.zza.zzb(i5);
    }
}
