package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class zzdcf implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;
    private final zzini zzh;
    private final zzini zzi;
    private final zzini zzj;
    private final zzini zzk;

    private zzdcf(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11, zzini zziniVar12) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar6;
        this.zzf = zziniVar7;
        this.zzg = zziniVar8;
        this.zzh = zziniVar9;
        this.zzi = zziniVar10;
        this.zzj = zziniVar11;
        this.zzk = zziniVar12;
    }

    public static zzdcf zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10, zzini zziniVar11, zzini zziniVar12) {
        return new zzdcf(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9, zziniVar10, zziniVar11, zziniVar12);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdce zzb() {
        return new zzdce((zzfps) this.zza.zzb(), ((zzcop) this.zzb).zza(), (ApplicationInfo) this.zzc.zzb(), ((zzefg) this.zzd).zzb(), zzexz.zzc(), (PackageInfo) this.zze.zzb(), zzimy.zzc(this.zzf), ((zzcnt) this.zzg).zzb(), (String) this.zzh.zzb(), ((zzfcw) this.zzi).zzb(), ((zzdcq) this.zzj).zza(), (zzdis) this.zzk.zzb());
    }
}
