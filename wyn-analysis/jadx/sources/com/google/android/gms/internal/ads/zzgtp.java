package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class zzgtp implements Serializable {
    public static zzgtp zzc() {
        return zzgsx.zza;
    }

    public static zzgtp zzd(Object obj) {
        return obj == null ? zzgsx.zza : new zzgtw(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgtp zzb(zzgti zzgtiVar);
}
