package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class xxu extends defpackage.xxq {
    static final int a = 27;
    static final defpackage.xxv c = new defpackage.xxu();

    public xxu() {
        super("CharMatcher.whitespace()");
    }

    @Override // defpackage.xxv
    public final boolean b(char c2) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> a) == c2;
    }
}
