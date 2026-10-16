package defpackage;

import android.animation.TimeInterpolator;
import android.util.Property;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes3.dex */
final class wry extends Property {
    public wry(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = wsa.a;
        return Float.valueOf(((wsa) obj).f);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i;
        wsa wsaVar = (wsa) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        wsaVar.f = fFloatValue;
        float f = fFloatValue * 6000.0f;
        List list = wsaVar.k;
        wsi wsiVar = (wsi) list.get(0);
        float f2 = wsaVar.f * 1080.0f;
        int[] iArr = wsa.a;
        int length = iArr.length;
        int i2 = 0;
        float interpolation = 0.0f;
        while (true) {
            i = (int) f;
            if (i2 >= 4) {
                break;
            }
            interpolation += wsaVar.c.getInterpolation(wsa.h(i, iArr[i2], 500)) * 90.0f;
            i2++;
        }
        wsiVar.g = f2 + interpolation;
        TimeInterpolator timeInterpolator = wsaVar.c;
        float interpolation2 = timeInterpolator.getInterpolation(wsa.h(i, 0, 3000)) - timeInterpolator.getInterpolation(wsa.h(i, 3000, 3000));
        wsiVar.a = BitmapDescriptorFactory.HUE_RED;
        float[] fArr = wsa.b;
        float f3 = ((1.0f - interpolation2) * fArr[0]) + (interpolation2 * fArr[1]);
        wsiVar.b = f3;
        float f4 = wsaVar.g;
        if (f4 > BitmapDescriptorFactory.HUE_RED) {
            wsiVar.b = f3 * (1.0f - f4);
        }
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            if (i3 >= 4) {
                break;
            }
            float fH = wsa.h(i, iArr[i3], 100);
            if (fH >= BitmapDescriptorFactory.HUE_RED && fH <= 1.0f) {
                int i4 = i3 + wsaVar.e;
                int[] iArr2 = wsaVar.d.e;
                int length3 = iArr2.length;
                int i5 = i4 % length3;
                int i6 = (i5 + 1) % length3;
                int i7 = iArr2[i5];
                int i8 = iArr2[i6];
                ((wsi) list.get(0)).c = tte.a(timeInterpolator.getInterpolation(fH), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                break;
            }
            i3++;
        }
        wsaVar.j.invalidateSelf();
    }
}
