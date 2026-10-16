package com.waze.navigate.location_preview;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.TimeUnit;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.b.g f31746a;

    /* renamed from: b, reason: collision with root package name */
    private final bh f31747b;

    /* renamed from: c, reason: collision with root package name */
    private Long f31748c;

    public o(com.waze.navigate.b.g gVar, bh bhVar, p pVar) {
        h.g.b.x.f(gVar, "navigateStatsSender");
        h.g.b.x.f(bhVar, "statsSender");
        h.g.b.x.f(pVar, "locationPreviewConfig");
        this.f31746a = gVar;
        this.f31747b = bhVar;
    }

    public final void a(ay ayVar) {
        h.g.b.x.f(ayVar, "model");
        Long l2 = this.f31748c;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (ayVar.M()) {
                return;
            }
            com.waze.realtime_report_feedback.c cVarT = ayVar.T();
            h.g.b.x.f(cVarT, "<this>");
            if ((cVarT instanceof br) || (cVarT instanceof bq)) {
                return;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            this.f31747b.d((System.nanoTime() - jLongValue) / 1000000, ayVar.P(), bjz.MOBILE_ANDROID);
            this.f31748c = null;
        }
    }

    public final void b(ay ayVar) {
        h.g.b.x.f(ayVar, "location");
        this.f31747b.b(ayVar, bjz.MOBILE_ANDROID);
    }

    public final void c(ay ayVar) {
        f fVarM;
        f fVarM2;
        h.g.b.x.f(ayVar, "location");
        this.f31748c = Long.valueOf(System.nanoTime());
        a(ayVar);
        bb bbVar = ayVar.h() == com.waze.modules.navigation.ah.z ? bb.r : (ayVar.b() != 11 || (fVarM2 = ayVar.m()) == null || fVarM2.c()) ? (ayVar.b() == 11 && (fVarM = ayVar.m()) != null && fVarM.c()) ? bb.o : ayVar.b() == 11 ? bb.m : (ayVar.b() == 9 && ayVar.a() == 9) ? bb.f31620l : ayVar.N() ? bb.f31611c : ayVar.S() ? bb.f31612d : ayVar.b() == 5 ? bb.f31617i : (ayVar.b() == 20 || ayVar.n() != null) ? bb.f31610b : ayVar.b() == 7 ? bb.f31615g : ayVar.b() == 8 ? bb.f31618j : ayVar.b() == 13 ? bb.f31619k : bb.f31616h : bb.n;
        String strE = ayVar.E();
        Integer numValueOf = Integer.valueOf(ayVar.H().size());
        com.waze.ui.m.b bVarP = ayVar.p();
        String strB = bVarP != null ? bVarP.b() : null;
        com.waze.ui.m.b bVarP2 = ayVar.p();
        Boolean boolValueOf = bVarP2 != null ? Boolean.valueOf(bVarP2.m()) : null;
        com.waze.ui.m.b bVarP3 = ayVar.p();
        this.f31747b.e(bbVar, strE, numValueOf, strB, boolValueOf, bVarP3 != null ? bVarP3.h() : null, bjz.MOBILE_ANDROID);
    }

    public final void d() {
        this.f31747b.f();
    }

    public final void e(com.waze.ui.m.cb cbVar, ay ayVar) {
        h.g.b.x.f(cbVar, NotificationCompat.CATEGORY_EVENT);
        h.g.b.x.f(ayVar, "model");
        if (h.g.b.x.n(cbVar, com.waze.ui.m.ay.f42802a) && ayVar.b() == 11) {
            this.f31746a.a(com.waze.navigate.b.b.f31035h, null);
        }
        this.f31747b.a(cbVar, ayVar, bjz.MOBILE_ANDROID);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.waze.navigate.location_preview.ay r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.location_preview.o.f(com.waze.navigate.location_preview.ay):void");
    }
}
