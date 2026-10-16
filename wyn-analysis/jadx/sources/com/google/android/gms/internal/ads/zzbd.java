package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzbd {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzc zzg = zzc.zza;
    public boolean zzh;

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class.equals(obj.getClass())) {
            zzbd zzbdVar = (zzbd) obj;
            if (Objects.equals(this.zza, zzbdVar.zza) && Objects.equals(this.zzb, zzbdVar.zzb) && this.zzc == zzbdVar.zzc && this.zzd == zzbdVar.zzd && this.zzf == zzbdVar.zzf && Objects.equals(this.zzg, zzbdVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j8 = this.zzd;
        return (this.zzg.hashCode() + (((((iHashCode2 * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31)) * 31;
    }

    public final zzbd zza(Object obj, Object obj2, int i5, long j8, long j10, zzc zzcVar, boolean z2, boolean z10) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i5;
        this.zzd = j8;
        this.zze = 0L;
        this.zzg = zzcVar;
        this.zzf = z2;
        this.zzh = false;
        return this;
    }

    public final int zzb() {
        int i5 = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i5) {
        long j8 = this.zzg.zza(i5).zza;
        return 0L;
    }

    public final int zzd(int i5) {
        return this.zzg.zza(i5).zza(-1);
    }

    public final int zze(long j8) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzf(long j8) {
        return -1;
    }

    public final int zzg(int i5) {
        return this.zzg.zza(i5).zzb;
    }

    public final long zzh(int i5, int i10) {
        zza zzaVarZza = this.zzg.zza(i5);
        if (zzaVarZza.zzb != -1) {
            return zzaVarZza.zzf[i10];
        }
        return -9223372036854775807L;
    }

    public final long zzi() {
        long j8 = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzj(int i5) {
        boolean z2 = this.zzg.zza(i5).zzj;
        return false;
    }
}
