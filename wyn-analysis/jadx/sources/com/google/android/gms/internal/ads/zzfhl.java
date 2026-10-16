package com.google.android.gms.internal.ads;

import D6.A1;
import D6.v1;
import com.google.android.gms.internal.ads.zzbic;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfhl implements zzfie {
    private final zzfie zza;
    private final zzfie zzb;
    private final zzfnr zzc;
    private final String zzd;
    private zzdch zze;
    private final Executor zzf;

    public zzfhl(zzfie zzfieVar, zzfie zzfieVar2, zzfnr zzfnrVar, String str, Executor executor) {
        this.zza = zzfieVar;
        this.zzb = zzfieVar2;
        this.zzc = zzfnrVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final p8.p zzg(zzfne zzfneVar, zzfif zzfifVar) {
        zzdch zzdchVar = zzfneVar.zza;
        this.zze = zzdchVar;
        if (zzfneVar.zzc != null) {
            if (zzdchVar.zzc() != null) {
                zzfneVar.zzc.zzp().zzv(zzfneVar.zza.zzc());
            }
            return zzhcf.zza(zzfneVar.zzc);
        }
        zzdchVar.zza().zzh(zzfneVar.zzb);
        return ((zzfhv) this.zza).zzb(zzfifVar, null, zzfneVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.zze;
    }

    public final synchronized p8.p zzb(final zzfif zzfifVar, final zzfid zzfidVar, zzdch zzdchVar) {
        zzdcg zzdcgVarZza = zzfidVar.zza(zzfifVar.zzb);
        zzdcgVarZza.zzi(new zzfhm(this.zzd));
        final zzdch zzdchVar2 = (zzdch) zzdcgVarZza.zzh();
        zzdchVar2.zzb();
        zzdchVar2.zzb();
        v1 v1Var = zzdchVar2.zzb().zzd;
        if (v1Var.f2521s != null || v1Var.f2526x != null) {
            this.zze = zzdchVar2;
            return ((zzfhv) this.zza).zzb(zzfifVar, zzfidVar, zzdchVar2);
        }
        zzflg zzflgVarZzb = zzdchVar2.zzb();
        v1 v1Var2 = zzflgVarZzb.zzd;
        String str = zzflgVarZzb.zzg;
        A1 a12 = zzflgVarZzb.zzk;
        Executor executor = this.zzf;
        final zzfhk zzfhkVar = new zzfhk(zzfidVar, zzfifVar, v1Var2, str, executor, a12, null);
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(((zzfhr) this.zzb).zza(zzfifVar, zzfidVar, zzdchVar2)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhj
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zze(zzfifVar, zzfhkVar, zzfidVar, zzdchVar2, (zzfhq) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ p8.p zzc(zzfif zzfifVar, zzfid zzfidVar, Object obj) {
        return zzb(zzfifVar, zzfidVar, null);
    }

    public final /* synthetic */ p8.p zze(zzfif zzfifVar, zzfhk zzfhkVar, zzfid zzfidVar, zzdch zzdchVar, zzfhq zzfhqVar) {
        if (zzfhqVar != null) {
            zzfhk zzfhkVar2 = new zzfhk(zzfhkVar.zza, zzfhkVar.zzb, zzfhkVar.zzc, zzfhkVar.zzd, zzfhkVar.zze, zzfhkVar.zzf, zzfhqVar.zza);
            zzfne zzfneVar = zzfhqVar.zzc;
            if (zzfneVar != null) {
                this.zze = null;
                this.zzc.zza(zzfhkVar2);
                return zzg(zzfneVar, zzfifVar);
            }
            zzfnr zzfnrVar = this.zzc;
            p8.p pVarZzb = zzfnrVar.zzb(zzfhkVar2);
            if (pVarZzb != null) {
                this.zze = null;
                return zzhcf.zzj(pVarZzb, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfhi
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ p8.p zza(Object obj) {
                        return this.zza.zzf((zzfnn) obj);
                    }
                }, this.zzf);
            }
            zzfnrVar.zza(zzfhkVar2);
            zzfifVar = new zzfif(zzfifVar.zzb, zzfhqVar.zzb);
        }
        p8.p pVarZzb2 = ((zzfhv) this.zza).zzb(zzfifVar, zzfidVar, zzdchVar);
        this.zze = zzdchVar;
        return pVarZzb2;
    }

    public final /* synthetic */ p8.p zzf(zzfnn zzfnnVar) throws zzeel {
        zzfne zzfneVar;
        zzfnp zzfnpVar;
        if (zzfnnVar == null || (zzfneVar = zzfnnVar.zza) == null || (zzfnpVar = zzfnnVar.zzb) == null) {
            throw new zzeel(1, "Empty prefetch");
        }
        zzbic.zzb.zzc zzcVarZzs = zzbic.zzb.zzs();
        zzbic.zzb.zza.C0143zza c0143zzaZzs = zzbic.zzb.zza.zzs();
        c0143zzaZzs.zzc(zzbic.zzb.zzd.IN_MEMORY);
        c0143zzaZzs.zzg(zzbic.zzb.zze.zzs());
        zzcVarZzs.zzh(c0143zzaZzs);
        zzfneVar.zza.zza().zzd().zzl(zzcVarZzs.zzbu());
        return zzg(zzfneVar, ((zzfhk) zzfnpVar).zzb);
    }
}
