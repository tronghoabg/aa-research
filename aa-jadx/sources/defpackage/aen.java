package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aen extends defpackage.aep {
    public float a;
    public float b;
    public float c;

    public aen(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.aep
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return i != 2 ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED : this.c;
        }
        return this.b;
    }

    @Override // defpackage.aep
    public final int b() {
        return 3;
    }

    @Override // defpackage.aep
    public final /* synthetic */ defpackage.aep c() {
        return new defpackage.aen(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.aep
    public final void d() {
        this.a = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aep
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aen)) {
            return false;
        }
        defpackage.aen aenVar = (defpackage.aen) obj;
        return aenVar.a == this.a && aenVar.b == this.b && aenVar.c == this.c;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
