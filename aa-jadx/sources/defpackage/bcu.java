package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bcu implements defpackage.bcs {
    private final float a;

    public bcu(float f) {
        this.a = f;
        if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || f > 100.0f) {
            defpackage.asq.c("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.bcs
    public final float a(long j, defpackage.dlo dloVar) {
        return defpackage.cjl.b(j) * (this.a / 100.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.bcu) && java.lang.Float.compare(this.a, ((defpackage.bcu) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
