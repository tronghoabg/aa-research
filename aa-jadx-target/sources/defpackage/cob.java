package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cob extends defpackage.coj {
    public final float a;

    public cob(float f) {
        super(false, false);
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cob) && java.lang.Float.compare(this.a, ((defpackage.cob) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "RelativeHorizontalTo(dx=" + this.a + ")";
    }
}
