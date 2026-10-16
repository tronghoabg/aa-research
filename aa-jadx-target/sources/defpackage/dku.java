package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class dku {
    public final float a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dku) && java.lang.Float.compare(this.a, ((defpackage.dku) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "BaselineShift(multiplier=" + this.a + ")";
    }
}
