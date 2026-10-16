package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.J;
import com.applovin.shadow.okio.Segment;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b3 {

    @NotNull
    public static final x2 Companion = new x2();

    /* renamed from: a, reason: collision with root package name */
    public final String f33125a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33126b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33127c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33128d;

    /* renamed from: e, reason: collision with root package name */
    public final String f33129e;

    /* renamed from: f, reason: collision with root package name */
    public int f33130f;

    /* renamed from: g, reason: collision with root package name */
    public int f33131g;

    /* renamed from: h, reason: collision with root package name */
    public String f33132h;

    /* renamed from: i, reason: collision with root package name */
    public String f33133i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f33134j;
    public a3 k;

    public /* synthetic */ b3(int i5, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, a3 a3Var) {
        if (119 != (i5 & 119)) {
            AbstractC1240b0.k(i5, 119, w2.f33354a.getDescriptor());
            throw null;
        }
        this.f33125a = str;
        this.f33126b = str2;
        this.f33127c = str3;
        if ((i5 & 8) == 0) {
            this.f33128d = null;
        } else {
            this.f33128d = str4;
        }
        this.f33129e = str5;
        this.f33130f = i10;
        this.f33131g = i11;
        if ((i5 & 128) == 0) {
            this.f33132h = null;
        } else {
            this.f33132h = str6;
        }
        if ((i5 & 256) == 0) {
            this.f33133i = null;
        } else {
            this.f33133i = str7;
        }
        if ((i5 & 512) == 0) {
            this.f33134j = null;
        } else {
            this.f33134j = num;
        }
        if ((i5 & Segment.SHARE_MINIMUM) == 0) {
            this.k = null;
        } else {
            this.k = a3Var;
        }
    }

    public static b3 a(b3 b3Var) {
        String make = b3Var.f33125a;
        String model = b3Var.f33126b;
        String osv = b3Var.f33127c;
        String str = b3Var.f33128d;
        String os = b3Var.f33129e;
        int i5 = b3Var.f33130f;
        int i10 = b3Var.f33131g;
        String str2 = b3Var.f33132h;
        String str3 = b3Var.f33133i;
        Integer num = b3Var.f33134j;
        a3 a3Var = b3Var.k;
        AbstractC3340k.e(make, "make");
        AbstractC3340k.e(model, "model");
        AbstractC3340k.e(osv, "osv");
        AbstractC3340k.e(os, "os");
        return new b3(make, model, osv, str, os, i5, i10, str2, str3, num, a3Var);
    }

    public final void b(int i5) {
        this.f33130f = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return AbstractC3340k.a(this.f33125a, b3Var.f33125a) && AbstractC3340k.a(this.f33126b, b3Var.f33126b) && AbstractC3340k.a(this.f33127c, b3Var.f33127c) && AbstractC3340k.a(this.f33128d, b3Var.f33128d) && AbstractC3340k.a(this.f33129e, b3Var.f33129e) && this.f33130f == b3Var.f33130f && this.f33131g == b3Var.f33131g && AbstractC3340k.a(this.f33132h, b3Var.f33132h) && AbstractC3340k.a(this.f33133i, b3Var.f33133i) && AbstractC3340k.a(this.f33134j, b3Var.f33134j) && AbstractC3340k.a(this.k, b3Var.k);
    }

    public final int hashCode() {
        int iC = N0.a.c(N0.a.c(this.f33125a.hashCode() * 31, 31, this.f33126b), 31, this.f33127c);
        String str = this.f33128d;
        int iC2 = (this.f33131g + ((this.f33130f + N0.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f33129e)) * 31)) * 31;
        String str2 = this.f33132h;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f33133i;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f33134j;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        a3 a3Var = this.k;
        return iHashCode3 + (a3Var != null ? a3Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceNode(make=" + this.f33125a + ", model=" + this.f33126b + ", osv=" + this.f33127c + ", carrier=" + this.f33128d + ", os=" + this.f33129e + ", w=" + this.f33130f + ", h=" + this.f33131g + ", ua=" + this.f33132h + ", ifa=" + this.f33133i + ", lmt=" + this.f33134j + ", ext=" + this.k + ')';
    }

    public b3(String make, String model, String osv, String str, String os, int i5, int i10, String str2, String str3, Integer num, a3 a3Var) {
        AbstractC3340k.e(make, "make");
        AbstractC3340k.e(model, "model");
        AbstractC3340k.e(osv, "osv");
        AbstractC3340k.e(os, "os");
        this.f33125a = make;
        this.f33126b = model;
        this.f33127c = osv;
        this.f33128d = str;
        this.f33129e = os;
        this.f33130f = i5;
        this.f33131g = i10;
        this.f33132h = str2;
        this.f33133i = str3;
        this.f33134j = num;
        this.k = a3Var;
    }

    public static final void a(b3 self, Vf.b output, C1244d0 serialDesc) {
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.f33125a);
        output.y(serialDesc, 1, self.f33126b);
        output.y(serialDesc, 2, self.f33127c);
        if (output.A(serialDesc, 3) || self.f33128d != null) {
            output.i(serialDesc, 3, Wf.q0.f15625a, self.f33128d);
        }
        output.y(serialDesc, 4, self.f33129e);
        output.t(5, self.f33130f, serialDesc);
        output.t(6, self.f33131g, serialDesc);
        if (output.A(serialDesc, 7) || self.f33132h != null) {
            output.i(serialDesc, 7, Wf.q0.f15625a, self.f33132h);
        }
        if (output.A(serialDesc, 8) || self.f33133i != null) {
            output.i(serialDesc, 8, Wf.q0.f15625a, self.f33133i);
        }
        if (output.A(serialDesc, 9) || self.f33134j != null) {
            output.i(serialDesc, 9, J.f15549a, self.f33134j);
        }
        if (!output.A(serialDesc, 10) && self.k == null) {
            return;
        }
        output.i(serialDesc, 10, y2.f33364a, self.k);
    }

    public final void b(String str) {
        this.f33132h = str;
    }

    public final void a(int i5) {
        this.f33131g = i5;
    }

    public final void a(String str) {
        this.f33133i = str;
    }

    public final void a(Integer num) {
        this.f33134j = num;
    }

    public final void a(a3 a3Var) {
        this.k = a3Var;
    }

    public /* synthetic */ b3(String str, String str2, String str3, String str4, String str5, int i5, int i10, String str6) {
        this(str, str2, str3, str4, str5, i5, i10, str6, null, null, null);
    }
}
