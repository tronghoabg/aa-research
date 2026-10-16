package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzbup {
    static final G6.r zza = new zzbun();
    static final G6.r zzb = new zzbuo();
    private final zzbub zzc;

    public zzbup(Context context, H6.a aVar, String str, zzfqt zzfqtVar) {
        this.zzc = new zzbub(context, aVar, str, zza, zzb, zzfqtVar);
    }

    public final zzbuf zza(String str, zzbui zzbuiVar, zzbuh zzbuhVar) {
        return new zzbut(this.zzc, str, zzbuiVar, zzbuhVar);
    }

    public final zzbuy zzb() {
        return new zzbuy(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
