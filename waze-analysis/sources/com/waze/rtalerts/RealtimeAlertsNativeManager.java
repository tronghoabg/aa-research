package com.waze.rtalerts;

import h.ab;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class RealtimeAlertsNativeManager extends d implements a {
    public static final RealtimeAlertsNativeManager INSTANCE = new RealtimeAlertsNativeManager();
    private static final bm<ab> popupClosed = bu.e(0, 1, kotlinx.coroutines.a.a.f51273c, 1);
    public static final int $stable = 8;

    private RealtimeAlertsNativeManager() {
    }

    @Override // com.waze.rtalerts.d
    public void emitPopupClosed() {
        popupClosed.c(ab.f48028a);
    }

    @Override // com.waze.rtalerts.a
    public void handleAlertClicked(int i2) {
        d.onAlertClicked$default(this, i2, null, 2, null);
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.rtalerts.a
    public kotlinx.coroutines.b.k<ab> observeOnPopupClosed() {
        return popupClosed;
    }

    public final native void onAlertClickedNTV(int i2);
}
