package defpackage;

/* loaded from: classes2.dex */
public final class npo implements npp {
    public final float a;

    public npo(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npo) && Float.compare(this.a, ((npo) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Number(value=" + this.a + ")";
    }
}
