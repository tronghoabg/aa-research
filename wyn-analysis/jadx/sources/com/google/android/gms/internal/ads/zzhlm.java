package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzhlm {
    final zzhln zza;
    final long[] zzb;

    public zzhlm(zzhln zzhlnVar, long[] jArr) {
        this.zza = zzhlnVar;
        this.zzb = jArr;
    }

    public zzhlm() {
        this(new zzhln(), new long[10]);
    }

    public zzhlm(zzhlm zzhlmVar) {
        this.zza = new zzhln(zzhlmVar.zza);
        this.zzb = Arrays.copyOf(zzhlmVar.zzb, 10);
    }
}
