package androidx.car.app.model;

import androidx.car.app.OnDoneCallback;
import androidx.car.app.annotations.RequiresCarApi;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@RequiresCarApi(2)
/* loaded from: classes.dex */
public interface InputCallbackDelegate {
    void sendInputSubmitted(String str, OnDoneCallback onDoneCallback);

    void sendInputTextChanged(String str, OnDoneCallback onDoneCallback);
}
