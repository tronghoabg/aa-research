package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i5) {
        zzgtr.zzi(!this.zzb);
        this.zza.append(i5, true);
        return this;
    }

    public final zzs zzb() {
        zzgtr.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
