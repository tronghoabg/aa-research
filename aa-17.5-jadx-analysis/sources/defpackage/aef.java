package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aef extends aei {
    public float a;
    public float b;

    public aef(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.aei
    public final float a(int i) {
        return i != 0 ? i != 1 ? BitmapDescriptorFactory.HUE_RED : this.b : this.a;
    }

    @Override // defpackage.aei
    public final int b() {
        return 2;
    }

    @Override // defpackage.aei
    public final /* synthetic */ aei c() {
        return new aef(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.aei
    public final void d() {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aei
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

    public final boolean equals(Object obj) {
        if (!(obj instanceof aef)) {
            return false;
        }
        aef aefVar = (aef) obj;
        return aefVar.a == this.a && aefVar.b == this.b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
