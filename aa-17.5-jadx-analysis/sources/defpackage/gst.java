package defpackage;

import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
final class gst extends gej {
    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onFailure(Bundleable bundleable) {
        ((ynz) ((ynz) gsu.b.e()).ai('R')).u("dispatchStopNavigation failed");
        super.onFailure(bundleable);
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        ((ynz) ((ynz) gsu.b.e()).ai('S')).u("dispatchStopNavigation succeeded");
        super.onSuccess(bundleable);
    }
}
