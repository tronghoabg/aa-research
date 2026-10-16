package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzakw implements zzao {
    public final float zza;
    public final zzakv zzb;
    public final zzakv zzc;

    private zzakw(float f10, zzakv zzakvVar, zzakv zzakvVar2) {
        this.zza = f10;
        this.zzb = zzakvVar;
        this.zzc = zzakvVar2;
    }

    public static zzakw zzb(float f10, int i5, int i10) {
        zzakv zzakvVarZza = zzakv.zza(i5);
        zzakv zzakvVarZza2 = zzakv.zza(i10);
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && zzakvVarZza == null && zzakvVarZza2 == null) {
            return null;
        }
        return new zzakw(f10, zzakvVarZza, zzakvVarZza2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakw)) {
            return false;
        }
        zzakw zzakwVar = (zzakw) obj;
        return Float.compare(this.zza, zzakwVar.zza) == 0 && Objects.equals(this.zzb, zzakwVar.zzb) && Objects.equals(this.zzc, zzakwVar.zzc);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.zza) * 31;
        zzakv zzakvVar = this.zzb;
        int iHashCode = (iFloatToIntBits + (zzakvVar != null ? zzakvVar.hashCode() : 0)) * 31;
        zzakv zzakvVar2 = this.zzc;
        return iHashCode + (zzakvVar2 != null ? zzakvVar2.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        StringBuilder sb2 = new StringBuilder(length + 37 + strValueOf.length() + 10 + strValueOf2.length());
        sb2.append("ReplayGain Xing/Info: peak=");
        sb2.append(f10);
        sb2.append(", field 1=");
        sb2.append(strValueOf);
        return wg.b.c(sb2, ", field 2=", strValueOf2);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
