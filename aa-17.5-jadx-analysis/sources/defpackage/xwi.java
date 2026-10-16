package defpackage;

/* loaded from: classes.dex */
public final class xwi extends xwg {
    private final char a;

    public xwi(char c) {
        this.a = c;
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return c == this.a;
    }

    @Override // defpackage.xwp
    public final xwp c(xwp xwpVar) {
        return xwpVar.b(this.a) ? xwpVar : new xwn(this, xwpVar);
    }

    @Override // defpackage.xwp
    public final String d(CharSequence charSequence) {
        return charSequence.toString().replace(this.a, '.');
    }

    public final String toString() {
        return "CharMatcher.is('" + xwp.i(this.a) + "')";
    }
}
