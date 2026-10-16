package rd;

import cg.C1621j;
import com.applovin.shadow.okhttp3.internal.http2.Header;

/* renamed from: rd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3967b {

    /* renamed from: d, reason: collision with root package name */
    public static final C1621j f44754d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1621j f44755e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1621j f44756f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1621j f44757g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1621j f44758h;

    /* renamed from: a, reason: collision with root package name */
    public final C1621j f44759a;

    /* renamed from: b, reason: collision with root package name */
    public final C1621j f44760b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44761c;

    static {
        C1621j c1621j = C1621j.f19903d;
        f44754d = ab.b.c(Header.RESPONSE_STATUS_UTF8);
        f44755e = ab.b.c(Header.TARGET_METHOD_UTF8);
        f44756f = ab.b.c(Header.TARGET_PATH_UTF8);
        f44757g = ab.b.c(Header.TARGET_SCHEME_UTF8);
        f44758h = ab.b.c(Header.TARGET_AUTHORITY_UTF8);
        ab.b.c(":host");
        ab.b.c(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3967b(C1621j c1621j, String str) {
        this(c1621j, ab.b.c(str));
        C1621j c1621j2 = C1621j.f19903d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3967b) {
            C3967b c3967b = (C3967b) obj;
            if (this.f44759a.equals(c3967b.f44759a) && this.f44760b.equals(c3967b.f44760b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44760b.hashCode() + ((this.f44759a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return N0.a.g(this.f44759a.t(), ": ", this.f44760b.t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3967b(String str, String str2) {
        this(ab.b.c(str), ab.b.c(str2));
        C1621j c1621j = C1621j.f19903d;
    }

    public C3967b(C1621j c1621j, C1621j c1621j2) {
        this.f44759a = c1621j;
        this.f44760b = c1621j2;
        this.f44761c = c1621j2.d() + c1621j.d() + 32;
    }
}
