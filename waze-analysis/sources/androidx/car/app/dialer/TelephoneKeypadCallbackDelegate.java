package androidx.car.app.dialer;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public interface TelephoneKeypadCallbackDelegate {
    void sendKeyDown(int i2, OnDoneCallback onDoneCallback);

    void sendKeyLongPress(int i2, OnDoneCallback onDoneCallback);

    void sendKeyUp(int i2, OnDoneCallback onDoneCallback);
}
