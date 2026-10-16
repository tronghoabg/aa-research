package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acy {
    public final float a;
    public final defpackage.afd b;

    public acy(float f, defpackage.afd afdVar) {
        this.a = f;
        this.b = afdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.acy)) {
            return false;
        }
        defpackage.acy acyVar = (defpackage.acy) obj;
        return this.a == acyVar.a && defpackage.afga.f(this.b, acyVar.b);
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FadeConfig(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
