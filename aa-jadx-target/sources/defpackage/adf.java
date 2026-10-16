package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adf {
    public final float a;
    public final long b;
    public final defpackage.afd c;

    public adf(float f, long j, defpackage.afd afdVar) {
        this.a = f;
        this.b = j;
        this.c = afdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.adf)) {
            return false;
        }
        defpackage.adf adfVar = (defpackage.adf) obj;
        return this.a == adfVar.a && defpackage.a.i(this.b, adfVar.b) && defpackage.afga.f(this.c, adfVar.c);
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + defpackage.a.f(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ScaleConfig(scale=" + this.a + ", transformOrigin=" + defpackage.cli.a(this.b) + ", animationSpec=" + this.c + ")";
    }
}
