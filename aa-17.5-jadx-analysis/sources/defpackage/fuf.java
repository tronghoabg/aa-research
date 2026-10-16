package defpackage;

import android.content.Intent;
import android.os.IBinder;
import androidx.car.app.ICarHost;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class fuf extends ICarHost.Stub {
    final /* synthetic */ fug a;

    public fuf(fug fugVar) {
        this.a = fugVar;
    }

    @Override // androidx.car.app.ICarHost
    public final void finish() {
        this.a.e.c().b();
    }

    @Override // androidx.car.app.ICarHost
    public final IBinder getHost(String str) {
        fug fugVar = this.a;
        fugVar.b();
        fuh fuhVar = (fuh) fugVar.d.get(str);
        if (Objects.equals(str, "navigation") && !((gmh) fugVar.e.d()).b) {
            throw new IllegalArgumentException("Attempted to retrieve the navigation service, but the app is not a navigation app");
        }
        if (Objects.equals(str, "constraints") && fugVar.e.i().c() < 2) {
            throw new IllegalArgumentException("Attempted to retrieve the constraint service, but the host's API level is less than 2");
        }
        if (Objects.equals(str, "hardware") && fugVar.e.i().c() < 3) {
            throw new IllegalArgumentException("Attempted to retrieve the hardware service, but the host's API level is less than 3");
        }
        if (fuhVar != null) {
            return fuhVar.q();
        }
        throw new IllegalArgumentException("Unknown host service type:".concat(String.valueOf(str)));
    }

    @Override // androidx.car.app.ICarHost
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ICarHost
    public final void startCarApp(Intent intent) {
        jwn.a(this.a.e.c().b.a.getPackageName(), intent, true);
    }
}
