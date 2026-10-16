package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.maps.GoogleMapOptions;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class zws extends vep {
    private static final ysi e = new ysi();
    private zvj a;
    private final GoogleMapOptions b;
    private final aabc c;
    private final gjt d;

    public zws(GoogleMapOptions googleMapOptions, gjt gjtVar, aabc aabcVar) {
        ysi ysiVar = e;
        this.b = googleMapOptions == null ? new GoogleMapOptions() : googleMapOptions;
        this.d = gjtVar;
        zkt.n(aabcVar, "environment");
        this.c = aabcVar;
        zkt.n(ysiVar, "googleMapFactory");
    }

    private static final void o(String str) {
        if (zrn.e("MapView", 4)) {
            Log.i("MapView", String.format("MapView.%s() called before MapView.onCreate(). If you are seeing this message often, make sure you are calling all of your MapView's lifecylce methods at the right time.", str));
        }
    }

    private final boolean p(String str) {
        addm.a.gu().x();
        if (this.a == null) {
            o(str);
            return false;
        }
        ysi.W(String.format("%s() call is not on Android main thread.", str));
        return true;
    }

    @Override // defpackage.veq
    public final sqj a() {
        try {
            return new sqi(this.a.a());
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.veq
    @Deprecated
    public final veg b() {
        try {
            return this.a;
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.veq
    public final void c(vgv vgvVar) {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                try {
                    zvjVar.B(vgvVar);
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void d(Bundle bundle) {
        try {
            ysi.W("onCreate is not on Android main thread.");
            this.a = zvf.aL(this.b, this.d, this.c);
            if (p("onCreate")) {
                this.a.E(bundle);
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void f() {
        try {
            if (p("onDestroy")) {
                this.a.F();
            }
            this.a = null;
            this.d.G();
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void g(Bundle bundle) {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                try {
                    zvjVar.G(bundle);
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void h() {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                try {
                    zvjVar.H();
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void i() {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                zvjVar.I();
            } else {
                o("onLowMemory");
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void j() {
        try {
            if (p("onPause")) {
                this.a.J();
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void k() {
        try {
            if (p("onResume")) {
                this.a.K();
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void l(Bundle bundle) {
        try {
            if (p("onSaveInstanceState")) {
                this.a.L(bundle);
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void m() {
        try {
            if (p("onStart")) {
                this.a.M();
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }

    @Override // defpackage.veq
    public final void n() {
        try {
            if (p("onStop")) {
                this.a.N();
            }
        } catch (Throwable th) {
            zus.a(th);
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (!(th instanceof Error)) {
                throw new RuntimeException(th);
            }
            throw ((Error) th);
        }
    }
}
