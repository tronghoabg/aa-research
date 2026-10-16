package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class zznp {
    private final zzbr zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznp)) {
            return false;
        }
        zznp zznpVar = (zznp) obj;
        return this.zza == zznpVar.zza && this.zzb == zznpVar.zzb && this.zzc.equals(zznpVar.zzc) && this.zzd.equals(zznpVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzbr zzbrVar = this.zza;
        int i5 = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        StringBuilder sb2 = new StringBuilder("(status=");
        sb2.append(zzbrVar);
        sb2.append(", keyId=");
        sb2.append(i5);
        sb2.append(", keyType='");
        return AbstractC3256n.h(sb2, str, "', keyPrefix='", str2, "')");
    }

    public final int zza() {
        return this.zzb;
    }

    private zznp(zzbr zzbrVar, int i5, String str, String str2) {
        this.zza = zzbrVar;
        this.zzb = i5;
        this.zzc = str;
        this.zzd = str2;
    }
}
