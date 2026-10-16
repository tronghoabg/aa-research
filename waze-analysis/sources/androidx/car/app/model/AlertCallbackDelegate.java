package androidx.car.app.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(5)
/* loaded from: classes2.dex */
public interface AlertCallbackDelegate {
    void sendCancel(int i2, OnDoneCallback onDoneCallback);

    void sendDismiss(OnDoneCallback onDoneCallback);
}
