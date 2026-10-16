package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zzje {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzje(String str, zzv zzvVar, zzv zzvVar2, int i5, int i10) {
        boolean z2;
        if (i5 != 0) {
            z2 = false;
            if (i10 == 0) {
                i10 = 0;
                z2 = true;
            }
        } else {
            z2 = true;
        }
        zzgtr.zza(z2);
        zzgtr.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i5;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzje.class == obj.getClass()) {
            zzje zzjeVar = (zzje) obj;
            if (this.zzd == zzjeVar.zzd && this.zze == zzjeVar.zze && this.zza.equals(zzjeVar.zza) && this.zzb.equals(zzjeVar.zzb) && this.zzc.equals(zzjeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzd + 527;
        String str = this.zza;
        int iHashCode = str.hashCode() + (((i5 * 31) + this.zze) * 31);
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        return this.zzc.hashCode() + (iHashCode2 * 31);
    }
}
