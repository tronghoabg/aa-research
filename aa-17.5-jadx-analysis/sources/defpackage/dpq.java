package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class dpq implements dpr {
    public final String b;
    public final String c;
    public final float e;
    public final float f;
    boolean a = false;
    float d = BitmapDescriptorFactory.HUE_RED;

    public dpq(float f, float f2, String str, String str2) {
        this.b = str == null ? "" : str;
        this.c = str2 == null ? "" : str2;
        this.f = f2;
        this.e = f;
    }

    @Override // defpackage.dpr
    public final float a() {
        float f = this.d;
        if (f >= this.f) {
            this.a = true;
        }
        if (this.a) {
            return f;
        }
        float f2 = f + 1.0f;
        this.d = f2;
        return f2;
    }
}
