package defpackage;

/* loaded from: classes.dex */
public final class cnl extends cob {
    public final float a;

    public cnl(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnl) && Float.compare(this.a, ((cnl) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "HorizontalTo(x=" + this.a + ")";
    }
}
