package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjt implements kka {
    public final float a;
    public final float b;
    private final List c;

    public kjt(float f, float f2, List list) {
        this.a = f;
        this.b = f2;
        this.c = list;
    }

    @Override // defpackage.kka
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjt)) {
            return false;
        }
        kjt kjtVar = (kjt) obj;
        return Float.compare(this.a, kjtVar.a) == 0 && Float.compare(this.b, kjtVar.b) == 0 && affa.f(this.c, kjtVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CarFloatPropertyConfig(minValue=" + this.a + ", maxValue=" + this.b + ", configArray=" + this.c + ")";
    }
}
