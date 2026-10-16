package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzbfp implements Runnable {
    final /* synthetic */ zzbfq zza;

    public zzbfp(zzbfq zzbfqVar) {
        Objects.requireNonNull(zzbfqVar);
        this.zza = zzbfqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfq zzbfqVar = this.zza;
        synchronized (zzbfqVar.zzf()) {
            if (zzbfqVar.zzg().get() && zzbfqVar.zzh()) {
                zzbfqVar.zzg().set(false);
                int i5 = G6.L.f4523b;
                H6.l.a("App went background");
                Iterator it = zzbfqVar.zzi().iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbfr) it.next()).zza(false);
                    } catch (Exception e7) {
                        H6.l.d("", e7);
                    }
                }
            } else {
                int i10 = G6.L.f4523b;
                H6.l.a("App is still foreground");
            }
        }
    }
}
