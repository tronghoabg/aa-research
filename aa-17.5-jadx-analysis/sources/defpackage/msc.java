package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class msc implements lhg, nsq {
    public static final msb a = new msb();
    public static final afgl b = new kkp(mki.b, 15);
    public static final yph c = yph.c("GH.CarCompatManager");
    public final Context d;
    public boolean e;
    private boolean f;
    private final eqn g = new kkl(this, 3);

    public msc(Context context) {
        this.d = context;
    }

    private static final boolean e() {
        if (!acxa.a.gu().Z()) {
            c.l().u("Compat mode kill switch is enabled, compat mode not allowed");
            return false;
        }
        yph yphVar = nsr.a;
        if (((nsr) mki.a.i(nsr.class)).g) {
            return true;
        }
        c.l().u("No car controls, compat mode not allowed");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.car.display.CarDisplay r8) {
        /*
            r7 = this;
            boolean r0 = r7.e
            if (r0 != 0) goto L94
            boolean r0 = e()
            if (r0 != 0) goto Lc
            goto L94
        Lc:
            if (r8 != 0) goto L20
            yph r8 = defpackage.nsr.a
            mki r8 = defpackage.mki.a
            java.lang.Class<nsr> r0 = defpackage.nsr.class
            java.lang.Object r8 = r8.i(r0)
            nsr r8 = (defpackage.nsr) r8
            nso r8 = r8.b()
            com.google.android.gms.car.display.CarDisplay r8 = r8.t
        L20:
            int r0 = android.os.Build.VERSION.SDK_INT
            long r0 = (long) r0
            long r2 = defpackage.acxa.d()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 >= 0) goto L2f
            r0 = r1
            goto L30
        L2f:
            r0 = r2
        L30:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L4b
            oip r3 = defpackage.ois.a
            ois r3 = r3.a()
            eqj r3 = r3.e
            java.lang.Object r3 = r3.e()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L4b
            int r3 = r3.intValue()
            goto L4c
        L4b:
            r3 = r2
        L4c:
            long r3 = (long) r3
            long r5 = defpackage.acxa.e()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L57
            r3 = r1
            goto L58
        L57:
            r3 = r2
        L58:
            if (r8 == 0) goto L71
            android.graphics.Point r8 = r8.d
            if (r8 == 0) goto L65
            int r8 = r8.y
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L66
        L65:
            r8 = 0
        L66:
            if (r8 == 0) goto L71
            int r8 = r8.intValue()
            r4 = 720(0x2d0, float:1.009E-42)
            if (r8 > r4) goto L71
            goto L72
        L71:
            r1 = r2
        L72:
            yph r8 = defpackage.msc.c
            yop r8 = r8.f()
            ype r8 = (defpackage.ype) r8
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            java.lang.String r6 = "Checking compat mode: osVersionLow=%b, thermalHigh=%b, videoLow=%b"
            r8.R(r6, r2, r4, r5)
            if (r0 != 0) goto L91
            if (r3 != 0) goto L91
            if (r1 == 0) goto L94
        L91:
            r7.b(r3)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msc.a(com.google.android.gms.car.display.CarDisplay):void");
    }

    public final void b(boolean z) {
        if (this.e) {
            return;
        }
        ((ype) c.f()).u("Entering compat mode");
        this.e = true;
        nim nimVarA = nim.a();
        nimVarA.j(false);
        nimVarA.l(false);
        nimVarA.k(false);
        wer.d(new ily(13), 300L);
        if (z) {
            wer.d(new mhr(this, 12), 1000L);
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        if (!e()) {
            c.l().u("Not starting CarCompatManager, compat mode not allowed");
            return;
        }
        ((ype) c.f()).u("Starting CarCompatManager");
        a(null);
        if (Build.VERSION.SDK_INT >= 29) {
            ois.a.a().e.i(this.g);
        }
        this.f = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.f) {
            ((ype) c.f()).u("Stopping CarCompatManager");
            if (Build.VERSION.SDK_INT >= 29) {
                ois.a.a().e.k(this.g);
            }
            this.f = false;
        }
        if (this.e) {
            ((ype) c.f()).u("Exiting compat mode");
            this.e = false;
            nsr.c().f(false);
        }
    }
}
