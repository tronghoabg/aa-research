package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class zzidy {
    private final Object zza;
    private final int zzb;

    public zzidy(Object obj, int i5) {
        this.zza = obj;
        this.zzb = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzidy)) {
            return false;
        }
        zzidy zzidyVar = (zzidy) obj;
        return this.zza == zzidyVar.zza && this.zzb == zzidyVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
