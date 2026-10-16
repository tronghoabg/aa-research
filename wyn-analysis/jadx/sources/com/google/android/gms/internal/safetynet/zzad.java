package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;

/* loaded from: classes4.dex */
public final class zzad implements t {
    private Status zza;
    private boolean zzb;

    public zzad(Status status, boolean z2) {
        this.zza = status;
        this.zzb = z2;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }

    public final boolean isVerifyAppsEnabled() {
        Status status = this.zza;
        if (status == null || !status.V()) {
            return false;
        }
        return this.zzb;
    }

    public zzad() {
    }
}
