package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* renamed from: com.waze.car_lib.r.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21414a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.c.Cdo f21415b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.b.a f21416c;

    public Cdo(com.waze.shared_infra.o.a aVar, com.waze.reports_v2.c.Cdo cdo, com.waze.car_lib.b.b.a aVar2) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(cdo, "statsSender");
        h.g.b.x.f(aVar2, "transformReportSubTypeToUiDataUseCase");
        this.f21414a = aVar;
        this.f21415b = cdo;
        this.f21416c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.o.ad a(com.waze.reports_v2.b.ag r9) {
        /*
            r8 = this;
            r7 = r9
            java.lang.String r0 = "categoryWithSubtypes"
            h.g.b.x.f(r9, r0)
            com.waze.reports_v2.c.do r0 = r8.f21415b
            java.util.List r1 = r9.h()
            r0.N(r1)
            com.waze.reports_v2.b.q r0 = r9.g()
            android.os.Parcelable$Creator<com.waze.reports_v2.b.q> r1 = com.waze.reports_v2.b.q.CREATOR
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L6c;
                case 1: goto L64;
                case 2: goto L5c;
                case 3: goto L54;
                case 4: goto L4c;
                case 5: goto L44;
                case 6: goto L3c;
                case 7: goto L34;
                case 8: goto L32;
                case 9: goto L2a;
                case 10: goto L22;
                default: goto L1c;
            }
        L1c:
            h.i r8 = new h.i
            r8.<init>()
            throw r8
        L22:
            r0 = 2131888737(0x7f120a61, float:1.9412118E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L2a:
            r0 = 2131888793(0x7f120a99, float:1.9412231E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L32:
            r0 = 0
            goto L73
        L34:
            r0 = 2131886294(0x7f1200d6, float:1.9407163E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L3c:
            r0 = 2131888088(0x7f1207d8, float:1.9410801E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L44:
            r0 = 2131888743(0x7f120a67, float:1.941213E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L4c:
            r0 = 2131888820(0x7f120ab4, float:1.9412286E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L54:
            r0 = 2131888770(0x7f120a82, float:1.9412185E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L5c:
            r0 = 2131888760(0x7f120a78, float:1.9412164E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L64:
            r0 = 2131888798(0x7f120a9e, float:1.9412241E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L6c:
            r0 = 2131888813(0x7f120aad, float:1.9412272E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L73:
            if (r0 == 0) goto L86
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            com.waze.shared_infra.o.a r1 = r8.f21414a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r1.c(r0, r2)
            if (r0 != 0) goto L88
        L86:
            java.lang.String r0 = ""
        L88:
            r2 = r0
            java.util.List r9 = r9.h()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r9 = r9.iterator()
        L9a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto Lb2
            java.lang.Object r1 = r9.next()
            com.waze.reports_v2.b.at r1 = (com.waze.reports_v2.b.at) r1
            com.waze.car_lib.b.b.a r3 = r8.f21416c
            com.waze.car_lib.b.a.b r1 = r3.a(r1)
            if (r1 == 0) goto L9a
            r0.add(r1)
            goto L9a
        Lb2:
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            com.waze.car_lib.r.df r1 = new com.waze.car_lib.r.df
            r5 = 0
            r6 = 56
            r4 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r1 = com.waze.gw.Gateway.patchAaSubReportState(r7, r1)
            com.waze.o.ad r1 = (com.waze.o.ad) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.Cdo.a(com.waze.reports_v2.b.ag):com.waze.o.ad");
    }
}
