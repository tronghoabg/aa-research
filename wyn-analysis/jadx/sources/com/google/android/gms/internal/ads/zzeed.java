package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzeed {
    private final Context zza;
    private zzase zzb;

    public zzeed(Context context) {
        this.zza = context;
    }

    public final void zza() {
        this.zzb = zzasd.zza(this.zza);
    }

    public final void zzb(zzash zzashVar) {
        this.zzb.zzb(zzashVar);
    }

    public final void zzc() {
        this.zzb.zzc();
    }

    public final zzasi zzd() {
        try {
            zzase zzaseVar = this.zzb;
            if (zzaseVar == null || !zzaseVar.zza()) {
                return null;
            }
            return zzaseVar.zzd();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
