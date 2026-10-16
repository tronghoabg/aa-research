package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzqu {
    public static final zzqu zza = new zzqt().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzqu(zzqt zzqtVar, byte[] bArr) {
        this.zzb = zzqtVar.zze();
        this.zzc = zzqtVar.zzf();
        this.zzd = zzqtVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqu.class == obj.getClass()) {
            zzqu zzquVar = (zzqu) obj;
            if (this.zzb == zzquVar.zzb && this.zzc == zzquVar.zzc && this.zzd == zzquVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z2 = this.zzb;
        boolean z10 = this.zzc;
        return (z10 ? 1 : 0) + (z10 ? 1 : 0) + ((z2 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
