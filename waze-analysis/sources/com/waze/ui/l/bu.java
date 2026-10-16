package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bu extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f42618b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cg f42619c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ba f42620d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ba f42621e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Animatable f42622f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f42623g;

    /* renamed from: h, reason: collision with root package name */
    private /* synthetic */ Object f42624h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bu(boolean z, cg cgVar, ba baVar, ba baVar2, Animatable animatable, r rVar, h.c.e eVar) {
        super(2, eVar);
        this.f42618b = z;
        this.f42619c = cgVar;
        this.f42620d = baVar;
        this.f42621e = baVar2;
        this.f42622f = animatable;
        this.f42623g = rVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bu buVar = new bu(this.f42618b, this.f42619c, this.f42620d, this.f42621e, this.f42622f, this.f42623g, eVar);
        buVar.f42624h = obj;
        return buVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bu) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (com.waze.ui.l.cg.C(r11.f42620d, 0.8f, r11) != r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.f42617a
            r2 = 1
            if (r1 == 0) goto L17
            java.lang.Object r3 = r11.f42624h
            if (r1 == r2) goto L11
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r12)
            goto L46
        L11:
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            e.b.c.b(r12)
            goto L32
        L17:
            e.b.c.b(r12)
            java.lang.Object r12 = r11.f42624h
            r3 = r12
            kotlinx.coroutines.af r3 = (kotlinx.coroutines.af) r3
            boolean r12 = r11.f42618b
            if (r12 == 0) goto L46
            r12 = r11
            h.c.e r12 = (h.c.e) r12
            r11.f42624h = r3
            r11.f42617a = r2
            r4 = 50
            java.lang.Object r12 = kotlinx.coroutines.aj.q(r4, r12)
            if (r12 == r0) goto L45
        L32:
            com.waze.ui.l.ba r12 = r11.f42620d
            r1 = r11
            h.c.e r1 = (h.c.e) r1
            r11.f42624h = r3
            r4 = 2
            r11.f42617a = r4
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            java.lang.Object r12 = com.waze.ui.l.cg.C(r12, r4, r1)
            if (r12 != r0) goto L46
        L45:
            return r0
        L46:
            com.waze.ui.l.ba r5 = r11.f42621e
            com.waze.ui.l.ad r12 = r5.j()
            if (r12 == 0) goto L4f
            goto L50
        L4f:
            r2 = 0
        L50:
            androidx.compose.animation.core.Animatable r12 = r11.f42622f
            com.waze.ui.l.cg r0 = r11.f42619c
            com.waze.ui.l.bt r1 = new com.waze.ui.l.bt
            r10 = 0
            r1.<init>(r2, r12, r0, r10)
            h.g.a.p r1 = (h.g.a.p) r1
            r12 = 3
            kotlinx.coroutines.aj.z(r3, r10, r10, r1, r12)
            com.waze.ui.l.r r6 = r11.f42623g
            com.waze.ui.l.br r4 = new com.waze.ui.l.br
            r8 = 5
            r9 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            h.g.a.p r4 = (h.g.a.p) r4
            kotlinx.coroutines.aj.z(r3, r10, r10, r4, r12)
            h.ab r11 = h.ab.f48028a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.bu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
