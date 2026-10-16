package E5;

import com.vungle.ads.internal.protos.Sdk;
import g6.C2710a;
import g6.C2711b;

/* loaded from: classes3.dex */
public final class H0 implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public Integer f3039a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3040b;

    /* renamed from: c, reason: collision with root package name */
    public int f3041c;

    /* renamed from: d, reason: collision with root package name */
    public long f3042d;

    /* renamed from: e, reason: collision with root package name */
    public long f3043e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3044f;

    /* renamed from: g, reason: collision with root package name */
    public C2711b f3045g = C2711b.f35767f;

    public final long a(int i5, int i10) {
        C2710a c2710aA = this.f3045g.a(i5);
        if (c2710aA.f35760b != -1) {
            return c2710aA.f35764f[i10];
        }
        return -9223372036854775807L;
    }

    public final int b(long j8) {
        int i5;
        C2710a c2710aA;
        int i10;
        C2711b c2711b = this.f3045g;
        long j10 = this.f3042d;
        c2711b.getClass();
        if (j8 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j8 < j10)) {
            int i11 = c2711b.f35773d;
            while (true) {
                i5 = c2711b.f35770a;
                if (i11 >= i5 || ((c2711b.a(i11).f35759a == Long.MIN_VALUE || c2711b.a(i11).f35759a > j8) && ((i10 = (c2710aA = c2711b.a(i11)).f35760b) == -1 || c2710aA.a(-1) < i10))) {
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
        C2711b c2711b = this.f3045g;
        long j10 = this.f3042d;
        int i5 = c2711b.f35770a - 1;
        while (i5 >= 0 && j8 != Long.MIN_VALUE) {
            long j11 = c2711b.a(i5).f35759a;
            if (j11 != Long.MIN_VALUE) {
                if (j8 >= j11) {
                    break;
                }
                i5--;
            } else {
                if (j10 != -9223372036854775807L && j8 >= j10) {
                    break;
                }
                i5--;
            }
        }
        if (i5 >= 0) {
            C2710a c2710aA = c2711b.a(i5);
            int i10 = c2710aA.f35760b;
            if (i10 != -1) {
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = c2710aA.f35763e[i11];
                    if (i12 != 0 && i12 != 1) {
                    }
                }
            }
            return i5;
        }
        return -1;
    }

    public final long d(int i5) {
        return this.f3045g.a(i5).f35759a;
    }

    public final int e(int i5, int i10) {
        C2710a c2710aA = this.f3045g.a(i5);
        if (c2710aA.f35760b != -1) {
            return c2710aA.f35763e[i10];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !H0.class.equals(obj.getClass())) {
            return false;
        }
        H0 h02 = (H0) obj;
        return u6.v.a(this.f3039a, h02.f3039a) && u6.v.a(this.f3040b, h02.f3040b) && this.f3041c == h02.f3041c && this.f3042d == h02.f3042d && this.f3043e == h02.f3043e && this.f3044f == h02.f3044f && u6.v.a(this.f3045g, h02.f3045g);
    }

    public final int f(int i5) {
        return this.f3045g.a(i5).a(-1);
    }

    public final boolean g(int i5) {
        return this.f3045g.a(i5).f35766h;
    }

    public final void h(Integer num, Object obj, int i5, long j8, long j10, C2711b c2711b, boolean z2) {
        this.f3039a = num;
        this.f3040b = obj;
        this.f3041c = i5;
        this.f3042d = j8;
        this.f3043e = j10;
        this.f3045g = c2711b;
        this.f3044f = z2;
    }

    public final int hashCode() {
        Integer num = this.f3039a;
        int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f3040b;
        int iHashCode2 = (((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.f3041c) * 31;
        long j8 = this.f3042d;
        int i5 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f3043e;
        return this.f3045g.hashCode() + ((((i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f3044f ? 1 : 0)) * 31);
    }
}
