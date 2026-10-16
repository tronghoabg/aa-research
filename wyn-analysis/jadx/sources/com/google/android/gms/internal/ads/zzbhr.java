package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.InterfaceC1714c;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbhr implements InterfaceC1714c {
    final /* synthetic */ zzcgd zza;
    final /* synthetic */ zzbhs zzb;

    public zzbhr(zzbhs zzbhsVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbhsVar);
        this.zzb = zzbhsVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
