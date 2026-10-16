package defpackage;

/* loaded from: classes3.dex */
public final class xwf extends xwk {
    public static final xwp a = new xwf();

    public xwf() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return c <= 127;
    }
}
