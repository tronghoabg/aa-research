package androidx.car.app.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(6)
/* loaded from: classes2.dex */
public interface TabCallbackDelegate {
    void sendTabSelected(String str, OnDoneCallback onDoneCallback);
}
