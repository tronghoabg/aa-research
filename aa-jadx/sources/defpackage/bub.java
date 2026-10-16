package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bub extends defpackage.ua {
    public final float a;

    public bub(float f) {
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bub) && this.a == ((defpackage.bub) obj).a;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }
}
