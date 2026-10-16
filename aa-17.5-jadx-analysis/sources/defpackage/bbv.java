package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bbv {
    public static final bbu a;
    public static final bbj b;

    static {
        bbu bbuVar = new bbu(0);
        a = bbuVar;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        b = new bbj(afbe.a, i, i2, i3, api.b, i4, 0, 0, ars.a, new aya(2), ahni.b(afcp.a), bbuVar, dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY));
    }

    public static final long a(bbj bbjVar, int i) {
        int i2 = bbjVar.c;
        int i3 = bbjVar.b + i2;
        long jA = bbjVar.a();
        long j = bbjVar.d;
        long j2 = i2;
        int iD = (int) (bbjVar.e == api.b ? bbjVar.d() >> 32 : bbjVar.d() & 4294967295L);
        long j3 = i;
        art artVar = bbjVar.n;
        bbjVar.a();
        long jG = ((((j3 * i3) + jA) + j) - j2) - (iD - afpt.g(0, 0, iD));
        if (jG < 0) {
            return 0L;
        }
        return jG;
    }

    public static final bbt b(int i, afdr afdrVar, bux buxVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        cdt cdtVar = baq.b;
        boolean zA = buxVar.A(i) | buxVar.z(BitmapDescriptorFactory.HUE_RED) | buxVar.C(afdrVar);
        Object objG = buxVar.g();
        if (zA || objG == buw.a) {
            objG = new bkp(i, afdrVar, 1);
            buxVar.x(objG);
        }
        baq baqVar = (baq) byx.r(objArr, cdtVar, (afdr) objG, buxVar, 0);
        baqVar.a.b(afdrVar);
        return baqVar;
    }
}
