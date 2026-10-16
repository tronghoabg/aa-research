package defpackage;

/* loaded from: classes.dex */
public final class cnz extends cob {
    public final float a;

    public cnz(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnz) && Float.compare(this.a, ((cnz) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.a + ")";
    }
}
