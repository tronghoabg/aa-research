package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbic;

/* loaded from: classes3.dex */
public final class zzdxt implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzdxt(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
    }

    public static zzdxt zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzdxt(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcnz) this.zza).zza();
        final String strZzb = ((zzefg) this.zzb).zzb();
        H6.a aVarZza = ((zzcop) this.zzc).zza();
        final zzbic.zza.EnumC0140zza enumC0140zza = (zzbic.zza.EnumC0140zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbhw zzbhwVar = new zzbhw(new zzbib(contextZza));
        zzbic.zzar.zza zzaVarZzs = zzbic.zzar.zzs();
        zzaVarZzs.zzc(aVarZza.f4928b);
        zzaVarZzs.zzg(aVarZza.f4929c);
        zzaVarZzs.zzk(true != aVarZza.f4930d ? 2 : 0);
        final zzbic.zzar zzarVarZzbu = zzaVarZzs.zzbu();
        zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdxs
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                zzbic.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbVarZzcc.zzc(enumC0140zza);
                zzaVar.zzaa(zzbVarZzcc);
                zzbic.zzm.zza zzaVarZzcc = zzaVar.zzG().zzcc();
                zzaVarZzcc.zzd(strZzb);
                zzaVarZzcc.zzs(zzarVarZzbu);
                zzaVar.zzI(zzaVarZzcc);
                zzaVar.zzh(str);
            }
        });
        return zzbhwVar;
    }
}
