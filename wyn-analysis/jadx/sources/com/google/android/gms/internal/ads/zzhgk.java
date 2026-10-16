package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhgk extends zzhfh {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhgj zzd;

    public /* synthetic */ zzhgk(int i5, int i10, int i11, zzhgj zzhgjVar, byte[] bArr) {
        this.zza = i5;
        this.zzd = zzhgjVar;
    }

    public static zzhgi zzb() {
        return new zzhgi(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgk)) {
            return false;
        }
        zzhgk zzhgkVar = (zzhgk) obj;
        return zzhgkVar.zza == this.zza && zzhgkVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhgk.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i5 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i5).length() + 10);
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i5);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhgj.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhgj zzd() {
        return this.zzd;
    }
}
