package defpackage;

import android.util.Property;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes3.dex */
final class wsp extends Property {
    public wsp(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = wsq.f;
        return Float.valueOf(((wsq) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        wsq wsqVar = (wsq) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        wsqVar.e = fFloatValue;
        List list = wsqVar.k;
        ((wsi) list.get(0)).a = BitmapDescriptorFactory.HUE_RED;
        wsi wsiVar = (wsi) list.get(0);
        wsi wsiVar2 = (wsi) list.get(1);
        eow eowVar = wsqVar.a;
        float fH = wsq.h((int) (fFloatValue * 333.0f), 0, 667);
        float interpolation = eowVar.getInterpolation(fH);
        wsiVar2.a = interpolation;
        wsiVar.b = interpolation;
        wsi wsiVar3 = (wsi) list.get(1);
        wsi wsiVar4 = (wsi) list.get(2);
        float interpolation2 = eowVar.getInterpolation(fH + 0.49925038f);
        wsiVar4.a = interpolation2;
        wsiVar3.b = interpolation2;
        ((wsi) list.get(2)).b = 1.0f;
        if (wsqVar.d && ((wsi) list.get(1)).b < 1.0f) {
            ((wsi) list.get(2)).c = ((wsi) list.get(1)).c;
            ((wsi) list.get(1)).c = ((wsi) list.get(0)).c;
            ((wsi) list.get(0)).c = wsqVar.b.e[wsqVar.c];
            wsqVar.d = false;
        }
        wsqVar.j.invalidateSelf();
    }
}
