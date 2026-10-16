package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class hss implements ComponentCallbacks2, idh {
    private static final iek e;
    protected final hrt a;
    protected final Context b;
    public final idg c;
    public final CopyOnWriteArrayList d;
    private final ido f;
    private final idn g;
    private final idt h;
    private final Runnable i;
    private final ida j;
    private iek k;

    static {
        iek iekVarB = iek.b(Bitmap.class);
        iekVarB.Y();
        e = iekVarB;
        iek.b(icm.class).Y();
    }

    public hss(hrt hrtVar, idg idgVar, idn idnVar, Context context) {
        ido idoVar = new ido();
        fxp fxpVar = hrtVar.e;
        this.h = new idt();
        gnu gnuVar = new gnu(this, 13, null);
        this.i = gnuVar;
        this.a = hrtVar;
        this.c = idgVar;
        this.g = idnVar;
        this.f = idoVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        hsr hsrVar = new hsr(this, idoVar);
        int iC = dup.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", iC == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ida idbVar = iC == 0 ? new idb(applicationContext, hsrVar) : new idk();
        this.j = idbVar;
        synchronized (hrtVar.c) {
            if (hrtVar.c.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            hrtVar.c.add(this);
        }
        if (ify.h()) {
            ify.g(gnuVar);
        } else {
            idgVar.a(this);
        }
        idgVar.a(idbVar);
        this.d = new CopyOnWriteArrayList(hrtVar.b.b);
        o(hrtVar.b.b());
    }

    private final synchronized void r() {
        Set set = this.h.a;
        Iterator it = ify.e(set).iterator();
        while (it.hasNext()) {
            i((iev) it.next());
        }
        set.clear();
    }

    public hsq a(Class cls) {
        return new hsq(this.a, this, cls, this.b);
    }

    public hsq b() {
        return a(Bitmap.class).n(e);
    }

    public hsq c() {
        return a(Drawable.class);
    }

    public hsq d(Bitmap bitmap) {
        return c().e(bitmap);
    }

    public hsq e(Uri uri) {
        return c().f(uri);
    }

    public hsq f(Object obj) {
        return c().h(obj);
    }

    final synchronized iek g() {
        return this.k;
    }

    public final void h(View view) {
        i(new ier(view));
    }

    public final void i(iev ievVar) {
        if (ievVar == null) {
            return;
        }
        boolean zQ = q(ievVar);
        ief iefVarD = ievVar.d();
        if (zQ) {
            return;
        }
        List list = this.a.c;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((hss) it.next()).q(ievVar)) {
                    return;
                }
            }
            if (iefVarD != null) {
                ievVar.h(null);
                iefVarD.c();
            }
        }
    }

    @Override // defpackage.idh
    public final synchronized void j() {
        this.h.j();
        r();
        ido idoVar = this.f;
        Iterator it = ify.e(idoVar.a).iterator();
        while (it.hasNext()) {
            idoVar.a((ief) it.next());
        }
        idoVar.b.clear();
        idg idgVar = this.c;
        idgVar.b(this);
        idgVar.b(this.j);
        ify.d().removeCallbacks(this.i);
        List list = this.a.c;
        synchronized (list) {
            if (!list.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(this);
        }
    }

    @Override // defpackage.idh
    public final synchronized void k() {
        n();
        this.h.k();
    }

    @Override // defpackage.idh
    public final synchronized void l() {
        this.h.l();
        m();
    }

    public final synchronized void m() {
        ido idoVar = this.f;
        idoVar.c = true;
        for (ief iefVar : ify.e(idoVar.a)) {
            if (iefVar.n()) {
                iefVar.f();
                idoVar.b.add(iefVar);
            }
        }
    }

    public final synchronized void n() {
        ido idoVar = this.f;
        idoVar.c = false;
        for (ief iefVar : ify.e(idoVar.a)) {
            if (!iefVar.l() && !iefVar.n()) {
                iefVar.b();
            }
        }
        idoVar.b.clear();
    }

    protected synchronized void o(iek iekVar) {
        this.k = (iek) ((iek) iekVar.o()).t();
    }

    final synchronized void p(iev ievVar, ief iefVar) {
        this.h.a.add(ievVar);
        ido idoVar = this.f;
        idoVar.a.add(iefVar);
        if (!idoVar.c) {
            iefVar.b();
            return;
        }
        iefVar.c();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        idoVar.b.add(iefVar);
    }

    final synchronized boolean q(iev ievVar) {
        ief iefVarD = ievVar.d();
        if (iefVarD == null) {
            return true;
        }
        if (!this.f.a(iefVarD)) {
            return false;
        }
        this.h.a.remove(ievVar);
        ievVar.h(null);
        return true;
    }

    public final synchronized String toString() {
        idn idnVar;
        ido idoVar;
        idnVar = this.g;
        idoVar = this.f;
        return super.toString() + "{tracker=" + String.valueOf(idoVar) + ", treeNode=" + String.valueOf(idnVar) + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
