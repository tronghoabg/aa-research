package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* loaded from: classes3.dex */
public final class zzbjd {
    public static final void zza(zzbjc zzbjcVar, zzbja zzbjaVar) {
        if (zzbjaVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbjaVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbjcVar.zza(zzbjaVar.zzb(), zzbjaVar.zzc(), zzbjaVar.zza(), zzbjaVar.zzd());
    }
}
