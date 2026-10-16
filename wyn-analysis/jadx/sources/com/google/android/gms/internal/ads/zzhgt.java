package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzhgt extends zzhfh {
    private final int zza;
    private final zzhgs zzb;

    public /* synthetic */ zzhgt(int i5, zzhgs zzhgsVar, byte[] bArr) {
        this.zza = i5;
        this.zzb = zzhgsVar;
    }

    public static zzhgr zzb() {
        return new zzhgr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgt)) {
            return false;
        }
        zzhgt zzhgtVar = (zzhgt) obj;
        return zzhgtVar.zza == this.zza && zzhgtVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhgt.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i5 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i5).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i5);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzb != zzhgs.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhgs zzd() {
        return this.zzb;
    }
}
