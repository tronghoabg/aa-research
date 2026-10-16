package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhgb extends zzhfh {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhga zzd;

    public /* synthetic */ zzhgb(int i5, int i10, int i11, zzhga zzhgaVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = i10;
        this.zzd = zzhgaVar;
    }

    public static zzhfz zzb() {
        return new zzhfz(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgb)) {
            return false;
        }
        zzhgb zzhgbVar = (zzhgb) obj;
        return zzhgbVar.zza == this.zza && zzhgbVar.zzb == this.zzb && zzhgbVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhgb.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int i5 = this.zzb;
        int length2 = String.valueOf(i5).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i10).length() + 10);
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i5);
        return AbstractC0279p0.o(sb2, "-byte IV, 16-byte tag, and ", i10, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhga.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhga zze() {
        return this.zzd;
    }
}
