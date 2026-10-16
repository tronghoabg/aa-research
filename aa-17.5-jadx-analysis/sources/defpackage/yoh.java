package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class yoh implements yop, ypo {
    private static final String a = new String();
    public final long b;
    public yog c;
    public yox d;
    private final Level e;
    private yok f;
    private yqq g;
    private Object[] h;

    protected yoh(Level level) {
        long jB = yqn.b();
        this.c = null;
        this.f = null;
        this.d = null;
        this.g = null;
        this.h = null;
        level.getClass();
        this.e = level;
        this.b = jB;
    }

    private final void ak(String str, Object... objArr) {
        this.h = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof yoc) {
                objArr[i] = ((yoc) obj).a();
            }
        }
        if (str != a) {
            this.g = new yqq(j(), str);
        }
        yrt yrtVarK = yqn.k();
        if (!yrtVarK.a()) {
            ypt yptVarC = c();
            yos yosVar = yof.h;
            yrt yrtVar = (yrt) yptVarC.d(yosVar);
            if (yrtVar != null && !yrtVar.a()) {
                yrtVarK = yrtVarK.a() ? yrtVar : new yrt(new yrr(yrtVarK.c, yrtVar.c));
            }
            r(yosVar, yrtVarK);
        }
        yns ynsVarA = a();
        try {
            ysg ysgVar = (ysg) ysg.a.get();
            int i2 = ysgVar.b + 1;
            ysgVar.b = i2;
            if (i2 == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i2 <= 100) {
                    ynsVarA.b.a(this);
                } else {
                    yns.j("unbounded recursion in log statement", this);
                }
                if (ysgVar != null) {
                    ysgVar.close();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            try {
                ynsVarA.b.g(e, this);
            } catch (ypq e2) {
                throw e2;
            } catch (RuntimeException e3) {
                yns.j(e3.getClass().getName() + ": " + e3.getMessage(), this);
                try {
                    e3.printStackTrace(System.err);
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private final boolean al() {
        yol yolVarB;
        yog yogVar;
        int i;
        yok yokVarA = this.f;
        if (yokVarA == null) {
            yokVarA = yqn.g().a(yoh.class, 1);
            this.f = yokVarA;
        }
        if (yokVarA != yok.a) {
            yolVarB = this.f;
            yog yogVar2 = this.c;
            if (yogVar2 != null && (i = yogVar2.b) > 0) {
                yolVarB.getClass();
                for (int i2 = 0; i2 < i; i2++) {
                    if (yof.f.equals(yogVar2.c(i2))) {
                        Object objE = yogVar2.e(i2);
                        yolVarB = objE instanceof yoq ? ((yoq) objE).b() : new ypb(yolVarB, objE);
                    }
                }
            }
        } else {
            yolVarB = null;
        }
        boolean zK = k(yolVarB);
        yox yoxVar = this.d;
        if (yoxVar == null) {
            return zK;
        }
        yow yowVar = (yow) yow.a.b(yolVarB, this.c);
        int iIncrementAndGet = yowVar.c.incrementAndGet();
        int i3 = -1;
        if (yoxVar != yox.c && yowVar.b.compareAndSet(false, true)) {
            try {
                yoxVar.a();
                yowVar.b.set(false);
                yowVar.c.addAndGet(-iIncrementAndGet);
                i3 = (-1) + iIncrementAndGet;
            } catch (Throwable th) {
                yowVar.b.set(false);
                throw th;
            }
        }
        if (zK && i3 > 0 && (yogVar = this.c) != null) {
            yogVar.f(yof.e, Integer.valueOf(i3));
        }
        return zK & (i3 >= 0);
    }

    @Override // defpackage.yop
    public final void A(String str, float f, Object obj) {
        if (al()) {
            ak(str, Float.valueOf(f), obj);
        }
    }

    @Override // defpackage.yop
    public final void B(String str, int i, int i2) {
        if (al()) {
            ak(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // defpackage.yop
    public final void C(String str, int i, long j) {
        if (al()) {
            ak(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    @Override // defpackage.yop
    public final void D(String str, int i, Object obj) {
        if (al()) {
            ak(str, Integer.valueOf(i), obj);
        }
    }

    @Override // defpackage.yop
    public final void E(String str, int i, boolean z) {
        if (al()) {
            ak(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.yop
    public final void F(String str, long j, int i) {
        if (al()) {
            ak(str, Long.valueOf(j), Integer.valueOf(i));
        }
    }

    @Override // defpackage.yop
    public final void G(String str, long j, long j2) {
        if (al()) {
            ak(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // defpackage.yop
    public final void H(String str, long j, Object obj) {
        if (al()) {
            ak(str, Long.valueOf(j), obj);
        }
    }

    @Override // defpackage.yop
    public final void I(String str, long j, boolean z) {
        if (al()) {
            ak(str, Long.valueOf(j), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.yop
    public final void J(String str, Object obj, float f) {
        if (al()) {
            ak(str, obj, Float.valueOf(f));
        }
    }

    @Override // defpackage.yop
    public final void K(String str, Object obj, int i) {
        if (al()) {
            ak(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.yop
    public final void L(String str, Object obj, long j) {
        if (al()) {
            ak(str, obj, Long.valueOf(j));
        }
    }

    @Override // defpackage.yop
    public final void M(String str, Object obj, Object obj2) {
        if (al()) {
            ak(str, obj, obj2);
        }
    }

    @Override // defpackage.yop
    public final void N(String str, Object obj, boolean z) {
        if (al()) {
            ak(str, obj, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.yop
    public final void O(String str, boolean z, int i) {
        if (al()) {
            ak(str, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    @Override // defpackage.yop
    public final void P(String str, boolean z, Object obj) {
        if (al()) {
            ak(str, Boolean.valueOf(z), obj);
        }
    }

    @Override // defpackage.yop
    public final void Q(String str, boolean z, boolean z2) {
        if (al()) {
            ak(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    @Override // defpackage.yop
    public final void R(String str, Object obj, Object obj2, Object obj3) {
        if (al()) {
            ak(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.yop
    public final void S(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // defpackage.yop
    public final void T(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // defpackage.yop
    public final void U(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // defpackage.yop
    public final void V(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // defpackage.yop
    public final void W(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (al()) {
            ak(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // defpackage.yop
    public final void X(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object... objArr) {
        if (al()) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length + 10];
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
            System.arraycopy(objArr, 0, objArr2, 10, length);
            ak(str, objArr2);
        }
    }

    @Override // defpackage.yop
    public final void Y(String str, Object[] objArr) {
        if (al()) {
            ak(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // defpackage.yop
    public final boolean Z() {
        return h() || a().k(this.e);
    }

    protected abstract yns a();

    @Override // defpackage.yop
    public final yop aa() {
        yos yosVar = yof.b;
        if (h()) {
            return b();
        }
        r(yosVar, 2);
        return b();
    }

    @Override // defpackage.yop
    public final void ab(byte b) {
        if (al()) {
            ak("logFrameReceived(volume=%s): discarding because session is not in progress", Byte.valueOf(b));
        }
    }

    @Override // defpackage.yop
    public final void ac(float f, boolean z) {
        if (al()) {
            ak("Permits remaining %f, secondary permit available %b", Float.valueOf(f), Boolean.valueOf(z));
        }
    }

    @Override // defpackage.yop
    public final void ad(int i, byte b) {
        if (al()) {
            ak("Received an encrypted frame on channel %d with flags %d with no ssl context, waiting.", Integer.valueOf(i), Byte.valueOf(b));
        }
    }

    @Override // defpackage.yop
    public final void ae(Object obj, double d) {
        if (al()) {
            ak("onFrameAvailable fps for %s: %f", obj, Double.valueOf(d));
        }
    }

    @Override // defpackage.yop
    public final void af(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (al()) {
            ak("applyDisplayGeometry: layout parameters updated. Margins: left=%d, top=%d -> left=%d, top=%d. Usable size: %dx%d -> %dx%d", obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // defpackage.yop
    public final void ag(short s) {
        if (al()) {
            ak("Received invalid message type %d", Short.valueOf(s));
        }
    }

    @Override // defpackage.yop
    public final void ah(boolean z, long j) {
        if (al()) {
            ak("Connecting Bluetooth RFCOMM socket isConnected: %s. Connecting duration %s ms", Boolean.valueOf(z), Long.valueOf(j));
        }
    }

    @Override // defpackage.yop
    public final yop ai(int i) {
        yok yokVar = yok.a;
        yoj yojVar = new yoj(i);
        if (this.f == null) {
            this.f = yojVar;
        }
        return b();
    }

    @Override // defpackage.yop
    public final void aj(int i, float f) {
        if (al()) {
            ak("PackageInstallListener:onProgressChanged sessionId=%d, progress=%f", Integer.valueOf(i), Float.valueOf(f));
        }
    }

    @Override // defpackage.ypo
    public final long am() {
        return this.b;
    }

    @Override // defpackage.ypo
    public final yok an() {
        yok yokVar = this.f;
        if (yokVar != null) {
            return yokVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    protected abstract yop b();

    @Override // defpackage.ypo
    public final ypt c() {
        yog yogVar = this.c;
        return yogVar != null ? yogVar : yps.a;
    }

    @Override // defpackage.ypo
    public final yqq d() {
        return this.g;
    }

    @Override // defpackage.ypo
    public final Object e() {
        if (this.g != null) {
            throw new IllegalStateException("cannot get literal argument if a template context exists");
        }
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // defpackage.ypo
    public final String f() {
        return a().b.f();
    }

    @Override // defpackage.ypo
    public final Level g() {
        return this.e;
    }

    @Override // defpackage.ypo
    public final boolean h() {
        return this.c != null && Boolean.TRUE.equals(this.c.d(yof.g));
    }

    @Override // defpackage.ypo
    public final Object[] i() {
        if (this.g == null) {
            throw new IllegalStateException("cannot get arguments unless a template context exists");
        }
        Object[] objArr = this.h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    protected abstract ysb j();

    protected boolean k(yol yolVar) {
        throw null;
    }

    @Override // defpackage.yop
    public final yop l(int i, TimeUnit timeUnit) {
        if (h()) {
            return b();
        }
        yos yosVar = yof.d;
        yom yomVar = ynx.a;
        r(yosVar, new ynw(i, timeUnit));
        return b();
    }

    @Override // defpackage.yop
    public final yop m(Enum r2) {
        return o(yof.f, r2);
    }

    @Override // defpackage.yop
    public final yop n(String str) {
        return o(yof.f, str);
    }

    @Override // defpackage.yop
    public final yop o(yos yosVar, Object obj) {
        yosVar.getClass();
        if (obj != null) {
            r(yosVar, obj);
        }
        return b();
    }

    @Override // defpackage.yop
    public final yop p(Throwable th) {
        return o(yof.a, th);
    }

    @Override // defpackage.yop
    public final yop q(ypd ypdVar) {
        if (ypdVar != ypd.NONE) {
            r(yof.i, ypdVar);
        }
        return b();
    }

    protected final void r(yos yosVar, Object obj) {
        yog yogVar = this.c;
        if (yogVar == null) {
            yogVar = new yog();
            this.c = yogVar;
        }
        yogVar.f(yosVar, obj);
    }

    @Override // defpackage.yop
    public final void s() {
        if (al()) {
            ak(a, "");
        }
    }

    @Override // defpackage.yop
    public final void t(Object obj) {
        if (al()) {
            ak("%s", obj);
        }
    }

    @Override // defpackage.yop
    public final void u(String str) {
        if (al()) {
            ak(a, str);
        }
    }

    @Override // defpackage.yop
    public final void v(String str, char c) {
        if (al()) {
            ak(str, Character.valueOf(c));
        }
    }

    @Override // defpackage.yop
    public final void w(String str, int i) {
        if (al()) {
            ak(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.yop
    public final void x(String str, long j) {
        if (al()) {
            ak(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.yop
    public final void y(String str, Object obj) {
        if (al()) {
            ak(str, obj);
        }
    }

    @Override // defpackage.yop
    public final void z(String str, float f, float f2) {
        if (al()) {
            ak(str, Float.valueOf(f), Float.valueOf(f2));
        }
    }
}
