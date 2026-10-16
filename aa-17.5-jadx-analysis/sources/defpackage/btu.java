package defpackage;

/* loaded from: classes2.dex */
public final class btu extends tv {
    public final float a;

    public btu(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btu) && this.a == ((btu) obj).a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
}
