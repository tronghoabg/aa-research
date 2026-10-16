package com.google.android.gms.internal.ads;

import D6.K0;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzfmo implements zzddc {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcfp zzc;

    public zzfmo(Context context, zzcfp zzcfpVar) {
        this.zzb = context;
        this.zzc = zzcfpVar;
    }

    public final synchronized void zzb(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle zzc() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zzdJ(K0 k02) {
        if (k02.f2338a != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
