package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bct implements defpackage.bcs {
    private final float a;

    public bct(float f) {
        this.a = f;
    }

    @Override // defpackage.bcs
    public final float a(long j, defpackage.dlo dloVar) {
        return dloVar.dI(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bct) && java.lang.Float.compare(this.a, ((defpackage.bct) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
