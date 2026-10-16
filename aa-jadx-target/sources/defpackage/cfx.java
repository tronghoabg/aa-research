package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfx implements defpackage.cft {
    private final float a;

    public cfx(float f) {
        this.a = f;
    }

    @Override // defpackage.cft
    public final int a(int i, int i2, defpackage.dlz dlzVar) {
        defpackage.dlz dlzVar2 = defpackage.dlz.a;
        float f = this.a;
        if (dlzVar != dlzVar2) {
            f = -f;
        }
        return java.lang.Math.round(((i2 - i) / 2.0f) * (f + 1.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cfx) && java.lang.Float.compare(this.a, ((defpackage.cfx) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
