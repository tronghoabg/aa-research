package defpackage;

/* loaded from: classes2.dex */
public final class btt extends tv {
    public final float a;

    public btt(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btt) && this.a == ((btt) obj).a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
}
