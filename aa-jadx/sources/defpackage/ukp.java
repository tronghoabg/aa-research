package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ukp {
    public static final defpackage.ukp a = new defpackage.ukp(-1, -1, 0);
    public static final defpackage.ukp b = new defpackage.ukp(-1, 0, 0);
    public final long c;
    public final int d;
    public final int e;

    public ukp(long j, int i, int i2) {
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public static long d(long j, defpackage.rif rifVar, defpackage.aelf aelfVar) {
        return (rifVar == null || aelfVar == null || aelfVar.isEmpty()) ? j : ((defpackage.ule) rifVar.a).a(j, aelfVar);
    }

    public final defpackage.uka a(defpackage.uks uksVar, int i) {
        if (this.e != 0) {
            defpackage.ula ulaVar = ((defpackage.tyc) uksVar).b;
            synchronized (ulaVar) {
            }
            return ulaVar.f(i);
        }
        if (this.c == -1) {
            int i2 = this.d;
            return i2 != -1 ? uksVar.j(i2).g(i) : defpackage.uka.c;
        }
        defpackage.ula ulaVar2 = ((defpackage.tyc) uksVar).b;
        synchronized (ulaVar2) {
        }
        return ulaVar2.g(i);
    }

    public final boolean b() {
        return (this.c == -1 && this.e == 0) ? false : true;
    }

    public final boolean c() {
        return this.c == -1 && this.d == -1 && this.e == 0;
    }

    public final defpackage.ula e(defpackage.ulc ulcVar, defpackage.rif rifVar, defpackage.aelf aelfVar) {
        if (ulcVar == null) {
            return defpackage.ula.a;
        }
        int i = this.e;
        if (i != 0) {
            return ulcVar.b(i);
        }
        long j = this.c;
        if (j != -1) {
            return ulcVar.c(d(j, rifVar, aelfVar));
        }
        int i2 = this.d;
        return i2 != -1 ? ulcVar.c(i2) : defpackage.ula.a;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.ukp ukpVar;
        return (obj instanceof defpackage.ukp) && (ukpVar = (defpackage.ukp) obj) != null && this.c == ukpVar.c && this.d == ukpVar.d;
    }

    public final int hashCode() {
        return ((((int) this.c) + 31) * 31) + this.d;
    }
}
