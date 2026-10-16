package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xxr extends defpackage.xxv {
    final defpackage.xxv a;

    public xxr(defpackage.xxv xxvVar) {
        this.a = xxvVar;
    }

    @Override // defpackage.xxv
    public final boolean b(char c) {
        return !this.a.b(c);
    }

    public final java.lang.String toString() {
        return ((defpackage.xxq) this.a).b.concat(".negate()");
    }
}
