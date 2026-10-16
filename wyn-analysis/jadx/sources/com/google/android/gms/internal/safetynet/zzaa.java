package com.google.android.gms.internal.safetynet;

import C7.a;
import C7.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class zzaa implements t {
    private final Status zza;
    private final i zzb;

    public zzaa(Status status, i iVar) {
        this.zza = status;
        this.zzb = iVar;
    }

    public final List<a> getHarmfulAppsList() {
        i iVar = this.zzb;
        return iVar == null ? Collections.EMPTY_LIST : Arrays.asList(iVar.f1897b);
    }

    public final int getHoursSinceLastScanWithHarmfulApp() {
        i iVar = this.zzb;
        if (iVar == null) {
            return -1;
        }
        return iVar.f1898c;
    }

    public final long getLastScanTimeMs() {
        i iVar = this.zzb;
        if (iVar == null) {
            return 0L;
        }
        return iVar.f1896a;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.zza;
    }
}
