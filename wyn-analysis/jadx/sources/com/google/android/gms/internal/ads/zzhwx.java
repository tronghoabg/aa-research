package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhwx extends zzhxt {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhww zzd;
    private final zzhwv zze;

    public /* synthetic */ zzhwx(int i5, BigInteger bigInteger, zzhww zzhwwVar, zzhwv zzhwvVar, byte[] bArr) {
        this.zzb = i5;
        this.zzc = bigInteger;
        this.zzd = zzhwwVar;
        this.zze = zzhwvVar;
    }

    public static zzhwu zzb() {
        return new zzhwu(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwx)) {
            return false;
        }
        zzhwx zzhwxVar = (zzhwx) obj;
        return zzhwxVar.zzb == this.zzb && Objects.equals(zzhwxVar.zzc, this.zzc) && zzhwxVar.zzd == this.zzd && zzhwxVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhwx.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhwv zzhwvVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhwvVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i5 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i5).length() + 13);
        AbstractC3256n.p(sb2, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i5);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhww.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhww zze() {
        return this.zzd;
    }

    public final zzhwv zzf() {
        return this.zze;
    }
}
