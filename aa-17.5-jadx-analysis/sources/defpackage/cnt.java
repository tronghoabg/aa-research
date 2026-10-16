package defpackage;

/* loaded from: classes.dex */
public final class cnt extends cob {
    public final float a;

    public cnt(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnt) && Float.compare(this.a, ((cnt) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "RelativeHorizontalTo(dx=" + this.a + ")";
    }
}
