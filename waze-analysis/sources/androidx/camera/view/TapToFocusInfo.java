package androidx.camera.view;

import android.graphics.PointF;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TapToFocusInfo {
    private final int focusState;
    private final PointF tapPoint;

    public TapToFocusInfo(int i2, PointF pointF) {
        this.focusState = i2;
        this.tapPoint = pointF;
    }

    public final int getFocusState() {
        return this.focusState;
    }

    public final PointF getTapPoint() {
        return this.tapPoint;
    }
}
