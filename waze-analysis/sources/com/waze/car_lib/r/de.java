package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f21365a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bl.c.c.d f21366b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bl.c.c.c f21367c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21368d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.b.n f21369e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bl.d.a.f f21370f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.bl.c.c.g f21371g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f21372h;

    public de(com.waze.shared_infra.i.e eVar, com.waze.bl.c.c.d dVar, com.waze.bl.c.c.c cVar, com.waze.shared_infra.o.a aVar, com.waze.map.b.n nVar, com.waze.bl.d.a.f fVar, com.waze.bl.c.c.g gVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(dVar, "controllerStarter");
        h.g.b.x.f(cVar, "config");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(nVar, "mainMapController");
        h.g.b.x.f(fVar, "closureMapPresenter");
        h.g.b.x.f(gVar, "saveClosureCandidatesUseCase");
        this.f21365a = eVar;
        this.f21366b = dVar;
        this.f21367c = cVar;
        this.f21368d = aVar;
        this.f21369e = nVar;
        this.f21370f = fVar;
        this.f21371g = gVar;
        this.f21372h = kotlinx.coroutines.b.bu.e(0, 16, null, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.car_lib.r.cv a(com.waze.car_lib.r.de r6, com.waze.t.b.bs r7) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.de.a(com.waze.car_lib.r.de, com.waze.t.b.bs):com.waze.car_lib.r.cv");
    }

    public static final /* synthetic */ cv b(de deVar) {
        return new cv(deVar.n(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_STATIC, Integer.valueOf(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_SUBTITLE_STATIC), R.drawable.icon_report_conversational_listening_vector), false, false, false, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.car_lib.r.de r17, kotlinx.coroutines.a.ad r18, androidx.car.app.CarContext r19, com.waze.t.b.h r20, h.c.e r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.de.g(com.waze.car_lib.r.de, kotlinx.coroutines.a.ad, androidx.car.app.CarContext, com.waze.t.b.h, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object h(com.waze.car_lib.r.de r4, com.waze.t.b.h r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.car_lib.r.dc
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.r.dc r0 = (com.waze.car_lib.r.dc) r0
            int r1 = r0.f21360c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21360c = r1
            goto L18
        L13:
            com.waze.car_lib.r.dc r0 = new com.waze.car_lib.r.dc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f21358a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21360c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r6)
            goto L46
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.bm r4 = r4.f21372h
            com.waze.car_lib.r.am r6 = new com.waze.car_lib.r.am
            r2 = 13
            r6.<init>(r5, r2)
            kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
            r0.f21360c = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.de.h(com.waze.car_lib.r.de, com.waze.t.b.h, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object j(com.waze.car_lib.r.de r11, kotlinx.coroutines.a.ad r12, h.c.e r13) {
        /*
            boolean r0 = r13 instanceof com.waze.car_lib.r.dd
            if (r0 == 0) goto L13
            r0 = r13
            com.waze.car_lib.r.dd r0 = (com.waze.car_lib.r.dd) r0
            int r1 = r0.f21364d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21364d = r1
            goto L18
        L13:
            com.waze.car_lib.r.dd r0 = new com.waze.car_lib.r.dd
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f21362b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f21364d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r11 = r0.f21361a
            r12 = r11
            kotlinx.coroutines.a.ad r12 = (kotlinx.coroutines.a.ad) r12
            e.b.c.b(r13)
            goto L81
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            e.b.c.b(r13)
            com.waze.bl.c.c.d r13 = r11.f21366b
            com.waze.car_lib.screens.cp r2 = new com.waze.car_lib.screens.cp
            r5 = 19
            r2.<init>(r5)
            com.waze.t.b.as r13 = r13.a(r3, r2)
            boolean r2 = r13 instanceof com.waze.t.b.d
            if (r2 == 0) goto L8d
            com.waze.car_lib.r.cv r5 = new com.waze.car_lib.r.cv
            com.waze.t.b.d r13 = (com.waze.t.b.d) r13
            com.waze.t.b.e r13 = r13.a()
            com.waze.t.b.e r2 = com.waze.t.b.e.f40769a
            com.waze.t.b.ah r2 = com.waze.t.b.ah.f40680a
            com.waze.t.b.ba r2 = com.waze.t.b.ba.f40709a
            int r13 = r13.ordinal()
            if (r13 != 0) goto L87
            r13 = 2131887033(0x7f1203b9, float:1.9408662E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r2 = 2131231916(0x7f0804ac, float:1.8079927E38)
            r6 = 2131887037(0x7f1203bd, float:1.940867E38)
            com.waze.car_lib.b.a.b r6 = r11.n(r6, r13, r2)
            r9 = 0
            r10 = 14
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f21361a = r12
            r0.f21364d = r4
            java.lang.Object r11 = r12.g(r5, r0)
            if (r11 != r1) goto L81
            return r1
        L81:
            kotlinx.coroutines.a.ag r12 = (kotlinx.coroutines.a.ag) r12
            kotlinx.coroutines.b.ai.ab(r12)
            return r3
        L87:
            h.i r11 = new h.i
            r11.<init>()
            throw r11
        L8d:
            boolean r11 = r13 instanceof com.waze.t.b.f
            if (r11 == 0) goto L98
            com.waze.t.b.f r13 = (com.waze.t.b.f) r13
            com.waze.t.b.h r11 = r13.a()
            return r11
        L98:
            h.i r11 = new h.i
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.de.j(com.waze.car_lib.r.de, kotlinx.coroutines.a.ad, h.c.e):java.lang.Object");
    }

    private final com.waze.car_lib.b.a.b l() {
        return n(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_CANCELED, Integer.valueOf(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_SUBTITLE_CANCELED), R.drawable.icon_report_conversational_cancel_vector);
    }

    private final com.waze.car_lib.b.a.b m() {
        return n(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_LISTENING, Integer.valueOf(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_SUBTITLE_LISTENING), R.drawable.icon_report_conversational_listening_vector);
    }

    private final com.waze.car_lib.b.a.b n(int i2, Integer num, int i3) {
        String strC;
        com.waze.shared_infra.o.a aVar = this.f21368d;
        String strC2 = aVar.c(i2, new Object[0]);
        if (num != null) {
            num.intValue();
            strC = aVar.c(num.intValue(), new Object[0]);
        } else {
            strC = null;
        }
        return new com.waze.car_lib.b.a.b("Report_agent", strC2, strC, i3);
    }

    private final com.waze.car_lib.b.a.b o() {
        return n(R.string.CONVERSATIONAL_REPORT_AGENT_INCAR_ITEM_TITLE_SUCCESS, null, R.drawable.icon_report_conversational_processing_vector);
    }

    public final kotlinx.coroutines.b.k i(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        com.waze.shared_infra.i.e eVar = this.f21365a;
        eVar.a(TtmlNode.START);
        if (ActivityCompat.checkSelfPermission(carContext, "android.permission.RECORD_AUDIO") == 0) {
            return kotlinx.coroutines.b.ai.n(new cw(this, carContext, null));
        }
        eVar.g("no runtime permissions");
        return kotlinx.coroutines.b.ck.b(null);
    }

    public final void k(cu cuVar) {
        h.g.b.x.f(cuVar, NotificationCompat.CATEGORY_EVENT);
        this.f21372h.c(cuVar);
    }
}
