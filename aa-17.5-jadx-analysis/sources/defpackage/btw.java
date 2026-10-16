package defpackage;

/* loaded from: classes2.dex */
public final class btw extends ty {
    public final float b;

    public btw(float f) {
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof btw) && this.b == ((btw) obj).b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b);
    }
}
