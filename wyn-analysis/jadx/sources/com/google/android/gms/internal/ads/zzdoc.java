package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbic;

/* loaded from: classes3.dex */
public final class zzdoc implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;

    private zzdoc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
    }

    public static zzdoc zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        return new zzdoc(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdob(((zzdnc) this.zza).zzb(), ((zzcnz) this.zzb).zza(), (zzceg) this.zzc.zzb(), ((zzdmq) this.zzd).zza(), (zzbic.zza.EnumC0140zza) this.zze.zzb(), ((zzcyr) this.zzf).zza());
    }
}
