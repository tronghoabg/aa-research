package defpackage;

/* loaded from: classes2.dex */
final class akdu extends akdy {
    private static final long serialVersionUID = -485345310999208286L;
    final akcm a;
    final boolean b;
    final akcl c;

    public akdu(akcm akcmVar, akcl akclVar) {
        super(akcmVar.d());
        if (!akcmVar.f()) {
            throw new IllegalArgumentException();
        }
        this.a = akcmVar;
        this.b = akdv.O(akcmVar);
        this.c = akclVar;
    }

    private final int g(long j) {
        int iB = this.c.b(j);
        long j2 = iB;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return iB;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    private final int h(long j) {
        int iA = this.c.a(j);
        long j2 = iA;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return iA;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.akcm
    public final long a(long j, int i) {
        int iH = h(j);
        boolean z = this.b;
        long jA = this.a.a(j + iH, i);
        if (!z) {
            iH = g(jA);
        }
        return jA - iH;
    }

    @Override // defpackage.akcm
    public final long b(long j, long j2) {
        int iH = h(j);
        boolean z = this.b;
        long jB = this.a.b(j + iH, j2);
        if (!z) {
            iH = g(jB);
        }
        return jB - iH;
    }

    @Override // defpackage.akcm
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.akcm
    public final boolean e() {
        boolean z = this.b;
        akcm akcmVar = this.a;
        return z ? akcmVar.e() : akcmVar.e() && this.c.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akdu) {
            akdu akduVar = (akdu) obj;
            if (this.a.equals(akduVar.a) && this.c.equals(akduVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.c.hashCode();
    }
}
