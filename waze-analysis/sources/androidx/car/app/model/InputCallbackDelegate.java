package androidx.car.app.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: WazeSource */
@RequiresCarApi(2)
/* loaded from: classes2.dex */
public interface InputCallbackDelegate {
    void sendInputSubmitted(String str, OnDoneCallback onDoneCallback);

    void sendInputTextChanged(String str, OnDoneCallback onDoneCallback);
}
