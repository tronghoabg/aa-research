package defpackage;

import android.util.Property;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes3.dex */
final class wrt extends Property {
    public wrt(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = wrv.a;
        return Float.valueOf(((wrv) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        wrv wrvVar = (wrv) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        wrvVar.g = fFloatValue;
        float f = fFloatValue * 5400.0f;
        List list = wrvVar.k;
        wsi wsiVar = (wsi) list.get(0);
        float f2 = wrvVar.g * 1520.0f;
        wsiVar.a = (-20.0f) + f2;
        wsiVar.b = f2;
        int i2 = 0;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            float fH = wrv.h(i, wrv.a[i2], 667);
            float f3 = wsiVar.b;
            eow eowVar = wrvVar.d;
            wsiVar.b = f3 + (eowVar.getInterpolation(fH) * 250.0f);
            wsiVar.a += eowVar.getInterpolation(wrv.h(i, wrv.b[i2], 667)) * 250.0f;
            i2++;
        }
        float f4 = wsiVar.a;
        float f5 = wsiVar.b;
        float f6 = f4 + ((f5 - f4) * wrvVar.h);
        wsiVar.a = f6;
        wsiVar.a = f6 / 360.0f;
        wsiVar.b = f5 / 360.0f;
        int i3 = 0;
        while (true) {
            if (i3 >= 4) {
                break;
            }
            float fH2 = wrv.h(i, wrv.c[i3], 333);
            if (fH2 > BitmapDescriptorFactory.HUE_RED && fH2 < 1.0f) {
                int i4 = i3 + wrvVar.f;
                int[] iArr = wrvVar.e.e;
                int length = iArr.length;
                int i5 = i4 % length;
                int i6 = (i5 + 1) % length;
                int i7 = iArr[i5];
                int i8 = iArr[i6];
                ((wsi) list.get(0)).c = tte.a(wrvVar.d.getInterpolation(fH2), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        wrvVar.j.invalidateSelf();
    }
}
