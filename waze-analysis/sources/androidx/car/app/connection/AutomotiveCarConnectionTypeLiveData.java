package androidx.car.app.connection;

import androidx.lifecycle.LiveData;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AutomotiveCarConnectionTypeLiveData extends LiveData<Integer> {
    AutomotiveCarConnectionTypeLiveData() {
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        setValue(1);
    }
}
