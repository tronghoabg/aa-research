package androidx.car.app.serialization;

import androidx.car.app.OnDoneCallback;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ListDelegate<T> {
    int getSize();

    void requestItemRange(int i2, int i3, OnDoneCallback onDoneCallback);
}
