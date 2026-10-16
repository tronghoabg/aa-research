package defpackage;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class umt implements ums {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private final Set h = new HashSet();

    @Override // defpackage.ums
    public final void c() {
        synchronized (this) {
            if (this.e) {
                return;
            }
            this.e = true;
            yno it = ygr.n(this.h).iterator();
            while (it.hasNext()) {
                ((trl) it.next()).a();
            }
        }
    }

    @Override // defpackage.ums
    public final void d() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            yno it = ygr.n(this.h).iterator();
            while (it.hasNext()) {
                ((trl) it.next()).b();
            }
        }
    }

    @Override // defpackage.ums
    public final void e() {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.g = true;
            yno it = ygr.n(this.h).iterator();
            while (it.hasNext()) {
                ((trl) it.next()).c();
            }
        }
    }

    @Override // defpackage.ums
    public final void f() {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            yno it = ygr.n(this.h).iterator();
            while (it.hasNext()) {
                ((trl) it.next()).d();
            }
        }
    }

    @Override // defpackage.ums
    public final void g() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            yno it = ygr.n(this.h).iterator();
            while (it.hasNext()) {
                ((trl) it.next()).f();
            }
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("MapStartupEventTrackerImpl"));
        synchronized (this) {
            printWriter.println(str + "  firstFullViewportRecorded: " + this.a);
            printWriter.println(str + "  hasLoggedFirstMapTile: " + this.b);
            printWriter.println(str + "  hasLoggedFirstBasemapLabel: " + this.c);
            printWriter.println(str + "  hasLoggedBasemapTiles: " + this.d);
            printWriter.println(str + "  hasLoggedBasemapLabels: " + this.e);
            printWriter.println(str + "  hasLoggedLastMapTile: " + this.f);
            printWriter.println(str + "  hasLoggedAllLabelsPlaced: " + this.g);
        }
    }

    @Override // defpackage.ums
    public final void h() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            yno it = ygr.n(this.h).iterator();
            while (it.hasNext()) {
                ((trl) it.next()).g();
            }
        }
    }

    @Override // defpackage.ums
    public final void i() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            yno it = ygr.n(this.h).iterator();
            while (it.hasNext()) {
                ((trl) it.next()).e();
            }
        }
    }

    @Override // defpackage.ums
    public final void j() {
        ygr ygrVarN;
        synchronized (this) {
            ygrVarN = ygr.n(this.h);
        }
        yno it = ygrVarN.iterator();
        while (it.hasNext()) {
            ((trl) it.next()).h();
        }
    }

    @Override // defpackage.ums
    public final void k() {
        ygr ygrVarN;
        synchronized (this) {
            ygrVarN = ygr.n(this.h);
        }
        yno it = ygrVarN.iterator();
        while (it.hasNext()) {
            ((trl) it.next()).i();
        }
    }

    @Override // defpackage.ums
    public final void l() {
        ygr ygrVarN;
        synchronized (this) {
            ygrVarN = ygr.n(this.h);
        }
        yno it = ygrVarN.iterator();
        while (it.hasNext()) {
            ((trl) it.next()).j();
        }
    }

    @Override // defpackage.ums
    public final void m() {
        ygr ygrVarN;
        synchronized (this) {
            ygrVarN = ygr.n(this.h);
        }
        yno it = ygrVarN.iterator();
        while (it.hasNext()) {
            ((trl) it.next()).k();
        }
    }

    @Override // defpackage.ums
    public final synchronized void n(abgl abglVar) {
    }

    @Override // defpackage.ums
    public final synchronized void o(abgl abglVar) {
    }

    @Override // defpackage.ums
    public final synchronized void q(trl trlVar) {
        this.h.add(trlVar);
    }

    @Override // defpackage.ums
    public final synchronized void s(trl trlVar) {
        this.h.remove(trlVar);
    }

    @Override // defpackage.ums
    public final void r() {
    }

    @Override // defpackage.ums
    public final void p(long j) {
    }
}
