package com.waze.location.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25195a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f25196b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25197c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25197c = i2;
        this.f25196b = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f25197c != 0 ? new f(this.f25196b, eVar, 1, null) : new f(this.f25196b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f25197c != 0 ? ((f) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((f) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (com.waze.sound.co.d(r4.f25196b.f25200c, com.waze.sound.ck.O, r4) == r0) goto L26;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f25197c
            r1 = 1
            if (r0 == 0) goto L2b
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r4.f25195a
            if (r2 == 0) goto Lf
            e.b.c.b(r5)
            goto L28
        Lf:
            e.b.c.b(r5)
            com.waze.location.a.g r5 = r4.f25196b
            com.waze.sound.d.a r2 = com.waze.location.a.g.b(r5)
            java.lang.String r5 = com.waze.location.a.g.c(r5)
            r3 = r4
            h.c.e r3 = (h.c.e) r3
            r4.f25195a = r1
            java.lang.Object r4 = r2.a(r5, r3)
            if (r4 != r0) goto L28
            return r0
        L28:
            h.ab r4 = h.ab.f48028a
            return r4
        L2b:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r4.f25195a
            if (r2 == 0) goto L3b
            if (r2 == r1) goto L37
            e.b.c.b(r5)
            goto L70
        L37:
            e.b.c.b(r5)
            goto L53
        L3b:
            e.b.c.b(r5)
            com.waze.location.a.g r5 = r4.f25196b
            com.waze.sound.d.a r2 = com.waze.location.a.g.b(r5)
            java.lang.String r5 = com.waze.location.a.g.c(r5)
            r3 = r4
            h.c.e r3 = (h.c.e) r3
            r4.f25195a = r1
            java.lang.Object r5 = r2.b(r5, r3)
            if (r5 == r0) goto L73
        L53:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L70
            com.waze.location.a.g r5 = r4.f25196b
            com.waze.sound.co r5 = com.waze.location.a.g.a(r5)
            com.waze.sound.ck r1 = com.waze.sound.ck.O
            r2 = r4
            h.c.e r2 = (h.c.e) r2
            r3 = 2
            r4.f25195a = r3
            java.lang.Object r4 = com.waze.sound.co.d(r5, r1, r2)
            if (r4 != r0) goto L70
            goto L73
        L70:
            h.ab r4 = h.ab.f48028a
            return r4
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f25197c = i2;
        this.f25196b = gVar;
    }
}
