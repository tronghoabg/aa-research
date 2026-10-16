package com.waze.external_poi;

import h.ab;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ExternalPoiNativeManager extends f implements a {
    public static final ExternalPoiNativeManager INSTANCE = new ExternalPoiNativeManager();
    private static final bm<ab> popupClosed = bu.e(0, 1, kotlinx.coroutines.a.a.f51273c, 1);
    public static final int $stable = 8;

    private ExternalPoiNativeManager() {
    }

    @Override // com.waze.external_poi.f
    public void emitPopupClosed() {
        popupClosed.c(ab.f48028a);
    }

    @Override // com.waze.external_poi.a
    public void handleExternalPoiClicked(int i2) {
        f.onExternalPoiClicked$default(this, i2, null, 2, null);
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.external_poi.a
    public k<ab> observeOnPopupClosed() {
        return popupClosed;
    }

    public final native void onExternalPoiClickedNTV(int i2);
}
