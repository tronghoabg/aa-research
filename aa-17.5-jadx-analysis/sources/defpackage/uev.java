package defpackage;

/* loaded from: classes3.dex */
public final class uev {
    public float a;
    public float b;
    public float c;
    public float d;
    public final tpf e = new tpf();

    public uev(float f, float f2, float f3, float f4) {
        c(f, f2, f3, f4);
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final void c(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e.n((f + f3) * 0.5f, (f2 + f4) * 0.5f);
    }

    public final boolean d(tpf tpfVar) {
        float f = tpfVar.b;
        float f2 = tpfVar.c;
        return this.a <= f && f <= this.c && this.b <= f2 && f2 <= this.d;
    }

    public final boolean e(uev uevVar) {
        return this.a <= uevVar.c && this.b <= uevVar.d && this.c >= uevVar.a && this.d >= uevVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uev) {
            uev uevVar = (uev) obj;
            if (this.a == uevVar.a && this.c == uevVar.c && this.b == uevVar.b && this.d == uevVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) + 31) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "AABB[[" + this.a + ", " + this.b + "], [" + this.c + ", " + this.d + "]]";
    }

    public uev() {
    }
}
