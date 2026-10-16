package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bs extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42605a;

    /* renamed from: b, reason: collision with root package name */
    int f42606b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba f42607c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cg f42608d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ba f42609e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ad f42610f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Animatable f42611g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f42612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bs(ba baVar, cg cgVar, ba baVar2, ad adVar, Animatable animatable, h.c.e eVar) {
        super(2, eVar);
        this.f42607c = baVar;
        this.f42608d = cgVar;
        this.f42609e = baVar2;
        this.f42610f = adVar;
        this.f42611g = animatable;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bs bsVar = new bs(this.f42607c, this.f42608d, this.f42609e, this.f42610f, this.f42611g, eVar);
        bsVar.f42612h = obj;
        return bsVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bs) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r2.snapTo(new java.lang.Float(0.5f), r7) == r0) goto L28;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f42606b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto Lf
            e.b.c.b(r8)
            goto L82
        Lf:
            int r1 = r7.f42605a
            java.lang.Object r3 = r7.f42612h
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r8)
            goto L40
        L19:
            e.b.c.b(r8)
            java.lang.Object r8 = r7.f42612h
            kotlinx.coroutines.af r8 = (kotlinx.coroutines.af) r8
            com.waze.ui.l.ba r1 = r7.f42607c
            com.waze.ui.l.ad r1 = r1.j()
            if (r1 != 0) goto L2a
            r1 = r3
            goto L2b
        L2a:
            r1 = r2
        L2b:
            com.waze.ui.l.ba r4 = r7.f42609e
            r5 = r7
            h.c.e r5 = (h.c.e) r5
            r7.f42612h = r8
            r7.f42605a = r1
            r7.f42606b = r3
            r3 = 1060320051(0x3f333333, float:0.7)
            java.lang.Object r3 = com.waze.ui.l.cg.C(r4, r3, r5)
            if (r3 == r0) goto L85
            r3 = r8
        L40:
            com.waze.ui.l.ba r8 = r7.f42607c
            com.waze.ui.l.ad r4 = r7.f42610f
            com.waze.ui.l.br r5 = new com.waze.ui.l.br
            r6 = 0
            r5.<init>(r8, r4, r6, r2)
            h.g.a.p r5 = (h.g.a.p) r5
            r8 = 3
            kotlinx.coroutines.aj.z(r3, r6, r6, r5, r8)
            boolean r2 = r4 instanceof com.waze.ui.l.ab
            if (r2 != 0) goto L82
            boolean r2 = r4 instanceof com.waze.ui.l.t
            if (r2 != 0) goto L82
            boolean r2 = r4 instanceof com.waze.ui.l.aa
            if (r2 != 0) goto L82
            androidx.compose.animation.core.Animatable r2 = r7.f42611g
            r4 = 2
            if (r1 == 0) goto L76
            java.lang.Float r8 = new java.lang.Float
            r1 = 1056964608(0x3f000000, float:0.5)
            r8.<init>(r1)
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.f42612h = r6
            r7.f42606b = r4
            java.lang.Object r7 = r2.snapTo(r8, r1)
            if (r7 != r0) goto L82
            goto L85
        L76:
            com.waze.ui.l.cg r7 = r7.f42608d
            com.waze.ui.l.br r0 = new com.waze.ui.l.br
            r0.<init>(r2, r7, r6, r4)
            h.g.a.p r0 = (h.g.a.p) r0
            kotlinx.coroutines.aj.z(r3, r6, r6, r0, r8)
        L82:
            h.ab r7 = h.ab.f48028a
            return r7
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.bs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
