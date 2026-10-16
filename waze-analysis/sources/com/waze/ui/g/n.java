package com.waze.ui.g;

import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class n implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f42351a;

    public /* synthetic */ n(int i2) {
        this.f42351a = i2;
    }

    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i2 = this.f42351a;
        if (i2 == 0) {
            return o.a((SnackbarHostState) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
        if (i2 != 1) {
            return null;
        }
        com.waze.uid.e.b bVar = (com.waze.uid.e.b) obj;
        com.waze.uid.e.h hVar = (com.waze.uid.e.h) obj2;
        com.waze.uid.b.m mVar = (com.waze.uid.b.m) obj3;
        h.g.b.x.f(bVar, "_trace");
        h.g.b.x.f(hVar, "_parent");
        h.g.b.x.f(mVar, "_controller");
        return new com.waze.uid.state_impl.b.n(bVar, hVar, mVar);
    }
}
