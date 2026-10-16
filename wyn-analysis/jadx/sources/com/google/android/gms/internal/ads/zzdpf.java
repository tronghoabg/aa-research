package com.google.android.gms.internal.ads;

import G6.U;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdpf implements zzimz {
    private final zzini zza;

    private zzdpf(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzdpf zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdpf(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        H6.a aVarZza = ((zzcop) this.zza).zza();
        U u10 = C6.n.f1857D.f1863c;
        return new zzbeu(UUID.randomUUID().toString(), aVarZza, "native", new JSONObject(), false, true);
    }
}
