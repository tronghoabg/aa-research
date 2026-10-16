package i4;

import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;

/* renamed from: i4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2849f {

    /* renamed from: c, reason: collision with root package name */
    public static final C2849f f36785c;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3772b f36786a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3772b f36787b;

    static {
        C2845b c2845b = C2845b.f36783e;
        f36785c = new C2849f(c2845b, c2845b);
    }

    public C2849f(AbstractC3772b abstractC3772b, AbstractC3772b abstractC3772b2) {
        this.f36786a = abstractC3772b;
        this.f36787b = abstractC3772b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2849f)) {
            return false;
        }
        C2849f c2849f = (C2849f) obj;
        return AbstractC3340k.a(this.f36786a, c2849f.f36786a) && AbstractC3340k.a(this.f36787b, c2849f.f36787b);
    }

    public final int hashCode() {
        return this.f36787b.hashCode() + (this.f36786a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f36786a + ", height=" + this.f36787b + ')';
    }
}
