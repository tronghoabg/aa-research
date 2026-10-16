package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o extends l {

    /* renamed from: a, reason: collision with root package name */
    static final int f7243a = Integer.numberOfLeadingZeros(31);

    /* renamed from: b, reason: collision with root package name */
    static final p f7244b = new o();

    o() {
        super("CharMatcher.whitespace()");
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> f7243a) == c2;
    }
}
