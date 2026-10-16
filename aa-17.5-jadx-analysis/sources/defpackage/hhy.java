package defpackage;

import android.content.Context;
import android.location.Location;
import androidx.car.app.IAppHost;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final class hhy extends IAppHost.Stub {
    public final /* synthetic */ hhz a;

    public hhy(hhz hhzVar) {
        this.a = hhzVar;
    }

    @Override // androidx.car.app.IAppHost
    public final void dismissAlert(int i) {
        int iC = this.a.a.i().c();
        if (iC <= 4) {
            gks.e("CarApp.H", "Attempt to dismiss alert for app Api level %s", Integer.valueOf(iC));
        } else {
            gev.c(new hhx(this, i, 0));
        }
    }

    @Override // androidx.car.app.IAppHost
    public final int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IAppHost
    public final void invalidate() {
        hhz hhzVar = this.a;
        if (!hhzVar.a.D().a) {
            gks.j("CarApp.H", "Skipping call to invalidate as app is not bound");
        } else {
            gks.b("CarApp.H", "Calling invalidate function");
            hhzVar.n("invalidate", new gnu(hhzVar, 12));
        }
    }

    @Override // androidx.car.app.IAppHost
    public final Bundleable openMicrophone(Bundleable bundleable) {
        sn snVar;
        hhz hhzVar = this.a;
        Context contextA = hhzVar.a.a();
        contextA.getClass();
        mt.k(contextA, "android.permission.RECORD_AUDIO");
        try {
            if (!hhzVar.b || !hhzVar.a.c().a().getLifecycle().a().a(eps.d) || hhzVar.a.i().c() <= 4) {
                gev.c(new gnu(((OpenMicrophoneRequest) bundleable.a()).getCarAudioCallbackDelegate(), 11));
                return new Bundleable(new OpenMicrophoneResponse(new sn(new hhv(0))));
            }
            gdu gduVar = (gdu) hhzVar.a.l(gdu.class);
            gduVar.getClass();
            OpenMicrophoneRequest openMicrophoneRequest = (OpenMicrophoneRequest) bundleable.a();
            eqm eqmVar = gduVar.a;
            eqmVar.j(gdt.a);
            synchronized (eqmVar) {
                OpenMicrophoneRequest openMicrophoneRequest2 = gduVar.b;
                if (openMicrophoneRequest2 != null) {
                    openMicrophoneRequest2.getCarAudioCallbackDelegate().onStopRecording();
                }
                gduVar.b = openMicrophoneRequest;
                snVar = new sn(new gds(gduVar, 0));
            }
            return new Bundleable(gduVar.a(snVar));
        } catch (xr e) {
            gks.f("CarApp.H", e, "Failed to unpack or create car audio request");
            throw new IllegalStateException(e);
        }
    }

    @Override // androidx.car.app.IAppHost
    public final void sendLocation(Location location) {
        gev.c(new hhw(this, location, 1));
    }

    @Override // androidx.car.app.IAppHost
    public final void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
        this.a.n("setSurfaceCallback", new hhw(this, iSurfaceCallback, 2));
    }

    @Override // androidx.car.app.IAppHost
    public final void showAlert(Bundleable bundleable) {
        int iC = this.a.a.i().c();
        if (iC <= 4) {
            gks.e("CarApp.H", "Attempt to show alert for app Api level %s", Integer.valueOf(iC));
        } else {
            gev.c(new hhw(this, bundleable, 0));
        }
    }

    @Override // androidx.car.app.IAppHost
    public final void showToast(CharSequence charSequence, int i) {
        gev.c(new oa((Object) this, charSequence, i, 4));
    }
}
