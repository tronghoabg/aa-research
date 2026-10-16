package com.waze.ads.c;

import h.ab;
import h.g.a.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f13974a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f13975b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f13976c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(m mVar, h.c.e eVar) {
        super(4, eVar);
        this.f13976c = mVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj2).booleanValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        j jVar = new j(this.f13976c, (h.c.e) obj4);
        jVar.f13974a = (f) obj;
        jVar.f13975b = zBooleanValue;
        return jVar.invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r15)
            java.lang.Object r15 = r14.f13974a
            com.waze.ads.c.f r15 = (com.waze.ads.c.f) r15
            boolean r0 = r14.f13975b
            com.waze.ads.a.f r1 = r15.a()
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.String r3 = r1.l()
            r5 = r3
            goto L19
        L18:
            r5 = r2
        L19:
            if (r1 == 0) goto L27
            java.lang.String r3 = r1.j()
            if (r3 == 0) goto L27
            com.waze.ui.ac.g r4 = new com.waze.ui.ac.g
            r4.<init>(r3)
            goto L28
        L27:
            r4 = r2
        L28:
            r6 = r4
            com.waze.ui.ac.i r6 = (com.waze.ui.ac.i) r6
            if (r1 == 0) goto L60
            com.waze.ads.a.e r3 = r1.a()
            if (r3 == 0) goto L60
            int r3 = r3.ordinal()
            if (r3 == 0) goto L60
            r4 = 1
            if (r3 == r4) goto L5a
            r4 = 2
            if (r3 == r4) goto L55
            r4 = 3
            if (r3 == r4) goto L50
            r4 = 4
            if (r3 != r4) goto L4a
            com.waze.ui.a.n r3 = com.waze.ui.a.n.f41687a
            com.waze.ui.a.q r3 = (com.waze.ui.a.q) r3
            goto L5e
        L4a:
            h.i r14 = new h.i
            r14.<init>()
            throw r14
        L50:
            com.waze.ui.a.m r3 = com.waze.ui.a.m.f41686a
            com.waze.ui.a.q r3 = (com.waze.ui.a.q) r3
            goto L5e
        L55:
            com.waze.ui.a.p r3 = com.waze.ui.a.p.f41689a
            com.waze.ui.a.q r3 = (com.waze.ui.a.q) r3
            goto L5e
        L5a:
            com.waze.ui.a.o r3 = com.waze.ui.a.o.f41688a
            com.waze.ui.a.q r3 = (com.waze.ui.a.q) r3
        L5e:
            r7 = r3
            goto L61
        L60:
            r7 = r2
        L61:
            if (r1 == 0) goto L90
            java.lang.Float r3 = r1.c()
            if (r3 == 0) goto L90
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L76
            r3 = r2
        L76:
            if (r3 == 0) goto L90
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.String r8 = "0.0"
            r4.<init>(r8)
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r3)
            java.lang.String r3 = r4.format(r8)
            r8 = r3
            goto L91
        L90:
            r8 = r2
        L91:
            h.o.a r9 = r15.d()
            if (r1 == 0) goto La7
            java.lang.String r1 = r1.d()
            if (r1 == 0) goto La7
            com.waze.ads.c.m r14 = r14.f13976c
            com.waze.ads.b.a r14 = com.waze.ads.c.m.b(r14)
            java.lang.String r2 = r14.a(r1)
        La7:
            r10 = r2
            boolean r11 = r15.e()
            if (r0 == 0) goto Lb1
            com.waze.ui.a.r r14 = com.waze.ui.a.r.f41690a
            goto Lb3
        Lb1:
            com.waze.ui.a.s r14 = com.waze.ui.a.s.f41691a
        Lb3:
            com.waze.ui.a.t r14 = (com.waze.ui.a.t) r14
            r12 = r14
            com.waze.ui.a.u r4 = new com.waze.ui.a.u
            r13 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ads.c.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
