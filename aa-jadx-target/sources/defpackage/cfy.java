package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfy {
    private final float a;

    public cfy(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return java.lang.Math.round(((i2 - i) / 2.0f) * (this.a + 1.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cfy) && java.lang.Float.compare(this.a, ((defpackage.cfy) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "Vertical(bias=" + this.a + ")";
    }
}
