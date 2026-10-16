package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wuv implements wuy {
    public final float a;

    public wuv(float f) {
        this.a = f;
    }

    public final float a(android.graphics.RectF rectF) {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.wuv) && this.a == ((defpackage.wuv) obj).a;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Float.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        return this.a + "px";
    }
}
