package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class akfq extends akcl {
    private static final long serialVersionUID = 6941492635554961361L;
    final int e;
    final akft f;
    final akft g;

    public akfq(String str, int i, akft akftVar, akft akftVar2) {
        super(str);
        this.e = i;
        this.f = akftVar;
        this.g = akftVar2;
    }

    private final akft n(long j) {
        long jA;
        int i = this.e;
        akft akftVar = this.f;
        akft akftVar2 = this.g;
        try {
            jA = akftVar.a(j, i, akftVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            jA = j;
        }
        try {
            j = akftVar2.a(j, i, akftVar.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jA > j ? akftVar : akftVar2;
    }

    @Override // defpackage.akcl
    public final int a(long j) {
        return this.e + n(j).c;
    }

    @Override // defpackage.akcl
    public final int c(long j) {
        return this.e;
    }

    @Override // defpackage.akcl
    public final long e(long j) {
        long jA;
        int i = this.e;
        akft akftVar = this.f;
        akft akftVar2 = this.g;
        try {
            jA = akftVar.a(j, i, akftVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        if (j > 0 && jA < 0) {
            jA = j;
        }
        try {
            long jA2 = akftVar2.a(j, i, akftVar.c);
            if (j <= 0 || jA2 >= 0) {
                j = jA2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jA > j ? j : jA;
    }

    @Override // defpackage.akcl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akfq) {
            akfq akfqVar = (akfq) obj;
            if (this.c.equals(akfqVar.c) && this.e == akfqVar.e && this.f.equals(akfqVar.f) && this.g.equals(akfqVar.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akcl
    public final long f(long j) {
        long jB;
        int i = this.e;
        akft akftVar = this.f;
        akft akftVar2 = this.g;
        long j2 = j + 1;
        try {
            jB = akftVar.b(j2, i, akftVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        if (j2 < 0 && jB > 0) {
            jB = j2;
        }
        try {
            long jB2 = akftVar2.b(j2, i, akftVar.c);
            if (j2 >= 0 || jB2 <= 0) {
                j2 = jB2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        if (jB <= j2) {
            jB = j2;
        }
        return jB - 1;
    }

    @Override // defpackage.akcl
    public final String g(long j) {
        return n(j).b;
    }

    @Override // defpackage.akcl
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.f, this.g});
    }

    @Override // defpackage.akcl
    public final boolean k() {
        return false;
    }
}
