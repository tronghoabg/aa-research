package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aem extends defpackage.aep {
    public float a;
    public float b;

    public aem(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.aep
    public final float a(int i) {
        if (i != 0) {
            return i != 1 ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : this.b;
        }
        return this.a;
    }

    @Override // defpackage.aep
    public final int b() {
        return 2;
    }

    @Override // defpackage.aep
    public final /* synthetic */ defpackage.aep c() {
        return new defpackage.aem(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.aep
    public final void d() {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aep
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aem)) {
            return false;
        }
        defpackage.aem aemVar = (defpackage.aem) obj;
        return aemVar.a == this.a && aemVar.b == this.b;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
