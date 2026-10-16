package androidx.car.app.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.CarProtocol;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public interface SearchCallbackDelegate {
    void sendSearchSubmitted(String str, OnDoneCallback onDoneCallback);

    void sendSearchTextChanged(String str, OnDoneCallback onDoneCallback);
}
