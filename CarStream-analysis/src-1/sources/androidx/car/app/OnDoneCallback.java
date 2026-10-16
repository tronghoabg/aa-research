package androidx.car.app;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.serialization.Bundleable;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public interface OnDoneCallback {
    default void onFailure(Bundleable bundleable) {
    }

    default void onSuccess(Bundleable bundleable) {
    }
}
