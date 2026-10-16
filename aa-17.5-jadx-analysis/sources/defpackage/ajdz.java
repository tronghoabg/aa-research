package defpackage;

/* loaded from: classes2.dex */
public final class ajdz extends ajed {
    public final aisx a;

    public ajdz() {
        super(1, 0);
        this.a = new aisx(ajea.a, aisy.a);
    }

    public final boolean a() {
        return Math.max(this.c.b, 0) == 0;
    }

    public final Object b(afck afckVar) {
        if (c()) {
            return afak.a;
        }
        aitg aitgVarA = ahne.a(affa.s(afckVar));
        try {
            f(new ajdy(this, aitgVarA));
            Object objK = aitgVarA.k();
            afcr afcrVar = afcr.a;
            if (objK == afcrVar) {
                afckVar.getClass();
            }
            return objK != afcrVar ? afak.a : objK;
        } catch (Throwable th) {
            aitgVarA.B();
            throw th;
        }
    }

    public final boolean c() {
        while (true) {
            aisv aisvVar = this.c;
            int i = this.b;
            int i2 = aisvVar.b;
            if (i2 > i) {
                super.g();
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (aisvVar.b(i2, i2 - 1)) {
                    boolean z = aitz.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    public final void d() {
        while (a()) {
            aisx aisxVar = this.a;
            Object obj = aisxVar.a;
            ajcz ajczVar = ajea.a;
            if (obj != ajczVar && aisxVar.d(obj, ajczVar)) {
                h();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + aiua.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
