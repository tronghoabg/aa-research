package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class liu extends defpackage.eqp implements defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.FusedParkingLD");
    public boolean i;
    private boolean o;
    private boolean p;
    private final defpackage.liz k = new defpackage.lit(this, 0);
    private final defpackage.lix l = new defpackage.lix() { // from class: liq
        @Override // defpackage.lix
        public final void a(boolean z) {
            this.a.b();
        }
    };
    private final defpackage.liv m = new defpackage.liv() { // from class: lir
        @Override // defpackage.liv
        public final void a(boolean z) {
            this.a.b();
        }
    };
    private final defpackage.liw n = new defpackage.liw() { // from class: lis
        @Override // defpackage.liw
        public final void a(int i) {
            defpackage.yqj yqjVar = (defpackage.yqj) defpackage.liu.a.l().ai(3970);
            defpackage.liu liuVar = this.a;
            yqjVar.B("Gear changed from %s to %s", liuVar.j, i);
            defpackage.tna.i(new defpackage.hif(liuVar, i, 12));
        }
    };
    public defpackage.liy h = defpackage.liy.c;
    public int j = -1;

    protected liu() {
    }

    public static final boolean r() {
        return defpackage.ler.b().q() && defpackage.ler.b().r();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public final void a() {
        boolean z;
        if (this.h == defpackage.liy.a || !this.i) {
            z = false;
        } else {
            if (defpackage.ygw.s(0, 101, -1).contains(java.lang.Integer.valueOf(this.j))) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z != this.o || this.p) {
            defpackage.yqm yqmVar = a;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            ((defpackage.yqj) yqmVar.l().ai((char) 3968)).y("Fused parking state changed to %b", boolValueOf);
            this.o = z;
            m(boolValueOf);
            this.p = false;
        }
    }

    public final void b() {
        ((defpackage.yqj) a.l().ai(3969)).Q("Keyboard/config enabled changed from %b to %b", this.i, r());
        this.i = r();
        defpackage.tna.i(new defpackage.kmp(this, 18));
    }

    @Override // defpackage.eqp
    protected final void c() {
        this.p = true;
        defpackage.mni.a().b(defpackage.mnh.s, this);
        defpackage.ler.b().j(this.k);
        defpackage.ler.b().h(this.n);
        defpackage.ler.b().i(this.l);
        defpackage.ler.b().g(this.m);
        b();
    }

    @Override // defpackage.eqp
    protected final void d() {
        defpackage.mni.a().d(defpackage.mnh.s);
        defpackage.ler.b().o(this.k);
        defpackage.ler.b().m(this.n);
        defpackage.ler.b().n(this.l);
        defpackage.ler.b().l(this.m);
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.println("isKeyboardEnabled: " + defpackage.ler.b().q());
        printWriter.println("isPhoneConfigEnabled: " + defpackage.ler.b().r());
        printWriter.println("isCurrentlyKeyboardAndConfigEnabled: " + this.i);
        printWriter.println("currentGear: " + this.j);
        printWriter.println("currentParkingState (speed): ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.h))));
        printWriter.println("isCurrentlyParked (output): " + this.o);
        printWriter.println("Waiting on first update for lifetime: " + this.p);
    }
}
