package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzink {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzink(int i5, int i10, zzinj zzinjVar) {
        this.zza = zzimw.zza(i5);
        this.zzb = zzimw.zza(i10);
    }

    public final zzink zza(zzini zziniVar) {
        this.zza.add(zziniVar);
        return this;
    }

    public final zzink zzb(zzini zziniVar) {
        this.zzb.add(zziniVar);
        return this;
    }

    public final zzinl zzc() {
        return new zzinl(this.zza, this.zzb, null);
    }
}
