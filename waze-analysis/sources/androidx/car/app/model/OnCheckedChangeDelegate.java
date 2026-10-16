package androidx.car.app.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public interface OnCheckedChangeDelegate {
    void sendCheckedChange(boolean z, OnDoneCallback onDoneCallback);
}
