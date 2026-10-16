package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dpy implements defpackage.dpz {
    public final java.lang.String b;
    public final java.lang.String c;
    public final float e;
    public final float f;
    boolean a = false;
    float d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;

    public dpy(float f, float f2, java.lang.String str, java.lang.String str2) {
        this.b = str == null ? "" : str;
        this.c = str2 == null ? "" : str2;
        this.f = f2;
        this.e = f;
    }

    @Override // defpackage.dpz
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
