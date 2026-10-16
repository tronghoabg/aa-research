package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cod extends defpackage.coj {
    public final float a;
    public final float b;

    public cod(float f, float f2) {
        super(false, false);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cod)) {
            return false;
        }
        defpackage.cod codVar = (defpackage.cod) obj;
        return java.lang.Float.compare(this.a, codVar.a) == 0 && java.lang.Float.compare(this.b, codVar.b) == 0;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "RelativeMoveTo(dx=" + this.a + ", dy=" + this.b + ")";
    }
}
