package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzcvw implements zzimz {
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

    private zzcvw(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
        this.zzg = zziniVar7;
        this.zzh = zziniVar8;
        this.zzi = zziniVar9;
        this.zzj = zziniVar10;
    }

    public static zzcvw zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8, zzini zziniVar9, zzini zziniVar10) {
        return new zzcvw(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8, zziniVar9, zziniVar10);
    }

    public static zzcvv zzd(zzcxz zzcxzVar, Context context, zzfko zzfkoVar, View view, zzclb zzclbVar, zzcxy zzcxyVar, zzdql zzdqlVar, zzdli zzdliVar, zzimt zzimtVar, Executor executor) {
        return new zzcvv(zzcxzVar, context, zzfkoVar, view, zzclbVar, zzcxyVar, zzdqlVar, zzdliVar, zzimtVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcvv zzb() {
        return new zzcvv(((zzdah) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcwc) this.zzc).zza(), ((zzcwb) this.zzd).zza(), ((zzcwq) this.zze).zza(), ((zzcwd) this.zzf).zza(), ((zzdoi) this.zzg).zza(), (zzdli) this.zzh.zzb(), zzimy.zzc(this.zzi), (Executor) this.zzj.zzb());
    }
}
