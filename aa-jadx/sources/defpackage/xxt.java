package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xxt extends defpackage.xxv {
    final defpackage.xxv a;
    final defpackage.xxv b;

    public xxt(defpackage.xxv xxvVar, defpackage.xxv xxvVar2) {
        this.a = xxvVar;
        xxvVar2.getClass();
        this.b = xxvVar2;
    }

    @Override // defpackage.xxv
    public final boolean b(char c) {
        return this.a.b(c) || this.b.b(c);
    }

    public final java.lang.String toString() {
        defpackage.xxv xxvVar = this.b;
        return this.a.toString() + ".or(" + xxvVar.toString() + ")";
    }
}
