package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class wuh extends wub {
    final float a = -1.0f;

    @Override // defpackage.wub
    public void a(wuu wuuVar, float f, float f2) {
        float f3 = f2 * f;
        wuuVar.e(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        wuq wuqVar = new wuq(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, f4);
        wuqVar.e = 180.0f;
        wuqVar.f = 90.0f;
        wuuVar.f.add(wuqVar);
        wuuVar.b(new wuo(wuqVar), 180.0f, 270.0f);
        float fCos = (float) Math.cos(Math.toRadians(270.0d));
        float f5 = f4 + BitmapDescriptorFactory.HUE_RED;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        wuuVar.b = (fCos * f6) + f7;
        wuuVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
