package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awo implements defpackage.awu {
    private final defpackage.awu a;
    private final defpackage.awu b;

    public awo(defpackage.awu awuVar, defpackage.awu awuVar2) {
        this.a = awuVar;
        this.b = awuVar2;
    }

    @Override // defpackage.awu
    public final int a(defpackage.dlo dloVar) {
        return java.lang.Math.max(this.a.a(dloVar), this.b.a(dloVar));
    }

    @Override // defpackage.awu
    public final int b(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        return java.lang.Math.max(this.a.b(dloVar, dlzVar), this.b.b(dloVar, dlzVar));
    }

    @Override // defpackage.awu
    public final int c(defpackage.dlo dloVar, defpackage.dlz dlzVar) {
        return java.lang.Math.max(this.a.c(dloVar, dlzVar), this.b.c(dloVar, dlzVar));
    }

    @Override // defpackage.awu
    public final int d(defpackage.dlo dloVar) {
        return java.lang.Math.max(this.a.d(dloVar), this.b.d(dloVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.awo)) {
            return false;
        }
        defpackage.awo awoVar = (defpackage.awo) obj;
        return defpackage.afga.f(awoVar.a, this.a) && defpackage.afga.f(awoVar.b, this.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
