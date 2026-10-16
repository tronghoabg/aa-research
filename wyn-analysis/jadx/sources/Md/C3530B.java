package md;

import A7.C0237b0;
import java.util.Arrays;
import od.C3711o0;

/* renamed from: md.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3530B {

    /* renamed from: a, reason: collision with root package name */
    public final String f40562a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC3529A f40563b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40564c;

    /* renamed from: d, reason: collision with root package name */
    public final C3711o0 f40565d;

    public C3530B(String str, EnumC3529A enumC3529A, long j8, C3711o0 c3711o0) {
        this.f40562a = str;
        this.f40563b = enumC3529A;
        this.f40564c = j8;
        this.f40565d = c3711o0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3530B)) {
            return false;
        }
        C3530B c3530b = (C3530B) obj;
        return Fe.b.v(this.f40562a, c3530b.f40562a) && Fe.b.v(this.f40563b, c3530b.f40563b) && this.f40564c == c3530b.f40564c && Fe.b.v(null, null) && Fe.b.v(this.f40565d, c3530b.f40565d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40562a, this.f40563b, Long.valueOf(this.f40564c), null, this.f40565d});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f40562a, "description");
        c0237b0S.f(this.f40563b, "severity");
        c0237b0S.e(this.f40564c, "timestampNanos");
        c0237b0S.f(null, "channelRef");
        c0237b0S.f(this.f40565d, "subchannelRef");
        return c0237b0S.toString();
    }
}
