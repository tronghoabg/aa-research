package N1;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: q, reason: collision with root package name */
    public static final Object f8055q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final C0773w f8056r;

    /* renamed from: b, reason: collision with root package name */
    public Object f8058b;

    /* renamed from: d, reason: collision with root package name */
    public Object f8060d;

    /* renamed from: e, reason: collision with root package name */
    public long f8061e;

    /* renamed from: f, reason: collision with root package name */
    public long f8062f;

    /* renamed from: g, reason: collision with root package name */
    public long f8063g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8064h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8065i;

    /* renamed from: j, reason: collision with root package name */
    public C0769s f8066j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public long f8067l;

    /* renamed from: m, reason: collision with root package name */
    public long f8068m;

    /* renamed from: n, reason: collision with root package name */
    public int f8069n;

    /* renamed from: o, reason: collision with root package name */
    public int f8070o;

    /* renamed from: p, reason: collision with root package name */
    public long f8071p;

    /* renamed from: a, reason: collision with root package name */
    public Object f8057a = f8055q;

    /* renamed from: c, reason: collision with root package name */
    public C0773w f8059c = f8056r;

    static {
        J5.n nVar = new J5.n(3);
        C3407I c3407i = AbstractC3409K.f40056b;
        e0 e0Var = e0.f40101e;
        List list = Collections.EMPTY_LIST;
        e0 e0Var2 = e0.f40101e;
        E5.Y y10 = new E5.Y();
        C0771u c0771u = C0771u.f8270a;
        Uri uri = Uri.EMPTY;
        f8056r = new C0773w("androidx.media3.common.Timeline", new r(nVar), uri != null ? new C0770t(uri, null, null, list, e0Var2, null, -9223372036854775807L) : null, new C0769s(y10), z.f8304B, c0771u);
        N0.a.k(1, 2, 3, 4, 5);
        N0.a.k(6, 7, 8, 9, 10);
        Q1.x.E(11);
        Q1.x.E(12);
        Q1.x.E(13);
    }

    public final boolean a() {
        return this.f8066j != null;
    }

    public final void b(C0773w c0773w, Object obj, long j8, long j10, long j11, boolean z2, boolean z10, C0769s c0769s, long j12, long j13, int i5, long j14) {
        C0770t c0770t;
        this.f8057a = f8055q;
        this.f8059c = c0773w != null ? c0773w : f8056r;
        this.f8058b = (c0773w == null || (c0770t = c0773w.f8272b) == null) ? null : c0770t.f8268e;
        this.f8060d = obj;
        this.f8061e = j8;
        this.f8062f = j10;
        this.f8063g = j11;
        this.f8064h = z2;
        this.f8065i = z10;
        this.f8066j = c0769s;
        this.f8067l = j12;
        this.f8068m = j13;
        this.f8069n = 0;
        this.f8070o = i5;
        this.f8071p = j14;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !M.class.equals(obj.getClass())) {
            return false;
        }
        M m10 = (M) obj;
        return Objects.equals(this.f8057a, m10.f8057a) && Objects.equals(this.f8059c, m10.f8059c) && Objects.equals(this.f8060d, m10.f8060d) && Objects.equals(this.f8066j, m10.f8066j) && this.f8061e == m10.f8061e && this.f8062f == m10.f8062f && this.f8063g == m10.f8063g && this.f8064h == m10.f8064h && this.f8065i == m10.f8065i && this.k == m10.k && this.f8067l == m10.f8067l && this.f8068m == m10.f8068m && this.f8069n == m10.f8069n && this.f8070o == m10.f8070o && this.f8071p == m10.f8071p;
    }

    public final int hashCode() {
        int iHashCode = (this.f8059c.hashCode() + ((this.f8057a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        Object obj = this.f8060d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0769s c0769s = this.f8066j;
        int iHashCode3 = (iHashCode2 + (c0769s != null ? c0769s.hashCode() : 0)) * 31;
        long j8 = this.f8061e;
        int i5 = (iHashCode3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f8062f;
        int i10 = (i5 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8063g;
        int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f8064h ? 1 : 0)) * 31) + (this.f8065i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j12 = this.f8067l;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f8068m;
        int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f8069n) * 31) + this.f8070o) * 31;
        long j14 = this.f8071p;
        return i13 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
