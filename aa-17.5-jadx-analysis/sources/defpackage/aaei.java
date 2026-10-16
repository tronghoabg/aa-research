package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class aaei implements tuy {
    public static final double a = Math.log(2.0d);
    private static final String g = "aaei";
    public float b;
    public float c;
    public aaev d;
    public zvg e;
    public ackk f;
    private final float h;
    private final float i;
    private MotionEvent j;
    private final aadr k;
    private final aacz l;
    private final zrt m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final aacx q;
    private final List r;
    private final List s;
    private aaej[] t;
    private aadt u;
    private int v;

    public aaei(aadr aadrVar, aacz aaczVar) {
        zrt zrtVar = zrt.a;
        this.v = 1;
        synchronized (this) {
            this.k = aadrVar;
            this.l = aaczVar;
            this.m = zrtVar;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = new aacx();
            this.r = new ArrayList();
            this.s = new ArrayList();
            this.d = null;
            this.e = null;
            this.t = null;
            this.u = null;
            this.f = null;
            this.i = zkt.q(20.0d);
            this.h = zkt.q(20.0d);
        }
    }

    private static int F(MotionEvent motionEvent) {
        return motionEvent.getPointerCount() < 2 ? 1 : 2;
    }

    private final void G() {
        synchronized (this) {
            if (!this.q.f) {
                this.n = false;
            }
        }
    }

    private final void H(aadp aadpVar) {
        zkt.n(this.d, "worldStateProvider");
        if (addm.l()) {
            this.d.d(new aaed());
        } else {
            this.d.c().v(null);
        }
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, a.bW(aadpVar, "Enqueueing animation(", ")"));
        }
        aadt aadtVar = this.u;
        if (aadtVar == null) {
            this.u = new aadt(aadpVar);
        } else if (aadpVar != aadtVar.a) {
            aadtVar.b();
            this.u = new aadt(aadpVar);
        }
        this.d.e(this.u);
    }

    @ResultIgnorabilityUnspecified
    private final boolean I(float f, float f2, float f3) {
        this.m.a();
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, "handleRotateEvent(" + f + ")");
        }
        synchronized (this) {
            if (!this.q.g) {
                return false;
            }
            aaek aaekVarB = B();
            aaekVarB.b(BitmapDescriptorFactory.HUE_RED, f, f2, f3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            H(aaekVarB);
            ackk ackkVar = this.f;
            if (ackkVar == null) {
                return true;
            }
            ((tux) ackkVar.a()).k();
            return true;
        }
    }

    @ResultIgnorabilityUnspecified
    private final boolean J(float f) {
        this.m.a();
        G();
        synchronized (this) {
            if (!this.q.f) {
                return false;
            }
            H(new aaeo(-f));
            ackk ackkVar = this.f;
            if (ackkVar == null) {
                return true;
            }
            ((tux) ackkVar.a()).m();
            return true;
        }
    }

    private final synchronized aaej[] K() {
        aaej[] aaejVarArrL;
        aaejVarArrL = this.t;
        if (aaejVarArrL == null) {
            aaejVarArrL = L();
            this.t = aaejVarArrL;
        }
        return aaejVarArrL;
    }

    private final synchronized aaej[] L() {
        aaej[] aaejVarArr;
        List list = this.s;
        List list2 = this.r;
        aaejVarArr = new aaej[list2.size() + list.size()];
        for (int i = 0; i < list2.size(); i++) {
            aaejVarArr[i] = (aaej) list2.get(i);
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            aaejVarArr[list2.size() + i2] = (aaej) list.get(i2);
        }
        return aaejVarArr;
    }

    @ResultIgnorabilityUnspecified
    private final void M(boolean z, float f, float f2, float f3) {
        aadu aaduVarO;
        float f4;
        float f5;
        aaev aaevVar;
        boolean z2;
        boolean zL = addm.l();
        zrt zrtVar = this.m;
        boolean z3 = false;
        if (zL) {
            zrtVar.a();
            if (!z) {
                z2 = false;
            } else if (this.o) {
                return;
            } else {
                z2 = true;
            }
            String str = g;
            if (zrn.e(str, 3)) {
                Log.d(str, "handleScaleEvent(" + f + ")");
            }
            if (this.q.b) {
                aaee aaeeVar = new aaee(this, f2, f3, z2, f);
                this.d.d(aaeeVar);
                if (aaeeVar.a != null) {
                    tux tuxVar = (tux) this.f.a();
                    aaeh aaehVar = aaeeVar.a;
                    float f6 = aaehVar.a;
                    aadu aaduVar = aaehVar.b;
                    double d = aaduVar.a;
                    double d2 = aaduVar.b;
                    tuxVar.n(f6, true);
                    return;
                }
                return;
            }
            return;
        }
        zrtVar.a();
        if (z) {
            if (this.o) {
                return;
            } else {
                z3 = true;
            }
        }
        String str2 = g;
        if (zrn.e(str2, 3)) {
            Log.d(str2, "handleScaleEvent(" + f + ")");
        }
        synchronized (this) {
            if (this.q.b) {
                if (x().h) {
                    aaduVarO = null;
                    f4 = f2;
                    f5 = f3;
                } else {
                    aaduVarO = this.d.c().o();
                    f4 = (float) aaduVarO.a;
                    f5 = (float) aaduVarO.b;
                }
                if (z3) {
                    D(-1.0f, aaduVarO, 330);
                    return;
                }
                double dLog = Math.log(f) / a;
                aaek aaekVarB = B();
                float f7 = (float) dLog;
                aaekVarB.b(f7, BitmapDescriptorFactory.HUE_RED, f4, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                H(aaekVarB);
                if (this.f == null || (aaevVar = this.d) == null) {
                    return;
                }
                ((tux) this.f.a()).n(aaevVar.c().b() + f7, true);
            }
        }
    }

    final aaeh A(aaem aaemVar, float f, aadu aaduVar, int i) {
        C(new aaec(f, aaduVar, i, this.l), aaemVar);
        if (this.f == null || this.d == null) {
            return null;
        }
        return new aaeh(aaemVar.c() + f, aaduVar == null ? aaemVar.i() : aaduVar);
    }

    public final synchronized aaek B() {
        aadp aadpVarF = this.u;
        while (aadpVarF != null) {
            if (aadpVarF instanceof aaek) {
                return (aaek) aadpVarF;
            }
            aadpVarF = aadpVarF instanceof aadq ? ((aadq) aadpVarF).f() : null;
        }
        return new aaek(this.l);
    }

    public final void C(aadp aadpVar, aaem aaemVar) {
        aaemVar.k(null);
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, a.bW(aadpVar, "Enqueueing animation(", ")"));
        }
        synchronized (this.k) {
            aadt aadtVar = this.u;
            if (aadtVar == null) {
                this.u = new aadt(aadpVar);
            } else if (aadpVar != aadtVar.a) {
                aadtVar.b();
                this.u = new aadt(aadpVar);
            }
        }
        this.d.e(this.u);
    }

    final void D(float f, aadu aaduVar, int i) {
        aaev aaevVar;
        H(new aaec(f, aaduVar, i, this.l));
        if (this.f == null || (aaevVar = this.d) == null) {
            return;
        }
        aaet aaetVarC = aaevVar.c();
        float fB = aaetVarC.b() + f;
        aadu aaduVarO = aaduVar == null ? aaetVarC.o() : aaduVar;
        tux tuxVar = (tux) this.f.a();
        double d = aaduVarO.a;
        double d2 = aaduVarO.b;
        tuxVar.n(fB, true);
    }

    public final synchronized void E(aaej aaejVar) {
        this.r.add(aaejVar);
        this.t = null;
    }

    @Override // defpackage.tut
    public final void a(MotionEvent motionEvent) {
        this.m.a();
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, a.bV(motionEvent, "onLongPress(", ")"));
        }
        if (this.j == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            ackk ackkVar = this.f;
            if (ackkVar != null) {
                ((tux) ackkVar.a()).e(x, y);
            }
        }
    }

    @Override // defpackage.tut
    public final boolean b(MotionEvent motionEvent) {
        this.m.a();
        zvg zvgVar = this.e;
        if (zvgVar != null && zvgVar.t(motionEvent)) {
            return true;
        }
        ackk ackkVar = this.f;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).i(motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    @Override // defpackage.tut
    public final boolean c(MotionEvent motionEvent) {
        this.m.a();
        zvg zvgVar = this.e;
        if (zvgVar != null && zvgVar.t(motionEvent)) {
            return true;
        }
        ackk ackkVar = this.f;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).j(motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    @Override // defpackage.tut
    public final boolean d(MotionEvent motionEvent) {
        this.m.a();
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, a.bV(motionEvent, "onSingleTapUp(", ")"));
        }
        int iF = F(motionEvent);
        double x = motionEvent.getX();
        double y = motionEvent.getY();
        if (zrn.e(str, 3)) {
            Log.d(str, "Executing onTouchOneFingerDragEnd(" + iF + "," + x + "," + y + ")");
        }
        for (aaej aaejVar : K()) {
            if (aaejVar.b(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tut
    public final void e() {
        this.m.a();
        ackk ackkVar = this.f;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).h();
        }
    }

    @Override // defpackage.tut
    public final void f(MotionEvent motionEvent) {
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, a.bV(motionEvent, "onDown(", ")"));
        }
        ackk ackkVar = this.f;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).c();
        }
    }

    @Override // defpackage.tut
    @ResultIgnorabilityUnspecified
    public final void g(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.m.a();
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, "onFling(" + String.valueOf(motionEvent) + "," + String.valueOf(motionEvent2) + "," + f + "," + f2 + ")");
        }
        synchronized (this) {
            if (this.q.a) {
                if (d(motionEvent2)) {
                    return;
                }
                H(new aadx(f, f2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: all -> 0x00d7, TryCatch #0 {, blocks: (B:25:0x00aa, B:29:0x00b6, B:27:0x00b0, B:31:0x00b8), top: B:40:0x00aa }] */
    @Override // defpackage.tut
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.view.MotionEvent r9, android.view.MotionEvent r10, float r11, float r12) {
        /*
            r8 = this;
            zrt r0 = r8.m
            r0.a()
            r8.G()
            boolean r0 = r8.n
            if (r0 == 0) goto Le
            goto Ld6
        Le:
            java.lang.String r0 = defpackage.aaei.g
            r1 = 3
            boolean r2 = defpackage.zrn.e(r0, r1)
            if (r2 == 0) goto L4d
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r2 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onScroll("
            r3.<init>(r4)
            r3.append(r9)
            java.lang.String r9 = ","
            r3.append(r9)
            r3.append(r2)
            java.lang.String r9 = ","
            r3.append(r9)
            r3.append(r11)
            java.lang.String r9 = ","
            r3.append(r9)
            r3.append(r12)
            java.lang.String r9 = ")"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            android.util.Log.d(r0, r9)
        L4d:
            boolean r9 = r8.o
            r2 = 0
            r3 = 1
            if (r9 != 0) goto L59
            boolean r9 = r8.p
            if (r9 == 0) goto L58
            goto L59
        L58:
            r3 = r2
        L59:
            if (r3 != 0) goto La7
            int r9 = F(r10)
            float r4 = r10.getX()
            double r4 = (double) r4
            float r10 = r10.getY()
            double r6 = (double) r10
            boolean r10 = defpackage.zrn.e(r0, r1)
            if (r10 == 0) goto L95
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "Executing OnTouchOneFingerDragMove("
            r10.<init>(r1)
            r10.append(r9)
            java.lang.String r9 = ","
            r10.append(r9)
            r10.append(r4)
            java.lang.String r9 = ","
            r10.append(r9)
            r10.append(r6)
            java.lang.String r9 = ")"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.d(r0, r9)
        L95:
            aaej[] r9 = r8.K()
            int r10 = r9.length
        L9a:
            if (r2 >= r10) goto La7
            r0 = r9[r2]
            boolean r0 = r0.c(r4, r6)
            if (r0 != 0) goto Ld6
            int r2 = r2 + 1
            goto L9a
        La7:
            monitor-enter(r8)
            if (r3 == 0) goto Lb0
            aacx r9 = r8.q     // Catch: java.lang.Throwable -> Ld7
            boolean r9 = r9.h     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto Lb6
        Lb0:
            aacx r9 = r8.q     // Catch: java.lang.Throwable -> Ld7
            boolean r9 = r9.a     // Catch: java.lang.Throwable -> Ld7
            if (r9 != 0) goto Lb8
        Lb6:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld7
            return
        Lb8:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld7
            aaek r0 = r8.B()
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r5 = r11
            r6 = r12
            r0.b(r1, r2, r3, r4, r5, r6)
            r8.H(r0)
            ackk r8 = r8.f
            if (r8 == 0) goto Ld6
            java.lang.Object r8 = r8.a()
            tux r8 = (defpackage.tux) r8
            r8.l()
        Ld6:
            return
        Ld7:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Ld7
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaei.h(android.view.MotionEvent, android.view.MotionEvent, float, float):void");
    }

    @Override // defpackage.tut
    public final void j() {
        this.m.a();
        for (aaej aaejVar : K()) {
            aaejVar.d();
        }
        aadr aadrVar = this.k;
        aadrVar.b.a();
        ztv ztvVar = aadrVar.c;
        ztvVar.c.a();
        if (ztvVar.e) {
            ztvVar.e = false;
            ztvVar.a();
        } else {
            String str = ztv.a;
            if (zrn.e(str, 5)) {
                Log.w(str, "onTouchEnd() called when no touch is in progress!");
            }
        }
        ackk ackkVar = this.f;
        if (ackkVar != null) {
            ((tux) ackkVar.a()).d();
        }
    }

    @Override // defpackage.tuy
    public final void k(tvc tvcVar) {
        this.m.a();
        I(tvcVar.a(), tvcVar.a, tvcVar.b);
        this.p = false;
    }

    @Override // defpackage.tuy
    public final void l(tvc tvcVar, boolean z) {
        this.m.a();
        this.o = false;
        M(z, tvcVar.b(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final void n(tvc tvcVar) {
        this.m.a();
        J(tvcVar.c());
        this.n = false;
    }

    @Override // defpackage.tuy
    public final void o(ackk ackkVar) {
        this.m.a();
        zkt.n(ackkVar, "gestureDispatcher");
        this.f = ackkVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.m.a();
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, a.bV(motionEvent, "onDoubleTap(", ")"));
        }
        this.v = 2;
        this.j = motionEvent;
        this.b = motionEvent.getX();
        this.c = motionEvent.getY();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02cb  */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDoubleTapEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaei.onDoubleTapEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.m.a();
        String str = g;
        if (zrn.e(str, 3)) {
            Log.d(str, a.bV(motionEvent, "onSingleTapConfirmed(", ")"));
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ackk ackkVar = this.f;
        if (ackkVar == null) {
            return true;
        }
        ((tux) ackkVar.a()).g(x, y);
        return true;
    }

    @Override // defpackage.tuy
    @ResultIgnorabilityUnspecified
    public final boolean p(tvc tvcVar) {
        this.m.a();
        return I(tvcVar.a(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    @ResultIgnorabilityUnspecified
    public final boolean q(tvc tvcVar) {
        this.m.a();
        this.p = x().g;
        return I(tvcVar.a(), tvcVar.a, tvcVar.b);
    }

    @Override // defpackage.tuy
    public final boolean r(tvc tvcVar, boolean z) {
        this.m.a();
        M(z, tvcVar.b(), tvcVar.a, tvcVar.b);
        return true;
    }

    @Override // defpackage.tuy
    public final boolean s(tvc tvcVar, boolean z) {
        this.m.a();
        this.o = true;
        M(z, tvcVar.b(), tvcVar.a, tvcVar.b);
        return true;
    }

    @Override // defpackage.tuy
    public final boolean t(tvc tvcVar) {
        return true;
    }

    @Override // defpackage.tuy
    public final boolean u(tvc tvcVar) {
        return false;
    }

    @Override // defpackage.tuy
    @ResultIgnorabilityUnspecified
    public final boolean v(tvc tvcVar) {
        this.m.a();
        return J(tvcVar.c());
    }

    @Override // defpackage.tuy
    @ResultIgnorabilityUnspecified
    public final boolean w(tvc tvcVar) {
        this.m.a();
        synchronized (this) {
            this.n = this.q.f;
        }
        return J(tvcVar.c());
    }

    @Override // defpackage.tuy
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final synchronized aacx x() {
        return this.q;
    }

    @Override // defpackage.tut
    public final void i() {
    }

    @Override // defpackage.tuy
    public final void m(tvc tvcVar) {
    }

    @Override // defpackage.tuy
    public final void y(tve tveVar) {
    }
}
