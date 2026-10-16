package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.InterfaceC1714c;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbhd implements InterfaceC1714c {
    final /* synthetic */ zzbhe zza;

    public zzbhd(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.zza = zzbheVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) {
        zzbhe zzbheVar = this.zza;
        synchronized (zzbheVar.zzh()) {
            try {
                zzbheVar.zzk(null);
                if (zzbheVar.zzi() != null) {
                    zzbheVar.zzj(null);
                }
                zzbheVar.zzh().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
