package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class did {
    public static final /* synthetic */ int a = 0;

    static {
        new dic(afbe.a);
    }

    public static final dhz a(int i) {
        if (i <= 0 || i >= 1001) {
            dka.c(a.bp(i, "'wght' value must be in [1, 1000]. Actual: "));
        }
        return new dib(i);
    }

    public static final dhz b(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            dka.c(a.bG(f, "'wdth' must be strictly > 0.0f. Actual: "));
        }
        return new dia("wdth", f);
    }

    public static final dic c(die dieVar, int i, dhz... dhzVarArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(dieVar.o));
        float f = i;
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            dka.c(a.bG(f, "'ital' must be in 0.0f..1.0f. Actual: "));
        }
        arrayList.add(new dia("ital", f));
        affx.a(dhzVarArr, arrayList);
        return new dic((dhz[]) arrayList.toArray(new dhz[arrayList.size()]));
    }
}
