package Z;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f16915a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16916b;

    public d(float f10, float f11) {
        this.f16915a = f10;
        this.f16916b = f11;
    }

    public final long a(long j8, long j10, L0.i layoutDirection) {
        AbstractC3340k.e(layoutDirection, "layoutDirection");
        float f10 = (((int) (j10 >> 32)) - ((int) (j8 >> 32))) / 2.0f;
        float f11 = (((int) (j10 & 4294967295L)) - ((int) (j8 & 4294967295L))) / 2.0f;
        L0.i iVar = L0.i.f6806a;
        float f12 = this.f16915a;
        if (layoutDirection != iVar) {
            f12 *= -1;
        }
        float f13 = 1;
        return A6.h.b(AbstractC4345a.H((f12 + f13) * f10), AbstractC4345a.H((f13 + this.f16916b) * f11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.valueOf(this.f16915a).equals(Float.valueOf(dVar.f16915a)) && Float.valueOf(this.f16916b).equals(Float.valueOf(dVar.f16916b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16916b) + (Float.floatToIntBits(this.f16915a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f16915a);
        sb2.append(", verticalBias=");
        return AbstractC0279p0.m(sb2, this.f16916b, ')');
    }
}
