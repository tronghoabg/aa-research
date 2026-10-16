package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ypm implements defpackage.ypu, defpackage.yqt {
    private static final java.lang.String a = new java.lang.String();
    public final long b;
    public defpackage.ypl c;
    public defpackage.yqc d;
    private final java.util.logging.Level e;
    private defpackage.ypp f;
    private defpackage.yrv g;
    private java.lang.Object[] h;

    protected ypm(java.util.logging.Level level) {
        long jB = defpackage.yrs.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = jB;
    }

    private final void ak(java.lang.String str, java.lang.Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            java.lang.Object obj = objArr[i];
            if (obj instanceof defpackage.yph) {
                objArr[i] = ((defpackage.yph) obj).a();
            }
        }
        if (str != a) {
            this.g = new defpackage.yrv(j(), str);
        }
        defpackage.ysy ysyVarK = defpackage.yrs.k();
        if (!ysyVarK.a()) {
            defpackage.yqy yqyVarC = c();
            defpackage.ypx ypxVar = defpackage.ypk.h;
            defpackage.ysy ysyVar = (defpackage.ysy) yqyVarC.d(ypxVar);
            if (ysyVar != null && !ysyVar.a()) {
                ysyVarK = ysyVarK.a() ? ysyVar : new defpackage.ysy(new defpackage.ysw(ysyVarK.c, ysyVar.c));
            }
            r(ypxVar, ysyVarK);
        }
        defpackage.yox yoxVarA = a();
        try {
            defpackage.ytl ytlVar = (defpackage.ytl) defpackage.ytl.a.get();
            int i2 = ytlVar.b + 1;
            ytlVar.b = i2;
            if (i2 == 0) {
                throw new java.lang.AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    yoxVarA.b.a(this);
                } else {
                    defpackage.yox.j("unbounded recursion in log statement", this);
                }
                if (ytlVar != null) {
                    ytlVar.close();
                }
            } catch (java.lang.Throwable th) {
                if (ytlVar != null) {
                    try {
                        ytlVar.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.lang.RuntimeException e) {
            try {
                yoxVarA.b.g(e, this);
            } catch (defpackage.yqv e2) {
                throw e2;
            } catch (java.lang.RuntimeException e3) {
                defpackage.yox.j(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(java.lang.System.err);
                } catch (java.lang.RuntimeException unused) {
                }
            }
        }
    }

    private final boolean al() {
        yqg yqgVarB;
        defpackage.ypl yplVar;
        int i;
        defpackage.ypp yppVarA = this.f;
        if (yppVarA == null) {
            yppVarA = defpackage.yrs.g().a(defpackage.ypm.class, 1);
            this.f = yppVarA;
        }
        if (yppVarA != defpackage.ypp.a) {
            yqgVarB = this.f;
            defpackage.ypl yplVar2 = this.c;
            if (yplVar2 != null && (i = yplVar2.b) > 0) {
                yqgVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (defpackage.ypk.f.equals(yplVar2.c(i2))) {
                        java.lang.Object objE = yplVar2.e(i2);
                        yqgVarB = objE instanceof ypv ? ((ypv) objE).b() : new yqg(yqgVarB, objE);
                    }
                }
            }
        } else {
            yqgVarB = null;
        }
        boolean zK = k(yqgVarB);
        defpackage.yqc yqcVar = this.d;
        if (yqcVar == null) {
            return zK;
        }
        defpackage.yqb yqbVar = (defpackage.yqb) defpackage.yqb.a.b(yqgVarB, this.c);
        int iIncrementAndGet = yqbVar.c.incrementAndGet();
        int i3 = -1;
        if (yqcVar != defpackage.yqc.c && yqbVar.b.compareAndSet(false, true)) {
            try {
                yqcVar.a();
                yqbVar.b.set(false);
                yqbVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (java.lang.Throwable th) {
                yqbVar.b.set(false);
                throw th;
            }
        }
        if (zK && i3 > 0 && (yplVar = this.c) != null) {
            yplVar.f(defpackage.ypk.e, java.lang.Integer.valueOf(i3));
        }
        return zK & (i3 >= 0);
    }

    @Override // defpackage.ypu
    public final void A(java.lang.String str, float f, java.lang.Object obj) {
        if (al()) {
            ak(str, java.lang.Float.valueOf(f), obj);
        }
    }

    @Override // defpackage.ypu
    public final void B(java.lang.String str, int i, int i2) {
        if (al()) {
            ak(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }

    @Override // defpackage.ypu
    public final void C(java.lang.String str, int i, long j) {
        if (al()) {
            ak(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j));
        }
    }

    @Override // defpackage.ypu
    public final void D(java.lang.String str, int i, java.lang.Object obj) {
        if (al()) {
            ak(str, java.lang.Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.ypu
    public final void E(java.lang.String str, int i, boolean z) {
        if (al()) {
            ak(str, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ypu
    public final void F(java.lang.String str, long j, int i) {
        if (al()) {
            ak(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i));
        }
    }

    @Override // defpackage.ypu
    public final void G(java.lang.String str, long j, long j2) {
        if (al()) {
            ak(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2));
        }
    }

    @Override // defpackage.ypu
    public final void H(java.lang.String str, long j, java.lang.Object obj) {
        if (al()) {
            ak(str, java.lang.Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.ypu
    public final void I(java.lang.String str, long j, boolean z) {
        if (al()) {
            ak(str, java.lang.Long.valueOf(j), java.lang.Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ypu
    public final void J(java.lang.String str, java.lang.Object obj, float f) {
        if (al()) {
            ak(str, obj, java.lang.Float.valueOf(f));
        }
    }

    @Override // defpackage.ypu
    public final void K(java.lang.String str, java.lang.Object obj, int i) {
        if (al()) {
            ak(str, obj, java.lang.Integer.valueOf(i));
        }
    }

    @Override // defpackage.ypu
    public final void L(java.lang.String str, java.lang.Object obj, long j) {
        if (al()) {
            ak(str, obj, java.lang.Long.valueOf(j));
        }
    }

    @Override // defpackage.ypu
    public final void M(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (al()) {
            ak(str, obj, obj2);
        }
    }

    @Override // defpackage.ypu
    public final void N(java.lang.String str, java.lang.Object obj, boolean z) {
        if (al()) {
            ak(str, obj, java.lang.Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ypu
    public final void O(java.lang.String str, boolean z, int i) {
        if (al()) {
            ak(str, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
        }
    }

    @Override // defpackage.ypu
    public final void P(java.lang.String str, boolean z, java.lang.Object obj) {
        if (al()) {
            ak(str, java.lang.Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.ypu
    public final void Q(java.lang.String str, boolean z, boolean z2) {
        if (al()) {
            ak(str, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.ypu
    public final void R(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (al()) {
            ak(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.ypu
    public final void S(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.ypu
    public final void T(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.ypu
    public final void U(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.ypu
    public final void V(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.ypu
    public final void W(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // defpackage.ypu
    public final void X(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object... objArr) {
        if (al()) {
            int length = objArr.length;
            java.lang.Object[] objArr2 = new java.lang.Object[length + 10];
            objArr2[0] = obj;
            objArr2[1] = obj2;
            objArr2[2] = obj3;
            objArr2[3] = obj4;
            objArr2[4] = obj5;
            objArr2[5] = obj6;
            objArr2[6] = obj7;
            objArr2[7] = obj8;
            objArr2[8] = obj9;
            objArr2[9] = obj10;
            java.lang.System.arraycopy(objArr, 0, objArr2, 10, length);
            ak(str, objArr2);
        }
    }

    @Override // defpackage.ypu
    public final void Y(java.lang.String str, java.lang.Object[] objArr) {
        if (al()) {
            ak(str, java.util.Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.ypu
    public final boolean Z() {
        return h() || a().k(this.e);
    }

    protected abstract defpackage.yox a();

    @Override // defpackage.ypu
    public final defpackage.ypu aa() {
        defpackage.ypx ypxVar = defpackage.ypk.b;
        if (h()) {
            return b();
        }
        r(ypxVar, 2);
        return b();
    }

    @Override // defpackage.ypu
    public final void ab(byte b) {
        if (al()) {
            ak("logFrameReceived(volume=%s): discarding because session is not in progress", java.lang.Byte.valueOf(b));
        }
    }

    @Override // defpackage.ypu
    public final void ac(float f, boolean z) {
        if (al()) {
            ak("Permits remaining %f, secondary permit available %b", java.lang.Float.valueOf(f), java.lang.Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ypu
    public final void ad(int i, byte b) {
        if (al()) {
            ak("Received an encrypted frame on channel %d with flags %d with no ssl context, waiting.", java.lang.Integer.valueOf(i), java.lang.Byte.valueOf(b));
        }
    }

    @Override // defpackage.ypu
    public final void ae(java.lang.Object obj, double d) {
        if (al()) {
            ak("onFrameAvailable fps for %s: %f", obj, java.lang.Double.valueOf(d));
        }
    }

    @Override // defpackage.ypu
    public final void af(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        if (al()) {
            ak("applyDisplayGeometry: layout parameters updated. Margins: left=%d, top=%d -> left=%d, top=%d. Usable size: %dx%d -> %dx%d", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // defpackage.ypu
    public final void ag(short s) {
        if (al()) {
            ak("Received invalid message type %d", java.lang.Short.valueOf(s));
        }
    }

    @Override // defpackage.ypu
    public final void ah(boolean z, long j) {
        if (al()) {
            ak("Connecting Bluetooth RFCOMM socket isConnected: %s. Connecting duration %s ms", java.lang.Boolean.valueOf(z), java.lang.Long.valueOf(j));
        }
    }

    @Override // defpackage.ypu
    public final defpackage.ypu ai(int i) {
        defpackage.ypp yppVar = defpackage.ypp.a;
        defpackage.ypo ypoVar = new defpackage.ypo(i);
        if (this.f == null) {
            this.f = ypoVar;
        }
        return b();
    }

    @Override // defpackage.ypu
    public final void aj(int i, float f) {
        if (al()) {
            ak("PackageInstallListener:onProgressChanged sessionId=%d, progress=%f", java.lang.Integer.valueOf(i), java.lang.Float.valueOf(f));
        }
    }

    @Override // defpackage.yqt
    public final long am() {
        return this.b;
    }

    @Override // defpackage.yqt
    public final defpackage.ypp an() {
        defpackage.ypp yppVar = this.f;
        if (yppVar != null) {
            return yppVar;
        }
        throw new java.lang.IllegalStateException("cannot request log site information prior to postProcess()");
    }

    protected abstract defpackage.ypu b();

    @Override // defpackage.yqt
    public final defpackage.yqy c() {
        defpackage.ypl yplVar = this.c;
        return yplVar != null ? yplVar : defpackage.yqx.a;
    }

    @Override // defpackage.yqt
    public final defpackage.yrv d() {
        return this.g;
    }

    @Override // defpackage.yqt
    public final java.lang.Object e() {
        if (this.g != null) {
            throw new java.lang.IllegalStateException("cannot get literal argument if a template context exists");
        }
        java.lang.Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new java.lang.IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.yqt
    public final java.lang.String f() {
        return a().b.f();
    }

    @Override // defpackage.yqt
    public final java.util.logging.Level g() {
        return this.e;
    }

    @Override // defpackage.yqt
    public final boolean h() {
        return this.c != null && java.lang.Boolean.TRUE.equals(this.c.d(defpackage.ypk.g));
    }

    @Override // defpackage.yqt
    public final java.lang.Object[] i() {
        if (this.g == null) {
            throw new java.lang.IllegalStateException("cannot get arguments unless a template context exists");
        }
        java.lang.Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new java.lang.IllegalStateException("cannot get arguments before calling log()");
    }

    protected abstract defpackage.ytg j();

    protected boolean k(defpackage.ypq ypqVar) {
        throw null;
    }

    @Override // defpackage.ypu
    public final defpackage.ypu l(int i, java.util.concurrent.TimeUnit timeUnit) {
        if (h()) {
            return b();
        }
        defpackage.ypx ypxVar = defpackage.ypk.d;
        defpackage.ypr yprVar = defpackage.ypc.a;
        r(ypxVar, new defpackage.ypb(i, timeUnit));
        return b();
    }

    @Override // defpackage.ypu
    public final defpackage.ypu m(java.lang.Enum r2) {
        return o(defpackage.ypk.f, r2);
    }

    @Override // defpackage.ypu
    public final defpackage.ypu n(java.lang.String str) {
        return o(defpackage.ypk.f, str);
    }

    @Override // defpackage.ypu
    public final defpackage.ypu o(defpackage.ypx ypxVar, java.lang.Object obj) {
        ypxVar.getClass();
        if (obj != null) {
            r(ypxVar, obj);
        }
        return b();
    }

    @Override // defpackage.ypu
    public final defpackage.ypu p(java.lang.Throwable th) {
        return o(defpackage.ypk.a, th);
    }

    @Override // defpackage.ypu
    public final defpackage.ypu q(defpackage.yqi yqiVar) {
        if (yqiVar != defpackage.yqi.NONE) {
            r(defpackage.ypk.i, yqiVar);
        }
        return b();
    }

    protected final void r(defpackage.ypx ypxVar, java.lang.Object obj) {
        defpackage.ypl yplVar = this.c;
        if (yplVar == null) {
            yplVar = new defpackage.ypl();
            this.c = yplVar;
        }
        yplVar.f(ypxVar, obj);
    }

    @Override // defpackage.ypu
    public final void s() {
        if (al()) {
            ak(a, "");
        }
    }

    @Override // defpackage.ypu
    public final void t(java.lang.Object obj) {
        if (al()) {
            ak("%s", obj);
        }
    }

    @Override // defpackage.ypu
    public final void u(java.lang.String str) {
        if (al()) {
            ak(a, str);
        }
    }

    @Override // defpackage.ypu
    public final void v(java.lang.String str, char c) {
        if (al()) {
            ak(str, java.lang.Character.valueOf(c));
        }
    }

    @Override // defpackage.ypu
    public final void w(java.lang.String str, int i) {
        if (al()) {
            ak(str, java.lang.Integer.valueOf(i));
        }
    }

    @Override // defpackage.ypu
    public final void x(java.lang.String str, long j) {
        if (al()) {
            ak(str, java.lang.Long.valueOf(j));
        }
    }

    @Override // defpackage.ypu
    public final void y(java.lang.String str, java.lang.Object obj) {
        if (al()) {
            ak(str, obj);
        }
    }

    @Override // defpackage.ypu
    public final void z(java.lang.String str, float f, float f2) {
        if (al()) {
            ak(str, java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
        }
    }
}
