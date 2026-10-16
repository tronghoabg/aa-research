package Jd;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: Jd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0672f extends J4.d {

    /* renamed from: f, reason: collision with root package name */
    public static final C0672f f6051f = new C0672f("*", "*", ff.v.f35432a);

    /* renamed from: d, reason: collision with root package name */
    public final String f6052d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6053e;

    public C0672f(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f6052d = str;
        this.f6053e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0672f)) {
            return false;
        }
        C0672f c0672f = (C0672f) obj;
        if (Bf.r.c0(this.f6052d, c0672f.f6052d, true) && Bf.r.c0(this.f6053e, c0672f.f6053e, true)) {
            return AbstractC3340k.a((List) this.f5599c, (List) c0672f.f5599c);
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f6052d.toLowerCase(locale);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f6053e.toLowerCase(locale);
        AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
        return (((List) this.f5599c).hashCode() * 31) + lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0672f(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        AbstractC3340k.e(contentType, "contentType");
        AbstractC3340k.e(contentSubtype, "contentSubtype");
        AbstractC3340k.e(parameters, "parameters");
    }
}
