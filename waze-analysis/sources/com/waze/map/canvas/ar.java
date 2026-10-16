package com.waze.map.canvas;

import com.waze.map.b.ed;
import com.waze.map.gb;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28544a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ed f28545b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28546c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ gb f28547d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bi f28548e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.n.c f28549f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(ed edVar, gb gbVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, com.waze.shared_infra.n.c cVar, bi biVar, h.c.e eVar) {
        super(2, eVar);
        this.f28545b = edVar;
        this.f28547d = gbVar;
        this.f28546c = mainCanvasDelegatorImpl;
        this.f28549f = cVar;
        this.f28548e = biVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ar(this.f28545b, this.f28547d, this.f28546c, this.f28549f, this.f28548e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (r6.f28548e.a(r6) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f28544a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 == r2) goto L11
            e.b.c.b(r7)
            goto La8
        L11:
            e.b.c.b(r7)
            goto L6f
        L15:
            e.b.c.b(r7)
            goto L4e
        L19:
            e.b.c.b(r7)
            com.waze.map.b.ed r7 = r6.f28545b
            com.waze.map.gb r1 = r6.f28547d
            com.waze.map.canvas.MainCanvasDelegatorImpl r4 = r6.f28546c
            com.waze.map.cd r5 = com.waze.map.canvas.MainCanvasDelegatorImpl.t(r4)
            r7.B(r1, r5)
            com.waze.shared_infra.i.e r7 = r4.a()
            java.lang.String r4 = "waiting for presenting canvas"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7.a(r4)
            kotlinx.coroutines.b.ch r7 = r1.n()
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.map.canvas.aq r1 = new com.waze.map.canvas.aq
            r4 = 0
            r1.<init>(r4)
            h.g.a.p r1 = (h.g.a.p) r1
            r4 = r6
            h.c.e r4 = (h.c.e) r4
            r6.f28544a = r3
            java.lang.Object r7 = kotlinx.coroutines.b.ai.i(r7, r1, r4)
            if (r7 != r0) goto L4e
            goto Lbf
        L4e:
            com.waze.map.canvas.MainCanvasDelegatorImpl r7 = r6.f28546c
            com.waze.shared_infra.i.e r7 = r7.a()
            java.lang.String r1 = "canvas ready for presenting"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r7.a(r1)
            com.waze.shared_infra.n.c r7 = r6.f28549f
            com.waze.map.b.d r1 = com.waze.map.b.d.f28177c
            r7.g(r1)
            com.waze.map.canvas.bi r7 = r6.f28548e
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r6.f28544a = r2
            java.lang.Object r7 = r7.d(r1)
            if (r7 == r0) goto Lbf
        L6f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            com.waze.map.canvas.MainCanvasDelegatorImpl r1 = r6.f28546c
            if (r7 != 0) goto L8e
            com.waze.shared_infra.i.e r7 = r1.a()
            java.lang.String r0 = "failed to start swapping"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.b(r0)
            com.waze.shared_infra.n.c r6 = r6.f28549f
            com.waze.map.b.d r7 = com.waze.map.b.d.f28175a
            r6.g(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        L8e:
            com.waze.shared_infra.i.e r7 = r1.a()
            java.lang.String r1 = "waiting for canvas to be swapped with main canvas"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r7.a(r1)
            com.waze.map.canvas.bi r7 = r6.f28548e
            r1 = r6
            h.c.e r1 = (h.c.e) r1
            r2 = 3
            r6.f28544a = r2
            java.lang.Object r7 = r7.a(r1)
            if (r7 != r0) goto La8
            goto Lbf
        La8:
            com.waze.map.canvas.MainCanvasDelegatorImpl r7 = r6.f28546c
            com.waze.shared_infra.i.e r7 = r7.a()
            java.lang.String r0 = "canvas swap animation DONE. swapped canvas is now showing on screen"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.a(r0)
            com.waze.shared_infra.n.c r6 = r6.f28549f
            com.waze.map.b.d r7 = com.waze.map.b.d.f28178d
            r6.g(r7)
            h.ab r6 = h.ab.f48028a
            return r6
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.canvas.ar.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
