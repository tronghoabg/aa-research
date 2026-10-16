package L0;

import A7.AbstractC0279p0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f6793a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6794b;

    public c(float f10, float f11) {
        this.f6793a = f10;
        this.f6794b = f11;
    }

    @Override // L0.b
    public final float b() {
        return this.f6793a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.valueOf(this.f6793a).equals(Float.valueOf(cVar.f6793a)) && Float.valueOf(this.f6794b).equals(Float.valueOf(cVar.f6794b));
    }

    @Override // L0.b
    public final float getFontScale() {
        return this.f6794b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6794b) + (Float.floatToIntBits(this.f6793a) * 31);
    }

    @Override // L0.b
    public final /* synthetic */ int j(float f10) {
        return AbstractC0279p0.a(this, f10);
    }

    @Override // L0.b
    public final /* synthetic */ float l(long j8) {
        return AbstractC0279p0.b(j8, this);
    }

    @Override // L0.b
    public final float t(float f10) {
        return b() * f10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f6793a);
        sb2.append(", fontScale=");
        return AbstractC0279p0.m(sb2, this.f6794b, ')');
    }

    @Override // L0.b
    public final /* synthetic */ long y(long j8) {
        return AbstractC0279p0.c(j8, this);
    }
}
