package defpackage;

/* loaded from: classes3.dex */
public final class uju {
    public static final uju a = new uju(-1, -1, 0);
    public static final uju b = new uju(-1, 0, 0);
    public final long c;
    public final int d;
    public final int e;

    public uju(long j, int i, int i2) {
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public static long d(long j, rhj rhjVar, aekf aekfVar) {
        return (rhjVar == null || aekfVar == null || aekfVar.isEmpty()) ? j : ((ukj) rhjVar.a).a(j, aekfVar);
    }

    public final ujf a(ujx ujxVar, int i) {
        if (this.e != 0) {
            ukf ukfVar = ((txf) ujxVar).b;
            synchronized (ukfVar) {
            }
            return ukfVar.f(i);
        }
        if (this.c == -1) {
            int i2 = this.d;
            return i2 != -1 ? ujxVar.j(i2).g(i) : ujf.c;
        }
        ukf ukfVar2 = ((txf) ujxVar).b;
        synchronized (ukfVar2) {
        }
        return ukfVar2.g(i);
    }

    public final boolean b() {
        return (this.c == -1 && this.e == 0) ? false : true;
    }

    public final boolean c() {
        return this.c == -1 && this.d == -1 && this.e == 0;
    }

    public final ukf e(ukh ukhVar, rhj rhjVar, aekf aekfVar) {
        if (ukhVar == null) {
            return ukf.a;
        }
        int i = this.e;
        if (i != 0) {
            return ukhVar.b(i);
        }
        long j = this.c;
        if (j != -1) {
            return ukhVar.c(d(j, rhjVar, aekfVar));
        }
        int i2 = this.d;
        return i2 != -1 ? ukhVar.c(i2) : ukf.a;
    }

    public final boolean equals(Object obj) {
        uju ujuVar;
        return (obj instanceof uju) && (ujuVar = (uju) obj) != null && this.c == ujuVar.c && this.d == ujuVar.d;
    }

    public final int hashCode() {
        return ((((int) this.c) + 31) * 31) + this.d;
    }
}
