package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class ukl {
    public static final ukl a = e().a();
    public final int b;
    public final uke c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final boolean n;
    public final int o;
    private final yfq p;
    private final boolean q;

    public ukl(int i, uke ukeVar, int i2, int i3, int i4, float f, float f2, float f3, int i5, int i6, int i7, float f4, yfq yfqVar, int i8, boolean z, boolean z2) {
        this.b = i;
        this.c = ukeVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = f4;
        this.p = yfqVar;
        this.o = i8;
        this.n = z;
        this.q = z2;
    }

    public static ukk e() {
        ukk ukkVar = new ukk();
        ukkVar.l(0);
        ukkVar.p(uke.a);
        ukkVar.j(0);
        ukkVar.k(0);
        ukkVar.i(2130706432);
        ukkVar.h(BitmapDescriptorFactory.HUE_RED);
        ukkVar.n(BitmapDescriptorFactory.HUE_RED);
        ukkVar.o(BitmapDescriptorFactory.HUE_RED);
        ukkVar.e(0);
        ukkVar.f(0);
        ukkVar.d(0);
        ukkVar.g(BitmapDescriptorFactory.HUE_RED);
        int i = yfq.d;
        ukkVar.q(yls.a);
        ukkVar.a = 1;
        ukkVar.c(false);
        ukkVar.m(false);
        return ukkVar;
    }

    public static ukl f(abew abewVar) {
        int i;
        float f = abewVar.e;
        float f2 = abewVar.n;
        float f3 = abewVar.o;
        if ((abewVar.c & 256) == 0 || (i = abewVar.l) == 0) {
            i = abewVar.k;
        }
        boolean z = abewVar.r.size() > 0 || abewVar.s.size() > 0;
        yfq yfqVarO = yfq.o(new abof(abewVar.j, abew.a));
        int i2 = abewVar.m;
        if (i2 == 0) {
            i2 = 2130706432;
        }
        ukk ukkVarE = e();
        ukkVarE.l(abewVar.f);
        ukkVarE.p(new uke(abewVar.d, f / 8.0f, new int[0], BitmapDescriptorFactory.HUE_RED));
        ukkVarE.j(abewVar.k);
        ukkVarE.k(i);
        ukkVarE.i(i2);
        ukkVarE.h(f2 / 8.0f);
        int iAr = a.ar(abewVar.p);
        ukkVarE.a = iAr != 0 ? iAr : 1;
        ukkVarE.c(abewVar.q);
        ukkVarE.n(abewVar.t);
        ukkVarE.o(abewVar.u);
        ukkVarE.q(yfqVarO);
        ukkVarE.e(abewVar.g);
        ukkVarE.f(abewVar.i);
        ukkVarE.d(abewVar.h);
        ukkVarE.g(f3 / 8.0f);
        ukkVarE.m(z);
        return ukkVarE.a();
    }

    public final float a() {
        return Math.max(this.g - this.e, BitmapDescriptorFactory.HUE_RED);
    }

    public final float b() {
        return this.g + this.e;
    }

    public final float c() {
        return Math.max(this.g - this.d, BitmapDescriptorFactory.HUE_RED);
    }

    public final float d() {
        return this.g + this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ukl) {
            ukl uklVar = (ukl) obj;
            if (this.b == uklVar.b && this.c.equals(uklVar.c) && this.d == uklVar.d && this.e == uklVar.e && this.f == uklVar.f) {
                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(uklVar.g)) {
                    if (Float.floatToIntBits(this.h) == Float.floatToIntBits(uklVar.h)) {
                        if (Float.floatToIntBits(this.i) == Float.floatToIntBits(uklVar.i) && this.j == uklVar.j && this.k == uklVar.k && this.l == uklVar.l) {
                            if (Float.floatToIntBits(this.m) == Float.floatToIntBits(uklVar.m) && yrm.W(this.p, uklVar.p)) {
                                int i = this.o;
                                int i2 = uklVar.o;
                                if (i == 0) {
                                    throw null;
                                }
                                if (i == i2 && this.n == uklVar.n && this.q == uklVar.q) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ Float.floatToIntBits(this.m)) * 1000003) ^ this.p.hashCode();
        int i = this.o;
        a.aW(i);
        return (((((iHashCode * 1000003) ^ i) * 1000003) ^ (true == this.n ? 1231 : 1237)) * 1000003) ^ (true != this.q ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.o;
        return "{" + this.b + ", " + String.valueOf(this.c) + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + ", " + this.k + ", " + this.l + ", " + this.m + ", " + String.valueOf(this.p) + ", " + (i != 0 ? Integer.toString(i) : "null") + ", " + this.n + ", " + this.q + "}";
    }

    public ukl() {
        throw null;
    }
}
