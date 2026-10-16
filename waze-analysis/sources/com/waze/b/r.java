package com.waze.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r implements o {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.f.f f16165b;

    public r(com.waze.sharedui.f.f fVar) {
        h.g.b.x.f(fVar, "elementSender");
        this.f16165b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.b.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.shared_infra.q.i r7, com.waze.sharedui.e.c r8, h.c.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.waze.b.p
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.b.p r0 = (com.waze.b.p) r0
            int r1 = r0.f16161c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16161c = r1
            goto L18
        L13:
            com.waze.b.p r0 = new com.waze.b.p
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f16159a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16161c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r9)
            goto L8e
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r9)
            i.b.p r9 = i.b.s.newBuilder()
            com.waze.shared_infra.h.c r2 = r8.f()
            int r2 = r2.c()
            r9.a(r2)
            com.waze.shared_infra.h.c r8 = r8.f()
            int r8 = r8.d()
            r9.b(r8)
            com.google.v.du r8 = r9.build()
            java.lang.String r9 = "build(...)"
            h.g.b.x.e(r8, r9)
            i.b.s r8 = (i.b.s) r8
            i.b.l.ip r2 = i.b.l.iq.newBuilder()
            long r4 = r7.b()
            r2.a(r4)
            r2.b(r8)
            com.google.v.du r7 = r2.build()
            h.g.b.x.e(r7, r9)
            i.b.l.iq r7 = (i.b.l.iq) r7
            i.b.l.cc r8 = com.waze.sharedui.api.c.a()
            r8.y(r7)
            com.google.v.du r7 = r8.build()
            h.g.b.x.e(r7, r9)
            i.b.l.cd r7 = (i.b.l.cd) r7
            com.waze.sharedui.f.f r6 = r6.f16165b
            int r8 = com.waze.a.a.f13571a
            com.waze.sharedui.f.d r8 = com.waze.a.a.a()
            r0.f16161c = r3
            java.lang.Object r9 = r6.a(r8, r7, r0)
            if (r9 == r1) goto Lba
        L8e:
            java.lang.String r6 = "sendElementExceptionally(...)"
            h.g.b.x.e(r9, r6)
            i.b.l.is r9 = (i.b.l.is) r9
            com.waze.b.m r6 = new com.waze.b.m
            boolean r7 = r9.hasIsAadcRestricted()
            r8 = 0
            if (r7 == 0) goto La7
            boolean r7 = r9.getIsAadcRestricted()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto La8
        La7:
            r7 = r8
        La8:
            boolean r0 = r9.hasIsU16Restricted()
            if (r0 == 0) goto Lb6
            boolean r8 = r9.getIsU16Restricted()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        Lb6:
            r6.<init>(r7, r8)
            return r6
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.b.r.a(com.waze.shared_infra.q.i, com.waze.sharedui.e.c, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.b.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.shared_infra.q.i r7, boolean r8, h.c.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.waze.b.q
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.b.q r0 = (com.waze.b.q) r0
            int r1 = r0.f16164c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16164c = r1
            goto L18
        L13:
            com.waze.b.q r0 = new com.waze.b.q
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f16162a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f16164c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r9)
            goto L83
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r9)
            i.b.u.u r9 = i.b.u.v.newBuilder()
            java.lang.String r2 = "newBuilder(...)"
            h.g.b.x.e(r9, r2)
            long r4 = r7.b()
            r9.a(r4)
            if (r8 == 0) goto L47
            r9.b()
        L47:
            i.b.u.n r7 = i.b.u.o.newBuilder()
            i.b.u.r r8 = i.b.u.s.newBuilder()
            r8.a(r9)
            r7.a(r8)
            java.lang.String r8 = "setRequest(...)"
            h.g.b.x.e(r7, r8)
            i.b.l.cc r8 = com.waze.sharedui.api.c.a()
            com.google.v.du r7 = r7.build()
            i.b.u.o r7 = (i.b.u.o) r7
            r8.W(r7)
            com.google.v.du r7 = r8.build()
            java.lang.String r8 = "build(...)"
            h.g.b.x.e(r7, r8)
            i.b.l.cd r7 = (i.b.l.cd) r7
            com.waze.sharedui.f.f r6 = r6.f16165b
            int r8 = com.waze.a.a.f13571a
            com.waze.sharedui.f.d r8 = com.waze.a.a.b()
            r0.f16164c = r3
            java.lang.Object r9 = r6.a(r8, r7, r0)
            if (r9 != r1) goto L83
            return r1
        L83:
            java.lang.String r6 = "sendElementExceptionally(...)"
            h.g.b.x.e(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.b.r.b(com.waze.shared_infra.q.i, boolean, h.c.e):java.lang.Object");
    }
}
