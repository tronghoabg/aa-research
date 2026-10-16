package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xxn extends defpackage.xxm {
    private final char a;
    private final char b;

    public xxn(char c, char c2) {
        if (c2 < c) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.xxv
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final java.lang.String toString() {
        return "CharMatcher.inRange('" + defpackage.xxv.i(this.a) + "', '" + defpackage.xxv.i(this.b) + "')";
    }
}
