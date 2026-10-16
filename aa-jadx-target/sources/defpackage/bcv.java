package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcv implements defpackage.bcs {
    private final float a;

    public bcv(float f) {
        this.a = f;
    }

    @Override // defpackage.bcs
    public final float a(long j, defpackage.dlo dloVar) {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bcv) && java.lang.Float.compare(this.a, ((defpackage.bcv) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.a + ".px)";
    }
}
