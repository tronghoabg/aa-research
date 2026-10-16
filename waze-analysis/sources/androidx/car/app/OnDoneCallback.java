package androidx.car.app;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.serialization.Bundleable;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public interface OnDoneCallback {
    void onFailure(Bundleable bundleable);

    void onSuccess(Bundleable bundleable);

    /* compiled from: WazeSource */
    /* renamed from: androidx.car.app.OnDoneCallback$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onFailure(OnDoneCallback onDoneCallback, Bundleable bundleable) {
        }

        public static void $default$onSuccess(OnDoneCallback onDoneCallback, Bundleable bundleable) {
        }
    }
}
