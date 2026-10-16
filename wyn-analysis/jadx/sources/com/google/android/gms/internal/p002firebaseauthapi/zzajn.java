package com.google.android.gms.internal.p002firebaseauthapi;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
final class zzajn {
    private final Object zza;
    private final int zzb;

    public zzajn(Object obj, int i5) {
        this.zza = obj;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzajn)) {
            return false;
        }
        zzajn zzajnVar = (zzajn) obj;
        return this.zza == zzajnVar.zza && this.zzb == zzajnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
