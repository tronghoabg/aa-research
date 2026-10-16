package com.google.android.gms.internal.ads;

import G6.U;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcur implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzcur(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzcur zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcur(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        H6.a aVarZza = ((zzcop) this.zza).zza();
        JSONObject jSONObject = (JSONObject) this.zzb.zzb();
        String str = (String) this.zzc.zzb();
        boolean zEquals = "native".equals(str);
        U u10 = C6.n.f1857D.f1863c;
        return new zzbeu(UUID.randomUUID().toString(), aVarZza, str, jSONObject, false, zEquals);
    }
}
