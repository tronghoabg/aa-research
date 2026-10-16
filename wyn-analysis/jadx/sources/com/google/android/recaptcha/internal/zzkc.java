package com.google.android.recaptcha.internal;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* loaded from: classes4.dex */
final class zzkc {
    private final Object zza;
    private final int zzb;

    public zzkc(Object obj, int i5) {
        this.zza = obj;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkc)) {
            return false;
        }
        zzkc zzkcVar = (zzkc) obj;
        return this.zza == zzkcVar.zza && this.zzb == zzkcVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
