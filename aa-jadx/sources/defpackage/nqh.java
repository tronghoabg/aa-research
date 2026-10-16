package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nqh implements defpackage.nqi {
    public final float a;

    public nqh(float f) {
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.nqh) && java.lang.Float.compare(this.a, ((defpackage.nqh) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "Number(value=" + this.a + ")";
    }
}
