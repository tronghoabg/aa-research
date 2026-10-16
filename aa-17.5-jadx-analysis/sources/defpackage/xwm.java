package defpackage;

/* loaded from: classes.dex */
final class xwm extends xwk {
    static final xwp a = new xwm();

    private xwm() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return false;
    }

    @Override // defpackage.xwp
    public final String d(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override // defpackage.xwp
    public final int e(CharSequence charSequence) {
        charSequence.getClass();
        return -1;
    }

    @Override // defpackage.xwp
    public final int f(CharSequence charSequence, int i) {
        woy.aj(i, charSequence.length());
        return -1;
    }

    @Override // defpackage.xwp
    public final xwp c(xwp xwpVar) {
        return xwpVar;
    }
}
