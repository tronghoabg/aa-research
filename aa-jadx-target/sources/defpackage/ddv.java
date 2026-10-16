package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ddv {
    public static final defpackage.ddv a = new defpackage.ddv(0.0f, new defpackage.afhw(0.0f, 0.0f));
    public final float b;
    public final defpackage.afhw c;
    private final int d = 0;

    public ddv(float f, defpackage.afhw afhwVar) {
        this.b = f;
        this.c = afhwVar;
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ddv)) {
            return false;
        }
        defpackage.ddv ddvVar = (defpackage.ddv) obj;
        if (this.b != ddvVar.b || !defpackage.afga.f(this.c, ddvVar.c)) {
            return false;
        }
        int i = ddvVar.d;
        return true;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToIntBits(this.b) * 31) + this.c.hashCode()) * 31;
    }

    public final java.lang.String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.c + ", steps=0)";
    }
}
