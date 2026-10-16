package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aeg extends aei {
    public float a;
    public float b;
    public float c;

    public aeg(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.aei
    public final float a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? BitmapDescriptorFactory.HUE_RED : this.c : this.b : this.a;
    }

    @Override // defpackage.aei
    public final int b() {
        return 3;
    }

    @Override // defpackage.aei
    public final /* synthetic */ aei c() {
        return new aeg(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.aei
    public final void d() {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aei
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

    public final boolean equals(Object obj) {
        if (!(obj instanceof aeg)) {
            return false;
        }
        aeg aegVar = (aeg) obj;
        return aegVar.a == this.a && aegVar.b == this.b && aegVar.c == this.c;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
