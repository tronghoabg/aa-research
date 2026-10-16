package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaje implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzt zztVar = new zzt();
        zztVar.zzo("application/id3");
        zztVar.zzP();
        zzt zztVar2 = new zzt();
        zztVar2.zzo("application/x-scte35");
        zztVar2.zzP();
    }

    public zzaje(String str, String str2, long j8, long j10, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j8;
        this.zzd = j10;
        this.zze = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaje.class == obj.getClass()) {
            zzaje zzajeVar = (zzaje) obj;
            if (this.zzc == zzajeVar.zzc && this.zzd == zzajeVar.zzd && Objects.equals(this.zza, zzajeVar.zza) && Objects.equals(this.zzb, zzajeVar.zzb) && Arrays.equals(this.zze, zzajeVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zzf;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        long j8 = this.zzc;
        long j10 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((iHashCode2 * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) j10)) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        long j8 = this.zzd;
        int length = String.valueOf(j8).length();
        long j10 = this.zzc;
        int length2 = String.valueOf(j10).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length3 + 8);
        N0.a.r(sb2, "EMSG: scheme=", str, ", id=");
        sb2.append(j8);
        M6.A(sb2, ", durationMs=", j10, ", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final /* synthetic */ void zza(zzam zzamVar) {
        AbstractC1746j.a(this, zzamVar);
    }
}
