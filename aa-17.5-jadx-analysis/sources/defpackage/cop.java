package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cop extends czz {
    public final String a;
    public final List b;
    public final int c;
    public final cjs d;
    public final float e;
    public final cjs f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public cop(String str, List list, int i, cjs cjsVar, float f, cjs cjsVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = cjsVar;
        this.e = f;
        this.f = cjsVar2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cop copVar = (cop) obj;
            return affa.f(this.a, copVar.a) && affa.f(this.d, copVar.d) && this.e == copVar.e && affa.f(this.f, copVar.f) && this.g == copVar.g && this.h == copVar.h && this.i == copVar.i && this.j == copVar.j && this.k == copVar.k && this.l == copVar.l && this.m == copVar.m && this.n == copVar.n && this.c == copVar.c && affa.f(this.b, copVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cjs cjsVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (cjsVar != null ? cjsVar.hashCode() : 0)) * 31) + Float.floatToIntBits(this.e)) * 31;
        cjs cjsVar2 = this.f;
        return ((((((((((((((((((iHashCode2 + (cjsVar2 != null ? cjsVar2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i) * 31) + this.j) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + this.c;
    }
}
