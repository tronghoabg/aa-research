package com.waze.a;

import com.waze.gp;
import i.b.ag;
import i.b.ah;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f13638a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f13639b;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("AadcAgeRequester");
        h.g.b.x.e(eVarD, "create(...)");
        f13639b = eVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.app_nav.hub.c.e r12, java.lang.Class r13, com.waze.uid.stats.b r14, com.waze.shared_infra.q.i r15, boolean r16, boolean r17, h.c.e r18) {
        /*
            r11 = this;
            r0 = r18
            java.lang.String r1 = "got birthdate="
            boolean r2 = r0 instanceof com.waze.a.d
            if (r2 == 0) goto L17
            r2 = r0
            com.waze.a.d r2 = (com.waze.a.d) r2
            int r3 = r2.f13618d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f13618d = r3
            goto L1c
        L17:
            com.waze.a.d r2 = new com.waze.a.d
            r2.<init>(r11, r0)
        L1c:
            java.lang.Object r11 = r2.f13616b
            h.c.a.a r0 = h.c.a.a.f48038a
            int r3 = r2.f13618d
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r12 = r2.f13615a
            com.waze.app_nav.hub.c.b r12 = (com.waze.app_nav.hub.c.b) r12
            e.b.c.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L70
        L2f:
            r0 = move-exception
            r11 = r0
            goto Lb2
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            e.b.c.b(r11)
            com.waze.shared_infra.i.e r11 = com.waze.a.h.f13639b
            java.lang.String r3 = "requesting age from user"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r11.e(r3)
            kotlinx.coroutines.CompletableDeferred r6 = kotlinx.coroutines.bo.j()
            com.waze.app_nav.hub.service.a r11 = new com.waze.app_nav.hub.service.a
            com.waze.a.e r5 = new com.waze.a.e
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r14 = "QueryAge"
            java.lang.String r3 = "return the birthdate when ok is clicked"
            r11.<init>(r14, r3, r5, r13)
            com.waze.app_nav.hub.c.b r12 = r12.a(r11)
            r12.c()
            r2.f13615a = r12     // Catch: java.lang.Throwable -> L2f
            r2.f13618d = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r11 = r6.c(r2)     // Catch: java.lang.Throwable -> L2f
            if (r11 == r0) goto Lb1
        L70:
            com.waze.a.a.i r11 = (com.waze.a.a.i) r11     // Catch: java.lang.Throwable -> L2f
            boolean r13 = r11 instanceof com.waze.a.a.h     // Catch: java.lang.Throwable -> L2f
            if (r13 == 0) goto L94
            com.waze.shared_infra.i.e r13 = com.waze.a.h.f13639b     // Catch: java.lang.Throwable -> L2f
            com.waze.a.a.h r11 = (com.waze.a.a.h) r11     // Catch: java.lang.Throwable -> L2f
            com.waze.shared_infra.q.i r14 = r11.a()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            r0.append(r14)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r14 = r0.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14     // Catch: java.lang.Throwable -> L2f
            r13.e(r14)     // Catch: java.lang.Throwable -> L2f
            com.waze.shared_infra.q.i r11 = r11.a()     // Catch: java.lang.Throwable -> L2f
            goto Lad
        L94:
            com.waze.a.a.f r13 = com.waze.a.a.f.f13590a     // Catch: java.lang.Throwable -> L2f
            boolean r13 = h.g.b.x.n(r11, r13)     // Catch: java.lang.Throwable -> L2f
            r14 = 0
            if (r13 != 0) goto Lac
            com.waze.a.a.g r13 = com.waze.a.a.g.f13591a     // Catch: java.lang.Throwable -> L2f
            boolean r11 = h.g.b.x.n(r11, r13)     // Catch: java.lang.Throwable -> L2f
            if (r11 == 0) goto La6
            goto Lac
        La6:
            h.i r11 = new h.i     // Catch: java.lang.Throwable -> L2f
            r11.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r11     // Catch: java.lang.Throwable -> L2f
        Lac:
            r11 = r14
        Lad:
            r12.b()
            return r11
        Lb1:
            return r0
        Lb2:
            r12.b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.a.h.f(com.waze.app_nav.hub.c.e, java.lang.Class, com.waze.uid.stats.b, com.waze.shared_infra.q.i, boolean, boolean, h.c.e):java.lang.Object");
    }

    private static final void g(com.waze.shared_infra.o.a aVar, i.b.u.q qVar) {
        ah status;
        com.waze.app_nav.hub.b.a aVar2 = null;
        if (((qVar == null || (status = qVar.getStatus()) == null) ? null : status.getCode()) != ag.OK) {
            com.waze.app_nav.hub.b.c.f15258a.a().b(new com.waze.app_nav.hub.b.k("WazeErrorDialog", aVar2, new gp(aVar, 2), 6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d2, code lost:
    
        if (c(r3, r4, r5, r6, r7, r8) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.shared_infra.o.a r14, com.waze.shared_infra.q.i r15, com.waze.b.o r16, boolean r17, h.c.e r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.a.h.a(com.waze.shared_infra.o.a, com.waze.shared_infra.q.i, com.waze.b.o, boolean, h.c.e):java.lang.Object");
    }

    public final Object b(com.waze.app_nav.hub.c.e eVar, com.waze.uid.stats.b bVar, com.waze.shared_infra.q.i iVar, boolean z, h.c.e eVar2) {
        return f(eVar, com.waze.a.a.a.class, bVar, iVar, false, z, eVar2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:11|56|12)(2:18|19))(2:20|(3:52|22|(1:24)(1:27))(6:32|54|33|(1:42)|43|44))|25|26|54|33|(0)|43|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r6 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        r9 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        r9 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.waze.shared_infra.o.a r7, com.waze.app_nav.hub.b.k r8, com.waze.shared_infra.q.i r9, com.waze.b.o r10, h.g.a.a r11, h.c.e r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.a.h.c(com.waze.shared_infra.o.a, com.waze.app_nav.hub.b.k, com.waze.shared_infra.q.i, com.waze.b.o, h.g.a.a, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        if (r1.c(r2, r3, (com.waze.shared_infra.q.i) r14, r5, r6, r6) == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.waze.shared_infra.o.a r11, com.waze.shared_infra.q.i r12, com.waze.b.o r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.a.h.e(com.waze.shared_infra.o.a, com.waze.shared_infra.q.i, com.waze.b.o, h.c.e):java.lang.Object");
    }
}
