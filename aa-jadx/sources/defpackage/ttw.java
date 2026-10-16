package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ttw {
    public final float[] a = new float[8];
    public defpackage.ttv b = new defpackage.ttv();
    public defpackage.ttv c = new defpackage.ttv();
    public final defpackage.ttv d = new defpackage.ttv();
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;

    public static float a(float f, float f2) {
        return f2 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? f : (f * 0.3f) + (f2 * 0.7f);
    }

    public final defpackage.utv b() {
        return this.c.d;
    }

    public final boolean c(defpackage.utv utvVar, defpackage.tqd tqdVar) {
        if (utvVar == null) {
            return false;
        }
        if (this.j && utvVar == this.b.d) {
            tqdVar.n(this.e, this.f);
            return true;
        }
        if (utvVar != this.c.d) {
            return false;
        }
        tqdVar.n(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        return true;
    }
}
