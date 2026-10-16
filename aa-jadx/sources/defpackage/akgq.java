package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgq extends defpackage.akdl {
    private static final long serialVersionUID = 6941492635554961361L;
    final int e;
    final defpackage.akgt f;
    final defpackage.akgt g;

    public akgq(java.lang.String str, int i, defpackage.akgt akgtVar, defpackage.akgt akgtVar2) {
        super(str);
        this.e = i;
        this.f = akgtVar;
        this.g = akgtVar2;
    }

    private final defpackage.akgt n(long j) {
        long jA;
        int i = this.e;
        defpackage.akgt akgtVar = this.f;
        defpackage.akgt akgtVar2 = this.g;
        try {
            jA = akgtVar.a(j, i, akgtVar2.c);
        } catch (java.lang.ArithmeticException | java.lang.IllegalArgumentException unused) {
            jA = j;
        }
        try {
            j = akgtVar2.a(j, i, akgtVar.c);
        } catch (java.lang.ArithmeticException | java.lang.IllegalArgumentException unused2) {
        }
        return jA > j ? akgtVar : akgtVar2;
    }

    @Override // defpackage.akdl
    public final int a(long j) {
        return this.e + n(j).c;
    }

    @Override // defpackage.akdl
    public final int c(long j) {
        return this.e;
    }

    @Override // defpackage.akdl
    public final long e(long j) {
        long jA;
        int i = this.e;
        defpackage.akgt akgtVar = this.f;
        defpackage.akgt akgtVar2 = this.g;
        try {
            jA = akgtVar.a(j, i, akgtVar2.c);
            if (j > 0 && jA < 0) {
                jA = j;
            }
        } catch (java.lang.ArithmeticException | java.lang.IllegalArgumentException unused) {
        }
        try {
            long jA2 = akgtVar2.a(j, i, akgtVar.c);
            if (j <= 0 || jA2 >= 0) {
                j = jA2;
            }
        } catch (java.lang.ArithmeticException | java.lang.IllegalArgumentException unused2) {
        }
        return jA > j ? j : jA;
    }

    @Override // defpackage.akdl
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akgq) {
            defpackage.akgq akgqVar = (defpackage.akgq) obj;
            if (this.c.equals(akgqVar.c) && this.e == akgqVar.e && this.f.equals(akgqVar.f) && this.g.equals(akgqVar.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.akdl
    public final long f(long j) {
        long jB;
        int i = this.e;
        defpackage.akgt akgtVar = this.f;
        defpackage.akgt akgtVar2 = this.g;
        long j2 = j + 1;
        try {
            jB = akgtVar.b(j2, i, akgtVar2.c);
            if (j2 < 0 && jB > 0) {
                jB = j2;
            }
        } catch (java.lang.ArithmeticException | java.lang.IllegalArgumentException unused) {
        }
        try {
            long jB2 = akgtVar2.b(j2, i, akgtVar.c);
            if (j2 >= 0 || jB2 <= 0) {
                j2 = jB2;
            }
        } catch (java.lang.ArithmeticException | java.lang.IllegalArgumentException unused2) {
        }
        if (jB <= j2) {
            jB = j2;
        }
        return jB - 1;
    }

    @Override // defpackage.akdl
    public final java.lang.String g(long j) {
        return n(j).b;
    }

    @Override // defpackage.akdl
    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.e), this.f, this.g});
    }

    @Override // defpackage.akdl
    public final boolean k() {
        return false;
    }
}
