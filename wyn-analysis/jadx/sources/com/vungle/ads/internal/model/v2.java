package com.vungle.ads.internal.model;

import Wf.C1241c;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.J;
import Wf.O;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class v2 {

    @NotNull
    public static final b2 Companion = new b2();

    /* renamed from: a, reason: collision with root package name */
    public final a2 f33335a;

    /* renamed from: b, reason: collision with root package name */
    public final e2 f33336b;

    /* renamed from: c, reason: collision with root package name */
    public final h2 f33337c;

    /* renamed from: d, reason: collision with root package name */
    public final r2 f33338d;

    /* renamed from: e, reason: collision with root package name */
    public final List f33339e;

    /* renamed from: f, reason: collision with root package name */
    public final u2 f33340f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33341g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f33342h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f33343i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f33344j;
    public final Boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f33345l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f33346m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f33347n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f33348o;

    /* renamed from: p, reason: collision with root package name */
    public Long f33349p;

    /* renamed from: q, reason: collision with root package name */
    public x1 f33350q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f33351r;

    public /* synthetic */ v2(int i5, a2 a2Var, e2 e2Var, h2 h2Var, r2 r2Var, List list, u2 u2Var, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, x1 x1Var, Boolean bool7) {
        if ((i5 & 1) == 0) {
            this.f33335a = null;
        } else {
            this.f33335a = a2Var;
        }
        if ((i5 & 2) == 0) {
            this.f33336b = null;
        } else {
            this.f33336b = e2Var;
        }
        if ((i5 & 4) == 0) {
            this.f33337c = null;
        } else {
            this.f33337c = h2Var;
        }
        if ((i5 & 8) == 0) {
            this.f33338d = null;
        } else {
            this.f33338d = r2Var;
        }
        if ((i5 & 16) == 0) {
            this.f33339e = null;
        } else {
            this.f33339e = list;
        }
        if ((i5 & 32) == 0) {
            this.f33340f = null;
        } else {
            this.f33340f = u2Var;
        }
        if ((i5 & 64) == 0) {
            this.f33341g = null;
        } else {
            this.f33341g = str;
        }
        if ((i5 & 128) == 0) {
            this.f33342h = Boolean.TRUE;
        } else {
            this.f33342h = bool;
        }
        if ((i5 & 256) == 0) {
            this.f33343i = null;
        } else {
            this.f33343i = bool2;
        }
        if ((i5 & 512) == 0) {
            this.f33344j = null;
        } else {
            this.f33344j = num;
        }
        if ((i5 & Segment.SHARE_MINIMUM) == 0) {
            this.k = null;
        } else {
            this.k = bool3;
        }
        if ((i5 & 2048) == 0) {
            this.f33345l = null;
        } else {
            this.f33345l = num2;
        }
        if ((i5 & 4096) == 0) {
            this.f33346m = null;
        } else {
            this.f33346m = bool4;
        }
        if ((i5 & Segment.SIZE) == 0) {
            this.f33347n = null;
        } else {
            this.f33347n = bool5;
        }
        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.f33348o = null;
        } else {
            this.f33348o = bool6;
        }
        if ((32768 & i5) == 0) {
            this.f33349p = null;
        } else {
            this.f33349p = l10;
        }
        if ((65536 & i5) == 0) {
            this.f33350q = null;
        } else {
            this.f33350q = x1Var;
        }
        if ((i5 & 131072) == 0) {
            this.f33351r = null;
        } else {
            this.f33351r = bool7;
        }
    }

    public static final void a(v2 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33335a != null) {
            output.i(serialDesc, 0, y1.f33362a, self.f33335a);
        }
        if (output.A(serialDesc, 1) || self.f33336b != null) {
            output.i(serialDesc, 1, c2.f33146a, self.f33336b);
        }
        if (output.A(serialDesc, 2) || self.f33337c != null) {
            output.i(serialDesc, 2, f2.f33164a, self.f33337c);
        }
        if (output.A(serialDesc, 3) || self.f33338d != null) {
            output.i(serialDesc, 3, p2.f33290a, self.f33338d);
        }
        if (output.A(serialDesc, 4) || self.f33339e != null) {
            output.i(serialDesc, 4, new C1241c(g3.f33175a, 0), self.f33339e);
        }
        if (output.A(serialDesc, 5) || self.f33340f != null) {
            output.i(serialDesc, 5, s2.f33314a, self.f33340f);
        }
        if (output.A(serialDesc, 6) || self.f33341g != null) {
            output.i(serialDesc, 6, Wf.q0.f15625a, self.f33341g);
        }
        if (output.A(serialDesc, 7) || !AbstractC3340k.a(self.f33342h, Boolean.TRUE)) {
            output.i(serialDesc, 7, C1247f.f15596a, self.f33342h);
        }
        if (output.A(serialDesc, 8) || self.f33343i != null) {
            output.i(serialDesc, 8, C1247f.f15596a, self.f33343i);
        }
        if (output.A(serialDesc, 9) || self.f33344j != null) {
            output.i(serialDesc, 9, J.f15549a, self.f33344j);
        }
        if (output.A(serialDesc, 10) || self.k != null) {
            output.i(serialDesc, 10, C1247f.f15596a, self.k);
        }
        if (output.A(serialDesc, 11) || self.f33345l != null) {
            output.i(serialDesc, 11, J.f15549a, self.f33345l);
        }
        if (output.A(serialDesc, 12) || self.f33346m != null) {
            output.i(serialDesc, 12, C1247f.f15596a, self.f33346m);
        }
        if (output.A(serialDesc, 13) || self.f33347n != null) {
            output.i(serialDesc, 13, C1247f.f15596a, self.f33347n);
        }
        if (output.A(serialDesc, 14) || self.f33348o != null) {
            output.i(serialDesc, 14, C1247f.f15596a, self.f33348o);
        }
        if (output.A(serialDesc, 15) || self.f33349p != null) {
            output.i(serialDesc, 15, O.f15556a, self.f33349p);
        }
        if (output.A(serialDesc, 16) || self.f33350q != null) {
            output.i(serialDesc, 16, v1.f33333a, self.f33350q);
        }
        if (!output.A(serialDesc, 17) && self.f33351r == null) {
            return;
        }
        output.i(serialDesc, 17, C1247f.f15596a, self.f33351r);
    }

    public final Long b() {
        return this.f33349p;
    }

    public final e2 c() {
        return this.f33336b;
    }

    public final h2 d() {
        return this.f33337c;
    }

    public final List e() {
        return this.f33339e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return AbstractC3340k.a(this.f33335a, v2Var.f33335a) && AbstractC3340k.a(this.f33336b, v2Var.f33336b) && AbstractC3340k.a(this.f33337c, v2Var.f33337c) && AbstractC3340k.a(this.f33338d, v2Var.f33338d) && AbstractC3340k.a(this.f33339e, v2Var.f33339e) && AbstractC3340k.a(this.f33340f, v2Var.f33340f) && AbstractC3340k.a(this.f33341g, v2Var.f33341g) && AbstractC3340k.a(this.f33342h, v2Var.f33342h) && AbstractC3340k.a(this.f33343i, v2Var.f33343i) && AbstractC3340k.a(this.f33344j, v2Var.f33344j) && AbstractC3340k.a(this.k, v2Var.k) && AbstractC3340k.a(this.f33345l, v2Var.f33345l) && AbstractC3340k.a(this.f33346m, v2Var.f33346m) && AbstractC3340k.a(this.f33347n, v2Var.f33347n) && AbstractC3340k.a(this.f33348o, v2Var.f33348o) && AbstractC3340k.a(this.f33349p, v2Var.f33349p) && AbstractC3340k.a(this.f33350q, v2Var.f33350q) && AbstractC3340k.a(this.f33351r, v2Var.f33351r);
    }

    public final int hashCode() {
        a2 a2Var = this.f33335a;
        int iHashCode = (a2Var == null ? 0 : a2Var.hashCode()) * 31;
        e2 e2Var = this.f33336b;
        int iHashCode2 = (iHashCode + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        h2 h2Var = this.f33337c;
        int iHashCode3 = (iHashCode2 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        r2 r2Var = this.f33338d;
        int iHashCode4 = (iHashCode3 + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        List list = this.f33339e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        u2 u2Var = this.f33340f;
        int iHashCode6 = (iHashCode5 + (u2Var == null ? 0 : u2Var.hashCode())) * 31;
        String str = this.f33341g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f33342h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f33343i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f33344j;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.k;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.f33345l;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f33346m;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f33347n;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f33348o;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l10 = this.f33349p;
        int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
        x1 x1Var = this.f33350q;
        int iHashCode17 = (iHashCode16 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        Boolean bool7 = this.f33351r;
        return iHashCode17 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        return "ConfigPayload(cleverCache=" + this.f33335a + ", configSettings=" + this.f33336b + ", endpoints=" + this.f33337c + ", logMetricsSettings=" + this.f33338d + ", placements=" + this.f33339e + ", userPrivacy=" + this.f33340f + ", configExtension=" + this.f33341g + ", disableAdId=" + this.f33342h + ", isReportIncentivizedEnabled=" + this.f33343i + ", sessionTimeout=" + this.f33344j + ", waitForConnectivityForTPAT=" + this.k + ", signalSessionTimeout=" + this.f33345l + ", signalsDisabled=" + this.f33346m + ", fpdEnabled=" + this.f33347n + ", rtaDebugging=" + this.f33348o + ", configLastValidatedTimestamp=" + this.f33349p + ", autoRedirect=" + this.f33350q + ", enableOT=" + this.f33351r + ')';
    }

    public final String a() {
        return this.f33341g;
    }

    public final void a(Long l10) {
        this.f33349p = l10;
    }
}
