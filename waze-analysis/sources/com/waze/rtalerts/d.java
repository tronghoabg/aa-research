package com.waze.rtalerts;

import com.waze.NativeManager;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class d {
    public static final int $stable = 0;

    static final void emitPopupClosedJNI$lambda$0(d dVar) {
        h.g.b.x.d(dVar, "null cannot be cast to non-null type com.waze.rtalerts.RealtimeAlertsNativeManager");
        ((RealtimeAlertsNativeManager) dVar).emitPopupClosed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initNativeLayer$default(d dVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNativeLayer");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        dVar.initNativeLayer(lVar);
    }

    static final ab initNativeLayer$lambda$0(d dVar) {
        h.g.b.x.d(dVar, "null cannot be cast to non-null type com.waze.rtalerts.RealtimeAlertsNativeManager");
        ((RealtimeAlertsNativeManager) dVar).initNativeLayerNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAlertClicked$default(d dVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAlertClicked");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        dVar.onAlertClicked(i2, lVar);
    }

    static final ab onAlertClicked$lambda$0(d dVar, int i2) {
        h.g.b.x.d(dVar, "null cannot be cast to non-null type com.waze.rtalerts.RealtimeAlertsNativeManager");
        ((RealtimeAlertsNativeManager) dVar).onAlertClickedNTV(i2);
        return null;
    }

    public abstract void emitPopupClosed();

    protected final void emitPopupClosedJNI() {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.rtalerts.b
            @Override // java.lang.Runnable
            public final void run() {
                d.emitPopupClosedJNI$lambda$0(this.f35117a);
            }
        });
    }

    public void initNativeLayer(h.g.a.l<? super ab, ab> lVar) {
        int i2 = 1;
        NativeManager.runNativeTask(new t(this, i2), lVar != null ? new c(lVar, i2) : null);
    }

    public void onAlertClicked(int i2, h.g.a.l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new w(this, i2, 1), lVar != null ? new c(lVar, 0) : null);
    }

    public final void initNativeLayer() {
        initNativeLayer$default(this, null, 1, null);
    }

    public final void onAlertClicked(int i2) {
        onAlertClicked$default(this, i2, null, 2, null);
    }
}
