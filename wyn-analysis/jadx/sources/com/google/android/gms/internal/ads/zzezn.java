package com.google.android.gms.internal.ads;

import G6.C0549m;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final /* synthetic */ class zzezn implements Callable {
    static final /* synthetic */ zzezn zza = new zzezn();

    private /* synthetic */ zzezn() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        C6.n nVar = C6.n.f1857D;
        C0549m c0549m = nVar.f1874o;
        synchronized (c0549m.f4623f) {
            str = c0549m.f4619b;
        }
        return new zzezp(str, nVar.f1874o.h());
    }
}
