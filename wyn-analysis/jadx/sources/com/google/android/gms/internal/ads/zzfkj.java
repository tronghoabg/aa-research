package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfkj implements R6.a {
    final /* synthetic */ D6.O zza;
    final /* synthetic */ zzfkk zzb;

    public zzfkj(zzfkk zzfkkVar, D6.O o7) {
        this.zza = o7;
        Objects.requireNonNull(zzfkkVar);
        this.zzb = zzfkkVar;
    }

    @Override // R6.a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzw() != null) {
            try {
                D6.N n10 = (D6.N) this.zza;
                n10.zzda(1, n10.zza());
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.i("#007 Could not call remote method.", e7);
            }
        }
    }
}
