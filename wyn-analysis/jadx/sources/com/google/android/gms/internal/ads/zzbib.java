package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzbib {
    zzbet zza;
    boolean zzb;
    private final ExecutorService zzc;

    public zzbib() {
        this.zzc = H6.c.f4936b;
    }

    public final /* synthetic */ ExecutorService zza() {
        return this.zzc;
    }

    public zzbib(final Context context) {
        ExecutorService executorService = H6.c.f4936b;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhx
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgk)).booleanValue();
                Context context2 = context;
                zzbib zzbibVar = this.zza;
                if (zBooleanValue) {
                    try {
                        zzbibVar.zza = (zzbet) tg.b.W(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbhy.zza);
                        zzbibVar.zza.zze(new BinderC3877b(context2), "GMA_SDK");
                        zzbibVar.zzb = true;
                    } catch (H6.n | RemoteException | NullPointerException unused) {
                        H6.l.a("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
