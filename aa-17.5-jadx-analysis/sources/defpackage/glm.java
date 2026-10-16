package defpackage;

import android.content.ComponentName;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final class glm extends gej {
    final /* synthetic */ aitf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glm(glf glfVar, aitf aitfVar, geb gebVar, ComponentName componentName, gns gnsVar, urf urfVar) {
        super(gebVar, componentName, glfVar, gnsVar, urfVar);
        this.f = aitfVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onFailure(Bundleable bundleable) {
        bundleable.getClass();
        this.f.g(null);
        super.onFailure(bundleable);
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        super.onSuccess(bundleable);
        bundleable.getClass();
        this.f.w(bundleable.a());
    }
}
