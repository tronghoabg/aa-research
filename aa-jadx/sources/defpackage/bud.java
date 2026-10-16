package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bud extends defpackage.ud {
    public final float b;

    public bud(float f) {
        this.b = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bud) && this.b == ((defpackage.bud) obj).b;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.b);
    }
}
