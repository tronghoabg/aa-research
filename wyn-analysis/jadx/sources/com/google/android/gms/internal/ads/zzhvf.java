package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhvf extends zzhxt {
    private final zzhvd zza;
    private final zzhvb zzb;
    private final zzhvc zzc;
    private final zzhve zzd;

    public /* synthetic */ zzhvf(zzhvd zzhvdVar, zzhvb zzhvbVar, zzhvc zzhvcVar, zzhve zzhveVar, byte[] bArr) {
        this.zza = zzhvdVar;
        this.zzb = zzhvbVar;
        this.zzc = zzhvcVar;
        this.zzd = zzhveVar;
    }

    public static zzhva zzb() {
        return new zzhva(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhvf)) {
            return false;
        }
        zzhvf zzhvfVar = (zzhvf) obj;
        return zzhvfVar.zza == this.zza && zzhvfVar.zzb == this.zzb && zzhvfVar.zzc == this.zzc && zzhvfVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhvf.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        AbstractC3256n.p(sb2, "ECDSA Parameters (variant: ", string, ", hashType: ", string2);
        AbstractC3256n.p(sb2, ", encoding: ", string3, ", curve: ", string4);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhve.zzd;
    }

    public final zzhvd zzc() {
        return this.zza;
    }

    public final zzhvb zzd() {
        return this.zzb;
    }

    public final zzhvc zze() {
        return this.zzc;
    }

    public final zzhve zzf() {
        return this.zzd;
    }
}
