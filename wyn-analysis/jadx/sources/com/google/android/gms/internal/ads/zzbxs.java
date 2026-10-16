package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;
import x6.C4470a;

/* loaded from: classes3.dex */
final class zzbxs implements J6.c {
    final /* synthetic */ zzbwt zza;
    final /* synthetic */ zzbvp zzb;
    final /* synthetic */ zzbxv zzc;

    public zzbxs(zzbxv zzbxvVar, zzbwt zzbwtVar, zzbvp zzbvpVar) {
        this.zza = zzbwtVar;
        this.zzb = zzbvpVar;
        Objects.requireNonNull(zzbxvVar);
        this.zzc = zzbxvVar;
    }

    @Override // J6.c
    public final void onFailure(C4470a c4470a) {
        try {
            this.zza.zzg(c4470a.b());
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        H6.l.f("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zzf("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }
}
