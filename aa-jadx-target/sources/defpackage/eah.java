package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class eah {
    private final java.lang.String a;
    private final int c;
    private final int d;
    private final float b = 1.0f;
    private final int e = 0;
    private final int f = 0;
    private final int g = 0;
    private final float h = 1.0f;

    public eah(java.lang.String str, int i, int i2) {
        this.a = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eah)) {
            return false;
        }
        defpackage.eah eahVar = (defpackage.eah) obj;
        if (!j$.util.Objects.equals(this.a, eahVar.a) || this.c != eahVar.c || this.d != eahVar.d) {
            return false;
        }
        float f = eahVar.b;
        int i = eahVar.e;
        int i2 = eahVar.f;
        int i3 = eahVar.g;
        float f2 = eahVar.h;
        return true;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(this.c);
        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(this.d);
        java.lang.Float fValueOf = java.lang.Float.valueOf(1.0f);
        return j$.util.Objects.hash(new java.lang.Object[]{str, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf});
    }

    public final java.lang.String toString() {
        return "DisplayShapeCompat{ spec=" + java.lang.Integer.valueOf(this.a.hashCode()) + " displayWidth=" + this.c + " displayHeight=" + this.d + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
