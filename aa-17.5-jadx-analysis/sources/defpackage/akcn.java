package defpackage;

/* loaded from: classes2.dex */
final class akcn extends akco {
    private static final long serialVersionUID = 31156755687123L;
    private final byte n;

    public akcn(String str, byte b) {
        super(str);
        this.n = b;
    }

    private Object readResolve() {
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

    @Override // defpackage.akco
    public final akcm a(akcd akcdVar) {
        byte b = this.n;
        akcd akcdVarB = akci.b(akcdVar);
        switch (b) {
            case 1:
                return akcdVarB.C();
            case 2:
                return akcdVarB.A();
            case 3:
                return akcdVarB.K();
            case 4:
                return akcdVarB.L();
            case 5:
                return akcdVarB.H();
            case 6:
                return akcdVarB.J();
            case 7:
                return akcdVarB.B();
            case 8:
                return akcdVarB.D();
            case 9:
                return akcdVarB.E();
            case 10:
                return akcdVarB.G();
            case 11:
                return akcdVarB.I();
            default:
                return akcdVarB.F();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akcn) && this.n == ((akcn) obj).n;
    }

    public final int hashCode() {
        return 1 << this.n;
    }
}
