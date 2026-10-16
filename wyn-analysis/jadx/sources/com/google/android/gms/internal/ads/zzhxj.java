package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhxj extends zzhxt {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhxi zzd;
    private final zzhxh zze;
    private final zzhxh zzf;
    private final int zzg;

    public /* synthetic */ zzhxj(int i5, BigInteger bigInteger, zzhxi zzhxiVar, zzhxh zzhxhVar, zzhxh zzhxhVar2, int i10, byte[] bArr) {
        this.zzb = i5;
        this.zzc = bigInteger;
        this.zzd = zzhxiVar;
        this.zze = zzhxhVar;
        this.zzf = zzhxhVar2;
        this.zzg = i10;
    }

    public static zzhxg zzb() {
        return new zzhxg(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhxj)) {
            return false;
        }
        zzhxj zzhxjVar = (zzhxj) obj;
        return zzhxjVar.zzb == this.zzb && Objects.equals(zzhxjVar.zzc, this.zzc) && Objects.equals(zzhxjVar.zzd, this.zzd) && Objects.equals(zzhxjVar.zze, this.zze) && Objects.equals(zzhxjVar.zzf, this.zzf) && zzhxjVar.zzg == this.zzg;
    }

    public final int hashCode() {
        return Objects.hash(zzhxj.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, Integer.valueOf(this.zzg));
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhxh zzhxhVar = this.zzf;
        zzhxh zzhxhVar2 = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhxhVar2);
        String strValueOf3 = String.valueOf(zzhxhVar);
        String strValueOf4 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i5 = this.zzg;
        int length4 = String.valueOf(i5).length();
        int length5 = strValueOf4.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i10).length() + 13);
        AbstractC3256n.p(sb2, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i5);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhxi.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhxi zze() {
        return this.zzd;
    }

    public final zzhxh zzf() {
        return this.zze;
    }

    public final zzhxh zzg() {
        return this.zzf;
    }

    public final int zzh() {
        return this.zzg;
    }
}
