package E5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;

/* renamed from: E5.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0446d0 implements InterfaceC0453h {

    /* renamed from: g, reason: collision with root package name */
    public static final A5.f f3303g;

    /* renamed from: a, reason: collision with root package name */
    public final String f3304a;

    /* renamed from: b, reason: collision with root package name */
    public final C0440a0 f3305b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f3306c;

    /* renamed from: d, reason: collision with root package name */
    public final C0450f0 f3307d;

    /* renamed from: e, reason: collision with root package name */
    public final X f3308e;

    /* renamed from: f, reason: collision with root package name */
    public final C0442b0 f3309f;

    static {
        V v2 = new V();
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        List list = Collections.EMPTY_LIST;
        l8.e0 e0Var2 = l8.e0.f40101e;
        C0442b0 c0442b0 = C0442b0.f3293c;
        new X(v2);
        new Z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        C0450f0 c0450f0 = C0450f0.f3356G;
        f3303g = new A5.f(9);
    }

    public C0446d0(String str, X x5, C0440a0 c0440a0, Z z2, C0450f0 c0450f0, C0442b0 c0442b0) {
        this.f3304a = str;
        this.f3305b = c0440a0;
        this.f3306c = z2;
        this.f3307d = c0450f0;
        this.f3308e = x5;
        this.f3309f = c0442b0;
    }

    public static C0446d0 a(String str) {
        V v2 = new V();
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        List list = Collections.EMPTY_LIST;
        l8.e0 e0Var2 = l8.e0.f40101e;
        C0442b0 c0442b0 = C0442b0.f3293c;
        Uri uri = str == null ? null : Uri.parse(str);
        return new C0446d0("", new X(v2), uri != null ? new C0440a0(uri, null, list, e0Var2) : null, new Z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0450f0.f3356G, c0442b0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0446d0)) {
            return false;
        }
        C0446d0 c0446d0 = (C0446d0) obj;
        return u6.v.a(this.f3304a, c0446d0.f3304a) && this.f3308e.equals(c0446d0.f3308e) && u6.v.a(this.f3305b, c0446d0.f3305b) && this.f3306c.equals(c0446d0.f3306c) && u6.v.a(this.f3307d, c0446d0.f3307d) && u6.v.a(this.f3309f, c0446d0.f3309f);
    }

    public final int hashCode() {
        int iHashCode = this.f3304a.hashCode() * 31;
        C0440a0 c0440a0 = this.f3305b;
        return this.f3309f.hashCode() + ((this.f3307d.hashCode() + ((this.f3308e.hashCode() + ((this.f3306c.hashCode() + ((iHashCode + (c0440a0 != null ? c0440a0.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
