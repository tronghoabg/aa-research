package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajil {
    public static final defpackage.ajil a;
    public static final defpackage.ajil b;
    private static final java.util.List g;
    private static final java.util.List h;
    public final boolean c;
    public final boolean d;
    public final java.lang.String[] e;
    public final java.lang.String[] f;

    static {
        java.util.List listAc = defpackage.afga.ac(defpackage.ajij.p, defpackage.ajij.q, defpackage.ajij.r, defpackage.ajij.j, defpackage.ajij.l, defpackage.ajij.k, defpackage.ajij.m, defpackage.ajij.o, defpackage.ajij.n);
        g = listAc;
        java.util.List listAc2 = defpackage.afga.ac(defpackage.ajij.p, defpackage.ajij.q, defpackage.ajij.r, defpackage.ajij.j, defpackage.ajij.l, defpackage.ajij.k, defpackage.ajij.m, defpackage.ajij.o, defpackage.ajij.n, defpackage.ajij.h, defpackage.ajij.i, defpackage.ajij.f, defpackage.ajij.g, defpackage.ajij.d, defpackage.ajij.e, defpackage.ajij.c);
        h = listAc2;
        defpackage.ajik ajikVar = new defpackage.ajik(true);
        defpackage.ajij[] ajijVarArr = (defpackage.ajij[]) listAc.toArray(new defpackage.ajij[0]);
        ajikVar.e((defpackage.ajij[]) java.util.Arrays.copyOf(ajijVarArr, ajijVarArr.length));
        ajikVar.f(defpackage.ajjj.TLS_1_3, defpackage.ajjj.TLS_1_2);
        ajikVar.c();
        ajikVar.a();
        defpackage.ajik ajikVar2 = new defpackage.ajik(true);
        defpackage.ajij[] ajijVarArr2 = (defpackage.ajij[]) listAc2.toArray(new defpackage.ajij[0]);
        ajikVar2.e((defpackage.ajij[]) java.util.Arrays.copyOf(ajijVarArr2, ajijVarArr2.length));
        ajikVar2.f(defpackage.ajjj.TLS_1_3, defpackage.ajjj.TLS_1_2);
        ajikVar2.c();
        a = ajikVar2.a();
        defpackage.ajik ajikVar3 = new defpackage.ajik(true);
        defpackage.ajij[] ajijVarArr3 = (defpackage.ajij[]) listAc2.toArray(new defpackage.ajij[0]);
        ajikVar3.e((defpackage.ajij[]) java.util.Arrays.copyOf(ajijVarArr3, ajijVarArr3.length));
        ajikVar3.f(defpackage.ajjj.TLS_1_3, defpackage.ajjj.TLS_1_2, defpackage.ajjj.TLS_1_1, defpackage.ajjj.TLS_1_0);
        ajikVar3.c();
        ajikVar3.a();
        b = new defpackage.ajik(false).a();
    }

    public ajil(boolean z, boolean z2, java.lang.String[] strArr, java.lang.String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final java.util.List a() {
        java.lang.String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(defpackage.ajij.t.a(str));
        }
        return arrayList;
    }

    public final java.util.List b() {
        java.lang.String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            defpackage.ajjj ajjjVar = defpackage.ajjj.TLS_1_3;
            arrayList.add(defpackage.aikj.a(str));
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajil)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        defpackage.ajil ajilVar = (defpackage.ajil) obj;
        if (z != ajilVar.c) {
            return false;
        }
        return !z || (java.util.Arrays.equals(this.e, ajilVar.e) && java.util.Arrays.equals(this.f, ajilVar.f) && this.d == ajilVar.d);
    }

    public final int hashCode() {
        if (!this.c) {
            return 17;
        }
        java.lang.String[] strArr = this.e;
        int iHashCode = strArr != null ? java.util.Arrays.hashCode(strArr) : 0;
        java.lang.String[] strArr2 = this.f;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? java.util.Arrays.hashCode(strArr2) : 0)) * 31) + (!this.d ? 1 : 0);
    }

    public final java.lang.String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + j$.util.Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + j$.util.Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
