package defpackage;

import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class uer {
    private static final yob j = yob.c("com/google/android/libraries/geo/mapcore/internal/label/callout/CalloutGeometry");
    public final ujf a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final abaf f;
    public final float g;
    public final float h;
    public final RectF i;

    public uer(float f, float f2, float f3, float f4, abaf abafVar, ujf ujfVar, float f5) {
        RectF rectF;
        float f6;
        float f7;
        float f8 = BitmapDescriptorFactory.HUE_RED;
        new uev(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.a = ujfVar;
        this.b = f;
        this.c = f2;
        float f9 = f3 / 2.0f;
        this.d = f9;
        float f10 = f4 / 2.0f;
        this.e = f10;
        ukl uklVar = ujfVar.s;
        if (uklVar == null) {
            ((ynz) j.a(uys.a).ai((char) 9318)).u("Styles for GLCalloutLabels should have a TextBoxStyle.");
            rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            float fC = uklVar.h + uklVar.c();
            float fA = uklVar.i + uklVar.a();
            float fD = uklVar.h + uklVar.d();
            float fB = uklVar.i + uklVar.b();
            switch (abafVar) {
                case CENTER:
                    break;
                case LEFT:
                    fD += uklVar.j;
                    break;
                case RIGHT:
                    fC += uklVar.j;
                    break;
                case TOP:
                    f6 = uklVar.j;
                    fB += f6;
                    break;
                case TOP_LEFT:
                    f6 = uklVar.l;
                    fD += f6;
                    fB += f6;
                    break;
                case TOP_RIGHT:
                    f6 = uklVar.l;
                    fC += f6;
                    fB += f6;
                    break;
                case BOTTOM:
                    f7 = uklVar.j;
                    fA += f7;
                    break;
                case BOTTOM_LEFT:
                    f7 = uklVar.l;
                    fD += f7;
                    fA += f7;
                    break;
                case BOTTOM_RIGHT:
                    f7 = uklVar.l;
                    fC += f7;
                    fA += f7;
                    break;
                default:
                    fC = 0.0f;
                    fA = 0.0f;
                    fD = 0.0f;
                    fB = 0.0f;
                    break;
            }
            rectF = new RectF(Math.round(fC * f5), Math.round(fA * f5), Math.round(fD * f5), Math.round(f5 * fB));
        }
        this.i = rectF;
        this.f = abafVar;
        float f11 = f + rectF.left + rectF.right;
        if (ujfVar != null && ujfVar.p() && ujfVar.s.o == 3) {
            f8 = f2;
        }
        this.g = ((f11 + f8) - f9) - f10;
        this.h = f2 + rectF.top + rectF.bottom;
    }
}
