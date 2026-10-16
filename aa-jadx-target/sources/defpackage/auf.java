package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class auf implements defpackage.awu {
    private final defpackage.awu a;
    private final defpackage.awu b;

    public auf(defpackage.awu awuVar, defpackage.awu awuVar2) {
        this.a = awuVar;
        this.b = awuVar2;
    }

    @Override // defpackage.awu
    public final int a(defpackage.dlo dloVar) {
        int iA = this.a.a(dloVar) - this.b.a(dloVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.awu
    public final int b(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        int iB = this.a.b(dloVar, dlzVar) - this.b.b(dloVar, dlzVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.awu
    public final int c(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        int iC = this.a.c(dloVar, dlzVar) - this.b.c(dloVar, dlzVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.awu
    public final int d(defpackage.dlo dloVar) {
        int iD = this.a.d(dloVar) - this.b.d(dloVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.auf)) {
            return false;
        }
        defpackage.auf aufVar = (defpackage.auf) obj;
        return defpackage.afga.f(aufVar.a, this.a) && defpackage.afga.f(aufVar.b, this.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
