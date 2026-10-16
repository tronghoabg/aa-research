package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
final class wsc extends emn {
    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = wsd.h;
        return ((wsd) obj).b() * 10000.0f;
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        wsd wsdVar = (wsd) obj;
        int i = wsd.h;
        wsdVar.d(f / 10000.0f);
        if (wsdVar.j.c(true)) {
            if (wsdVar.d == null) {
                Context context = wsdVar.i;
                TimeInterpolator timeInterpolator = wkn.a;
                wsdVar.f = woy.C(context, R.attr.motionEasingStandardInterpolator, timeInterpolator);
                wsdVar.g = woy.C(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
                wsdVar.d = new ValueAnimator();
                wsdVar.d.setDuration(500L);
                wsdVar.d.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
                wsdVar.d.setInterpolator(null);
                wsdVar.d.addUpdateListener(new nt(wsdVar, 13, null));
            }
            float fA = wsdVar.a((int) f);
            if (fA == wsdVar.c) {
                if (wsdVar.d.isRunning()) {
                    return;
                }
                wsdVar.c(fA);
                return;
            }
            if (wsdVar.d.isRunning()) {
                wsdVar.d.cancel();
            }
            wsdVar.c = fA;
            if (fA == 1.0f) {
                wsdVar.e = wsdVar.f;
                wsdVar.d.start();
            } else {
                wsdVar.e = wsdVar.g;
                wsdVar.d.reverse();
            }
        }
    }
}
