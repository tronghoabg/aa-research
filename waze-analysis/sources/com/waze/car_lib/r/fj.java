package com.waze.car_lib.r;

import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f21640a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f21641b;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ViewModelRoutesHelper");
        h.g.b.x.e(eVarD, "create(...)");
        f21641b = eVarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.car.app.model.Distance a(int r5, com.waze.sharedui.utils.f r6) {
        /*
            java.lang.String r0 = "distanceUtils"
            h.g.b.x.f(r6, r0)
            com.waze.sharedui.utils.c r6 = new com.waze.sharedui.utils.c
            com.waze.sharedui.utils.e r0 = com.waze.sharedui.utils.f.c()
            r1 = 0
            r6.<init>(r0, r5, r1)
            double r0 = r6.f39085b
            com.waze.sharedui.utils.d r5 = r6.f39084a
            r2 = 3
            if (r5 != 0) goto L17
            goto L20
        L17:
            int r5 = r5.ordinal()
            if (r5 == 0) goto L3e
            r3 = 2
            if (r5 == r3) goto L3d
        L20:
            com.waze.shared_infra.i.e r5 = com.waze.car_lib.r.fj.f21641b
            com.waze.sharedui.utils.d r6 = r6.f39084a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected unit returned "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = ", returning KM"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.b(r6)
            goto L3e
        L3d:
            r2 = 5
        L3e:
            androidx.car.app.model.Distance r5 = androidx.car.app.model.Distance.create(r0, r2)
            java.lang.String r6 = "create(...)"
            h.g.b.x.e(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.fj.a(int, com.waze.sharedui.utils.f):androidx.car.app.model.Distance");
    }

    public static final int b(List list, long j2) {
        h.g.b.x.f(list, "<this>");
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((com.waze.modules.c.ar) it.next()).a() == j2) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            return i2;
        }
        f21641b.b("cannot find altId " + j2 + " in routes");
        return 0;
    }
}
