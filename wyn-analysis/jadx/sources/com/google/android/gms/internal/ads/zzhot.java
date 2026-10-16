package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhot extends zzhpj {
    private final int zza;
    private final int zzb;
    private final zzhos zzc;

    public /* synthetic */ zzhot(int i5, int i10, zzhos zzhosVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = zzhosVar;
    }

    public static zzhor zzb() {
        return new zzhor(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhot)) {
            return false;
        }
        zzhot zzhotVar = (zzhot) obj;
        return zzhotVar.zza == this.zza && zzhotVar.zze() == zze() && zzhotVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhot.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i5 = this.zzb;
        int length2 = String.valueOf(i5).length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i10).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i5);
        return AbstractC0279p0.o(sb2, "-byte tags, and ", i10, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzc != zzhos.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhos zzhosVar = this.zzc;
        if (zzhosVar == zzhos.zzd) {
            return this.zzb;
        }
        if (zzhosVar == zzhos.zza || zzhosVar == zzhos.zzb || zzhosVar == zzhos.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhos zzf() {
        return this.zzc;
    }
}
