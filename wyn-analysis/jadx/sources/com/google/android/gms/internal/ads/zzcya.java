package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.List;

/* loaded from: classes3.dex */
public class zzcya implements zzepm {
    protected final zzfky zza;
    protected final zzfkn zzb;
    private final zzddy zzc;
    private final zzdel zzd;
    private final zzfib zze;
    private final zzdcs zzf;
    private final zzdhq zzg;
    private final zzdep zzh;
    private final zzdkv zzi;
    private final zzdbv zzj;
    private final zzeaw zzk;

    public zzcya(zzcxz zzcxzVar) {
        this.zza = zzcxzVar.zza();
        this.zzb = zzcxzVar.zzb();
        this.zzc = zzcxzVar.zzc();
        this.zzd = zzcxzVar.zzd();
        this.zze = zzcxzVar.zze();
        this.zzf = zzcxzVar.zzf();
        this.zzg = zzcxzVar.zzg();
        this.zzh = zzcxzVar.zzh();
        this.zzi = zzcxzVar.zzi();
        this.zzj = zzcxzVar.zzj();
        this.zzk = zzcxzVar.zzk();
    }

    public void zzd() {
        this.zzc.zzc(null);
    }

    public void zzj() {
        this.zzd.zzg();
        this.zzh.zza(this);
    }

    public final zzddy zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final void zzm() {
        this.zzi.zzi();
    }

    public final zzdcs zzn() {
        return this.zzf;
    }

    public final zzdbv zzo() {
        return this.zzj;
    }

    public final zzfib zzp() {
        return this.zze;
    }

    public final zzdgp zzq() {
        return this.zzg.zzn();
    }

    public final zzfky zzr() {
        return this.zza;
    }

    public final boolean zzs() {
        return this.zzb.zzaq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt() {
        zzeaw zzeawVar;
        List list = this.zzb.zzaC;
        if (list == null || list.isEmpty() || (zzeawVar = this.zzk) == null) {
            return;
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziR)).booleanValue() || list.isEmpty()) {
            return;
        }
        zzgzi zzgziVarListIterator = ((zzgwt) list).listIterator(0);
        while (zzgziVarListIterator.hasNext()) {
            zzeax zzeaxVar = (zzeax) zzgziVarListIterator.next();
            int[] iArr = zzeaxVar.zzb;
            int length = iArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (iArr[i5] == 1) {
                    long j8 = zzeaxVar.zza;
                    C6.n.f1857D.k.getClass();
                    zzeawVar.zza(j8, 1, System.currentTimeMillis());
                    break;
                }
                i5++;
            }
        }
    }
}
