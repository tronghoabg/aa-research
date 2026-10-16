package y2;

import A7.B0;
import Q1.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4541c extends B0 {

    /* renamed from: b, reason: collision with root package name */
    public long f47979b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f47980c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f47981d;

    public static Serializable e0(int i5, o oVar) {
        if (i5 == 0) {
            return Double.valueOf(Double.longBitsToDouble(oVar.o()));
        }
        if (i5 == 1) {
            return Boolean.valueOf(oVar.u() == 1);
        }
        if (i5 == 2) {
            return g0(oVar);
        }
        if (i5 != 3) {
            if (i5 == 8) {
                return f0(oVar);
            }
            if (i5 != 10) {
                if (i5 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(oVar.o()));
                oVar.H(2);
                return date;
            }
            int iY = oVar.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i10 = 0; i10 < iY; i10++) {
                Serializable serializableE0 = e0(oVar.u(), oVar);
                if (serializableE0 != null) {
                    arrayList.add(serializableE0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strG0 = g0(oVar);
            int iU = oVar.u();
            if (iU == 9) {
                return map;
            }
            Serializable serializableE02 = e0(iU, oVar);
            if (serializableE02 != null) {
                map.put(strG0, serializableE02);
            }
        }
    }

    public static HashMap f0(o oVar) {
        int iY = oVar.y();
        HashMap map = new HashMap(iY);
        for (int i5 = 0; i5 < iY; i5++) {
            String strG0 = g0(oVar);
            Serializable serializableE0 = e0(oVar.u(), oVar);
            if (serializableE0 != null) {
                map.put(strG0, serializableE0);
            }
        }
        return map;
    }

    public static String g0(o oVar) {
        int iA = oVar.A();
        int i5 = oVar.f9703b;
        oVar.H(iA);
        return new String(oVar.f9702a, i5, iA);
    }
}
