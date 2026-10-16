package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhpg extends zzhpj {
    private final int zza;
    private final int zzb;
    private final zzhpf zzc;
    private final zzhpe zzd;

    public /* synthetic */ zzhpg(int i5, int i10, zzhpf zzhpfVar, zzhpe zzhpeVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = zzhpfVar;
        this.zzd = zzhpeVar;
    }

    public static zzhpd zzb() {
        return new zzhpd(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpg)) {
            return false;
        }
        zzhpg zzhpgVar = (zzhpg) obj;
        return zzhpgVar.zza == this.zza && zzhpgVar.zze() == zze() && zzhpgVar.zzc == this.zzc && zzhpgVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhpg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhpe zzhpeVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzhpeVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i5 = this.zzb;
        int length3 = String.valueOf(i5).length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i10).length() + 10);
        AbstractC3256n.p(sb2, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        N0.a.l(i5, i10, ", ", "-byte tags, and ", sb2);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzc != zzhpf.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhpf zzhpfVar = this.zzc;
        if (zzhpfVar == zzhpf.zzd) {
            return this.zzb;
        }
        if (zzhpfVar == zzhpf.zza || zzhpfVar == zzhpf.zzb || zzhpfVar == zzhpf.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhpf zzf() {
        return this.zzc;
    }

    public final zzhpe zzg() {
        return this.zzd;
    }
}
