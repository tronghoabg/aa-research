package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class gax {
    public static final gax a = new gax();

    public static final gal a(Context context, int i, CarColor carColor) {
        String str = String.format("android.resource://%s/%s", Arrays.copyOf(new Object[]{context.getPackageName(), Integer.valueOf(i)}, 2));
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        return new gal(uri, carColor, 0, null);
    }

    public static final gbg c(Context context, int i, CarColor carColor) {
        return fxy.d(a(context, i, carColor));
    }

    public final void b(long j, ckv ckvVar, bux buxVar, int i) {
        long j2;
        long jQ;
        int i2 = i & 6;
        bux buxVarC = buxVar.c(984391234);
        int i3 = i2 == 0 ? i | 2 : i;
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(ckvVar) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                jQ = gux.c(buxVarC).Q();
            } else {
                buxVarC.s();
                jQ = j;
            }
            buxVarC.l();
            cfy cfyVarC = awd.c(cfy.e, 1.0f);
            if (ckvVar != null) {
                cfyVarC = cjn.g(cfyVarC, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar, true, 0, 1042431);
            }
            atk.c(cfyVarC.a(new aix(jQ, ckq.a)), buxVarC, 0);
            j2 = jQ;
        } else {
            buxVarC.s();
            j2 = j;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gaw(this, j2, ckvVar, i, 0);
        }
    }
}
