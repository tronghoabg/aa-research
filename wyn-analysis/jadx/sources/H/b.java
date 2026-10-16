package H;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f4842a;

    public b(float f10) {
        this.f4842a = f10;
    }

    @Override // H.a
    public final float a(long j8, L0.b density) {
        AbstractC3340k.e(density, "density");
        return density.t(this.f4842a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L0.d.a(this.f4842a, ((b) obj).f4842a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4842a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4842a + ".dp)";
    }
}
