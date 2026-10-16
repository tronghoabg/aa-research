package defpackage;

import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final class gsp extends INavigationHost.Stub {
    public final /* synthetic */ gsr a;

    public gsp(gsr gsrVar) {
        this.a = gsrVar;
    }

    @Override // androidx.car.app.navigation.INavigationHost
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.navigation.INavigationHost
    public final void navigationEnded() {
        gsr gsrVar = this.a;
        if (!gsrVar.b) {
            gks.j("CarApp.H.Nav", "Accessed navigationEnded after host became invalidated");
        }
        gks.h("CarApp.H.Nav", "%s ended navigation", gsrVar.a());
        gev.c(new gnu(this, 5));
        gsrVar.a.k().d(gnr.b(14, ((gmh) gsrVar.a.d()).a));
    }

    @Override // androidx.car.app.navigation.INavigationHost
    public final void navigationStarted() {
        this.a.n("navigationStarted", new gnu(this, 7));
    }

    @Override // androidx.car.app.navigation.INavigationHost
    public final void setVoiceAssistantCapabilities(Bundleable bundleable) {
        gsr gsrVar = this.a;
        if (gcx.g(gsrVar.a)) {
            gsrVar.n("setVoiceAssistantCapabilities", new esx(this, bundleable, 18, (char[]) null));
        }
    }

    @Override // androidx.car.app.navigation.INavigationHost
    public final void updateTrip(Bundleable bundleable) {
        this.a.n("updateTrip", new esx(this, bundleable, 17, (char[]) null));
    }
}
