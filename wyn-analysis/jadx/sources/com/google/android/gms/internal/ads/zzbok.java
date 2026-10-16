package com.google.android.gms.internal.ads;

import D6.s1;
import android.content.Context;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbok extends zzbns {
    private final A6.f zza;

    public zzbok(A6.f fVar) {
    }

    public final /* synthetic */ A6.f zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zze(D6.L l10, InterfaceC3876a interfaceC3876a) {
        if (l10 == null || interfaceC3876a == null) {
            return;
        }
        y6.c cVar = new y6.c((Context) BinderC3877b.S(interfaceC3876a));
        try {
            if (l10.zzw() instanceof s1) {
                s1 s1Var = (s1) l10.zzw();
                cVar.setAdListener(s1Var != null ? s1Var.f2494a : null);
            }
        } catch (RemoteException e7) {
            H6.l.d("", e7);
        }
        try {
            if (l10.zzv() instanceof zzbfm) {
                zzbfm zzbfmVar = (zzbfm) l10.zzv();
                cVar.setAppEventListener(zzbfmVar != null ? zzbfmVar.zzc() : null);
            }
        } catch (RemoteException e10) {
            H6.l.d("", e10);
        }
        H6.f.f4939b.post(new zzboj(this, cVar, l10));
    }
}
