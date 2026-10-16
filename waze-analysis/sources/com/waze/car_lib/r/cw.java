package com.waze.car_lib.r;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21239a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f21240b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CarContext f21241c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f21242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cw(de deVar, CarContext carContext, h.c.e eVar) {
        super(2, eVar);
        this.f21240b = deVar;
        this.f21241c = carContext;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        cw cwVar = new cw(this.f21240b, this.f21241c, eVar);
        cwVar.f21242d = obj;
        return cwVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cw) create((kotlinx.coroutines.a.ad) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        if (kotlinx.coroutines.a.ab.a(r3, new com.waze.car_lib.ar(r2, r5, 6), r10) == r0) goto L16;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r10.f21239a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            e.b.c.b(r11)
            goto L7e
        Ld:
            java.lang.Object r1 = r10.f21242d
            kotlinx.coroutines.a.ad r1 = (kotlinx.coroutines.a.ad) r1
            e.b.c.b(r11)
            goto L37
        L15:
            e.b.c.b(r11)
            java.lang.Object r11 = r10.f21242d
            r1 = r11
            kotlinx.coroutines.a.ad r1 = (kotlinx.coroutines.a.ad) r1
            com.waze.car_lib.r.de r11 = r10.f21240b
            com.waze.shared_infra.i.e r3 = com.waze.car_lib.r.de.f(r11)
            java.lang.String r4 = "initialize"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.a(r4)
            r3 = r10
            h.c.e r3 = (h.c.e) r3
            r10.f21242d = r1
            r10.f21239a = r2
            java.lang.Object r11 = com.waze.car_lib.r.de.j(r11, r1, r3)
            if (r11 == r0) goto L81
        L37:
            r3 = r1
            r5 = r11
            com.waze.t.b.h r5 = (com.waze.t.b.h) r5
            if (r5 == 0) goto L7e
            r11 = r3
            kotlinx.coroutines.af r11 = (kotlinx.coroutines.af) r11
            com.waze.car_lib.r.de r2 = r10.f21240b
            com.waze.car_lib.r.as r1 = new com.waze.car_lib.r.as
            r4 = 4
            r8 = 0
            r1.<init>(r2, r5, r8, r4)
            h.g.a.p r1 = (h.g.a.p) r1
            r9 = 3
            kotlinx.coroutines.aj.z(r11, r8, r8, r1, r9)
            androidx.car.app.CarContext r4 = r10.f21241c
            com.waze.car_lib.r.ed r1 = new com.waze.car_lib.r.ed
            r6 = 0
            r7 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            h.g.a.p r1 = (h.g.a.p) r1
            kotlinx.coroutines.aj.z(r11, r8, r8, r1, r9)
            com.waze.car_lib.r.j r1 = new com.waze.car_lib.r.j
            r4 = 12
            r1.<init>(r2, r8, r4)
            h.g.a.p r1 = (h.g.a.p) r1
            kotlinx.coroutines.aj.z(r11, r8, r8, r1, r9)
            com.waze.car_lib.ar r11 = new com.waze.car_lib.ar
            r1 = 6
            r11.<init>(r2, r5, r1)
            r1 = r10
            h.c.e r1 = (h.c.e) r1
            r10.f21242d = r8
            r2 = 2
            r10.f21239a = r2
            java.lang.Object r10 = kotlinx.coroutines.a.ab.a(r3, r11, r1)
            if (r10 != r0) goto L7e
            goto L81
        L7e:
            h.ab r10 = h.ab.f48028a
            return r10
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.cw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
