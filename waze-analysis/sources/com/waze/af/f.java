package com.waze.af;

import com.waze.app_nav.hub.c.h;
import com.waze.av.a.p;
import com.waze.places.PlaceFormatterNativeManager;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final PlaceFormatterNativeManager f14050a;

    public f(PlaceFormatterNativeManager placeFormatterNativeManager) {
        x.f(placeFormatterNativeManager, "nativeManager");
        this.f14050a = placeFormatterNativeManager;
    }

    @Override // com.waze.af.e
    public final am a(p pVar) {
        x.f(pVar, "wazeAddress");
        CompletableDeferred completableDeferredJ = bo.j();
        this.f14050a.formatPlaceToString(com.waze.ac.e.j(pVar), new h(completableDeferredJ, 17));
        return completableDeferredJ;
    }

    @Override // com.waze.af.e
    public final am b(p pVar) {
        x.f(pVar, "wazeAddress");
        CompletableDeferred completableDeferredJ = bo.j();
        String strF = pVar.b().f();
        if (strF == null || strF.length() == 0) {
            completableDeferredJ.a(new c(pVar.b().a()));
            return completableDeferredJ;
        }
        this.f14050a.formatPlaceToString(com.waze.ac.e.j(pVar), new h(completableDeferredJ, 16));
        return completableDeferredJ;
    }
}
