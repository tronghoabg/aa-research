package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnt extends defpackage.coj {
    public final float a;

    public cnt(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cnt) && java.lang.Float.compare(this.a, ((defpackage.cnt) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "HorizontalTo(x=" + this.a + ")";
    }
}
