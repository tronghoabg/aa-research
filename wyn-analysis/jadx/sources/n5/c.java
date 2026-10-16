package N5;

import A7.B0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class c extends B0 {

    /* renamed from: b, reason: collision with root package name */
    public long f8418b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f8419c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f8420d;

    public static Serializable e0(int i5, Y4.b bVar) {
        if (i5 == 0) {
            return Double.valueOf(Double.longBitsToDouble(bVar.k()));
        }
        if (i5 == 1) {
            return Boolean.valueOf(bVar.q() == 1);
        }
        if (i5 == 2) {
            return g0(bVar);
        }
        if (i5 != 3) {
            if (i5 == 8) {
                return f0(bVar);
            }
            if (i5 != 10) {
                if (i5 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(bVar.k()));
                bVar.B(2);
                return date;
            }
            int iT = bVar.t();
            ArrayList arrayList = new ArrayList(iT);
            for (int i10 = 0; i10 < iT; i10++) {
                Serializable serializableE0 = e0(bVar.q(), bVar);
                if (serializableE0 != null) {
                    arrayList.add(serializableE0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strG0 = g0(bVar);
            int iQ = bVar.q();
            if (iQ == 9) {
                return map;
            }
            Serializable serializableE02 = e0(iQ, bVar);
            if (serializableE02 != null) {
                map.put(strG0, serializableE02);
            }
        }
    }

    public static HashMap f0(Y4.b bVar) {
        int iT = bVar.t();
        HashMap map = new HashMap(iT);
        for (int i5 = 0; i5 < iT; i5++) {
            String strG0 = g0(bVar);
            Serializable serializableE0 = e0(bVar.q(), bVar);
            if (serializableE0 != null) {
                map.put(strG0, serializableE0);
            }
        }
        return map;
    }

    public static String g0(Y4.b bVar) {
        int iV = bVar.v();
        int i5 = bVar.f16680b;
        bVar.B(iV);
        return new String(bVar.f16679a, i5, iV);
    }
}
