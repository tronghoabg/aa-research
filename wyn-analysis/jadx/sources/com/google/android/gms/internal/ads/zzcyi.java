package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcyi implements zzepm {
    public final List zza;

    public zzcyi(List list) {
        this.zza = list;
    }

    public static zzema zza(zzeog zzeogVar) {
        return new zzemb(zzeogVar, zzcyh.zza);
    }

    public static zzema zzb(zzema zzemaVar) {
        return new zzemb(zzemaVar, zzcyg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzhcf.zzr((p8.p) it.next(), new zzcyf(this), zzhcw.zza());
        }
    }

    public zzcyi(zzcya zzcyaVar) {
        this.zza = Collections.singletonList(zzhcf.zza(zzcyaVar));
    }
}
