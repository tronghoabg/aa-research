package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbir implements zzbln {
    final /* synthetic */ SharedPreferences zza;

    public zzbir(zzbiv zzbivVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final Boolean zza(String str, boolean z2) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z2));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final Long zzb(String str, long j8) {
        try {
            return Long.valueOf(this.zza.getLong(str, j8));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j8));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final Double zzc(String str, double d3) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d3));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d3)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
