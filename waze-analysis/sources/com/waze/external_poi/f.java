package com.waze.external_poi;

import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class f {
    public static final int $stable = 0;

    static final void emitPopupClosedJNI$lambda$0(f fVar) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.external_poi.ExternalPoiNativeManager");
        ((ExternalPoiNativeManager) fVar).emitPopupClosed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initNativeLayer$default(f fVar, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNativeLayer");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        fVar.initNativeLayer(lVar);
    }

    static final ab initNativeLayer$lambda$0(f fVar) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.external_poi.ExternalPoiNativeManager");
        ((ExternalPoiNativeManager) fVar).initNativeLayerNTV();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExternalPoiClicked$default(f fVar, int i2, l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onExternalPoiClicked");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        fVar.onExternalPoiClicked(i2, lVar);
    }

    static final ab onExternalPoiClicked$lambda$0(f fVar, int i2) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.external_poi.ExternalPoiNativeManager");
        ((ExternalPoiNativeManager) fVar).onExternalPoiClickedNTV(i2);
        return null;
    }

    public abstract void emitPopupClosed();

    protected final void emitPopupClosedJNI() {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.external_poi.e
            @Override // java.lang.Runnable
            public final void run() {
                f.emitPopupClosedJNI$lambda$0(this.f23742a);
            }
        });
    }

    public void initNativeLayer(l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.external_poi.c
            @Override // com.waze.hw
            public final Object a() {
                f.initNativeLayer$lambda$0(this.f23739a);
                return null;
            }
        }, lVar != null ? new d(lVar, 0) : null);
    }

    public void onExternalPoiClicked(final int i2, l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.external_poi.b
            @Override // com.waze.hw
            public final Object a() {
                f.onExternalPoiClicked$lambda$0(this.f23737a, i2);
                return null;
            }
        }, lVar != null ? new d(lVar, 1) : null);
    }

    public final void initNativeLayer() {
        initNativeLayer$default(this, null, 1, null);
    }

    public final void onExternalPoiClicked(int i2) {
        onExternalPoiClicked$default(this, i2, null, 2, null);
    }
}
