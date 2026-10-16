package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class uhf {
    public final ujl a;
    public final toq[] b;
    public final uhi c;
    public final uwt d;
    public final float e;
    public final abbb f;

    public uhf(ujl ujlVar, ujf ujfVar, uwt uwtVar, int i) {
        this.a = ujlVar;
        this.b = ujlVar.e;
        ugz ugzVar = new ugz(ujfVar, i);
        this.c = ugzVar;
        this.d = uwtVar;
        uke[] ukeVarArrE = ugzVar.e();
        float f = BitmapDescriptorFactory.HUE_RED;
        for (uke ukeVar : ukeVarArrE) {
            float fAbs = Math.abs(ukeVar.h) + (ukeVar.d / 2.0f);
            if (fAbs > f) {
                f = fAbs;
            }
        }
        this.e = f + f;
        this.f = ujlVar.s;
    }

    public static float a(List list) {
        Iterator it = list.iterator();
        float fMax = 1.0f;
        while (it.hasNext()) {
            fMax = Math.max(fMax, ((uhf) it.next()).e);
        }
        return fMax;
    }

    public final ujf b() {
        return ((ugz) this.c).a;
    }
}
