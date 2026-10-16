package com.waze.sharedrive.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f38178a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f38179b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aq f38180c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f38181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aq aqVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f38181d = i2;
        this.f38180c = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f38181d != 0) {
            af afVar = new af(this.f38180c, eVar, 1, null);
            afVar.f38179b = obj;
            return afVar;
        }
        af afVar2 = new af(this.f38180c, eVar, 0);
        afVar2.f38179b = obj;
        return afVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f38181d != 0 ? ((af) create((String) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((af) create((q) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[RETURN] */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f38181d
            r1 = 1
            if (r0 == 0) goto L29
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r8.f38178a
            if (r2 == 0) goto Lf
            e.b.c.b(r9)
            goto L26
        Lf:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f38179b
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L26
            com.waze.sharedrive.d.aq r2 = r8.f38180c
            r3 = r8
            h.c.e r3 = (h.c.e) r3
            r8.f38178a = r1
            java.lang.Object r8 = com.waze.sharedrive.d.aq.c(r2, r9, r3)
            if (r8 != r0) goto L26
            return r0
        L26:
            h.ab r8 = h.ab.f48028a
            return r8
        L29:
            h.c.a.a r0 = h.c.a.a.f48038a
            int r2 = r8.f38178a
            if (r2 == 0) goto L33
            e.b.c.b(r9)
            goto L7c
        L33:
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f38179b
            r6 = r9
            com.waze.sharedrive.d.q r6 = (com.waze.sharedrive.d.q) r6
            if (r6 == 0) goto L89
            com.waze.sharedrive.c.a.l r9 = com.waze.sharedrive.g.bf.A(r6)
            if (r9 == 0) goto L89
            com.waze.sharedrive.c.a.q r9 = r9.c()
            java.lang.Object r9 = r9.b()
            com.waze.sharedrive.c.a.k r9 = (com.waze.sharedrive.c.a.k) r9
            boolean r4 = r9 instanceof com.waze.sharedrive.c.a.h
            if (r4 != 0) goto L65
            boolean r2 = r9 instanceof com.waze.sharedrive.c.a.j
            if (r2 == 0) goto L58
            com.waze.sharedrive.c.a.j r9 = (com.waze.sharedrive.c.a.j) r9
            goto L59
        L58:
            r9 = 0
        L59:
            r2 = 0
            if (r9 == 0) goto L63
            boolean r9 = r9.a()
            if (r9 != r1) goto L63
            goto L65
        L63:
            r3 = r2
            goto L66
        L65:
            r3 = r1
        L66:
            com.waze.sharedrive.d.aq r5 = r8.f38180c
            com.waze.sharedrive.d.ae r2 = new com.waze.sharedrive.d.ae
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            h.g.a.p r2 = (h.g.a.p) r2
            r9 = r8
            h.c.e r9 = (h.c.e) r9
            r8.f38178a = r1
            java.lang.Object r9 = kotlinx.coroutines.aj.O(r2, r9)
            if (r9 != r0) goto L7c
            return r0
        L7c:
            com.waze.sharedrive.d.aq r8 = r8.f38180c
            com.waze.shared_infra.i.e r8 = com.waze.sharedrive.d.aq.a(r8)
            java.lang.String r9 = "stopped updating background active drive data"
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r8.e(r9)
        L89:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.d.af.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aq aqVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f38181d = i2;
        this.f38180c = aqVar;
    }
}
