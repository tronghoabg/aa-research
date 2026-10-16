package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdfs extends zzdix {
    private boolean zzb;

    public zzdfs(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzdfr.zza);
        this.zzb = true;
    }
}
