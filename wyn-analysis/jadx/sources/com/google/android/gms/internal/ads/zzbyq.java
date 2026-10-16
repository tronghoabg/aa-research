package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzbyq implements com.google.android.gms.ads.nativead.h {
    private final zzbnc zza;

    public zzbyq(zzbnc zzbncVar) {
        this.zza = zzbncVar;
        try {
            zzbncVar.zzr();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzq(new BinderC3877b(view));
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return false;
        }
    }
}
