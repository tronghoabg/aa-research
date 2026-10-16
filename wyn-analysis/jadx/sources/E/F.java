package E;

import A.AbstractC0213f;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final float f2680a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2681b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2682c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2683d;

    public F(float f10, float f11, float f12, float f13) {
        this.f2680a = f10;
        this.f2681b = f11;
        this.f2682c = f12;
        this.f2683d = f13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        return L0.d.a(this.f2680a, f10.f2680a) && L0.d.a(this.f2681b, f10.f2681b) && L0.d.a(this.f2682c, f10.f2682c) && L0.d.a(this.f2683d, f10.f2683d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2683d) + AbstractC0213f.c(this.f2682c, AbstractC0213f.c(this.f2681b, Float.floatToIntBits(this.f2680a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) L0.d.b(this.f2680a)) + ", top=" + ((Object) L0.d.b(this.f2681b)) + ", end=" + ((Object) L0.d.b(this.f2682c)) + ", bottom=" + ((Object) L0.d.b(this.f2683d)) + ')';
    }
}
