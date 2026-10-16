package defpackage;

import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class fej {
    final float a;
    final float b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;

    public fej(View view) {
        this.a = view.getTranslationX();
        this.b = view.getTranslationY();
        int[] iArr = ebm.a;
        this.c = view.getTranslationZ();
        this.d = view.getScaleX();
        this.e = view.getScaleY();
        this.f = view.getRotationX();
        this.g = view.getRotationY();
        this.h = view.getRotation();
    }

    public final void a(View view) {
        fek.f(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fej)) {
            return false;
        }
        fej fejVar = (fej) obj;
        return fejVar.a == this.a && fejVar.b == this.b && fejVar.c == this.c && fejVar.d == this.d && fejVar.e == this.e && fejVar.f == this.f && fejVar.g == this.g && fejVar.h == this.h;
    }

    public final int hashCode() {
        float f = this.a;
        int iFloatToIntBits = f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0;
        float f2 = this.b;
        int iFloatToIntBits2 = f2 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f2) : 0;
        int i = iFloatToIntBits * 31;
        float f3 = this.c;
        int iFloatToIntBits3 = (((i + iFloatToIntBits2) * 31) + (f3 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.d;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.e;
        int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f5) : 0)) * 31;
        float f6 = this.f;
        int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f6) : 0)) * 31;
        float f7 = this.g;
        int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.h;
        return iFloatToIntBits7 + (f8 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f8) : 0);
    }
}
