package com.waze.main_screen.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ak extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f26109a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26110b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.u f26111c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f26112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(h.c.e eVar, h.g.a.u uVar) {
        super(3, eVar);
        this.f26111c = uVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ak akVar = new ak((h.c.e) obj3, this.f26111c);
        akVar.f26112d = (kotlinx.coroutines.b.l) obj;
        akVar.f26110b = (Object[]) obj2;
        return akVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r1.emit(r14, r12) == r0) goto L14;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r13.f26109a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 == r3) goto Le
            e.b.c.b(r14)
            goto L52
        Le:
            java.lang.Object r1 = r13.f26112d
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            e.b.c.b(r14)
            r12 = r13
            goto L43
        L17:
            e.b.c.b(r14)
            java.lang.Object r14 = r13.f26112d
            r1 = r14
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1
            java.lang.Object r14 = r13.f26110b
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r4 = r13
            h.c.e r4 = (h.c.e) r4
            h.g.a.u r5 = r13.f26111c
            r4 = 0
            r6 = r14[r4]
            r7 = r14[r3]
            r8 = r14[r2]
            r4 = 3
            r9 = r14[r4]
            r4 = 4
            r10 = r14[r4]
            r4 = 5
            r11 = r14[r4]
            r13.f26112d = r1
            r13.f26109a = r3
            r12 = r13
            java.lang.Object r14 = r5.invoke(r6, r7, r8, r9, r10, r11, r12)
            if (r14 == r0) goto L55
        L43:
            r13 = r12
            h.c.e r13 = (h.c.e) r13
            r3 = 0
            r12.f26112d = r3
            r12.f26109a = r2
            java.lang.Object r13 = r1.emit(r14, r13)
            if (r13 != r0) goto L52
            goto L55
        L52:
            h.ab r13 = h.ab.f48028a
            return r13
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.c.ak.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
