package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzezc implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzezc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzezc zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzezc(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfcs zzfcsVarZzb = ((zzfbh) this.zza).zzb();
        zzfcs zzfcsVar = (zzexg) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains("29")) {
            zzfcsVarZzb = zzfcsVar;
        }
        zzinh.zzb(zzfcsVarZzb);
        return zzfcsVarZzb;
    }
}
