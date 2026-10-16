package androidx.car.app.utils;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.Bundleable;
import defpackage.qu;

/* loaded from: classes2.dex */
public class RemoteUtils$1 extends IOnDoneCallback.Stub {
    final /* synthetic */ qu val$callback;

    public RemoteUtils$1(qu quVar) {
        this.val$callback = quVar;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onFailure(Bundleable bundleable) {
        this.val$callback.onFailure(bundleable);
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onSuccess(Bundleable bundleable) {
        this.val$callback.onSuccess(bundleable);
    }
}
