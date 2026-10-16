package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import Va.M6;

/* loaded from: classes.dex */
final class zzar {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzar(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(M6.t(AbstractC0279p0.r("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
