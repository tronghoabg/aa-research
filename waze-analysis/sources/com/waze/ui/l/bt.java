package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bt extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42613a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f42614b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Animatable f42615c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cg f42616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bt(boolean z, Animatable animatable, cg cgVar, h.c.e eVar) {
        super(2, eVar);
        this.f42614b = z;
        this.f42615c = animatable;
        this.f42616d = cgVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bt(this.f42614b, this.f42615c, this.f42616d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bt) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r3.snapTo(new java.lang.Float(1.0f), r11) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r3, new java.lang.Float(1.0f), r11.f42616d.f42676c, null, null, r11, 12, null) == r0) goto L12;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.f42613a
            r2 = 1
            if (r1 == 0) goto Lb
            e.b.c.b(r12)
            goto L44
        Lb:
            e.b.c.b(r12)
            boolean r12 = r11.f42614b
            androidx.compose.animation.core.Animatable r3 = r11.f42615c
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L32
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r1)
            com.waze.ui.l.cg r12 = r11.f42616d
            androidx.compose.animation.core.AnimationSpec r5 = com.waze.ui.l.cg.c(r12)
            r8 = r11
            h.c.e r8 = (h.c.e) r8
            r11.f42613a = r2
            r9 = 12
            r10 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L44
            goto L43
        L32:
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r1)
            r1 = r11
            h.c.e r1 = (h.c.e) r1
            r2 = 2
            r11.f42613a = r2
            java.lang.Object r11 = r3.snapTo(r12, r1)
            if (r11 != r0) goto L44
        L43:
            return r0
        L44:
            h.ab r11 = h.ab.f48028a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.l.bt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
