package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.C1703q;

/* loaded from: classes.dex */
final class zzaz implements zzdr {
    private C1703q zza;

    public zzaz(C1703q c1703q) {
        this.zza = c1703q;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized C1703q zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final synchronized void zzb(C1703q c1703q) {
        C1703q c1703q2 = this.zza;
        if (c1703q2 != c1703q) {
            c1703q2.a();
            this.zza = c1703q;
        }
    }

    @Override // com.google.android.gms.internal.identity.zzdr
    public final void zzc() {
    }
}
