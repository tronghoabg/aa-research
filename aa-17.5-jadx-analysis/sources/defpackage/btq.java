package defpackage;

/* loaded from: classes2.dex */
public final class btq extends tt {
    public final float a;

    public btq(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btq) && this.a == ((btq) obj).a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
}
