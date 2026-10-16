package com.waze.bw.b.a;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements p {

    /* renamed from: a, reason: collision with root package name */
    private final q f17719a;

    /* renamed from: b, reason: collision with root package name */
    private final k f17720b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f17721c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f17722d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f17723e;

    public t(q qVar, k kVar, com.waze.shared_infra.q.e eVar) {
        x.f(qVar, "config");
        x.f(kVar, "routeDurationApi");
        x.f(eVar, "wazeClock");
        this.f17719a = qVar;
        this.f17720b = kVar;
        this.f17721c = eVar;
        bn bnVarB = ck.b(null);
        this.f17722d = bnVarB;
        this.f17723e = ai.U(bnVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.waze.sharedui.e.c r18, java.util.List r19, h.c.e r20) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.b.a.t.e(com.waze.sharedui.e.c, java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.bw.b.a.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.sharedui.e.c r5, java.util.List r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.bw.b.a.s
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.bw.b.a.s r0 = (com.waze.bw.b.a.s) r0
            int r1 = r0.f17717c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17717c = r1
            goto L18
        L13:
            com.waze.bw.b.a.s r0 = new com.waze.bw.b.a.s
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f17715a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f17717c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.sharedui.e.c r5 = r0.f17718d
            r6 = r5
            com.waze.sharedui.e.c r6 = (com.waze.sharedui.e.c) r6
            e.b.c.b(r7)
            goto L41
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r7)
            r0.f17718d = r5
            r0.f17717c = r3
            java.lang.Object r7 = r4.e(r5, r6, r0)
            if (r7 == r1) goto L88
        L41:
            kotlinx.coroutines.b.bn r6 = r4.f17722d
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = 10
            int r0 = h.a.i.q(r7, r0)
            int r0 = h.a.r.a(r0)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 16
            int r0 = h.k.n.h(r0, r2)
            r1.<init>(r0)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Iterator r7 = r7.iterator()
        L62:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r7.next()
            r2 = r0
            com.waze.bw.b.a.f r2 = (com.waze.bw.b.a.f) r2
            java.lang.String r2 = r2.d()
            r1.put(r2, r0)
            goto L62
        L77:
            com.waze.shared_infra.q.e r4 = r4.f17721c
            long r2 = r4.a()
            com.waze.bw.b.a.o r4 = new com.waze.bw.b.a.o
            r4.<init>(r1, r5, r2)
            r6.e(r4)
            h.ab r4 = h.ab.f48028a
            return r4
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.b.a.t.a(com.waze.sharedui.e.c, java.util.List, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // com.waze.bw.b.a.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.sharedui.e.c r8, java.util.List r9, h.c.e r10) {
        /*
            r7 = this;
            kotlinx.coroutines.b.bn r0 = r7.f17722d
            java.lang.Object r0 = r0.d()
            com.waze.bw.b.a.o r0 = (com.waze.bw.b.a.o) r0
            if (r0 != 0) goto Lb
            goto L49
        Lb:
            com.waze.sharedui.e.c r1 = r0.b()
            com.waze.shared_infra.h.c r1 = r1.f()
            com.waze.shared_infra.h.c r2 = r8.f()
            double r1 = com.waze.sharedui.utils.f.a(r1, r2)
            com.waze.shared_infra.q.e r3 = r7.f17721c
            long r3 = r3.a()
            long r5 = r0.a()
            long r3 = r3 - r5
            com.waze.bw.b.a.q r0 = r7.f17719a
            long r5 = r0.a()
            double r5 = (double) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L52
            h.o.c r1 = h.o.a.f48264a
            h.o.d r1 = h.o.d.f48272c
            long r1 = h.o.c.j(r3, r1)
            long r3 = r0.b()
            h.o.d r0 = h.o.d.f48273d
            long r3 = h.o.c.j(r3, r0)
            int r0 = h.o.a.c(r1, r3)
            if (r0 <= 0) goto L52
        L49:
            java.lang.Object r7 = r7.a(r8, r9, r10)
            h.c.a.a r8 = h.c.a.a.f48038a
            if (r7 != r8) goto L52
            return r7
        L52:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.b.a.t.b(com.waze.sharedui.e.c, java.util.List, h.c.e):java.lang.Object");
    }

    @Override // com.waze.bw.b.a.p
    public final ch c() {
        return this.f17723e;
    }
}
