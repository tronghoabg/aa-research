package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aee extends aei {
    public float a;

    public aee(float f) {
        this.a = f;
    }

    @Override // defpackage.aei
    public final float a(int i) {
        return i == 0 ? this.a : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aei
    public final int b() {
        return 1;
    }

    @Override // defpackage.aei
    public final /* synthetic */ aei c() {
        return new aee(BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.aei
    public final void d() {
        this.a = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aei
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aee) && ((aee) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
