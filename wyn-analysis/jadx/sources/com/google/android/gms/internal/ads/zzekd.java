package com.google.android.gms.internal.ads;

import Va.M6;
import android.graphics.drawable.Drawable;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
final class zzekd extends zzekg {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzekd(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzekg) {
            zzekg zzekgVar = (zzekg) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzekgVar.zza()) : zzekgVar.zza() == null) {
                if (this.zzb.equals(zzekgVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzekgVar.zzc()) : zzekgVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        AbstractC3256n.p(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return M6.t(sb2, ", icon=", strValueOf, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final Drawable zzc() {
        return this.zzc;
    }
}
