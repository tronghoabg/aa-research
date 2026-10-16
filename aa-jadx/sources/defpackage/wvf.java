package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wvf implements defpackage.wuy {
    private final float a;

    public wvf(float f) {
        this.a = f;
    }

    @Override // defpackage.wuy
    public final float a(android.graphics.RectF rectF) {
        return this.a * java.lang.Math.min(rectF.width(), rectF.height());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.wvf) && this.a == ((defpackage.wvf) obj).a;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        return ((int) (this.a * 100.0f)) + "%";
    }
}
