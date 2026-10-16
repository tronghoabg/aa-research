package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xxo extends defpackage.xxm {
    private final char a;

    public xxo(char c) {
        this.a = c;
    }

    @Override // defpackage.xxv
    public final boolean b(char c) {
        return c == this.a;
    }

    @Override // defpackage.xxv
    public final defpackage.xxv c(defpackage.xxv xxvVar) {
        return xxvVar.b(this.a) ? xxvVar : new defpackage.xxt(this, xxvVar);
    }

    @Override // defpackage.xxv
    public final java.lang.String d(java.lang.CharSequence charSequence) {
        return charSequence.toString().replace(this.a, '.');
    }

    public final java.lang.String toString() {
        return "CharMatcher.is('" + defpackage.xxv.i(this.a) + "')";
    }
}
