package com.waze.navigate;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class cx {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void isUsingOneOffNavigationSettings$default(cx cxVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isUsingOneOffNavigationSettings");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        cxVar.isUsingOneOffNavigationSettings(lVar);
    }

    static final Boolean isUsingOneOffNavigationSettings$lambda$0(cx cxVar) {
        h.g.b.x.d(cxVar, "null cannot be cast to non-null type com.waze.navigate.NavigateNativeManager");
        return Boolean.valueOf(((NavigateNativeManager) cxVar).isUsingOneOffNavigationSettingsNTV());
    }

    static final void showOneOffNavigationSettingsPopupJNI$lambda$0(cx cxVar) {
        h.g.b.x.d(cxVar, "null cannot be cast to non-null type com.waze.navigate.NavigateNativeManager");
        ((NavigateNativeManager) cxVar).showOneOffNavigationSettingsPopup();
    }

    public void isUsingOneOffNavigationSettings(h.g.a.l<? super Boolean, h.ab> lVar) {
        NativeManager.runNativeTask(new bj(this, 12), lVar != null ? new bn(lVar, 20) : null);
    }

    protected final void showOneOffNavigationSettingsPopupJNI() {
        NativeManager.runMainThreadTask(new e(this, 2));
    }

    public final void isUsingOneOffNavigationSettings() {
        isUsingOneOffNavigationSettings$default(this, null, 1, null);
    }
}
