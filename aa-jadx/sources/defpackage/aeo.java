package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aeo extends defpackage.aep {
    public float a;
    public float b;
    public float c;
    public float d;

    public aeo(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.aep
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return i != 3 ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : this.d;
        }
        return this.c;
    }

    @Override // defpackage.aep
    public final int b() {
        return 4;
    }

    @Override // defpackage.aep
    public final /* synthetic */ defpackage.aep c() {
        return new defpackage.aeo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.aep
    public final void d() {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aep
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aeo)) {
            return false;
        }
        defpackage.aeo aeoVar = (defpackage.aeo) obj;
        return aeoVar.a == this.a && aeoVar.b == this.b && aeoVar.c == this.c && aeoVar.d == this.d;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
