package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzmq implements zzmi {
    public final zzxg zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzmq(zzxn zzxnVar, boolean z2) {
        this.zza = new zzxg(zzxnVar, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmi
    public final zzbf zzb() {
        return this.zza.zzA();
    }

    public final void zzc(int i5) {
        this.zzd = i5;
        this.zze = false;
        this.zzc.clear();
    }
}
