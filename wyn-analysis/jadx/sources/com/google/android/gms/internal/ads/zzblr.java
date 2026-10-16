package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzblr {
    private final Context zza;

    public zzblr(Context context) {
        this.zza = context;
    }

    public final void zza(zzcal zzcalVar) {
        try {
            ((zzbls) tg.b.W(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzblq.zza)).zze(zzcalVar);
        } catch (H6.n e7) {
            H6.l.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e7.getMessage())));
        } catch (RemoteException e10) {
            H6.l.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        }
    }
}
