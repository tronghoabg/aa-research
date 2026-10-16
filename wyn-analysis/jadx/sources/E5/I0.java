package E5;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class I0 implements InterfaceC0453h {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f3107q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Object f3108r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final C0446d0 f3109s;

    /* renamed from: b, reason: collision with root package name */
    public Object f3111b;

    /* renamed from: d, reason: collision with root package name */
    public long f3113d;

    /* renamed from: e, reason: collision with root package name */
    public long f3114e;

    /* renamed from: f, reason: collision with root package name */
    public long f3115f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3116g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3117h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3118i;

    /* renamed from: j, reason: collision with root package name */
    public Z f3119j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f3120l;

    /* renamed from: m, reason: collision with root package name */
    public long f3121m;

    /* renamed from: n, reason: collision with root package name */
    public int f3122n;

    /* renamed from: o, reason: collision with root package name */
    public int f3123o;

    /* renamed from: p, reason: collision with root package name */
    public long f3124p;

    /* renamed from: a, reason: collision with root package name */
    public Object f3110a = f3107q;

    /* renamed from: c, reason: collision with root package name */
    public C0446d0 f3112c = f3109s;

    static {
        V v2 = new V();
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        List list = Collections.EMPTY_LIST;
        l8.e0 e0Var2 = l8.e0.f40101e;
        C0442b0 c0442b0 = C0442b0.f3293c;
        Uri uri = Uri.EMPTY;
        f3109s = new C0446d0("com.google.android.exoplayer2.Timeline", new X(v2), uri != null ? new C0440a0(uri, null, list, e0Var2) : null, new Z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0450f0.f3356G, c0442b0);
    }

    public final boolean a() {
        AbstractC4256a.i(this.f3118i == (this.f3119j != null));
        return this.f3119j != null;
    }

    public final void b(Object obj, C0446d0 c0446d0, long j8, long j10, long j11, boolean z2, boolean z10, Z z11, long j12, long j13, int i5, int i10, long j14) {
        this.f3110a = obj;
        this.f3112c = c0446d0 != null ? c0446d0 : f3109s;
        if (c0446d0 != null) {
            C0440a0 c0440a0 = c0446d0.f3305b;
        }
        this.f3111b = null;
        this.f3113d = j8;
        this.f3114e = j10;
        this.f3115f = j11;
        this.f3116g = z2;
        this.f3117h = z10;
        this.f3118i = z11 != null;
        this.f3119j = z11;
        this.f3120l = j12;
        this.f3121m = j13;
        this.f3122n = i5;
        this.f3123o = i10;
        this.f3124p = j14;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !I0.class.equals(obj.getClass())) {
            return false;
        }
        I0 i02 = (I0) obj;
        return u6.v.a(this.f3110a, i02.f3110a) && u6.v.a(this.f3112c, i02.f3112c) && u6.v.a(this.f3119j, i02.f3119j) && this.f3113d == i02.f3113d && this.f3114e == i02.f3114e && this.f3115f == i02.f3115f && this.f3116g == i02.f3116g && this.f3117h == i02.f3117h && this.k == i02.k && this.f3120l == i02.f3120l && this.f3121m == i02.f3121m && this.f3122n == i02.f3122n && this.f3123o == i02.f3123o && this.f3124p == i02.f3124p;
    }

    public final int hashCode() {
        int iHashCode = (this.f3112c.hashCode() + ((this.f3110a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 961;
        Z z2 = this.f3119j;
        int iHashCode2 = z2 == null ? 0 : z2.hashCode();
        long j8 = this.f3113d;
        int i5 = (((iHashCode + iHashCode2) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f3114e;
        int i10 = (i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3115f;
        int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f3116g ? 1 : 0)) * 31) + (this.f3117h ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j12 = this.f3120l;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f3121m;
        int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f3122n) * 31) + this.f3123o) * 31;
        long j14 = this.f3124p;
        return i13 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
