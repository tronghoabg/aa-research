package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbk implements java.lang.Cloneable, java.io.Serializable, defpackage.ajpy {
    private static final long serialVersionUID = -2768352615787625448L;
    public final defpackage.akch a;
    public final int b;
    private final java.lang.String c;

    public akbk(defpackage.akch akchVar) throws defpackage.ajqr {
        defpackage.aguw.e(akchVar, "Char array buffer");
        int iA = akchVar.a(58);
        if (iA == -1) {
            throw new defpackage.ajqr("Invalid header: ".concat(akchVar.toString()));
        }
        java.lang.String strD = akchVar.d(0, iA);
        if (strD.isEmpty()) {
            throw new defpackage.ajqr("Invalid header: ".concat(akchVar.toString()));
        }
        this.a = akchVar;
        this.c = strD;
        this.b = iA + 1;
    }

    @Override // defpackage.ajpy
    public final defpackage.akay[] a() throws defpackage.ajqr {
        defpackage.akch akchVar = this.a;
        defpackage.akbo akboVar = new defpackage.akbo(0, akchVar.b);
        akboVar.a(this.b);
        return defpackage.akba.a.b(akchVar, akboVar);
    }

    @Override // defpackage.ajqp
    public final java.lang.String b() {
        return this.c;
    }

    @Override // defpackage.ajqp
    public final java.lang.String c() {
        defpackage.akch akchVar = this.a;
        return akchVar.d(this.b, akchVar.b);
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
