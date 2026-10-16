package com.waze.network;

import com.waze.NativeManager;
import com.waze.iu;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements h.g.a.l {
    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            com.waze.perf.c.a(com.waze.perf.b.f33032j);
        }
        NativeManager nativeManager = NativeManager.getInstance();
        h.g.b.x.e(nativeManager, "getInstance(...)");
        iu.ConnectivityChanged$default(nativeManager, zBooleanValue, null, 2, null);
        return h.ab.f48028a;
    }
}
