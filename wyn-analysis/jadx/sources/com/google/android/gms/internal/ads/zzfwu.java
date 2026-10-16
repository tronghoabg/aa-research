package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzfwu {
    private final zzfvv zza;
    private final ArrayList zzb;

    public zzfwu(zzfvv zzfvvVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        this.zza = zzfvvVar;
        arrayList.add(str);
    }

    public final void zza(String str) {
        this.zzb.add(str);
    }

    public final zzfvv zzb() {
        return this.zza;
    }

    public final ArrayList zzc() {
        return this.zzb;
    }
}
