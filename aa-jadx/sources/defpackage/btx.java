package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class btx extends defpackage.ty {
    public final float a;

    public btx(float f) {
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.btx) && this.a == ((defpackage.btx) obj).a;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }
}
