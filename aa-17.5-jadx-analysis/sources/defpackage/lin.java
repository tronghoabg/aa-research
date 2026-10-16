package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class lin extends eqj implements mnd {
    public static final yph a = yph.c("GH.FusedParkingLD");
    public boolean i;
    private boolean o;
    private boolean p;
    private final lis k = new lim(this, 0);
    private final liq l = new liq() { // from class: lij
        @Override // defpackage.liq
        public final void a(boolean z) {
            this.a.b();
        }
    };
    private final lio m = new lio() { // from class: lik
        @Override // defpackage.lio
        public final void a(boolean z) {
            this.a.b();
        }
    };
    private final lip n = new lip() { // from class: lil
        @Override // defpackage.lip
        public final void a(int i) {
            ype ypeVar = (ype) lin.a.l().ai(3967);
            lin linVar = this.a;
            ypeVar.B("Gear changed from %s to %s", linVar.j, i);
            szp.u(new hhx(linVar, i, 11));
        }
    };
    public lir h = lir.c;
    public int j = -1;

    protected lin() {
    }

    public static final boolean r() {
        return lbh.c().q() && lbh.c().r();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            lir r0 = r6.h
            lir r1 = defpackage.lir.a
            r2 = 0
            if (r0 == r1) goto L2c
            boolean r0 = r6.i
            if (r0 == 0) goto L2c
            int r0 = r6.j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r3 = 101(0x65, float:1.42E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            yfq r1 = defpackage.yfq.s(r1, r3, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = r2
        L2d:
            boolean r1 = r6.o
            if (r0 != r1) goto L37
            boolean r1 = r6.p
            if (r1 == 0) goto L36
            goto L37
        L36:
            return
        L37:
            yph r1 = defpackage.lin.a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r4 = 3965(0xf7d, float:5.556E-42)
            java.lang.String r5 = "Fused parking state changed to %b"
            defpackage.a.bD(r5, r3, r4, r1)
            r6.o = r0
            r6.m(r3)
            r6.p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lin.a():void");
    }

    public final void b() {
        ((ype) a.l().ai(3966)).Q("Keyboard/config enabled changed from %b to %b", this.i, r());
        this.i = r();
        szp.u(new kyl(this, 9));
    }

    @Override // defpackage.eqj
    protected final void c() {
        this.p = true;
        mnc.a().b(mnb.s, this);
        lbh.c().j(this.k);
        lbh.c().h(this.n);
        lbh.c().i(this.l);
        lbh.c().g(this.m);
        b();
    }

    @Override // defpackage.eqj
    protected final void d() {
        mnc.a().d(mnb.s);
        lbh.c().o(this.k);
        lbh.c().m(this.n);
        lbh.c().n(this.l);
        lbh.c().l(this.m);
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        printWriter.println("isKeyboardEnabled: " + lbh.c().q());
        printWriter.println("isPhoneConfigEnabled: " + lbh.c().r());
        printWriter.println("isCurrentlyKeyboardAndConfigEnabled: " + this.i);
        printWriter.println("currentGear: " + this.j);
        printWriter.println("currentParkingState (speed): ".concat(String.valueOf(String.valueOf(this.h))));
        printWriter.println("isCurrentlyParked (output): " + this.o);
        printWriter.println("Waiting on first update for lifetime: " + this.p);
    }
}
