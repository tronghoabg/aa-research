package com.google.android.gms.internal.safetynet;

import C7.e;
import C7.h;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
final class zzp implements e {
    private final Status zza;
    private final h zzb;

    public zzp(Status status, h hVar) {
        this.zza = status;
        this.zzb = hVar;
    }

    @Override // C7.e
    public final String getJwsResult() {
        h hVar = this.zzb;
        if (hVar == null) {
            return null;
        }
        return hVar.f1895a;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }
}
