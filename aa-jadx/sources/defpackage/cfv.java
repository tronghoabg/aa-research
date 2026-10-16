package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cfv implements defpackage.cft {
    public final float a;

    public cfv(float f) {
        this.a = f;
    }

    @Override // defpackage.cft
    public final int a(int i, int i2, defpackage.dlz dlzVar) {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cfv) && java.lang.Float.compare(this.a, ((defpackage.cfv) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
