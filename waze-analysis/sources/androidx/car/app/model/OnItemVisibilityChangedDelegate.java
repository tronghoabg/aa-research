package androidx.car.app.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public interface OnItemVisibilityChangedDelegate {
    void sendItemVisibilityChanged(int i2, int i3, OnDoneCallback onDoneCallback);
}
