package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbwd implements J6.b {
    final /* synthetic */ zzbsa zza;

    public zzbwd(zzbwk zzbwkVar, zzbsa zzbsaVar) {
        this.zza = zzbsaVar;
        Objects.requireNonNull(zzbwkVar);
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }
}
