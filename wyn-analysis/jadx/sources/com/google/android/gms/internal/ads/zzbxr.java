package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;
import x6.C4470a;

/* loaded from: classes3.dex */
final class zzbxr implements J6.c {
    final /* synthetic */ zzbxc zza;
    final /* synthetic */ zzbvp zzb;

    public zzbxr(zzbxv zzbxvVar, zzbxc zzbxcVar, zzbvp zzbvpVar) {
        this.zza = zzbxcVar;
        this.zzb = zzbvpVar;
        Objects.requireNonNull(zzbxvVar);
    }

    @Override // J6.c
    public final void onFailure(C4470a c4470a) {
        try {
            this.zza.zzg(c4470a.b());
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        J6.t tVar = (J6.t) obj;
        if (tVar != null) {
            try {
                this.zza.zze(new zzbwq(tVar));
            } catch (RemoteException e7) {
                H6.l.d("", e7);
            }
            return new zzbxw(this.zzb);
        }
        H6.l.f("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e10) {
            H6.l.d("", e10);
            return null;
        }
    }
}
