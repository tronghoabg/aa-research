package defpackage;

/* loaded from: classes3.dex */
final class xwj extends xwg {
    private final char a;
    private final char b;

    public xwj(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + xwp.i(this.a) + xwp.i(this.b) + "\")";
    }
}
