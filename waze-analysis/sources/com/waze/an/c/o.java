package com.waze.an.c;

import com.waze.ui.l.cg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f14792a;

    /* renamed from: b, reason: collision with root package name */
    int f14793b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.a.o f14794c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cg f14795d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.k.a.u f14796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(kotlinx.coroutines.a.o oVar, cg cgVar, com.waze.main_screen.k.a.u uVar, h.c.e eVar) {
        super(2, eVar);
        this.f14794c = oVar;
        this.f14795d = cgVar;
        this.f14796e = uVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new o(this.f14794c, this.f14795d, this.f14796e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r5.k(r6, r7, r13.b(), r13.c(), r10, r12) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:7:0x0012). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r12.f14793b
            r2 = 1
            java.lang.String r3 = "InsightState"
            if (r1 == 0) goto L1b
            java.lang.Object r4 = r12.f14792a
            if (r1 == r2) goto L15
            kotlinx.coroutines.a.q r4 = (kotlinx.coroutines.a.q) r4
            e.b.c.b(r13)
        L12:
            r13 = r4
            goto La2
        L15:
            kotlinx.coroutines.a.q r4 = (kotlinx.coroutines.a.q) r4
            e.b.c.b(r13)
            goto L33
        L1b:
            e.b.c.b(r13)
            kotlinx.coroutines.a.o r13 = r12.f14794c
            kotlinx.coroutines.a.q r13 = r13.p()
        L24:
            r1 = r12
            h.c.e r1 = (h.c.e) r1
            r12.f14792a = r13
            r12.f14793b = r2
            java.lang.Object r1 = r13.a(r1)
            if (r1 == r0) goto Lb4
            r4 = r13
            r13 = r1
        L33:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lb1
            java.lang.Object r13 = r4.b()
            com.waze.main_screen.k.a.b r13 = (com.waze.main_screen.k.a.b) r13
            java.util.List r1 = r13.a()
            r5 = 0
            java.lang.Object r1 = h.a.i.S(r1, r5)
            r6 = r1
            com.waze.ui.l.ad r6 = (com.waze.ui.l.ad) r6
            java.util.List r1 = r13.a()
            java.lang.Object r1 = h.a.i.S(r1, r2)
            r7 = r1
            com.waze.ui.l.ad r7 = (com.waze.ui.l.ad) r7
            com.waze.ui.l.cg r5 = r12.f14795d
            boolean r1 = r5.y()
            if (r1 == 0) goto L85
            java.lang.String r1 = "-----------Update received from channel---------"
            android.util.Log.d(r3, r1)
            java.util.Objects.toString(r6)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "point: "
            java.lang.String r1 = r8.concat(r1)
            android.util.Log.w(r3, r1)
            java.util.Objects.toString(r7)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "segment: "
            java.lang.String r1 = r8.concat(r1)
            android.util.Log.w(r3, r1)
        L85:
            com.waze.main_screen.k.a.u r1 = r12.f14796e
            boolean r10 = r1.l()
            boolean r8 = r13.b()
            boolean r9 = r13.c()
            r11 = r12
            h.c.e r11 = (h.c.e) r11
            r12.f14792a = r4
            r13 = 2
            r12.f14793b = r13
            java.lang.Object r13 = r5.k(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L12
            goto Lb4
        La2:
            com.waze.ui.l.cg r1 = r12.f14795d
            boolean r1 = r1.y()
            if (r1 == 0) goto L24
            java.lang.String r1 = "----------Animation done. Ready for next update---------"
            android.util.Log.d(r3, r1)
            goto L24
        Lb1:
            h.ab r12 = h.ab.f48028a
            return r12
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.an.c.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
