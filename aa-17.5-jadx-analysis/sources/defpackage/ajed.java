package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public class ajed {
    private final aisx a;
    public final int b;
    public final aisv c;
    private final aisw d;
    private final aisx e;
    private final aisw f;
    private final afeh g;

    public ajed(int i, int i2) {
        this.b = i;
        aisy aisyVar = aisy.a;
        this.d = new aisw(0L, aisyVar);
        this.f = new aisw(0L, aisyVar);
        if (i2 > i) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1");
        }
        ajef ajefVar = new ajef(0L, null, 2);
        this.a = new aisx(ajefVar, aisyVar);
        this.e = new aisx(ajefVar, aisyVar);
        this.c = new aisv(i - i2, aisyVar);
        this.g = new akh(this, 11);
    }

    private final int a() {
        int andDecrement;
        do {
            andDecrement = aisv.a.getAndDecrement(this.c);
        } while (andDecrement > this.b);
        return andDecrement;
    }

    private final boolean b(aiwr aiwrVar) {
        Object objA;
        long j;
        ajef ajefVar;
        aisx aisxVar = this.e;
        ajef ajefVar2 = (ajef) aisxVar.a;
        long jB = this.f.b();
        ajeb ajebVar = ajeb.a;
        long j2 = ajee.f;
        long j3 = jB / j2;
        loop0: while (true) {
            objA = ajbu.a(ajefVar2, j3, ajebVar);
            if (!ajcx.a(objA)) {
                ajbv ajbvVarB = ajcx.b(objA);
                while (true) {
                    ajbv ajbvVar = (ajbv) aisxVar.a;
                    ajefVar = ajefVar2;
                    j = jB;
                    if (ajbvVar.b >= ajbvVarB.b) {
                        break loop0;
                    }
                    if (!ajbvVarB.u()) {
                        break;
                    }
                    if (!aisxVar.d(ajbvVar, ajbvVarB)) {
                        if (ajbvVarB.s()) {
                            ajbvVarB.p();
                        }
                        ajefVar2 = ajefVar;
                        jB = j;
                    } else if (ajbvVar.s()) {
                        ajbvVar.p();
                    }
                }
            } else {
                j = jB;
                break;
            }
            ajefVar2 = ajefVar;
            jB = j;
        }
        ajef ajefVar3 = (ajef) ajcx.b(objA);
        int i = (int) (j % j2);
        lds ldsVar = ajefVar3.c;
        if (ldsVar.m(i).d(null, aiwrVar)) {
            aiwrVar.E(ajefVar3, i);
            return true;
        }
        if (!ldsVar.m(i).d(ajee.b, ajee.c)) {
            boolean z = aitz.a;
            return false;
        }
        if (aiwrVar instanceof aitf) {
            ((aitf) aiwrVar).e(afak.a, this.g);
        } else {
            if (!(aiwrVar instanceof ajdw)) {
                Objects.toString(aiwrVar);
                throw new IllegalStateException("unexpected: ".concat(aiwrVar.toString()));
            }
            ((ajdw) aiwrVar).b = afak.a;
        }
        return true;
    }

    public final Object e(afck afckVar) {
        if (a() <= 0) {
            aitg aitgVarA = ahne.a(affa.s(afckVar));
            try {
                if (!b(aitgVarA)) {
                    f(aitgVarA);
                }
                Object objK = aitgVarA.k();
                if (objK == afcr.a) {
                    return objK;
                }
            } catch (Throwable th) {
                aitgVarA.B();
                throw th;
            }
        }
        return afak.a;
    }

    protected final void f(aitf aitfVar) {
        while (a() <= 0) {
            if (b((aiwr) aitfVar)) {
                return;
            }
        }
        aitfVar.e(afak.a, this.g);
    }

    public final void g() {
        aisv aisvVar;
        int i;
        int i2;
        do {
            aisvVar = this.c;
            i = this.b;
            i2 = aisvVar.b;
            if (i2 <= i) {
                return;
            }
        } while (!aisvVar.b(i2, i));
    }

    public final void h() {
        Object objA;
        long j;
        boolean zG;
        ajef ajefVar;
        do {
            int andIncrement = aisv.a.getAndIncrement(this.c);
            int i = this.b;
            if (andIncrement >= i) {
                g();
                throw new IllegalStateException(a.bp(i, "The number of released permits cannot be greater than "));
            }
            if (andIncrement >= 0) {
                return;
            }
            aisx aisxVar = this.a;
            ajef ajefVar2 = (ajef) aisxVar.a;
            long jB = this.d.b();
            long j2 = ajee.f;
            long j3 = jB / j2;
            ajec ajecVar = ajec.a;
            while (true) {
                objA = ajbu.a(ajefVar2, j3, ajecVar);
                if (!ajcx.a(objA)) {
                    ajbv ajbvVarB = ajcx.b(objA);
                    while (true) {
                        ajbv ajbvVar = (ajbv) aisxVar.a;
                        ajefVar = ajefVar2;
                        j = jB;
                        if (ajbvVar.b >= ajbvVarB.b) {
                            break;
                        }
                        if (!ajbvVarB.u()) {
                            break;
                        }
                        if (!aisxVar.d(ajbvVar, ajbvVarB)) {
                            if (ajbvVarB.s()) {
                                ajbvVarB.p();
                            }
                            ajefVar2 = ajefVar;
                            jB = j;
                        } else if (ajbvVar.s()) {
                            ajbvVar.p();
                        }
                    }
                } else {
                    j = jB;
                    break;
                }
                ajefVar2 = ajefVar;
                jB = j;
            }
            ajef ajefVar3 = (ajef) ajcx.b(objA);
            ajefVar3.o();
            zG = false;
            if (ajefVar3.b <= j3) {
                int i2 = (int) (j % j2);
                lds ldsVar = ajefVar3.c;
                ajcz ajczVar = ajee.b;
                Object objA2 = ldsVar.m(i2).a(ajczVar);
                if (objA2 == null) {
                    int i3 = ajee.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            if (!ldsVar.m(i2).d(ajczVar, ajee.d)) {
                                break;
                            }
                        } else if (ldsVar.m(i2).a == ajee.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    zG = true;
                } else if (objA2 != ajee.e) {
                    if (objA2 instanceof aitf) {
                        aitf aitfVar = (aitf) objA2;
                        Object objJ = aitfVar.j(afak.a, this.g);
                        if (objJ != null) {
                            aitfVar.c(objJ);
                            zG = true;
                        }
                    } else {
                        if (!(objA2 instanceof ajdw)) {
                            Objects.toString(objA2);
                            throw new IllegalStateException("unexpected: ".concat(objA2.toString()));
                        }
                        zG = ((ajdw) objA2).g(this, afak.a);
                    }
                }
            }
        } while (!zG);
    }
}
