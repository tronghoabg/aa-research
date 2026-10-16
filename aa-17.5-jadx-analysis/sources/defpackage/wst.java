package defpackage;

import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class wst extends Property {
    public wst(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = wsu.a;
        return Float.valueOf(((wsu) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        List list;
        wsu wsuVar = (wsu) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        wsuVar.g = fFloatValue;
        float f = fFloatValue * 1800.0f;
        int i = 0;
        while (true) {
            list = wsuVar.k;
            if (i >= list.size()) {
                break;
            }
            int i2 = (int) f;
            wsi wsiVar = (wsi) list.get(i);
            int[] iArr = wsu.b;
            int i3 = i + i;
            int i4 = iArr[i3];
            int[] iArr2 = wsu.a;
            float fH = wsu.h(i2, i4, iArr2[i3]);
            Interpolator[] interpolatorArr = wsuVar.c;
            wsiVar.a = dlz.i(interpolatorArr[i3].getInterpolation(fH), BitmapDescriptorFactory.HUE_RED, 1.0f);
            int i5 = i3 + 1;
            wsiVar.b = dlz.i(interpolatorArr[i5].getInterpolation(wsu.h(i2, iArr[i5], iArr2[i5])), BitmapDescriptorFactory.HUE_RED, 1.0f);
            i++;
        }
        if (wsuVar.f) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((wsi) it.next()).c = wsuVar.d.e[wsuVar.e];
            }
            wsuVar.f = false;
        }
        wsuVar.j.invalidateSelf();
    }
}
