package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bua extends defpackage.ua {
    public final float a;

    public bua(float f) {
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bua) && this.a == ((defpackage.bua) obj).a;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }
}
