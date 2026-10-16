package defpackage;

/* loaded from: classes.dex */
public final class ctu implements cto {
    private final csp a;
    private final int b;
    private final int c;
    private final /* synthetic */ int d;

    public ctu(csp cspVar, int i, int i2, int i3) {
        this.d = i3;
        this.a = cspVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.csp
    public final int c(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.c(i);
        }
        csp cspVar = this.a;
        return i2 != 1 ? cspVar.c(i) : cspVar.c(i);
    }

    @Override // defpackage.csp
    public final int d(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.d(i);
        }
        csp cspVar = this.a;
        return i2 != 1 ? cspVar.d(i) : cspVar.d(i);
    }

    @Override // defpackage.csp
    public final int e(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.e(i);
        }
        csp cspVar = this.a;
        return i2 != 1 ? cspVar.e(i) : cspVar.e(i);
    }

    @Override // defpackage.csp
    public final int f(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return this.a.f(i);
        }
        csp cspVar = this.a;
        return i2 != 1 ? cspVar.f(i) : cspVar.f(i);
    }

    @Override // defpackage.csp
    public final Object g() {
        int i = this.d;
        if (i == 0) {
            return this.a.g();
        }
        csp cspVar = this.a;
        return i != 1 ? cspVar.g() : cspVar.g();
    }

    @Override // defpackage.cto
    public final cuo v(long j) {
        int i = this.d;
        if (i == 0) {
            int i2 = this.c;
            int i3 = this.b;
            if (i2 == 1) {
                csp cspVar = this.a;
                return new ctv(i3 == 2 ? cspVar.d(dle.a(j)) : cspVar.f(dle.a(j)), dle.g(j) ? dle.a(j) : 32767);
            }
            csp cspVar2 = this.a;
            return new ctv(dle.h(j) ? dle.b(j) : 32767, i3 == 2 ? cspVar2.c(dle.b(j)) : cspVar2.e(dle.b(j)));
        }
        int i4 = this.c;
        if (i != 1) {
            int i5 = this.b;
            if (i4 == 1) {
                csp cspVar3 = this.a;
                return new cye(i5 == 2 ? cspVar3.d(dle.a(j)) : cspVar3.f(dle.a(j)), dle.g(j) ? dle.a(j) : 32767);
            }
            csp cspVar4 = this.a;
            return new cye(dle.h(j) ? dle.b(j) : 32767, i5 == 2 ? cspVar4.c(dle.b(j)) : cspVar4.e(dle.b(j)));
        }
        int i6 = this.b;
        if (i4 == 1) {
            csp cspVar5 = this.a;
            return new csk(i6 == 2 ? cspVar5.d(dle.a(j)) : cspVar5.f(dle.a(j)), dle.g(j) ? dle.a(j) : 32767);
        }
        csp cspVar6 = this.a;
        return new csk(dle.h(j) ? dle.b(j) : 32767, i6 == 2 ? cspVar6.c(dle.b(j)) : cspVar6.e(dle.b(j)));
    }
}
