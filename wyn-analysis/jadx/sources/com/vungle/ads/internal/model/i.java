package com.vungle.ads.internal.model;

import Wf.C1241c;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.J;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* renamed from: A, reason: collision with root package name */
    public final f0 f33194A;

    /* renamed from: B, reason: collision with root package name */
    public final Boolean f33195B;

    /* renamed from: C, reason: collision with root package name */
    public final Boolean f33196C;

    /* renamed from: D, reason: collision with root package name */
    public final Integer f33197D;

    /* renamed from: a, reason: collision with root package name */
    public final String f33198a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33199b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33200c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f33201d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f33202e;

    /* renamed from: f, reason: collision with root package name */
    public final String f33203f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f33204g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f33205h;

    /* renamed from: i, reason: collision with root package name */
    public final String f33206i;

    /* renamed from: j, reason: collision with root package name */
    public final String f33207j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f33208l;

    /* renamed from: m, reason: collision with root package name */
    public final Map f33209m;

    /* renamed from: n, reason: collision with root package name */
    public final String f33210n;

    /* renamed from: o, reason: collision with root package name */
    public final String f33211o;

    /* renamed from: p, reason: collision with root package name */
    public final String f33212p;

    /* renamed from: q, reason: collision with root package name */
    public final List f33213q;

    /* renamed from: r, reason: collision with root package name */
    public final List f33214r;

    /* renamed from: s, reason: collision with root package name */
    public final z f33215s;

    /* renamed from: t, reason: collision with root package name */
    public final String f33216t;

    /* renamed from: u, reason: collision with root package name */
    public final v f33217u;

    /* renamed from: v, reason: collision with root package name */
    public final String f33218v;

    /* renamed from: w, reason: collision with root package name */
    public final String f33219w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f33220x;

    /* renamed from: y, reason: collision with root package name */
    public final Integer f33221y;

    /* renamed from: z, reason: collision with root package name */
    public final f f33222z;

    public /* synthetic */ i(int i5, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, z zVar, String str10, v vVar, String str11, String str12, Integer num5, Integer num6, f fVar, f0 f0Var, Boolean bool3, Boolean bool4, Integer num7) {
        if ((i5 & 1) == 0) {
            this.f33198a = null;
        } else {
            this.f33198a = str;
        }
        if ((i5 & 2) == 0) {
            this.f33199b = null;
        } else {
            this.f33199b = str2;
        }
        if ((i5 & 4) == 0) {
            this.f33200c = null;
        } else {
            this.f33200c = str3;
        }
        if ((i5 & 8) == 0) {
            this.f33201d = null;
        } else {
            this.f33201d = num;
        }
        if ((i5 & 16) == 0) {
            this.f33202e = null;
        } else {
            this.f33202e = num2;
        }
        if ((i5 & 32) == 0) {
            this.f33203f = null;
        } else {
            this.f33203f = str4;
        }
        if ((i5 & 64) == 0) {
            this.f33204g = null;
        } else {
            this.f33204g = bool;
        }
        if ((i5 & 128) == 0) {
            this.f33205h = null;
        } else {
            this.f33205h = bool2;
        }
        if ((i5 & 256) == 0) {
            this.f33206i = null;
        } else {
            this.f33206i = str5;
        }
        if ((i5 & 512) == 0) {
            this.f33207j = null;
        } else {
            this.f33207j = str6;
        }
        if ((i5 & Segment.SHARE_MINIMUM) == 0) {
            this.k = null;
        } else {
            this.k = num3;
        }
        if ((i5 & 2048) == 0) {
            this.f33208l = null;
        } else {
            this.f33208l = num4;
        }
        if ((i5 & 4096) == 0) {
            this.f33209m = null;
        } else {
            this.f33209m = map;
        }
        if ((i5 & Segment.SIZE) == 0) {
            this.f33210n = null;
        } else {
            this.f33210n = str7;
        }
        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.f33211o = null;
        } else {
            this.f33211o = str8;
        }
        if ((32768 & i5) == 0) {
            this.f33212p = null;
        } else {
            this.f33212p = str9;
        }
        if ((65536 & i5) == 0) {
            this.f33213q = null;
        } else {
            this.f33213q = list;
        }
        if ((131072 & i5) == 0) {
            this.f33214r = null;
        } else {
            this.f33214r = list2;
        }
        if ((262144 & i5) == 0) {
            this.f33215s = null;
        } else {
            this.f33215s = zVar;
        }
        if ((524288 & i5) == 0) {
            this.f33216t = null;
        } else {
            this.f33216t = str10;
        }
        if ((1048576 & i5) == 0) {
            this.f33217u = null;
        } else {
            this.f33217u = vVar;
        }
        if ((2097152 & i5) == 0) {
            this.f33218v = null;
        } else {
            this.f33218v = str11;
        }
        if ((4194304 & i5) == 0) {
            this.f33219w = null;
        } else {
            this.f33219w = str12;
        }
        this.f33220x = (8388608 & i5) == 0 ? 0 : num5;
        this.f33221y = (16777216 & i5) == 0 ? 0 : num6;
        if ((33554432 & i5) == 0) {
            this.f33222z = null;
        } else {
            this.f33222z = fVar;
        }
        if ((67108864 & i5) == 0) {
            this.f33194A = null;
        } else {
            this.f33194A = f0Var;
        }
        this.f33195B = (134217728 & i5) == 0 ? Boolean.FALSE : bool3;
        if ((268435456 & i5) == 0) {
            this.f33196C = null;
        } else {
            this.f33196C = bool4;
        }
        this.f33197D = (i5 & 536870912) == 0 ? 0 : num7;
    }

    public static final void a(i self, Vf.b output, C1244d0 serialDesc) {
        Integer num;
        Integer num2;
        Integer num3;
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33198a != null) {
            output.i(serialDesc, 0, Wf.q0.f15625a, self.f33198a);
        }
        if (output.A(serialDesc, 1) || self.f33199b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33199b);
        }
        if (output.A(serialDesc, 2) || self.f33200c != null) {
            output.i(serialDesc, 2, Wf.q0.f15625a, self.f33200c);
        }
        if (output.A(serialDesc, 3) || self.f33201d != null) {
            output.i(serialDesc, 3, J.f15549a, self.f33201d);
        }
        if (output.A(serialDesc, 4) || self.f33202e != null) {
            output.i(serialDesc, 4, J.f15549a, self.f33202e);
        }
        if (output.A(serialDesc, 5) || self.f33203f != null) {
            output.i(serialDesc, 5, Wf.q0.f15625a, self.f33203f);
        }
        if (output.A(serialDesc, 6) || self.f33204g != null) {
            output.i(serialDesc, 6, C1247f.f15596a, self.f33204g);
        }
        if (output.A(serialDesc, 7) || self.f33205h != null) {
            output.i(serialDesc, 7, C1247f.f15596a, self.f33205h);
        }
        if (output.A(serialDesc, 8) || self.f33206i != null) {
            output.i(serialDesc, 8, Wf.q0.f15625a, self.f33206i);
        }
        if (output.A(serialDesc, 9) || self.f33207j != null) {
            output.i(serialDesc, 9, Wf.q0.f15625a, self.f33207j);
        }
        if (output.A(serialDesc, 10) || self.k != null) {
            output.i(serialDesc, 10, J.f15549a, self.k);
        }
        if (output.A(serialDesc, 11) || self.f33208l != null) {
            output.i(serialDesc, 11, J.f15549a, self.f33208l);
        }
        if (output.A(serialDesc, 12) || self.f33209m != null) {
            output.i(serialDesc, 12, w.f33352a, self.f33209m);
        }
        if (output.A(serialDesc, 13) || self.f33210n != null) {
            output.i(serialDesc, 13, Wf.q0.f15625a, self.f33210n);
        }
        if (output.A(serialDesc, 14) || self.f33211o != null) {
            output.i(serialDesc, 14, Wf.q0.f15625a, self.f33211o);
        }
        if (output.A(serialDesc, 15) || self.f33212p != null) {
            output.i(serialDesc, 15, Wf.q0.f15625a, self.f33212p);
        }
        if (output.A(serialDesc, 16) || self.f33213q != null) {
            output.i(serialDesc, 16, new C1241c(Wf.q0.f15625a, 0), self.f33213q);
        }
        if (output.A(serialDesc, 17) || self.f33214r != null) {
            output.i(serialDesc, 17, new C1241c(Wf.q0.f15625a, 0), self.f33214r);
        }
        if (output.A(serialDesc, 18) || self.f33215s != null) {
            output.i(serialDesc, 18, x.f33356a, self.f33215s);
        }
        if (output.A(serialDesc, 19) || self.f33216t != null) {
            output.i(serialDesc, 19, Wf.q0.f15625a, self.f33216t);
        }
        if (output.A(serialDesc, 20) || self.f33217u != null) {
            output.i(serialDesc, 20, t.f33316a, self.f33217u);
        }
        if (output.A(serialDesc, 21) || self.f33218v != null) {
            output.i(serialDesc, 21, Wf.q0.f15625a, self.f33218v);
        }
        if (output.A(serialDesc, 22) || self.f33219w != null) {
            output.i(serialDesc, 22, Wf.q0.f15625a, self.f33219w);
        }
        if (output.A(serialDesc, 23) || (num3 = self.f33220x) == null || num3.intValue() != 0) {
            output.i(serialDesc, 23, J.f15549a, self.f33220x);
        }
        if (output.A(serialDesc, 24) || (num2 = self.f33221y) == null || num2.intValue() != 0) {
            output.i(serialDesc, 24, J.f15549a, self.f33221y);
        }
        if (output.A(serialDesc, 25) || self.f33222z != null) {
            output.i(serialDesc, 25, d.f33151a, self.f33222z);
        }
        if (output.A(serialDesc, 26) || self.f33194A != null) {
            output.i(serialDesc, 26, d0.f33153a, self.f33194A);
        }
        if (output.A(serialDesc, 27) || !AbstractC3340k.a(self.f33195B, Boolean.FALSE)) {
            output.i(serialDesc, 27, C1247f.f15596a, self.f33195B);
        }
        if (output.A(serialDesc, 28) || self.f33196C != null) {
            output.i(serialDesc, 28, C1247f.f15596a, self.f33196C);
        }
        if (output.A(serialDesc, 29) || (num = self.f33197D) == null || num.intValue() != 0) {
            output.i(serialDesc, 29, J.f15549a, self.f33197D);
        }
    }

    public final Integer b() {
        return this.f33208l;
    }

    public final Integer c() {
        return this.f33201d;
    }

    public final String d() {
        return this.f33207j;
    }

    public final List e() {
        return this.f33214r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC3340k.a(this.f33198a, iVar.f33198a) && AbstractC3340k.a(this.f33199b, iVar.f33199b) && AbstractC3340k.a(this.f33200c, iVar.f33200c) && AbstractC3340k.a(this.f33201d, iVar.f33201d) && AbstractC3340k.a(this.f33202e, iVar.f33202e) && AbstractC3340k.a(this.f33203f, iVar.f33203f) && AbstractC3340k.a(this.f33204g, iVar.f33204g) && AbstractC3340k.a(this.f33205h, iVar.f33205h) && AbstractC3340k.a(this.f33206i, iVar.f33206i) && AbstractC3340k.a(this.f33207j, iVar.f33207j) && AbstractC3340k.a(this.k, iVar.k) && AbstractC3340k.a(this.f33208l, iVar.f33208l) && AbstractC3340k.a(this.f33209m, iVar.f33209m) && AbstractC3340k.a(this.f33210n, iVar.f33210n) && AbstractC3340k.a(this.f33211o, iVar.f33211o) && AbstractC3340k.a(this.f33212p, iVar.f33212p) && AbstractC3340k.a(this.f33213q, iVar.f33213q) && AbstractC3340k.a(this.f33214r, iVar.f33214r) && AbstractC3340k.a(this.f33215s, iVar.f33215s) && AbstractC3340k.a(this.f33216t, iVar.f33216t) && AbstractC3340k.a(this.f33217u, iVar.f33217u) && AbstractC3340k.a(this.f33218v, iVar.f33218v) && AbstractC3340k.a(this.f33219w, iVar.f33219w) && AbstractC3340k.a(this.f33220x, iVar.f33220x) && AbstractC3340k.a(this.f33221y, iVar.f33221y) && AbstractC3340k.a(this.f33222z, iVar.f33222z) && AbstractC3340k.a(this.f33194A, iVar.f33194A) && AbstractC3340k.a(this.f33195B, iVar.f33195B) && AbstractC3340k.a(this.f33196C, iVar.f33196C) && AbstractC3340k.a(this.f33197D, iVar.f33197D);
    }

    public final Integer f() {
        return this.f33197D;
    }

    public final Integer g() {
        return this.f33220x;
    }

    public final Integer h() {
        return this.f33221y;
    }

    public final int hashCode() {
        String str = this.f33198a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f33199b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33200c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f33201d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f33202e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f33203f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f33204g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f33205h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.f33206i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f33207j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f33208l;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Map map = this.f33209m;
        int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        String str7 = this.f33210n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f33211o;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f33212p;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.f33213q;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f33214r;
        int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        z zVar = this.f33215s;
        int iHashCode19 = (iHashCode18 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str10 = this.f33216t;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        v vVar = this.f33217u;
        int iHashCode21 = (iHashCode20 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str11 = this.f33218v;
        int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f33219w;
        int iHashCode23 = (iHashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num5 = this.f33220x;
        int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f33221y;
        int iHashCode25 = (iHashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        f fVar = this.f33222z;
        int iHashCode26 = (iHashCode25 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f0 f0Var = this.f33194A;
        int iHashCode27 = (iHashCode26 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        Boolean bool3 = this.f33195B;
        int iHashCode28 = (iHashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f33196C;
        int iHashCode29 = (iHashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.f33197D;
        return iHashCode29 + (num7 != null ? num7.hashCode() : 0);
    }

    public final Integer i() {
        return this.k;
    }

    public final v j() {
        return this.f33217u;
    }

    public final Map k() {
        return this.f33209m;
    }

    public final Boolean l() {
        return this.f33195B;
    }

    public final String m() {
        return this.f33210n;
    }

    public final String toString() {
        return "AdUnit(id=" + this.f33198a + ", adType=" + this.f33199b + ", adSource=" + this.f33200c + ", expiry=" + this.f33201d + ", expiryDuration=" + this.f33202e + ", deeplinkUrl=" + this.f33203f + ", clickCoordinatesEnabled=" + this.f33204g + ", adLoadOptimizationEnabled=" + this.f33205h + ", mediationName=" + this.f33206i + ", info=" + this.f33207j + ", sleep=" + this.k + ", errorCode=" + this.f33208l + ", tpat=" + this.f33209m + ", vmURL=" + this.f33210n + ", vmVersion=" + this.f33211o + ", adMarketId=" + this.f33212p + ", notification=" + this.f33213q + ", loadAdUrls=" + this.f33214r + ", viewAbility=" + this.f33215s + ", templateType=" + this.f33216t + ", templateSettings=" + this.f33217u + ", creativeId=" + this.f33218v + ", advAppId=" + this.f33219w + ", showClose=" + this.f33220x + ", showCloseIncentivized=" + this.f33221y + ", adSizeInfo=" + this.f33222z + ", webViewSettings=" + this.f33194A + ", usePreloading=" + this.f33195B + ", partialDownloadEnabled=" + this.f33196C + ", maxDownloadRetryAttempts=" + this.f33197D + ')';
    }

    public final String a() {
        return this.f33203f;
    }
}
