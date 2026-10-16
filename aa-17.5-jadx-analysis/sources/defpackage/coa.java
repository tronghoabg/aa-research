package defpackage;

/* loaded from: classes.dex */
public final class coa extends cob {
    public final float a;

    public coa(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof coa) && Float.compare(this.a, ((coa) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "VerticalTo(y=" + this.a + ")";
    }
}
