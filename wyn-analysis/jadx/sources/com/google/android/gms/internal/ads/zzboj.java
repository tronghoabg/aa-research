package com.google.android.gms.internal.ads;

import D6.S0;
import android.os.RemoteException;
import android.view.View;
import j$.util.Objects;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
final class zzboj implements Runnable {
    final /* synthetic */ y6.c zza;
    final /* synthetic */ D6.L zzb;
    final /* synthetic */ zzbok zzc;

    public zzboj(zzbok zzbokVar, y6.c cVar, D6.L l10) {
        this.zza = cVar;
        this.zzb = l10;
        Objects.requireNonNull(zzbokVar);
        this.zzc = zzbokVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y6.c cVar = this.zza;
        D6.L l10 = this.zzb;
        S0 s02 = cVar.f47739a;
        s02.getClass();
        try {
            InterfaceC3876a interfaceC3876aZzb = l10.zzb();
            if (interfaceC3876aZzb != null && ((View) BinderC3877b.S(interfaceC3876aZzb)).getParent() == null) {
                s02.f2385l.addView((View) BinderC3877b.S(interfaceC3876aZzb));
                s02.f2383i = l10;
                this.zzc.zzc();
                throw null;
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
        H6.l.f("Could not bind.");
    }
}
