package com.google.android.gms.internal.safetynet;

import C7.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;

/* loaded from: classes4.dex */
final class zzab implements t {
    private final Status zza;
    private final j zzb;

    public zzab(Status status, j jVar) {
        this.zza = status;
        this.zzb = jVar;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }

    public final String getTokenResult() {
        j jVar = this.zzb;
        if (jVar == null) {
            return null;
        }
        return jVar.f1900a;
    }
}
