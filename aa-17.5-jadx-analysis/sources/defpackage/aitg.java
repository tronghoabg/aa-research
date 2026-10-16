package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class aitg extends aiuk implements aitf, afdb, aiwr {
    public final afck a;
    public final afco b;
    public final aisv c;
    public final aisx d;
    private final aisx f;

    public aitg(afck afckVar, int i) {
        super(i);
        this.a = afckVar;
        boolean z = aitz.a;
        this.b = afckVar.hH();
        aisy aisyVar = aisy.a;
        this.c = new aisv(536870911, aisyVar);
        this.d = new aisx(aita.a, aisyVar);
        this.f = new aisx(null, aisyVar);
    }

    private final aiuo I() {
        aivh aivhVar = (aivh) this.b.get(aivh.d);
        if (aivhVar == null) {
            return null;
        }
        aiuo aiuoVarC = affx.c(aivhVar, true, new aitj(this));
        this.f.d(null, aiuoVarC);
        return aiuoVarC;
    }

    private final void J(int i) {
        aisv aisvVar;
        int i2;
        aiui aiuiVar;
        do {
            aisvVar = this.c;
            i2 = aisvVar.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = aitz.a;
                afck afckVarR = r();
                boolean z2 = i == 4;
                if (z2 || !(afckVarR instanceof ajca) || affx.k(i) != affx.k(this.e)) {
                    affx.j(this, afckVarR, z2);
                    return;
                }
                ajca ajcaVar = (ajca) afckVarR;
                aitu aituVar = ajcaVar.a;
                afco afcoVarHH = ajcaVar.hH();
                try {
                    if (aituVar.eQ(afcoVarHH)) {
                        try {
                            aituVar.a(afcoVarHH, this);
                            return;
                        } finally {
                        }
                    }
                    ThreadLocal threadLocal = aiwj.a;
                    aius aiusVarA = aiwj.a();
                    if (aiusVarA.p()) {
                        aiusVarA.n(this);
                        return;
                    }
                    aiusVarA.o(true);
                    try {
                        affx.j(this, r(), true);
                        do {
                        } while (aiusVarA.r());
                        return;
                    } catch (Throwable th) {
                        try {
                            H(th);
                            return;
                        } finally {
                            aiusVarA.m(true);
                        }
                    }
                } finally {
                }
            }
        } while (!aisvVar.b(i2, (536870911 & i2) + 1073741824));
    }

    private static final void K(Object obj, Object obj2) {
        throw new IllegalStateException(a.bt(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object L(aivv aivvVar, Object obj, int i, afeh afehVar) {
        if (obj instanceof aito) {
            boolean z = aitz.a;
            return obj;
        }
        if (affx.k(i)) {
            if (afehVar == null) {
                if (aivvVar instanceof aite) {
                    afehVar = null;
                }
            }
            return new aitn(obj, aivvVar instanceof aite ? (aite) aivvVar : null, afehVar, null);
        }
        return obj;
    }

    private final void M(ajbv ajbvVar) {
        int i = this.c.b & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            ajbvVar.k(i);
        } catch (Throwable th) {
            afco afcoVar = this.b;
            toString();
            aiiu.b(afcoVar, new aitp("Exception in invokeOnCancellation handler for ".concat(toString()), th));
        }
    }

    public final void A(Object obj) {
        boolean z = aitz.a;
        while (true) {
            aisx aisxVar = this.d;
            Object obj2 = aisxVar.a;
            if (obj2 instanceof aita) {
                if (aisxVar.d(obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof aite) || (obj2 instanceof ajbv)) {
                K(obj, obj2);
            } else {
                if (obj2 instanceof aito) {
                    aito aitoVar = (aito) obj2;
                    if (!aitoVar.a()) {
                        K(obj, obj2);
                    }
                    if (obj2 instanceof aiti) {
                        Throwable th = aitoVar != null ? aitoVar.b : null;
                        if (obj instanceof aite) {
                            t((aite) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            M((ajbv) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof aitn) {
                    aitn aitnVar = (aitn) obj2;
                    if (aitnVar.b != null) {
                        K(obj, obj2);
                    }
                    if (obj instanceof ajbv) {
                        return;
                    }
                    obj.getClass();
                    aite aiteVar = (aite) obj;
                    if (aitnVar.a()) {
                        t(aiteVar, aitnVar.e);
                        return;
                    } else if (aisxVar.d(obj2, aitn.b(aitnVar, aiteVar, null, 29))) {
                        return;
                    }
                } else {
                    if (obj instanceof ajbv) {
                        return;
                    }
                    obj.getClass();
                    if (aisxVar.d(obj2, new aitn(obj2, (aite) obj, null, null))) {
                        return;
                    }
                }
            }
        }
    }

    public final void B() {
        afck afckVar = this.a;
        Throwable th = null;
        ajca ajcaVar = afckVar instanceof ajca ? (ajca) afckVar : null;
        if (ajcaVar != null) {
            while (true) {
                aisx aisxVar = ajcaVar.f;
                Object obj = aisxVar.a;
                ajcz ajczVar = ajcb.b;
                if (obj == ajczVar) {
                    if (aisxVar.d(ajczVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj instanceof Throwable)) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                    }
                    if (!aisxVar.d(obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            x();
            g(th);
        }
    }

    public final void C(Object obj, int i, afeh afehVar) {
        aisx aisxVar;
        Object obj2;
        do {
            aisxVar = this.d;
            obj2 = aisxVar.a;
            if (!(obj2 instanceof aivv)) {
                if (obj2 instanceof aiti) {
                    aiti aitiVar = (aiti) obj2;
                    if (aitiVar.a.b()) {
                        if (afehVar != null) {
                            v(afehVar, aitiVar.b, obj);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!aisxVar.d(obj2, L((aivv) obj2, obj, i, afehVar)));
        y();
        J(i);
    }

    public final boolean D() {
        return this.e == 2 && ((ajca) this.a).f.a != null;
    }

    @Override // defpackage.aiwr
    public final void E(ajbv ajbvVar, int i) {
        aisv aisvVar;
        int i2;
        do {
            aisvVar = this.c;
            i2 = aisvVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!aisvVar.b(i2, ((i2 >> 29) << 29) + i));
        A(ajbvVar);
    }

    @Override // defpackage.aiuk
    public final void F(Throwable th) {
        while (true) {
            aisx aisxVar = this.d;
            Object obj = aisxVar.a;
            if (obj instanceof aivv) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof aito) {
                return;
            }
            if (obj instanceof aitn) {
                aitn aitnVar = (aitn) obj;
                if (aitnVar.a()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (aisxVar.d(obj, aitn.b(aitnVar, null, th, 15))) {
                    aite aiteVar = aitnVar.b;
                    if (aiteVar != null) {
                        t(aiteVar, th);
                    }
                    afeh afehVar = aitnVar.c;
                    if (afehVar != null) {
                        v(afehVar, th, aitnVar.a);
                        return;
                    }
                    return;
                }
            } else if (aisxVar.d(obj, new aitn(obj, null, null, th))) {
                return;
            }
        }
    }

    public final ajcz G(Object obj, afeh afehVar) {
        aisx aisxVar;
        Object obj2;
        do {
            aisxVar = this.d;
            obj2 = aisxVar.a;
            if (!(obj2 instanceof aivv)) {
                return null;
            }
        } while (!aisxVar.d(obj2, L((aivv) obj2, obj, this.e, afehVar)));
        y();
        return aith.a;
    }

    @Override // defpackage.aitf
    public final void c(Object obj) {
        boolean z = aitz.a;
        J(this.e);
    }

    @Override // defpackage.aitf
    public final void d(afec afecVar) {
        A(new aiup(afecVar, 1));
    }

    @Override // defpackage.aitf
    public final void e(Object obj, afeh afehVar) {
        C(obj, this.e, afehVar);
    }

    @Override // defpackage.afdb
    public final StackTraceElement ea() {
        return null;
    }

    @Override // defpackage.afdb
    public final afdb eb() {
        afck afckVar = this.a;
        if (afckVar instanceof afdb) {
            return (afdb) afckVar;
        }
        return null;
    }

    @Override // defpackage.aitf
    public final void f(aitu aituVar, Object obj) {
        afck afckVar = this.a;
        ajca ajcaVar = afckVar instanceof ajca ? (ajca) afckVar : null;
        C(obj, (ajcaVar != null ? ajcaVar.a : null) == aituVar ? 4 : this.e, null);
    }

    @Override // defpackage.aitf
    public final boolean g(Throwable th) {
        aisx aisxVar;
        Object obj;
        do {
            aisxVar = this.d;
            obj = aisxVar.a;
            if (!(obj instanceof aivv)) {
                return false;
            }
        } while (!aisxVar.d(obj, new aiti(this, th, (obj instanceof aite) || (obj instanceof ajbv))));
        aivv aivvVar = (aivv) obj;
        if (aivvVar instanceof aite) {
            t((aite) obj, th);
        } else if (aivvVar instanceof ajbv) {
            M((ajbv) obj);
        }
        y();
        J(this.e);
        return true;
    }

    @Override // defpackage.aitf
    public final boolean h() {
        return l() instanceof aivv;
    }

    @Override // defpackage.afck
    public final afco hH() {
        return this.b;
    }

    @Override // defpackage.aitf
    public final boolean i() {
        return !(l() instanceof aivv);
    }

    @Override // defpackage.aitf
    public final Object j(Object obj, afeh afehVar) {
        return G(obj, afehVar);
    }

    public final Object k() {
        aisv aisvVar;
        int i;
        aivh aivhVar;
        boolean zD = D();
        do {
            aisvVar = this.c;
            i = aisvVar.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zD) {
                    B();
                }
                Object objL = l();
                if (objL instanceof aito) {
                    Throwable th = ((aito) objL).b;
                    if (aitz.b) {
                        throw ajcy.a(th, this);
                    }
                    throw th;
                }
                if (!affx.k(this.e) || (aivhVar = (aivh) this.b.get(aivh.d)) == null || aivhVar.t()) {
                    return m(objL);
                }
                CancellationException cancellationExceptionO = aivhVar.o();
                F(cancellationExceptionO);
                if (aitz.b) {
                    throw ajcy.a(cancellationExceptionO, this);
                }
                throw cancellationExceptionO;
            }
        } while (!aisvVar.b(i, (536870911 & i) + 536870912));
        if (s() == null) {
            I();
        }
        if (zD) {
            B();
        }
        return afcr.a;
    }

    public final Object l() {
        return this.d.a;
    }

    @Override // defpackage.aiuk
    public final Object m(Object obj) {
        return obj instanceof aitn ? ((aitn) obj).a : obj;
    }

    @Override // defpackage.aiuk
    public final Object n() {
        return l();
    }

    protected String o() {
        return "CancellableContinuation";
    }

    public Throwable p(aivh aivhVar) {
        return aivhVar.o();
    }

    @Override // defpackage.aiuk
    public final Throwable q(Object obj) {
        Throwable thQ = super.q(obj);
        if (thQ == null) {
            return null;
        }
        afck afckVar = this.a;
        return (aitz.b && (afckVar instanceof afdb)) ? ajcy.a(thQ, (afdb) afckVar) : thQ;
    }

    @Override // defpackage.aiuk
    public final afck r() {
        return this.a;
    }

    public final aiuo s() {
        return (aiuo) this.f.a;
    }

    public final void t(aite aiteVar, Throwable th) {
        try {
            aiteVar.a(th);
        } catch (Throwable th2) {
            afco afcoVar = this.b;
            toString();
            aiiu.b(afcoVar, new aitp("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final String toString() {
        String strC = aiua.c(this.a);
        Object objL = l();
        String str = objL instanceof aivv ? "Active" : objL instanceof aiti ? "Cancelled" : "Completed";
        return o() + "(" + strC + "){" + str + "}@" + aiua.b(this);
    }

    public final void v(afeh afehVar, Throwable th, Object obj) {
        try {
            afehVar.invoke(th, obj, this.b);
        } catch (Throwable th2) {
            afco afcoVar = this.b;
            toString();
            aiiu.b(afcoVar, new aitp("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    @Override // defpackage.afck
    public final void w(Object obj) {
        Throwable thA = aezw.a(obj);
        if (thA != null) {
            if (aitz.b) {
                thA = ajcy.a(thA, this);
            }
            obj = new aito(thA, false);
        }
        C(obj, this.e, null);
    }

    public final void x() {
        aiuo aiuoVarS = s();
        if (aiuoVarS == null) {
            return;
        }
        aiuoVarS.hy();
        this.f.c(aivu.a);
    }

    public final void y() {
        if (D()) {
            return;
        }
        x();
    }

    public final void z() {
        aiuo aiuoVarI = I();
        if (aiuoVarI != null && i()) {
            aiuoVarI.hy();
            this.f.c(aivu.a);
        }
    }
}
