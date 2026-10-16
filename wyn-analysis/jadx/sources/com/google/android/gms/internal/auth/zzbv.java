package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public final class zzbv implements t {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        AbstractC1732v.i(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        AbstractC1732v.i(str);
        this.zzb = str;
        this.zza = Status.f26424e;
    }
}
