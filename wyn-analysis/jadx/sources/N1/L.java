package N1;

import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public Object f8048a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8049b;

    /* renamed from: c, reason: collision with root package name */
    public int f8050c;

    /* renamed from: d, reason: collision with root package name */
    public long f8051d;

    /* renamed from: e, reason: collision with root package name */
    public long f8052e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8053f;

    /* renamed from: g, reason: collision with root package name */
    public C0753b f8054g = C0753b.f8135c;

    static {
        N0.a.k(0, 1, 2, 3, 4);
    }

    public final long a(int i5, int i10) {
        C0752a c0752aA = this.f8054g.a(i5);
        if (c0752aA.f8129a != -1) {
            return c0752aA.f8134f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j8) {
        int i5;
        C0752a c0752aA;
        int i10;
        C0753b c0753b = this.f8054g;
        long j10 = this.f8051d;
        c0753b.getClass();
        if (j8 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j8 < j10)) {
            int i11 = 0;
            while (true) {
                i5 = c0753b.f8137a;
                if (i11 >= i5) {
                    break;
                }
                c0753b.a(i11).getClass();
                c0753b.a(i11).getClass();
                if (0 > j8 && ((i10 = (c0752aA = c0753b.a(i11)).f8129a) == -1 || c0752aA.a(-1) < i10)) {
                    break;
                }
                i11++;
            }
            if (i11 < i5) {
                return i11;
            }
        }
        return -1;
    }

    public final int c(long j8) {
        C0753b c0753b = this.f8054g;
        int i5 = c0753b.f8137a - 1;
        c0753b.b(i5);
        while (i5 >= 0 && j8 != Long.MIN_VALUE) {
            c0753b.a(i5).getClass();
            if (j8 >= 0) {
                break;
            }
            i5--;
        }
        if (i5 >= 0) {
            C0752a c0752aA = c0753b.a(i5);
            int i10 = c0752aA.f8129a;
            if (i10 != -1) {
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = c0752aA.f8133e[i11];
                    if (i12 != 0 && i12 != 1) {
                    }
                }
            }
            return i5;
        }
        return -1;
    }

    public final long d(int i5) {
        this.f8054g.a(i5).getClass();
        return 0L;
    }

    public final int e(int i5) {
        return this.f8054g.a(i5).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !L.class.equals(obj.getClass())) {
            return false;
        }
        L l10 = (L) obj;
        Object obj2 = this.f8048a;
        Object obj3 = l10.f8048a;
        int i5 = Q1.x.f9724a;
        return Objects.equals(obj2, obj3) && Objects.equals(this.f8049b, l10.f8049b) && this.f8050c == l10.f8050c && this.f8051d == l10.f8051d && this.f8052e == l10.f8052e && this.f8053f == l10.f8053f && Objects.equals(this.f8054g, l10.f8054g);
    }

    public final boolean f(int i5) {
        C0753b c0753b = this.f8054g;
        if (i5 != c0753b.f8137a - 1) {
            return false;
        }
        c0753b.b(i5);
        return false;
    }

    public final boolean g(int i5) {
        this.f8054g.a(i5).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i5, long j8, long j10, C0753b c0753b, boolean z2) {
        this.f8048a = obj;
        this.f8049b = obj2;
        this.f8050c = i5;
        this.f8051d = j8;
        this.f8052e = j10;
        this.f8054g = c0753b;
        this.f8053f = z2;
    }

    public final int hashCode() {
        Object obj = this.f8048a;
        int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f8049b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f8050c) * 31;
        long j8 = this.f8051d;
        int i5 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f8052e;
        return this.f8054g.hashCode() + ((((i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f8053f ? 1 : 0)) * 31);
    }
}
