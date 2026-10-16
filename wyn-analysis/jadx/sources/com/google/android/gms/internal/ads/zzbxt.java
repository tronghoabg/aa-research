package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;
import x6.C4470a;

/* loaded from: classes3.dex */
final class zzbxt implements L6.b {
    final /* synthetic */ zzbxl zza;

    public zzbxt(zzbxv zzbxvVar, zzbxl zzbxlVar) {
        this.zza = zzbxlVar;
        Objects.requireNonNull(zzbxvVar);
    }

    public final void onFailure(C4470a c4470a) {
        try {
            this.zza.zzg(c4470a.b());
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }
}
