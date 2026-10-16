package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class wvg extends defpackage.wpu {
    public final float a;

    public wvg() {
        super(null);
        this.a = -1.0f;
    }

    @Override // defpackage.wpu
    public void a(defpackage.wvs wvsVar, float f, float f2) {
        float f3 = f2 * f;
        wvsVar.e(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        defpackage.wvo wvoVar = new defpackage.wvo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f4, f4);
        wvoVar.e = 180.0f;
        wvoVar.f = 90.0f;
        wvsVar.f.add(wvoVar);
        wvsVar.b(new defpackage.wvm(wvoVar), 180.0f, 270.0f);
        float f5 = f4 + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        wvsVar.b = ((-1.8369701E-16f) * f6) + f7;
        wvsVar.c = f7 + (f6 * (-1.0f));
    }
}
