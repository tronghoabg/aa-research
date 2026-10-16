package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.C1703q;
import x7.B;
import x7.C4493e;

/* loaded from: classes.dex */
final class zzdq extends B {
    private C1703q zza;

    public zzdq(C1703q c1703q) {
        super("com.google.android.gms.location.IDeviceOrientationListener");
        this.zza = c1703q;
    }

    public final synchronized void zzc(C1703q c1703q) {
        C1703q c1703q2 = this.zza;
        if (c1703q2 != c1703q) {
            c1703q2.a();
            this.zza = c1703q;
        }
    }

    @Override // x7.C
    public final void zzd(C4493e c4493e) {
        C1703q c1703q;
        synchronized (this) {
            c1703q = this.zza;
        }
        c1703q.b(new zzdp(this, c4493e));
    }

    public final synchronized void zze() {
        this.zza.a();
    }
}
