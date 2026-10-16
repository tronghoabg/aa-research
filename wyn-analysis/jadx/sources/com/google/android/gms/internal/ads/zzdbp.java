package com.google.android.gms.internal.ads;

import G6.C0546j;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzdbp implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdbp(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzdbp zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdbp(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final H6.a aVarZza = ((zzcop) this.zzb).zza();
        final zzflg zzflgVarZza = ((zzdcq) this.zzc).zza();
        return new zzgti() { // from class: com.google.android.gms.internal.ads.zzdbo
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                zzfkn zzfknVar = (zzfkn) obj;
                C0546j c0546j = new C0546j(context);
                c0546j.f4603c = zzfknVar.zzB;
                c0546j.f4606f = zzfknVar.zzC.toString();
                c0546j.f4605e = aVarZza.f4927a;
                c0546j.f4604d = zzflgVarZza.zzg;
                return c0546j;
            }
        };
    }
}
