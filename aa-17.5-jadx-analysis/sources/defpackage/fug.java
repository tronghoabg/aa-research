package defpackage;

import android.util.Log;
import androidx.car.app.ICarHost;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fug implements eqa, gnp, fbg {
    public final eqc a;
    public final gmg b;
    public final gns c;
    public final HashMap d;
    public geu e;
    public long f;
    public boolean g;
    public boolean h;
    private final fbf i;
    private final ICarHost.Stub j;

    public fug(geu geuVar) {
        eqc eqcVar = new eqc(this, true);
        this.a = eqcVar;
        fbf fbfVarL = ebi.l(this);
        this.i = fbfVarL;
        fuf fufVar = new fuf(this);
        this.j = fufVar;
        this.d = new HashMap();
        this.f = -1L;
        this.g = true;
        this.h = false;
        this.e = geuVar;
        this.b = new gmg(geuVar, fufVar, new glf(this, geuVar));
        geuVar.B().b(this, 7, new elt(this, 16));
        this.c = geuVar.k();
        fbfVarL.b(null);
        eqcVar.e(epr.ON_CREATE);
        eqcVar.c(new fue(this, geuVar));
    }

    public final fuh a(String str) {
        b();
        fuh fuhVar = (fuh) this.d.get(str);
        if (fuhVar != null) {
            return fuhVar;
        }
        throw new IllegalStateException("No host service registered for: ".concat(str));
    }

    public final void b() {
        woy.aa(this.g, "Accessed the car host after it became invalidated");
    }

    public final void c(epr eprVar) {
        Log.d("CarApp.H", "AppLifecycleEvent: ".concat(String.valueOf(String.valueOf(eprVar))));
        b();
        this.a.e(eprVar);
    }

    public final void d() {
        this.g = false;
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((fuh) it.next()).h();
        }
        this.a.e(epr.ON_DESTROY);
    }

    public final void e() {
        this.b.g();
    }

    public final void f(String str, fui fuiVar) {
        b();
        HashMap map = this.d;
        if (((fuh) map.get(str)) == null) {
            map.put(str, fuiVar.a(this.b));
        }
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.a;
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return (fbe) this.i.b;
    }

    @Override // defpackage.gnp
    public final void p(PrintWriter printWriter) {
        throw null;
    }

    public final String toString() {
        return this.b.toString();
    }
}
