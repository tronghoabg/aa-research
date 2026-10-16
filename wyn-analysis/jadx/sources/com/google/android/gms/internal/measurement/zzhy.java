package com.google.android.gms.internal.measurement;

import Fe.e;
import l8.AbstractC3412N;

/* loaded from: classes4.dex */
public final class zzhy {
    private final boolean zza;

    public zzhy(zzhx zzhxVar) {
        e.t(zzhxVar, "BuildInfo must be non-null");
        this.zza = !zzhxVar.zza();
    }

    public final boolean zza(String str) {
        e.t(str, "flagName must not be null");
        if (this.zza) {
            return ((AbstractC3412N) zzia.zza.get()).b(str);
        }
        return true;
    }
}
