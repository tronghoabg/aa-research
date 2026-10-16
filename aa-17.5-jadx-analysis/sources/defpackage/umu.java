package defpackage;

import android.util.Log;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class umu implements tuz, ums {
    public static final ygr a = ygr.t(qbp.s, qbp.t, qbp.u, qbp.v, qbp.w, qbp.p, qbp.q, qbp.r, qbp.x);
    private static final yfq b = yfq.w(pyf.b, pyf.d, pyf.f, pyf.h, pyf.n, pyf.p, pyf.o);
    private static final yfq c = yfq.w(pyf.a, pyf.c, pyf.e, pyf.g, pyf.i, pyf.m, pyf.j);
    private final erb A;
    private final qce t;
    private final ackk u;
    private final pye v;
    private final aaem y;
    private final aaem z;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = true;
    private boolean i = false;
    private long j = 0;
    private boolean k = false;
    private boolean l = false;
    private final Set m = new HashSet();
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean w = false;
    private boolean x = false;

    public umu(erb erbVar, qce qceVar, pye pyeVar, ackk ackkVar) {
        this.A = erbVar;
        this.v = pyeVar;
        this.t = qceVar;
        this.u = ackkVar;
        qby qbyVar = (qby) qbp.k.get(qceVar);
        qbyVar.getClass();
        this.y = (aaem) erbVar.R(qbyVar);
        qby qbyVar2 = (qby) qbp.l.get(qceVar);
        qbyVar2.getClass();
        this.z = (aaem) erbVar.R(qbyVar2);
    }

    private final boolean A() {
        ackk ackkVar = this.u;
        return ackkVar != null && ((uaj) ackkVar.a()).d();
    }

    private static void v(pye pyeVar, yfy yfyVar, qce qceVar) {
        ((vky) yfyVar.get(qceVar)).getClass();
        if (pyeVar != null) {
            pyeVar.a();
        }
        String[] strArr = vaq.a;
    }

    private final void w(yfy yfyVar) {
        ((qbv) yfyVar.get(this.t)).getClass();
        int i = pza.a;
    }

    private final void x(yfy yfyVar) {
        ((qbv) yfyVar.get(this.t)).getClass();
        int i = pza.a;
    }

    private static void y(pye pyeVar, yfy yfyVar, qce qceVar) {
        if (pyeVar == null) {
            return;
        }
        ((vky) yfyVar.get(qceVar)).getClass();
        pyeVar.c();
        String[] strArr = vaq.a;
    }

    private final boolean z() {
        ackk ackkVar = this.u;
        return ackkVar != null && ((uaj) ackkVar.a()).c();
    }

    @Override // defpackage.tuz
    public final synchronized void a() {
        this.k = true;
    }

    @Override // defpackage.ums
    public final synchronized void c() {
        if (this.q) {
            return;
        }
        u(4);
        if (this.h) {
            x(qbp.f);
            pye pyeVar = this.v;
            qce qceVar = this.t;
            y(pyeVar, pyf.h, qceVar);
            y(pyeVar, pyf.g, qceVar);
        }
        xuv xuvVarB = xuw.b("GlobalTimer.BasemapLabelLoad");
        try {
            String[] strArr = vaq.a;
            xuvVarB.close();
            this.q = true;
        } finally {
        }
    }

    @Override // defpackage.ums
    public final synchronized void d() {
        if (this.p) {
            return;
        }
        u(3);
        if (this.h) {
            x(qbp.d);
            pye pyeVar = this.v;
            qce qceVar = this.t;
            y(pyeVar, pyf.c, qceVar);
            y(pyeVar, pyf.d, qceVar);
        }
        xuv xuvVarB = xuw.b("GlobalTimer.BasemapTilesLoad");
        try {
            String[] strArr = vaq.a;
            xuvVarB.close();
            this.p = true;
        } finally {
        }
    }

    @Override // defpackage.ums
    public final synchronized void e() {
        if (this.s) {
            return;
        }
        u(6);
        if (this.h) {
            xuv xuvVarB = xuw.b("GlobalTimer.LastLabelTile");
            try {
                String[] strArr = vaq.a;
                xuvVarB.close();
                x(qbp.g);
                if (A()) {
                    x(qbp.h);
                }
                yvi yviVar = yvi.q;
                pza.a();
                qce qceVar = this.t;
                ((String) pzb.e.get(qceVar)).getClass();
                w(qbp.n);
                if (z()) {
                    w(qbp.o);
                }
                pye pyeVar = this.v;
                y(pyeVar, pyf.j, qceVar);
                y(pyeVar, pyf.o, qceVar);
                if (pyeVar != null) {
                    ((vky) pyf.q.get(qceVar)).getClass();
                    pyeVar.b();
                    ((vky) pyf.k.get(qceVar)).getClass();
                    pyeVar.a();
                }
            } finally {
            }
        }
        x(qbp.m);
        this.s = true;
    }

    @Override // defpackage.ums
    public final synchronized void f() {
        if (this.r) {
            return;
        }
        u(5);
        if (this.h) {
            qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
            x(qbp.b);
            if (A()) {
                x(qbp.c);
            }
            yvi yviVar = yvi.r;
            pza.a();
        }
        xuv xuvVarB = xuw.b("GlobalTimer.LastMapTile");
        try {
            String[] strArr = vaq.a;
            xuvVarB.close();
            vaq.d();
            qce qceVar = this.t;
            ((String) pzb.b.get(qceVar)).getClass();
            pye pyeVar = this.v;
            y(pyeVar, pyf.i, qceVar);
            y(pyeVar, pyf.n, qceVar);
            if (pyeVar != null) {
                ((vky) pyf.l.get(qceVar)).getClass();
                pyeVar.a();
            }
            this.r = true;
        } finally {
        }
    }

    @Override // defpackage.ums
    public final synchronized void g() {
        if (this.o) {
            return;
        }
        u(2);
        if (this.h) {
            x(qbp.e);
        }
        xuv xuvVarB = xuw.b("GlobalTimer.FirstBasemapLabelLoad");
        try {
            String[] strArr = vaq.a;
            xuvVarB.close();
            qce qceVar = this.t;
            ((String) pzb.d.get(qceVar)).getClass();
            pye pyeVar = this.v;
            y(pyeVar, pyf.f, qceVar);
            y(pyeVar, pyf.e, qceVar);
            this.o = true;
        } finally {
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("MapStartupTracker"));
        printWriter.println(str + "  mapDisplayType: " + this.t.name());
        synchronized (this) {
            printWriter.println(str + "  baseTilesFetchedFromServer: " + this.f);
            printWriter.println(str + "  baseTilesFetchedFromCache: " + this.g);
            printWriter.println(str + "  anyTileFetchedFromServer: " + this.d);
            printWriter.println(str + "  anyTileFetchedFromCache: " + this.e);
            printWriter.println(str + "  shouldLogFirstViewportMetrics: " + this.h);
            printWriter.println(str + "  firstFullViewportRecorded: " + this.l);
            printWriter.println(str + "  hasLoggedFirstMapTile: " + this.n);
            printWriter.println(str + "  hasLoggedBasemapTiles: " + this.p);
            printWriter.println(str + "  hasLoggedBasemapLabels: " + this.q);
            printWriter.println(str + "  hasLoggedLastMapTile: " + this.r);
            printWriter.println(str + "  hasLoggedAllLabelsPlaced: " + this.s);
            Set set = this.m;
            if (!set.isEmpty()) {
                printWriter.println(str + "  loggedStartupStateErrors: " + ((String) Collection.EL.stream(set).map(new ric(20)).collect(Collectors.joining(", ", "[", "]"))));
            }
        }
        int i = pza.a;
    }

    @Override // defpackage.ums
    public final synchronized void h() {
        if (this.n) {
            return;
        }
        vaq.d();
        qce qceVar = this.t;
        ((String) pzb.a.get(qceVar)).getClass();
        if (this.h) {
            qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
            x(qbp.a);
            ((aaem) this.A.R(qbk.a)).n();
            pye pyeVar = this.v;
            y(pyeVar, pyf.a, qceVar);
            y(pyeVar, pyf.b, qceVar);
        }
        this.n = true;
    }

    @Override // defpackage.ums
    public final synchronized void i() {
        if (!this.l) {
            if (this.h) {
                x(qbp.j);
                yvi yviVar = yvi.o;
                pza.a();
                qce qceVar = this.t;
                ((String) pzb.c.get(qceVar)).getClass();
                pye pyeVar = this.v;
                y(pyeVar, pyf.m, qceVar);
                y(pyeVar, pyf.p, qceVar);
                w(qbp.n);
            } else {
                w(qbp.j);
            }
            this.l = true;
            if (Log.isLoggable("WaitForStableMap", 2)) {
                Log.v("WaitForStableMap", "stable map");
            }
        }
    }

    @Override // defpackage.ums
    public final synchronized void j() {
        this.w = true;
        this.y.n();
        this.z.n();
    }

    @Override // defpackage.ums
    public final synchronized void k() {
        this.h = false;
    }

    @Override // defpackage.ums
    public final synchronized void l() {
        boolean z = this.w;
        aaem aaemVar = this.y;
        if (z) {
            aaemVar.l();
        } else {
            aaemVar.m();
        }
    }

    @Override // defpackage.ums
    public final synchronized void m() {
        vaq.d();
        boolean z = this.w;
        aaem aaemVar = this.z;
        if (z) {
            aaemVar.l();
        } else {
            aaemVar.m();
        }
    }

    @Override // defpackage.ums
    public final synchronized void n(abgl abglVar) {
        if (abglVar == abgl.GMM_VECTOR_BASE) {
            this.g = true;
        }
        this.e = true;
    }

    @Override // defpackage.ums
    public final synchronized void o(abgl abglVar) {
        if (abglVar == abgl.GMM_VECTOR_BASE) {
            this.f = true;
        }
        this.d = true;
    }

    @Override // defpackage.ums
    public final synchronized void p(long j) {
        if (!this.l && !this.i) {
            long j2 = this.j;
            if (j2 == 0) {
                this.j = j;
            } else if (j2 != j) {
                if (this.k) {
                    qbs qbsVar = qbs.AUTO_PAN_MODE_ENABLED;
                } else {
                    qbs qbsVar2 = qbs.AUTO_PAN_MODE_ENABLED;
                }
                this.j = j;
                this.i = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void t() {
        if (!this.x && !this.s) {
            vaq.d();
            yvi yviVar = yvi.p;
            pza.a();
            w(qbp.a);
            w(qbp.b);
            w(qbp.g);
            w(qbp.m);
            w(qbp.j);
            w(qbp.d);
            w(qbp.f);
            w(qbp.c);
            w(qbp.h);
            w(qbp.e);
            yno it = a.iterator();
            while (it.hasNext()) {
            }
            yfq yfqVar = b;
            int i = ((yls) yfqVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                v(this.v, (yfy) yfqVar.get(i2), this.t);
            }
            yfq yfqVar2 = c;
            int i3 = ((yls) yfqVar2).c;
            for (int i4 = 0; i4 < i3; i4++) {
                v(this.v, (yfy) yfqVar2.get(i4), this.t);
            }
            erb erbVar = this.A;
            qce qceVar = this.t;
            qbr qbrVar = (qbr) qbp.i.get(qceVar);
            qbrVar.getClass();
            x(qbp.n);
            if (z()) {
                x(qbp.o);
            }
            pye pyeVar = this.v;
            if (pyeVar != null) {
                if (!this.r) {
                    y(pyeVar, pyf.l, qceVar);
                }
                if (!this.s) {
                    y(pyeVar, pyf.k, qceVar);
                }
            }
        }
        this.x = true;
        this.h = false;
    }

    final synchronized void u(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (!this.p) {
                        qbr qbrVar = qbp.p;
                        int i3 = pza.a;
                        this.m.add(qbrVar);
                    }
                    if (!this.o) {
                        qbr qbrVar2 = qbp.q;
                        int i4 = pza.a;
                        this.m.add(qbrVar2);
                    }
                } else if (i2 != 4) {
                    if (!this.q) {
                        qbr qbrVar3 = qbp.s;
                        int i5 = pza.a;
                        this.m.add(qbrVar3);
                    }
                    if (!this.r) {
                        qbr qbrVar4 = qbp.t;
                        int i6 = pza.a;
                        this.m.add(qbrVar4);
                    }
                    if (!this.o) {
                        qbr qbrVar5 = qbp.u;
                        int i7 = pza.a;
                        this.m.add(qbrVar5);
                    }
                } else {
                    if (!this.p) {
                        qbr qbrVar6 = qbp.v;
                        int i8 = pza.a;
                        this.m.add(qbrVar6);
                    }
                    if (!this.n) {
                        qbr qbrVar7 = qbp.w;
                        int i9 = pza.a;
                        this.m.add(qbrVar7);
                    }
                }
            } else if (!this.n) {
                qbr qbrVar8 = qbp.r;
                int i10 = pza.a;
                this.m.add(qbrVar8);
            }
        } else if (!this.n) {
            qbr qbrVar9 = qbp.x;
            int i11 = pza.a;
            this.m.add(qbrVar9);
        }
    }

    @Override // defpackage.ums
    public final void r() {
    }

    @Override // defpackage.ums
    public final void q(trl trlVar) {
    }

    @Override // defpackage.ums
    public final void s(trl trlVar) {
    }
}
