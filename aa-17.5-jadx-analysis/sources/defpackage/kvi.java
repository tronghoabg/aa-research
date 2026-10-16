package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class kvi implements amy {
    private final float a;
    private final float b;

    public kvi(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.amy
    public final float a(float f, float f2, float f3) {
        float f4 = this.a;
        float f5 = f2 + f;
        float f6 = f3 - this.b;
        if (f >= f4 && f5 <= f6) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f7 = f - f4;
        if (f >= f4 || f5 <= f6) {
            float f8 = f5 - f6;
            if (Math.abs(f7) >= Math.abs(f8)) {
                return f8;
            }
        }
        return f7;
    }

    @Override // defpackage.amy
    public final /* synthetic */ aec b() {
        return amx.a;
    }
}
