package com.waze.parking;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.map.b.dm;
import com.waze.map.b.ed;
import com.waze.navigate.fk;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.a.e f33003a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.e.g f33004b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ah.b f33005c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.af.e f33006d;

    /* renamed from: e, reason: collision with root package name */
    private final fk f33007e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f33008f;

    /* renamed from: g, reason: collision with root package name */
    private final ed f33009g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f33010h;

    /* renamed from: i, reason: collision with root package name */
    private final ch f33011i;

    public y(s sVar, com.waze.map.a.e eVar, com.waze.sharedui.e.g gVar, com.waze.ah.b bVar, com.waze.af.e eVar2, fk fkVar, com.waze.shared_infra.i.e eVar3) {
        h.g.b.x.f(sVar, "args");
        h.g.b.x.f(eVar, "locationPickerStateHolder");
        h.g.b.x.f(gVar, "userLocationService");
        h.g.b.x.f(bVar, "reverseGeocodingService");
        h.g.b.x.f(eVar2, "formatterService");
        h.g.b.x.f(fkVar, "parkedHereRepository");
        h.g.b.x.f(eVar3, "logger");
        this.f33003a = eVar;
        this.f33004b = gVar;
        this.f33005c = bVar;
        this.f33006d = eVar2;
        this.f33007e = fkVar;
        this.f33008f = eVar3;
        ed edVarA = eVar.a();
        this.f33009g = edVarA;
        bn bnVarB = ck.b(new r(eVar.a(), false, com.waze.places.d.f33105a));
        this.f33010h = bnVarB;
        this.f33011i = ai.U(bnVarB);
        if (sVar.a() == null) {
            i(sVar.b(), 0.0f);
            return;
        }
        addCloseable(new com.waze.main.navigate.f(sVar.a().p(edVarA), 3));
        com.waze.shared_infra.h.c cVarB = sVar.b();
        dm dmVar = (dm) sVar.a().i().d();
        i(cVarB, dmVar != null ? dmVar.b() : 0.0f);
    }

    private final void i(com.waze.shared_infra.h.c cVar, float f2) {
        this.f33008f.a("start(originalParking:" + cVar + ", initialOrientation:" + f2 + ")");
        com.waze.map.a.e eVar = this.f33003a;
        eVar.e(cVar, f2);
        addCloseable((AutoCloseable) eVar);
        y yVar = this;
        aj.z(ViewModelKt.getViewModelScope(yVar), null, null, new t(this, (h.c.e) null, 2, (byte[]) null), 3);
        aj.z(ViewModelKt.getViewModelScope(yVar), null, null, new t(this, (h.c.e) null, 3, (char[]) null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(h.c.e r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.waze.parking.u
            if (r0 == 0) goto L13
            r0 = r12
            com.waze.parking.u r0 = (com.waze.parking.u) r0
            int r1 = r0.f32996c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32996c = r1
            goto L18
        L13:
            com.waze.parking.u r0 = new com.waze.parking.u
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f32994a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32996c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r12)
            goto L7a
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            e.b.c.b(r12)
            com.waze.map.a.e r12 = r11.f33003a
            com.waze.shared_infra.i.e r2 = r11.f33008f
            com.waze.shared_infra.h.c r12 = r12.b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "saveBeforeExit viewportCenter("
            r4.<init>(r5)
            r4.append(r12)
            java.lang.String r5 = ")"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.a(r4)
            if (r12 != 0) goto L5a
            r11 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L5a:
            com.waze.navigate.fk r4 = r11.f33007e
            int r5 = r12.d()
            int r6 = r12.c()
            java.lang.String r9 = ""
            r10 = 0
            r7 = 0
            com.waze.shared_infra.s.c r11 = r4.setParking(r5, r6, r7, r9, r10)
            kotlinx.coroutines.am r11 = r11.a()
            r0.f32996c = r3
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.parking.y.e(h.c.e):java.lang.Object");
    }

    public final ch g() {
        return this.f33011i;
    }

    public final void h() {
        this.f33008f.a("recenterOnUserLocation");
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new t(this, (h.c.e) null, 0), 3);
    }
}
