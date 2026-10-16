package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class xxp extends defpackage.xxm {
    private final char a;
    private final char b;

    public xxp(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.xxv
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final java.lang.String toString() {
        return "CharMatcher.anyOf(\"" + defpackage.xxv.i(this.a) + defpackage.xxv.i(this.b) + "\")";
    }
}
