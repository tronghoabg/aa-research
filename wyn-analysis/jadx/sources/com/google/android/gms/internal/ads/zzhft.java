package com.google.android.gms.internal.ads;

import j$.util.Objects;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhft extends zzhfh {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhfs zze;
    private final zzhfr zzf;

    public /* synthetic */ zzhft(int i5, int i10, int i11, int i12, zzhfs zzhfsVar, zzhfr zzhfrVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzhfsVar;
        this.zzf = zzhfrVar;
    }

    public static zzhfq zzb() {
        return new zzhfq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhft)) {
            return false;
        }
        zzhft zzhftVar = (zzhft) obj;
        return zzhftVar.zza == this.zza && zzhftVar.zzb == this.zzb && zzhftVar.zzc == this.zzc && zzhftVar.zzd == this.zzd && zzhftVar.zze == this.zze && zzhftVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhft.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhfr zzhfrVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzhfrVar);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i5 = this.zzc;
        int length3 = String.valueOf(i5).length();
        int i10 = this.zzd;
        int length4 = String.valueOf(i10).length();
        int i11 = this.zza;
        int length5 = String.valueOf(i11).length();
        int i12 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i12).length() + 15);
        AbstractC3256n.p(sb2, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        N0.a.l(i5, i10, ", ", "-byte IV, and ", sb2);
        N0.a.l(i11, i12, "-byte tags, and ", "-byte AES key, and ", sb2);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zze != zzhfs.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhfs zzg() {
        return this.zze;
    }

    public final zzhfr zzh() {
        return this.zzf;
    }
}
