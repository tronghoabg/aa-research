package com.google.android.gms.internal.ads;

import D6.InterfaceC0408y0;
import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfkc implements R6.a {
    final /* synthetic */ InterfaceC0408y0 zza;
    final /* synthetic */ zzfke zzb;

    public zzfkc(zzfke zzfkeVar, InterfaceC0408y0 interfaceC0408y0) {
        this.zza = interfaceC0408y0;
        Objects.requireNonNull(zzfkeVar);
        this.zzb = zzfkeVar;
    }

    @Override // R6.a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzw() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.i("#007 Could not call remote method.", e7);
            }
        }
    }
}
