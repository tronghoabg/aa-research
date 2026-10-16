package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzcox implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcox(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcox zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcox(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbd zzb() {
        Context contextZza = ((zzcnz) this.zza).zza();
        zzfqt zzfqtVar = (zzfqt) this.zzb.zzb();
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        C6.n nVar = C6.n.f1857D;
        zzbup zzbupVarZza = nVar.f1877r.zza(contextZza, H6.a.V(), zzfqtVar);
        zzbuj zzbujVar = zzbum.zza;
        zzbupVarZza.zza("google.afma.request.getAdDictionary", zzbujVar, zzbujVar);
        return new zzcbg(contextZza, nVar.f1877r.zza(contextZza, H6.a.V(), zzfqtVar).zza("google.afma.sdkConstants.getSdkConstants", zzbujVar, zzbujVar), H6.a.V(), zzhcpVarZzc);
    }
}
