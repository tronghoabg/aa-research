package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aeh extends aei {
    public float a;
    public float b;
    public float c;
    public float d;

    public aeh(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.aei
    public final float a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? BitmapDescriptorFactory.HUE_RED : this.d : this.c : this.b : this.a;
    }

    @Override // defpackage.aei
    public final int b() {
        return 4;
    }

    @Override // defpackage.aei
    public final /* synthetic */ aei c() {
        return new aeh(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // defpackage.aei
    public final void d() {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = BitmapDescriptorFactory.HUE_RED;
        this.d = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // defpackage.aei
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

    public final boolean equals(Object obj) {
        if (!(obj instanceof aeh)) {
            return false;
        }
        aeh aehVar = (aeh) obj;
        return aehVar.a == this.a && aehVar.b == this.b && aehVar.c == this.c && aehVar.d == this.d;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
