package defpackage;

import android.content.ComponentName;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public class gej extends IOnDoneCallback.Stub implements qu {
    public final geb a;
    public final ComponentName b;
    public final gns c;
    public final glf d;
    public final urf e;

    public gej(geu geuVar, glf glfVar) {
        this(geuVar.f(), ((gmh) geuVar.d()).a, glfVar, geuVar.k(), geuVar.D());
    }

    @Override // androidx.car.app.IOnDoneCallback
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onFailure(Bundleable bundleable) {
        this.d.a();
        gev.c(new esx(this, bundleable, 14, (char[]) null));
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onSuccess(Bundleable bundleable) {
        this.d.a();
    }

    public gej(geb gebVar, ComponentName componentName, glf glfVar, gns gnsVar, urf urfVar) {
        this.a = gebVar;
        this.b = componentName;
        this.d = glfVar;
        this.c = gnsVar;
        this.e = urfVar;
    }
}
