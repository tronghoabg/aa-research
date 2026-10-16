package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bv extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42625a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f42626b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cg f42627c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ba f42628d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Animatable f42629e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ba f42630f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ aa f42631g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bv(boolean z, cg cgVar, ba baVar, Animatable animatable, ba baVar2, aa aaVar, h.c.e eVar) {
        super(2, eVar);
        this.f42626b = z;
        this.f42627c = cgVar;
        this.f42628d = baVar;
        this.f42629e = animatable;
        this.f42630f = baVar2;
        this.f42631g = aaVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bv(this.f42626b, this.f42627c, this.f42628d, this.f42629e, this.f42630f, this.f42631g, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bv) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (com.waze.ui.l.ba.H(r7.f42630f, r7.f42631g, new com.waze.ui.l.ci(), com.waze.ui.l.l.d(), r7, 8) != r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.f42625a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L13
            e.b.c.b(r8)
            goto L79
        L13:
            e.b.c.b(r8)
            goto L57
        L17:
            e.b.c.b(r8)
            goto L44
        L1b:
            e.b.c.b(r8)
            goto L34
        L1f:
            e.b.c.b(r8)
            boolean r8 = r7.f42626b
            if (r8 != 0) goto L44
            r8 = r7
            h.c.e r8 = (h.c.e) r8
            r7.f42625a = r4
            r4 = 50
            java.lang.Object r8 = kotlinx.coroutines.aj.q(r4, r8)
            if (r8 != r0) goto L34
            goto L7c
        L34:
            com.waze.ui.l.ba r8 = r7.f42628d
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.f42625a = r3
            r3 = 1060320051(0x3f333333, float:0.7)
            java.lang.Object r8 = com.waze.ui.l.cg.C(r8, r3, r1)
            if (r8 == r0) goto L7c
        L44:
            androidx.compose.animation.core.Animatable r8 = r7.f42629e
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            r3 = r7
            h.c.e r3 = (h.c.e) r3
            r7.f42625a = r2
            java.lang.Object r8 = r8.snapTo(r1, r3)
            if (r8 == r0) goto L7c
        L57:
            com.waze.ui.l.ba r1 = r7.f42630f
            com.waze.ui.l.aa r8 = r7.f42631g
            r2 = r8
            com.waze.ui.l.ad r2 = (com.waze.ui.l.ad) r2
            com.waze.ui.l.ci r8 = new com.waze.ui.l.ci
            r8.<init>()
            r3 = r8
            com.waze.ui.l.ck r3 = (com.waze.ui.l.ck) r3
            float r4 = com.waze.ui.l.l.d()
            r5 = r7
            h.c.e r5 = (h.c.e) r5
            r8 = 4
            r7.f42625a = r8
            r6 = 8
            java.lang.Object r7 = com.waze.ui.l.ba.H(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L79
            goto L7c
        L79:
            h.ab r7 = h.ab.f48028a
            return r7
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.bv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
