package k8;

/* renamed from: k8.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3197f extends AbstractC3195d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f39297b = Integer.numberOfLeadingZeros(31);

    /* renamed from: c, reason: collision with root package name */
    public static final C3197f f39298c = new C3197f("CharMatcher.whitespace()");

    @Override // k8.AbstractC3193b
    public final boolean a(char c10) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f39297b) == c10;
    }
}
