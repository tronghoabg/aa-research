package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzddr extends zzdix {
    private boolean zzb;

    public zzddr(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzddq.zza);
        this.zzb = true;
    }
}
