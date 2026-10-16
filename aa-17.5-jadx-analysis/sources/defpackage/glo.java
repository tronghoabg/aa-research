package defpackage;

import android.content.ComponentName;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final class glo extends gej {
    final /* synthetic */ urf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glo(glf glfVar, urf urfVar, geb gebVar, ComponentName componentName, gns gnsVar, urf urfVar2) {
        super(gebVar, componentName, glfVar, gnsVar, urfVar2);
        this.f = urfVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onFailure(Bundleable bundleable) {
        bundleable.getClass();
        this.f.c();
        super.onFailure(bundleable);
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        this.f.c();
        super.onSuccess(bundleable);
    }
}
