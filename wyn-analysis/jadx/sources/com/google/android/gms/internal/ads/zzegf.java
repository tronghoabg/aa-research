package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzegf extends zzegk {
    private final Context zzg;
    private final H6.a zzh;
    private final zzege zzi;

    public zzegf(Context context, H6.a aVar, zzege zzegeVar, zzcan zzcanVar) {
        this.zzg = context;
        this.zzh = aVar;
        this.zzi = zzegeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzi(this.zzh.f4927a);
                    this.zzi.zza();
                } catch (RemoteException e7) {
                    this.zzi.zzb(e7);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) {
        super.onConnectionFailed(bVar);
        this.zzi.zzb(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f34117d))));
    }

    @Override // com.google.android.gms.internal.ads.zzegk, com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) {
        int i10 = G6.L.f4523b;
        H6.l.a("Cannot connect to remote service, fallback to local instance.");
        this.zzi.zzb(new RemoteException(N0.a.d(i5, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i5).length() + 33))));
    }

    public final void zza() {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return;
                }
                this.zzc = true;
                zzcam zzcamVar = new zzcam(this.zzg, C6.n.f1857D.f1879t.j(), this, this);
                this.zzf = zzcamVar;
                zzcamVar.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
