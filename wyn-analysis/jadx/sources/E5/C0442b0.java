package E5;

import android.net.Uri;

/* renamed from: E5.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0442b0 implements InterfaceC0453h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0442b0 f3293c = new C0442b0(new G9.e(4));

    /* renamed from: d, reason: collision with root package name */
    public static final A5.f f3294d = new A5.f(12);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3296b;

    public C0442b0(G9.e eVar) {
        this.f3295a = (Uri) eVar.f4685b;
        this.f3296b = (String) eVar.f4686c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0442b0)) {
            return false;
        }
        C0442b0 c0442b0 = (C0442b0) obj;
        return u6.v.a(this.f3295a, c0442b0.f3295a) && u6.v.a(this.f3296b, c0442b0.f3296b);
    }

    public final int hashCode() {
        Uri uri = this.f3295a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f3296b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
