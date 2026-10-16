package com.google.d.f;

import com.google.d.d.fo;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class o implements x, com.google.d.f.b.f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7859a = new String();

    /* renamed from: b, reason: collision with root package name */
    private final Level f7860b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7861c;

    /* renamed from: d, reason: collision with root package name */
    private n f7862d;

    /* renamed from: e, reason: collision with root package name */
    private r f7863e;

    /* renamed from: f, reason: collision with root package name */
    private af f7864f;

    /* renamed from: g, reason: collision with root package name */
    private com.google.d.f.b.ag f7865g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f7866h;

    protected o(Level level) {
        long jB = com.google.d.f.b.ae.b();
        this.f7862d = null;
        this.f7863e = null;
        this.f7864f = null;
        this.f7865g = null;
        this.f7866h = null;
        fo.o(level, "level");
        this.f7860b = level;
        this.f7861c = jB;
    }

    private final void v(String str, Object... objArr) {
        this.f7866h = objArr;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof j) {
                objArr[i2] = ((j) obj).a();
            }
        }
        if (str != f7859a) {
            this.f7865g = new com.google.d.f.b.ag(a(), str);
        }
        com.google.d.f.c.j jVarK = com.google.d.f.b.ae.k();
        if (!jVarK.e()) {
            com.google.d.f.b.k kVarJ = j();
            aa aaVar = m.f7855h;
            com.google.d.f.c.j jVar = (com.google.d.f.c.j) kVarJ.c(aaVar);
            if (jVar != null) {
                jVarK = jVarK.b(jVar);
            }
            n(aaVar, jVarK);
        }
        c().i(this);
    }

    private final boolean w() {
        s sVarB;
        n nVar;
        r rVarA = this.f7863e;
        if (rVarA == null) {
            rVarA = com.google.d.f.b.ae.g().a(o.class, 1);
            this.f7863e = rVarA;
        }
        if (rVarA != r.f7872a) {
            sVarB = this.f7863e;
            n nVar2 = this.f7862d;
            if (nVar2 != null && nVar2.a() > 0) {
                fo.o(sVarB, "logSiteKey");
                int iA = nVar2.a();
                for (int i2 = 0; i2 < iA; i2++) {
                    if (m.f7853f.equals(nVar2.b(i2))) {
                        Object objD = nVar2.d(i2);
                        sVarB = objD instanceof y ? ((y) objD).b() : aj.a(sVarB, objD);
                    }
                }
            }
        } else {
            sVarB = null;
        }
        boolean zB = b(sVarB);
        af afVar = this.f7864f;
        if (afVar == null) {
            return zB;
        }
        int iA2 = ae.a(afVar, sVarB, this.f7862d);
        if (zB && iA2 > 0 && (nVar = this.f7862d) != null) {
            nVar.e(m.f7852e, Integer.valueOf(iA2));
        }
        return zB & (iA2 >= 0);
    }

    protected abstract com.google.d.f.e.d a();

    protected boolean b(s sVar) {
        n nVar = this.f7862d;
        if (nVar == null) {
            return true;
        }
        if (sVar != null) {
            af afVarC = af.c(af.c(f.a(nVar, sVar, this.f7861c), c.a(this.f7862d, sVar)), ai.a(this.f7862d, sVar));
            this.f7864f = afVarC;
            if (afVarC == af.f7679c) {
                return false;
            }
        }
        n nVar2 = this.f7862d;
        aa aaVar = m.f7856i;
        ak akVar = (ak) nVar2.c(aaVar);
        if (akVar == null) {
            return true;
        }
        n nVar3 = this.f7862d;
        if (nVar3 != null) {
            nVar3.f(aaVar);
        }
        com.google.d.f.b.k kVarJ = j();
        aa aaVar2 = m.f7848a;
        n(aaVar2, new v((Throwable) kVarJ.c(aaVar2), akVar, com.google.d.f.f.a.b(o.class, akVar.a())));
        return true;
    }

    protected abstract a c();

    protected abstract x d();

    @Override // com.google.d.f.b.f
    public final long e() {
        return this.f7861c;
    }

    @Override // com.google.d.f.b.f
    public final r f() {
        r rVar = this.f7863e;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    @Override // com.google.d.f.x
    public final x g(aa aaVar, Object obj) {
        fo.o(aaVar, "metadata key");
        if (obj != null) {
            n(aaVar, obj);
        }
        return d();
    }

    @Override // com.google.d.f.x
    public final x h(Throwable th) {
        return g(m.f7848a, th);
    }

    @Override // com.google.d.f.x
    public final x i(String str, String str2, int i2, String str3) {
        r rVar = r.f7872a;
        q qVar = new q(str, str2, i2, str3);
        if (this.f7863e == null) {
            this.f7863e = qVar;
        }
        return d();
    }

    @Override // com.google.d.f.b.f
    public final com.google.d.f.b.k j() {
        n nVar = this.f7862d;
        return nVar != null ? nVar : com.google.d.f.b.k.g();
    }

    @Override // com.google.d.f.b.f
    public final com.google.d.f.b.ag k() {
        return this.f7865g;
    }

    @Override // com.google.d.f.b.f
    public final Object l() {
        fo.m(this.f7865g == null, "cannot get literal argument if a template context exists");
        Object[] objArr = this.f7866h;
        if (objArr != null) {
            return objArr[0];
        }
        throw new IllegalStateException("cannot get literal argument before calling log()");
    }

    @Override // com.google.d.f.b.f
    public final Level m() {
        return this.f7860b;
    }

    protected final void n(aa aaVar, Object obj) {
        n nVar = this.f7862d;
        if (nVar == null) {
            nVar = new n();
            this.f7862d = nVar;
        }
        nVar.e(aaVar, obj);
    }

    @Override // com.google.d.f.x
    public final void o(String str) {
        if (w()) {
            v(f7859a, str);
        }
    }

    @Override // com.google.d.f.x
    public final void p(String str, Object obj) {
        if (w()) {
            v(str, obj);
        }
    }

    @Override // com.google.d.f.x
    public final void q(String str, Object[] objArr) {
        if (w()) {
            v(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // com.google.d.f.b.f
    public final boolean r() {
        return this.f7862d != null && Boolean.TRUE.equals(this.f7862d.c(m.f7854g));
    }

    @Override // com.google.d.f.b.f
    public final Object[] s() {
        fo.m(this.f7865g != null, "cannot get arguments unless a template context exists");
        Object[] objArr = this.f7866h;
        if (objArr != null) {
            return objArr;
        }
        throw new IllegalStateException("cannot get arguments before calling log()");
    }

    @Override // com.google.d.f.x
    public final void t(int i2, boolean z) {
        if (w()) {
            v("#isAvailable(%d) - isAvailable = %b", Integer.valueOf(i2), Boolean.valueOf(z));
        }
    }

    @Override // com.google.d.f.x
    public final void u(Object obj, boolean z) {
        if (w()) {
            v("#isFeatureSupported(%s) - isSupported = %b", obj, Boolean.valueOf(z));
        }
    }
}
