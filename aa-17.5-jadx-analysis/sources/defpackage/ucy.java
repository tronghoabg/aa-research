package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ucy {
    public final boolean a;
    public final tmb b;
    public final erb o;
    public final plf c = new ucx();
    public final List d = new ArrayList();
    public final aekf e = new aeke(16);
    public final Set f = yrm.t();
    public final aehf g = new aehf(null);
    public final aehf h = new aehf(null);
    public final Map i = new HashMap();
    public final Map j = new HashMap();
    private int p = 1;
    public final AtomicInteger k = new AtomicInteger();
    public volatile uev l = new uev(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    public uev m = new uev(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    public volatile boolean n = false;

    public ucy(boolean z, erb erbVar, tmb tmbVar) {
        this.a = z;
        this.o = erbVar;
        this.b = tmbVar;
    }

    static tqi a(ubf ubfVar) {
        uzc uzcVarH;
        uzc uzcVarB = null;
        if (ubfVar instanceof ubq) {
            ubq ubqVar = (ubq) ubfVar;
            if (ubqVar.H() == null) {
                uzcVarH = uzc.a;
            } else {
                uzcVarH = ubqVar.H();
                uzcVarH.getClass();
            }
            return tqi.a(uzcVarH, null, null);
        }
        uzc uzcVarB2 = b(ubfVar.e().i);
        uew uewVarF = ubfVar.f();
        uew uewVarG = ubfVar.g();
        uzc uzcVarB3 = (uewVarF == null || ubfVar.C()) ? null : b(uewVarF.i);
        if (uewVarG != null && !ubfVar.D()) {
            uzcVarB = b(uewVarG.i);
        }
        return tqi.a(uzcVarB2, uzcVarB3, uzcVarB);
    }

    public static uzc b(uev uevVar) {
        return new uzc((int) uevVar.a, (int) uevVar.b, (int) uevVar.c, (int) uevVar.d);
    }

    private final int o() {
        int i = this.p;
        if (i == 0) {
            i = 1;
        }
        this.p = i + 1;
        return i;
    }

    final void c(tqj tqjVar) {
        this.f.add(tqjVar);
    }

    final void d() {
        List<ucw> list = this.d;
        synchronized (list) {
            for (ucw ucwVar : list) {
                ucwVar.b();
                this.c.g(ucwVar);
            }
            list.clear();
        }
        synchronized (this) {
            this.g.clear();
            this.i.clear();
            this.j.clear();
        }
    }

    public final void e() {
        this.k.getAndIncrement();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.ubf r10, boolean r11) {
        /*
            r9 = this;
            vat r0 = defpackage.uqb.c
            abcs r0 = r10.a()
            if (r0 == 0) goto L2b
            abdl r0 = r0.u
            if (r0 != 0) goto Le
            abdl r0 = defpackage.abdl.a
        Le:
            abnh r1 = defpackage.abdn.u
            r0.j(r1)
            abnl r0 = r0.w
            abnu r2 = r1.d
            java.lang.Object r0 = r0.j(r2)
            if (r0 != 0) goto L20
            java.lang.Object r0 = r1.b
            goto L24
        L20:
            java.lang.Object r0 = r1.c(r0)
        L24:
            abdt r0 = (defpackage.abdt) r0
            boolean r0 = r0.b
            if (r0 == 0) goto L2b
            goto L73
        L2b:
            abcs r0 = r10.a()
            r1 = 0
            if (r0 == 0) goto L5e
            udx r0 = r10.u()
            abdl r0 = r0.P()
            abnh r2 = defpackage.abdn.F
            r0.j(r2)
            abnl r3 = r0.w
            abnu r4 = r2.d
            boolean r3 = r3.m(r4)
            if (r3 == 0) goto L5e
            r0.j(r2)
            abnl r0 = r0.w
            java.lang.Object r0 = r0.j(r4)
            if (r0 != 0) goto L57
            java.lang.Object r0 = r2.b
            goto L5b
        L57:
            java.lang.Object r0 = r2.c(r0)
        L5b:
            abbb r0 = (defpackage.abbb) r0
            goto L5f
        L5e:
            r0 = r1
        L5f:
            boolean r2 = r10.o()
            if (r2 != 0) goto L74
            udx r2 = r10.u()
            uat r2 = (defpackage.uat) r2
            abky r2 = r2.B
            if (r2 == 0) goto L70
            goto L74
        L70:
            if (r0 == 0) goto L73
            goto L74
        L73:
            return
        L74:
            r2 = 1
            r11 = r11 ^ r2
            java.util.List r3 = r9.d
            monitor-enter(r3)
            int r4 = r9.o()     // Catch: java.lang.Throwable -> Ld8
            udx r5 = r10.u()     // Catch: java.lang.Throwable -> Ld8
            r6 = r5
            uat r6 = (defpackage.uat) r6     // Catch: java.lang.Throwable -> Ld8
            ucr r6 = r6.k     // Catch: java.lang.Throwable -> Ld8
            boolean r7 = r6.b()     // Catch: java.lang.Throwable -> Ld8
            if (r7 == 0) goto L99
            uim r6 = r6.a     // Catch: java.lang.Throwable -> Ld8
            r6.getClass()     // Catch: java.lang.Throwable -> Ld8
            too r6 = r6.a     // Catch: java.lang.Throwable -> Ld8
            toh r7 = new toh     // Catch: java.lang.Throwable -> Ld8
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Ld8
            goto L9a
        L99:
            r7 = r1
        L9a:
            plf r9 = r9.c     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Throwable -> Ld8
            ucw r9 = (defpackage.ucw) r9     // Catch: java.lang.Throwable -> Ld8
            int r6 = r10.t()     // Catch: java.lang.Throwable -> Ld8
            boolean r8 = r10.D()     // Catch: java.lang.Throwable -> Ld8
            if (r8 == 0) goto Lb4
            boolean r8 = r10.C()     // Catch: java.lang.Throwable -> Ld8
            if (r8 == 0) goto Lb4
            r2 = 4
            goto Lc3
        Lb4:
            boolean r8 = r10.C()     // Catch: java.lang.Throwable -> Ld8
            if (r8 == 0) goto Lbc
            r2 = 2
            goto Lc3
        Lbc:
            boolean r10 = r10.D()     // Catch: java.lang.Throwable -> Ld8
            if (r10 == 0) goto Lc3
            r2 = 3
        Lc3:
            r9.a = r6     // Catch: java.lang.Throwable -> Ld8
            r9.b = r5     // Catch: java.lang.Throwable -> Ld8
            r9.h = r2     // Catch: java.lang.Throwable -> Ld8
            r9.c = r4     // Catch: java.lang.Throwable -> Ld8
            r9.e = r7     // Catch: java.lang.Throwable -> Ld8
            r9.d = r0     // Catch: java.lang.Throwable -> Ld8
            r9.f = r1     // Catch: java.lang.Throwable -> Ld8
            r9.g = r11     // Catch: java.lang.Throwable -> Ld8
            r3.add(r9)     // Catch: java.lang.Throwable -> Ld8
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld8
            return
        Ld8:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ld8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucy.f(ubf, boolean):void");
    }

    public final void g(ubf ubfVar) {
        toh tohVar;
        vat vatVar = uqb.c;
        if (ubfVar.a() == null) {
            return;
        }
        abdl abdlVar = ubfVar.a().u;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abnh abnhVar = abdn.u;
        abdlVar.j(abnhVar);
        Object objJ = abdlVar.w.j(abnhVar.d);
        if (((abdt) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b) {
            return;
        }
        List list = this.d;
        synchronized (list) {
            int iO = o();
            udx udxVarU = ubfVar.u();
            ucr ucrVar = ((uat) udxVarU).k;
            if (ucrVar.b()) {
                uim uimVar = ucrVar.a;
                uimVar.getClass();
                tohVar = new toh(uimVar.a);
            } else {
                tohVar = null;
            }
            ucw ucwVar = (ucw) this.c.b();
            ucwVar.a = ubfVar.t();
            ucwVar.b = udxVarU;
            ucwVar.h = 8;
            ucwVar.c = iO;
            ucwVar.e = tohVar;
            ucwVar.d = null;
            ucwVar.f = null;
            ucwVar.g = true;
            list.add(ucwVar);
        }
    }

    final void h(ucw ucwVar) {
        Integer numValueOf = Integer.valueOf(ucwVar.a);
        Map map = this.j;
        if (map.containsKey(numValueOf)) {
            return;
        }
        Integer numValueOf2 = Integer.valueOf(ucwVar.a);
        abbb abbbVar = ucwVar.d;
        abbbVar.getClass();
        map.put(numValueOf2, abbbVar);
    }

    public final void i(int i) {
        List list = this.d;
        synchronized (list) {
            ucw ucwVar = (ucw) this.c.b();
            ucwVar.a = i;
            ucwVar.c = -559038737;
            ucwVar.b = null;
            ucwVar.h = 7;
            ucwVar.e = null;
            ucwVar.d = null;
            ucwVar.f = null;
            ucwVar.g = false;
            list.add(ucwVar);
        }
    }

    public final void j(int i) {
        List list = this.d;
        synchronized (list) {
            ucw ucwVar = (ucw) this.c.b();
            ucwVar.a = i;
            ucwVar.c = -559038737;
            ucwVar.b = null;
            ucwVar.h = 9;
            ucwVar.e = null;
            ucwVar.d = null;
            ucwVar.f = null;
            ucwVar.g = false;
            list.add(ucwVar);
        }
    }

    final synchronized void k() {
        this.i.clear();
    }

    public final synchronized boolean l(int i) {
        if (!this.g.c(i)) {
            if (!this.j.containsKey(Integer.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(ubq ubqVar) {
        if (ubqVar.H() == null) {
            return false;
        }
        ubqVar.H().getClass();
        if (this.l.a < r4.d) {
            if (r4.b < this.l.c && this.l.b < r4.e) {
                if (r4.c < this.l.d) {
                    return true;
                }
            }
        }
        return false;
    }

    final void n(udx udxVar, int i) {
        abdl abdlVar = udxVar.n().u;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abnh abnhVar = abdn.u;
        abdlVar.j(abnhVar);
        Object objJ = abdlVar.w.j(abnhVar.d);
        if (((abdt) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b || udxVar.r() == null) {
            return;
        }
        List list = this.d;
        synchronized (list) {
            int iO = o();
            ucw ucwVar = (ucw) this.c.b();
            ucwVar.a = -559038737;
            ucwVar.b = udxVar;
            ucwVar.h = i;
            ucwVar.c = iO;
            ucwVar.e = null;
            ucwVar.d = null;
            ucwVar.f = null;
            ucwVar.g = false;
            list.add(ucwVar);
        }
    }
}
