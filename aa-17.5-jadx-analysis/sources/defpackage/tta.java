package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class tta {
    public final float[] a = new float[8];
    public tsz b = new tsz();
    public tsz c = new tsz();
    public final tsz d = new tsz();
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;

    public static float a(float f, float f2) {
        return f2 == BitmapDescriptorFactory.HUE_RED ? f : (f * 0.3f) + (f2 * 0.7f);
    }

    public final usz b() {
        return this.c.d;
    }

    public final boolean c(usz uszVar, tpf tpfVar) {
        if (uszVar == null) {
            return false;
        }
        if (this.j && uszVar == this.b.d) {
            tpfVar.n(this.e, this.f);
            return true;
        }
        if (uszVar != this.c.d) {
            return false;
        }
        tpfVar.n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        return true;
    }
}
