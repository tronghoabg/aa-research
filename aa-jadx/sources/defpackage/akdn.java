package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akdn extends defpackage.akdo {
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;

    public akdn(java.lang.String str, byte b) {
        super(str);
        this.n = b;
    }

    private java.lang.Object readResolve() {
        switch (this.n) {
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            case 7:
                return g;
            case 8:
                return h;
            case 9:
                return i;
            case 10:
                return j;
            case 11:
                return k;
            default:
                return l;
        }
    }

    @Override // defpackage.akdo
    public final defpackage.akdm a(defpackage.akdd akddVar) {
        byte b = this.n;
        defpackage.akdd akddVarB = defpackage.akdi.b(akddVar);
        switch (b) {
            case 1:
                return akddVarB.C();
            case 2:
                return akddVarB.A();
            case 3:
                return akddVarB.K();
            case 4:
                return akddVarB.L();
            case 5:
                return akddVarB.H();
            case 6:
                return akddVarB.J();
            case 7:
                return akddVarB.B();
            case 8:
                return akddVarB.D();
            case 9:
                return akddVarB.E();
            case 10:
                return akddVarB.G();
            case 11:
                return akddVarB.I();
            default:
                return akddVarB.F();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.akdn) && this.n == ((defpackage.akdn) obj).n;
    }

    public final int hashCode() {
        return 1 << this.n;
    }
}
