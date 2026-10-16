package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dlg {
    public static final defpackage.dlg a = new defpackage.dlg(1.0f, 0.0f);
    public final float b;
    public final float c;

    public dlg(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dlg)) {
            return false;
        }
        defpackage.dlg dlgVar = (defpackage.dlg) obj;
        return this.b == dlgVar.b && this.c == dlgVar.c;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.b) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "TextGeometricTransform(scaleX=" + this.b + ", skewX=" + this.c + ")";
    }

    public dlg() {
        this(1.0f, 0.0f);
    }
}
