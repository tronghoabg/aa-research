package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;

/* loaded from: classes4.dex */
abstract class zzt extends zze<zzad> {
    protected final zzg zza;

    public zzt(o oVar) {
        super(oVar);
        this.zza = new zzs(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return new zzad(status, false);
    }
}
