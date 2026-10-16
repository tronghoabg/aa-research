package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaqx {
    private final zzaqa zza;
    private final zzfj zzb;
    private final zzet zzc = new zzet(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaqx(zzaqa zzaqaVar, zzfj zzfjVar) {
        this.zza = zzaqaVar;
        this.zzb = zzfjVar;
    }

    public final void zza() {
        this.zzf = false;
        this.zza.zza();
    }

    public final void zzb(zzeu zzeuVar) throws zzat {
        long jZze;
        char c10;
        zzet zzetVar = this.zzc;
        zzeuVar.zzm(zzetVar.zza, 0, 3);
        zzetVar.zzf(0);
        zzetVar.zzh(8);
        this.zzd = zzetVar.zzi();
        this.zze = zzetVar.zzi();
        zzetVar.zzh(6);
        zzeuVar.zzm(zzetVar.zza, 0, zzetVar.zzj(8));
        zzetVar.zzf(0);
        if (this.zzd) {
            zzetVar.zzh(4);
            long jZzj = zzetVar.zzj(3);
            zzetVar.zzh(1);
            int iZzj = zzetVar.zzj(15) << 15;
            zzetVar.zzh(1);
            long jZzj2 = zzetVar.zzj(15);
            zzetVar.zzh(1);
            if (this.zzf || !this.zze) {
                c10 = 30;
            } else {
                zzetVar.zzh(4);
                zzetVar.zzh(1);
                int iZzj2 = zzetVar.zzj(15) << 15;
                zzetVar.zzh(1);
                c10 = 30;
                long jZzj3 = zzetVar.zzj(15);
                zzetVar.zzh(1);
                this.zzb.zze((zzetVar.zzj(3) << 30) | iZzj2 | jZzj3);
                this.zzf = true;
            }
            jZze = this.zzb.zze((jZzj << c10) | iZzj | jZzj2);
        } else {
            jZze = 0;
        }
        zzaqa zzaqaVar = this.zza;
        zzaqaVar.zzc(jZze, 4);
        zzaqaVar.zzd(zzeuVar);
        zzaqaVar.zze(false);
    }
}
