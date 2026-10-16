package g2;

import java.util.Locale;

/* renamed from: g2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2688i {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f35606g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35607a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f35608b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35609c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35610d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35611e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f35612f;

    public C2688i(C2687h c2687h) {
        this.f35607a = c2687h.f35600a;
        this.f35608b = c2687h.f35601b;
        this.f35609c = c2687h.f35602c;
        this.f35610d = c2687h.f35603d;
        this.f35611e = c2687h.f35604e;
        this.f35612f = c2687h.f35605f;
    }

    public static int a(int i5) {
        return A6.c.I(i5 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2688i.class == obj.getClass()) {
            C2688i c2688i = (C2688i) obj;
            if (this.f35608b == c2688i.f35608b && this.f35609c == c2688i.f35609c && this.f35607a == c2688i.f35607a && this.f35610d == c2688i.f35610d && this.f35611e == c2688i.f35611e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (((((527 + this.f35608b) * 31) + this.f35609c) * 31) + (this.f35607a ? 1 : 0)) * 31;
        long j8 = this.f35610d;
        return ((i5 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f35611e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f35608b), Integer.valueOf(this.f35609c), Long.valueOf(this.f35610d), Integer.valueOf(this.f35611e), Boolean.valueOf(this.f35607a)};
        int i5 = Q1.x.f9724a;
        return String.format(Locale.US, "RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", objArr);
    }
}
