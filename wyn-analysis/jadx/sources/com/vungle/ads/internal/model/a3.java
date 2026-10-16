package com.vungle.ads.internal.model;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import Wf.C1244d0;
import Wf.J;
import Wf.O;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a3 {

    @NotNull
    public static final z2 Companion = new z2();

    /* renamed from: a, reason: collision with root package name */
    public boolean f33091a;

    /* renamed from: b, reason: collision with root package name */
    public String f33092b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f33093c;

    /* renamed from: d, reason: collision with root package name */
    public float f33094d;

    /* renamed from: e, reason: collision with root package name */
    public String f33095e;

    /* renamed from: f, reason: collision with root package name */
    public int f33096f;

    /* renamed from: g, reason: collision with root package name */
    public String f33097g;

    /* renamed from: h, reason: collision with root package name */
    public String f33098h;

    /* renamed from: i, reason: collision with root package name */
    public String f33099i;

    /* renamed from: j, reason: collision with root package name */
    public String f33100j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public float f33101l;

    /* renamed from: m, reason: collision with root package name */
    public int f33102m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f33103n;

    /* renamed from: o, reason: collision with root package name */
    public int f33104o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33105p;

    /* renamed from: q, reason: collision with root package name */
    public String f33106q;

    /* renamed from: r, reason: collision with root package name */
    public String f33107r;

    /* renamed from: s, reason: collision with root package name */
    public Long f33108s;

    /* renamed from: t, reason: collision with root package name */
    public Long f33109t;

    /* renamed from: u, reason: collision with root package name */
    public Long f33110u;

    /* renamed from: v, reason: collision with root package name */
    public Long f33111v;

    /* renamed from: w, reason: collision with root package name */
    public String f33112w;

    public /* synthetic */ a3(int i5, boolean z2, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z10, int i12, boolean z11, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10) {
        if ((i5 & 1) == 0) {
            this.f33091a = false;
        } else {
            this.f33091a = z2;
        }
        if ((i5 & 2) == 0) {
            this.f33092b = null;
        } else {
            this.f33092b = str;
        }
        if ((i5 & 4) == 0) {
            this.f33093c = null;
        } else {
            this.f33093c = num;
        }
        if ((i5 & 8) == 0) {
            this.f33094d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.f33094d = f10;
        }
        if ((i5 & 16) == 0) {
            this.f33095e = null;
        } else {
            this.f33095e = str2;
        }
        if ((i5 & 32) == 0) {
            this.f33096f = 0;
        } else {
            this.f33096f = i10;
        }
        if ((i5 & 64) == 0) {
            this.f33097g = null;
        } else {
            this.f33097g = str3;
        }
        if ((i5 & 128) == 0) {
            this.f33098h = null;
        } else {
            this.f33098h = str4;
        }
        if ((i5 & 256) == 0) {
            this.f33099i = null;
        } else {
            this.f33099i = str5;
        }
        if ((i5 & 512) == 0) {
            this.f33100j = null;
        } else {
            this.f33100j = str6;
        }
        if ((i5 & Segment.SHARE_MINIMUM) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i5 & 2048) == 0) {
            this.f33101l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.f33101l = f11;
        }
        if ((i5 & 4096) == 0) {
            this.f33102m = 1;
        } else {
            this.f33102m = i11;
        }
        if ((i5 & Segment.SIZE) == 0) {
            this.f33103n = false;
        } else {
            this.f33103n = z10;
        }
        if ((i5 & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.f33104o = 1;
        } else {
            this.f33104o = i12;
        }
        if ((32768 & i5) == 0) {
            this.f33105p = false;
        } else {
            this.f33105p = z11;
        }
        if ((65536 & i5) == 0) {
            this.f33106q = null;
        } else {
            this.f33106q = str8;
        }
        if ((131072 & i5) == 0) {
            this.f33107r = null;
        } else {
            this.f33107r = str9;
        }
        if ((262144 & i5) == 0) {
            this.f33108s = null;
        } else {
            this.f33108s = l10;
        }
        if ((524288 & i5) == 0) {
            this.f33109t = null;
        } else {
            this.f33109t = l11;
        }
        if ((1048576 & i5) == 0) {
            this.f33110u = null;
        } else {
            this.f33110u = l12;
        }
        if ((2097152 & i5) == 0) {
            this.f33111v = null;
        } else {
            this.f33111v = l13;
        }
        if ((i5 & 4194304) == 0) {
            this.f33112w = null;
        } else {
            this.f33112w = str10;
        }
    }

    public static final void a(a3 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33091a) {
            output.x(serialDesc, 0, self.f33091a);
        }
        if (output.A(serialDesc, 1) || self.f33092b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33092b);
        }
        if (output.A(serialDesc, 2) || self.f33093c != null) {
            output.i(serialDesc, 2, J.f15549a, self.f33093c);
        }
        if (output.A(serialDesc, 3) || !Float.valueOf(self.f33094d).equals(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            output.s(serialDesc, 3, self.f33094d);
        }
        if (output.A(serialDesc, 4) || self.f33095e != null) {
            output.i(serialDesc, 4, Wf.q0.f15625a, self.f33095e);
        }
        if (output.A(serialDesc, 5) || self.f33096f != 0) {
            output.t(5, self.f33096f, serialDesc);
        }
        if (output.A(serialDesc, 6) || self.f33097g != null) {
            output.i(serialDesc, 6, Wf.q0.f15625a, self.f33097g);
        }
        if (output.A(serialDesc, 7) || self.f33098h != null) {
            output.i(serialDesc, 7, Wf.q0.f15625a, self.f33098h);
        }
        if (output.A(serialDesc, 8) || self.f33099i != null) {
            output.i(serialDesc, 8, Wf.q0.f15625a, self.f33099i);
        }
        if (output.A(serialDesc, 9) || self.f33100j != null) {
            output.i(serialDesc, 9, Wf.q0.f15625a, self.f33100j);
        }
        if (output.A(serialDesc, 10) || self.k != null) {
            output.i(serialDesc, 10, Wf.q0.f15625a, self.k);
        }
        if (output.A(serialDesc, 11) || !Float.valueOf(self.f33101l).equals(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
            output.s(serialDesc, 11, self.f33101l);
        }
        if (output.A(serialDesc, 12) || self.f33102m != 1) {
            output.t(12, self.f33102m, serialDesc);
        }
        if (output.A(serialDesc, 13) || self.f33103n) {
            output.x(serialDesc, 13, self.f33103n);
        }
        if (output.A(serialDesc, 14) || self.f33104o != 1) {
            output.t(14, self.f33104o, serialDesc);
        }
        if (output.A(serialDesc, 15) || self.f33105p) {
            output.x(serialDesc, 15, self.f33105p);
        }
        if (output.A(serialDesc, 16) || self.f33106q != null) {
            output.i(serialDesc, 16, Wf.q0.f15625a, self.f33106q);
        }
        if (output.A(serialDesc, 17) || self.f33107r != null) {
            output.i(serialDesc, 17, Wf.q0.f15625a, self.f33107r);
        }
        if (output.A(serialDesc, 18) || self.f33108s != null) {
            output.i(serialDesc, 18, O.f15556a, self.f33108s);
        }
        if (output.A(serialDesc, 19) || self.f33109t != null) {
            output.i(serialDesc, 19, O.f15556a, self.f33109t);
        }
        if (output.A(serialDesc, 20) || self.f33110u != null) {
            output.i(serialDesc, 20, O.f15556a, self.f33110u);
        }
        if (output.A(serialDesc, 21) || self.f33111v != null) {
            output.i(serialDesc, 21, O.f15556a, self.f33111v);
        }
        if (!output.A(serialDesc, 22) && self.f33112w == null) {
            return;
        }
        output.i(serialDesc, 22, Wf.q0.f15625a, self.f33112w);
    }

    public final void b(String str) {
        this.f33092b = str;
    }

    public final void c(String str) {
        this.f33095e = str;
    }

    public final void d(String str) {
        this.f33097g = str;
    }

    public final void e(String str) {
        this.f33098h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.f33091a == a3Var.f33091a && AbstractC3340k.a(this.f33092b, a3Var.f33092b) && AbstractC3340k.a(this.f33093c, a3Var.f33093c) && Float.valueOf(this.f33094d).equals(Float.valueOf(a3Var.f33094d)) && AbstractC3340k.a(this.f33095e, a3Var.f33095e) && this.f33096f == a3Var.f33096f && AbstractC3340k.a(this.f33097g, a3Var.f33097g) && AbstractC3340k.a(this.f33098h, a3Var.f33098h) && AbstractC3340k.a(this.f33099i, a3Var.f33099i) && AbstractC3340k.a(this.f33100j, a3Var.f33100j) && AbstractC3340k.a(this.k, a3Var.k) && Float.valueOf(this.f33101l).equals(Float.valueOf(a3Var.f33101l)) && this.f33102m == a3Var.f33102m && this.f33103n == a3Var.f33103n && this.f33104o == a3Var.f33104o && this.f33105p == a3Var.f33105p && AbstractC3340k.a(this.f33106q, a3Var.f33106q) && AbstractC3340k.a(this.f33107r, a3Var.f33107r) && AbstractC3340k.a(this.f33108s, a3Var.f33108s) && AbstractC3340k.a(this.f33109t, a3Var.f33109t) && AbstractC3340k.a(this.f33110u, a3Var.f33110u) && AbstractC3340k.a(this.f33111v, a3Var.f33111v) && AbstractC3340k.a(this.f33112w, a3Var.f33112w);
    }

    public final void f(String str) {
        this.f33106q = str;
    }

    public final void g(String str) {
        this.f33112w = str;
    }

    public final void h(String str) {
        this.f33100j = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    public final int hashCode() {
        boolean z2 = this.f33091a;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        String str = this.f33092b;
        int iHashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f33093c;
        int iC = AbstractC0213f.c(this.f33094d, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str2 = this.f33095e;
        int iHashCode2 = (this.f33096f + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f33097g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f33098h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f33099i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f33100j;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iC2 = (this.f33102m + AbstractC0213f.c(this.f33101l, (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31)) * 31;
        ?? r03 = this.f33103n;
        int i10 = r03;
        if (r03 != 0) {
            i10 = 1;
        }
        int i11 = (this.f33104o + ((iC2 + i10) * 31)) * 31;
        boolean z10 = this.f33105p;
        int i12 = (i11 + (z10 ? 1 : z10 ? 1 : 0)) * 31;
        String str8 = this.f33106q;
        int iHashCode7 = (i12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f33107r;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l10 = this.f33108s;
        int iHashCode9 = (iHashCode8 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f33109t;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f33110u;
        int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f33111v;
        int iHashCode12 = (iHashCode11 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str10 = this.f33112w;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void i(String str) {
        this.f33099i = str;
    }

    public final void j(String str) {
        this.k = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VungleExt(isGooglePlayServicesAvailable=");
        sb2.append(this.f33091a);
        sb2.append(", appSetId=");
        sb2.append(this.f33092b);
        sb2.append(", appSetIdScope=");
        sb2.append(this.f33093c);
        sb2.append(", batteryLevel=");
        sb2.append(this.f33094d);
        sb2.append(", batteryState=");
        sb2.append(this.f33095e);
        sb2.append(", batterySaverEnabled=");
        sb2.append(this.f33096f);
        sb2.append(", connectionType=");
        sb2.append(this.f33097g);
        sb2.append(", connectionTypeDetail=");
        sb2.append(this.f33098h);
        sb2.append(", locale=");
        sb2.append(this.f33099i);
        sb2.append(", language=");
        sb2.append(this.f33100j);
        sb2.append(", timeZone=");
        sb2.append(this.k);
        sb2.append(", volumeLevel=");
        sb2.append(this.f33101l);
        sb2.append(", soundEnabled=");
        sb2.append(this.f33102m);
        sb2.append(", isTv=");
        sb2.append(this.f33103n);
        sb2.append(", sdCardAvailable=");
        sb2.append(this.f33104o);
        sb2.append(", isSideloadEnabled=");
        sb2.append(this.f33105p);
        sb2.append(", gaid=");
        sb2.append(this.f33106q);
        sb2.append(", amazonAdvertisingId=");
        sb2.append(this.f33107r);
        sb2.append(", sit=");
        sb2.append(this.f33108s);
        sb2.append(", oit=");
        sb2.append(this.f33109t);
        sb2.append(", ort=");
        sb2.append(this.f33110u);
        sb2.append(", obt=");
        sb2.append(this.f33111v);
        sb2.append(", gpVersion=");
        return AbstractC0279p0.n(sb2, this.f33112w, ')');
    }

    public a3(boolean z2, String str, Integer num, float f10, String str2, int i5, String str3, String str4, String str5, String str6, String str7, float f11, int i10, boolean z10, int i11, boolean z11, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10) {
        this.f33091a = z2;
        this.f33092b = str;
        this.f33093c = num;
        this.f33094d = f10;
        this.f33095e = str2;
        this.f33096f = i5;
        this.f33097g = str3;
        this.f33098h = str4;
        this.f33099i = str5;
        this.f33100j = str6;
        this.k = str7;
        this.f33101l = f11;
        this.f33102m = i10;
        this.f33103n = z10;
        this.f33104o = i11;
        this.f33105p = z11;
        this.f33106q = str8;
        this.f33107r = str9;
        this.f33108s = l10;
        this.f33109t = l11;
        this.f33110u = l12;
        this.f33111v = l13;
        this.f33112w = str10;
    }

    public final void b(float f10) {
        this.f33101l = f10;
    }

    public final void c(int i5) {
        this.f33102m = i5;
    }

    public final void d(Long l10) {
        this.f33108s = l10;
    }

    public final void b(boolean z2) {
        this.f33103n = z2;
    }

    public final void c(Long l10) {
        this.f33110u = l10;
    }

    public final void b(int i5) {
        this.f33104o = i5;
    }

    public final void b(Long l10) {
        this.f33109t = l10;
    }

    public final void a(boolean z2) {
        this.f33091a = z2;
    }

    public final void a(Integer num) {
        this.f33093c = num;
    }

    public final void a(float f10) {
        this.f33094d = f10;
    }

    public final void a(int i5) {
        this.f33096f = i5;
    }

    public final void a() {
        this.f33105p = false;
    }

    public final void a(String str) {
        this.f33107r = str;
    }

    public final void a(Long l10) {
        this.f33111v = l10;
    }

    public /* synthetic */ a3() {
        this(false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, false, 1, false, null, null, null, null, null, null, null);
    }
}
