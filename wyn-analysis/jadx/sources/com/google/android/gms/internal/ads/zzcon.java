package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzcon implements zzimz {
    private final zzini zza;

    private zzcon(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcon zza(zzini zziniVar) {
        return new zzcon(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        Context contextZza = ((zzcnz) this.zza).zza();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznd)).booleanValue()) {
            return H6.f.j(contextZza);
        }
        return null;
    }
}
