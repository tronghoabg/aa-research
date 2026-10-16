package defpackage;

/* loaded from: classes2.dex */
public final class akek extends akea {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public akek(akcm akcmVar, akco akcoVar) {
        super(akcmVar, akcoVar);
        this.b = 100;
    }

    @Override // defpackage.akea, defpackage.akcm
    public final long a(long j, int i) {
        return this.a.b(j, i * 100);
    }

    @Override // defpackage.akea, defpackage.akcm
    public final long b(long j, long j2) {
        long j3 = j2 * 100;
        if (j3 / 100 == j2) {
            return this.a.b(j, j3);
        }
        throw new ArithmeticException(a.bI(j2, "Multiplication overflows a long: ", " * 100"));
    }

    @Override // defpackage.akea, defpackage.akcm
    public final long c() {
        return this.a.c() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akek) {
            akek akekVar = (akek) obj;
            if (this.a.equals(akekVar.a) && this.d == akekVar.d) {
                int i = akekVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
