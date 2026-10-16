package com.google.android.gms.internal.ads;

import android.app.Activity;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzekf extends zzelb {
    private final Activity zza;
    private final F6.l zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzekf(Activity activity, F6.l lVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = lVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        F6.l lVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzelb) {
            zzelb zzelbVar = (zzelb) obj;
            if (this.zza.equals(zzelbVar.zza()) && ((lVar = this.zzb) != null ? lVar.equals(zzelbVar.zzb()) : zzelbVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzelbVar.zzc()) : zzelbVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzelbVar.zzd()) : zzelbVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        F6.l lVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (lVar == null ? 0 : lVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = strValueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        AbstractC3256n.p(sb2, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        AbstractC3256n.p(sb2, ", gwsQueryId=", str, ", uri=", str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final F6.l zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzelb
    public final String zzd() {
        return this.zzd;
    }
}
