package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzbnd {
    private final zzbnc zza;

    public zzbnd(zzbnc zzbncVar) {
        Context context;
        this.zza = zzbncVar;
        try {
            context = (Context) BinderC3877b.S(zzbncVar.zzm());
        } catch (RemoteException | NullPointerException e7) {
            H6.l.d("", e7);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(new BinderC3877b(new MediaView(context)));
            } catch (RemoteException e10) {
                H6.l.d("", e10);
            }
        }
    }

    public final zzbnc zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            return null;
        }
    }
}
