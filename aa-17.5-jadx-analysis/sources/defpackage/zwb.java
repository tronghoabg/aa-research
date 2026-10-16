package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.GoogleMapOptions;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zwb extends ven {
    private zvj a;
    private GoogleMapOptions b;
    private final List c = new ArrayList();
    private final aaau d;
    private final gjt e;

    public zwb(aaau aaauVar, gjt gjtVar) {
        this.d = aaauVar;
        this.e = gjtVar;
    }

    @Override // defpackage.veo
    @Deprecated
    public final veg a() {
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

    @Override // defpackage.veo
    public final String b(String str) {
        try {
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                return "map is null; This means that the map is not ready yet.";
            }
            try {
                return zvjVar.v(str);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
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

    @Override // defpackage.veo
    public final void c(vgv vgvVar) {
        try {
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                this.c.add(vgvVar);
                return;
            }
            try {
                zvjVar.B(vgvVar);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
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

    @Override // defpackage.veo
    public final void d() {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                zvjVar.D();
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

    @Override // defpackage.veo
    public final void f(Bundle bundle) {
        try {
            GoogleMapOptions googleMapOptions = this.b;
            if (googleMapOptions == null) {
                googleMapOptions = (GoogleMapOptions) vja.c(bundle, "MapOptions");
                this.b = googleMapOptions;
            }
            if (googleMapOptions == null) {
                this.b = new GoogleMapOptions();
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

    @Override // defpackage.veo
    public final void g() {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                zvjVar.F();
                this.a = null;
            }
            this.b = null;
            this.e.G();
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

    @Override // defpackage.veo
    public final void h() {
        try {
            if (this.a.aK()) {
                this.a.F();
                this.a = null;
                this.e.G();
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

    @Override // defpackage.veo
    public final void i(Bundle bundle) {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                try {
                    zvjVar.G(bundle);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
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

    @Override // defpackage.veo
    public final void j() {
        try {
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                try {
                    zvjVar.H();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
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

    @Override // defpackage.veo
    public final void k() {
        try {
            if (this.a == null && addm.k()) {
                throw new zse("Map is not ready to invoke map.onLowMemory()");
            }
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                zrn.b("Map is not ready to invoke map.onLowMemory()");
            } else {
                zvjVar.I();
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

    @Override // defpackage.veo
    public final void l() {
        try {
            if (this.a == null && addm.k()) {
                throw new zse("Map is not ready to invoke map.onPause()");
            }
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                zrn.b("Map is not ready to invoke map.onPause()");
            } else {
                zvjVar.J();
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

    @Override // defpackage.veo
    public final void m() {
        try {
            if (this.a == null && addm.k()) {
                throw new zse("Map is not ready to invoke map.onResume()");
            }
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                zrn.b("Map is not ready to invoke map.onResume()");
            } else {
                zvjVar.K();
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

    @Override // defpackage.veo
    public final void n(Bundle bundle) {
        try {
            if (this.a == null && addm.k()) {
                throw new zse("Map is not ready to invoke map.onSaveInstanceState()");
            }
            GoogleMapOptions googleMapOptions = this.b;
            if (googleMapOptions != null) {
                vja.e(bundle, "MapOptions", googleMapOptions);
            }
            zvj zvjVar = this.a;
            if (zvjVar != null) {
                zvjVar.L(bundle);
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

    @Override // defpackage.veo
    public final void o() {
        try {
            if (this.a == null && addm.k()) {
                throw new zse("Map is not ready to invoke map.onStart()");
            }
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                zrn.b("Map is not ready to invoke map.onStart()");
            } else {
                zvjVar.M();
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

    @Override // defpackage.veo
    public final void p() {
        try {
            if (this.a == null && addm.k()) {
                throw new zse("Map is not ready to invoke map.onStop()");
            }
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                zrn.b("Map is not ready to invoke map.onStop()");
            } else {
                zvjVar.N();
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

    @Override // defpackage.veo
    public final boolean q() {
        try {
            return this.a != null;
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

    @Override // defpackage.veo
    @ResultIgnorabilityUnspecified
    public final sqj r(sqj sqjVar, Bundle bundle) {
        View viewA;
        try {
            zvj zvjVar = this.a;
            if (zvjVar == null) {
                aaau aaauVar = this.d;
                zvf zvfVarAL = zvf.aL(this.b, (gjt) aaauVar.b, (aabc) aaauVar.a);
                this.a = zvfVarAL;
                zvfVarAL.E(bundle);
                viewA = this.a.a();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.B((vgv) it.next());
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
                this.c.clear();
            } else {
                viewA = zvjVar.a();
                ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewA);
                }
            }
            return new sqi(viewA);
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

    @Override // defpackage.veo
    public final void s(GoogleMapOptions googleMapOptions) {
        try {
            this.b = googleMapOptions;
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
