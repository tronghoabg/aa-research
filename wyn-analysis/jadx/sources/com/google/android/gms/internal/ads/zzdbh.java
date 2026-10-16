package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdbh implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;

    private zzdbh(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
        this.zzg = zziniVar7;
    }

    public static zzdbh zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        return new zzdbh(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbg(((zzcnz) this.zza).zza(), ((zzdcq) this.zzb).zza(), ((zzcop) this.zzc).zza(), ((zzcnt) this.zzd).zzb(), (zzece) this.zze.zzb(), (zzfqt) this.zzf.zzb(), (zzecz) this.zzg.zzb());
    }
}
