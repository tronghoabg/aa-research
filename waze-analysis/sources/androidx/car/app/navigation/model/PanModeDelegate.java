package androidx.car.app.navigation.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(2)
/* loaded from: classes2.dex */
public interface PanModeDelegate {
    void sendPanModeChanged(boolean z, OnDoneCallback onDoneCallback);
}
