package androidx.car.app.utils;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteUtils$1 extends androidx.car.app.IOnDoneCallback.Stub {
    final /* synthetic */ defpackage.qz val$callback;

    public RemoteUtils$1(defpackage.qz qzVar) {
        this.val$callback = qzVar;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onFailure(androidx.car.app.serialization.Bundleable bundleable) {
        this.val$callback.onFailure(bundleable);
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onSuccess(androidx.car.app.serialization.Bundleable bundleable) {
        this.val$callback.onSuccess(bundleable);
    }
}
