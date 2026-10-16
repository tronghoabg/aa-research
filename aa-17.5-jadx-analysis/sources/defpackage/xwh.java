package defpackage;

/* loaded from: classes.dex */
public final class xwh extends xwg {
    private final char a;
    private final char b;

    public xwh(char c, char c2) {
        if (c2 < c) {
            throw new IllegalArgumentException();
        }
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + xwp.i(this.a) + "', '" + xwp.i(this.b) + "')";
    }
}
