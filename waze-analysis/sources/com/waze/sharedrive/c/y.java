package com.waze.sharedrive.c;

import com.waze.sharedrive.z;
import h.ab;
import j$.time.Instant;
import java.util.Objects;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38160a;

    /* renamed from: b, reason: collision with root package name */
    private final p f38161b;

    public y(p pVar, com.waze.sharedrive.b.a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(pVar, "sharedDriveApi");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f38161b = pVar;
        this.f38160a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object d(com.waze.sharedrive.c.y r4, java.lang.String r5, com.waze.sharedrive.c.a.l r6, java.lang.String r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.sharedrive.c.t
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sharedrive.c.t r0 = (com.waze.sharedrive.c.t) r0
            int r1 = r0.f38136c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38136c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.t r0 = new com.waze.sharedrive.c.t
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f38134a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38136c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L5b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r8)
            com.waze.sharedrive.c.a.q r8 = r6.c()
            java.lang.Object r8 = r8.b()
            boolean r8 = r8 instanceof com.waze.sharedrive.c.a.h
            if (r8 == 0) goto L50
            if (r7 == 0) goto L41
            goto L50
        L41:
            com.waze.shared_infra.i.e r4 = r4.f38160a
            java.lang.String r5 = "changeRole: role is Driver but routeUuid is missing"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.g(r5)
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L50:
            com.waze.sharedrive.c.p r4 = r4.f38161b
            r0.f38136c = r3
            java.lang.Object r8 = r4.a(r5, r6, r7, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            com.waze.sharedrive.ab r8 = (com.waze.sharedrive.ab) r8
            boolean r4 = r8 instanceof com.waze.sharedrive.aa
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.y.d(com.waze.sharedrive.c.y, java.lang.String, com.waze.sharedrive.c.a.l, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object f(com.waze.sharedrive.c.y r4, com.waze.sharedrive.c.a.b r5, j$.time.Instant r6, java.lang.String r7, com.waze.shared_infra.h.c r8, java.lang.String r9, com.waze.sharedrive.c.a.e r10, h.c.e r11) {
        /*
            boolean r0 = r11 instanceof com.waze.sharedrive.c.u
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.sharedrive.c.u r0 = (com.waze.sharedrive.c.u) r0
            int r1 = r0.f38139c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38139c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.u r0 = new com.waze.sharedrive.c.u
            r0.<init>(r4, r11)
        L18:
            java.lang.Object r11 = r0.f38137a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38139c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.sharedrive.c.y r4 = r0.f38140d
            r5 = r4
            com.waze.sharedrive.c.y r5 = (com.waze.sharedrive.c.y) r5
            e.b.c.b(r11)
            goto L53
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r11)
            com.waze.sharedrive.c.a.g r11 = new com.waze.sharedrive.c.a.g
            r11.<init>(r6)
            com.waze.sharedrive.c.a.k r11 = (com.waze.sharedrive.c.a.k) r11
            com.waze.sharedrive.c.a.l r6 = com.waze.sharedrive.a.s.j(r11, r9, r10, r8)
            com.waze.sharedrive.c.a.a r8 = new com.waze.sharedrive.c.a.a
            r8.<init>(r5, r6, r7)
            com.waze.sharedrive.c.p r5 = r4.f38161b
            r0.f38140d = r4
            r0.f38139c = r3
            java.lang.Object r11 = r5.b(r8, r0)
            if (r11 == r1) goto L72
        L53:
            com.waze.sharedrive.ab r11 = (com.waze.sharedrive.ab) r11
            java.lang.Object r5 = r11.c()
            if (r5 == 0) goto L71
            com.waze.sharedrive.q r5 = (com.waze.sharedrive.q) r5
            com.waze.shared_infra.i.e r4 = r4.f38160a
            java.util.Objects.toString(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Failed to create shared drive: "
            java.lang.String r5 = r6.concat(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.b(r5)
        L71:
            return r11
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.y.f(com.waze.sharedrive.c.y, com.waze.sharedrive.c.a.b, j$.time.Instant, java.lang.String, com.waze.shared_infra.h.c, java.lang.String, com.waze.sharedrive.c.a.e, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object j(com.waze.sharedrive.c.y r5, java.lang.String r6, com.waze.shared_infra.h.c r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.sharedrive.c.w
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sharedrive.c.w r0 = (com.waze.sharedrive.c.w) r0
            int r1 = r0.f38150c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38150c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.w r0 = new com.waze.sharedrive.c.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f38148a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38150c
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            h.g.b.aq r5 = r0.f38153f
            r6 = r5
            h.g.b.aq r6 = (h.g.b.aq) r6
            java.lang.String r6 = r0.f38152e
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            com.waze.sharedrive.c.y r7 = r0.f38151d
            r0 = r7
            com.waze.sharedrive.c.y r0 = (com.waze.sharedrive.c.y) r0
            e.b.c.b(r8)
            goto L5a
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            e.b.c.b(r8)
            h.g.b.aq r8 = new h.g.b.aq
            r8.<init>()
            com.waze.sharedrive.c.p r2 = r5.f38161b
            r0.f38151d = r5
            r0.f38152e = r6
            r0.f38153f = r8
            r0.f38150c = r3
            java.lang.Object r7 = r2.f(r6, r7, r0)
            if (r7 == r1) goto L6d
            r4 = r7
            r7 = r5
            r5 = r8
            r8 = r4
        L5a:
            com.waze.sharedrive.ab r8 = (com.waze.sharedrive.ab) r8
            java.lang.Object r8 = r8.c()
            if (r8 == 0) goto L6a
            com.waze.sharedrive.q r8 = (com.waze.sharedrive.q) r8
            com.waze.sharedrive.c.d r6 = r7.p(r8, r6)
            r5.f48105a = r6
        L6a:
            java.lang.Object r5 = r5.f48105a
            return r5
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.y.j(com.waze.sharedrive.c.y, java.lang.String, com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object l(com.waze.sharedrive.c.y r5, java.lang.String r6, j$.time.Instant r7, java.lang.String r8, h.c.e r9) {
        /*
            boolean r0 = r9 instanceof com.waze.sharedrive.c.x
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.sharedrive.c.x r0 = (com.waze.sharedrive.c.x) r0
            int r1 = r0.f38156c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38156c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.x r0 = new com.waze.sharedrive.c.x
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f38154a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38156c
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            h.g.b.aq r5 = r0.f38159f
            r6 = r5
            h.g.b.aq r6 = (h.g.b.aq) r6
            java.lang.String r6 = r0.f38158e
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            com.waze.sharedrive.c.y r7 = r0.f38157d
            r8 = r7
            com.waze.sharedrive.c.y r8 = (com.waze.sharedrive.c.y) r8
            e.b.c.b(r9)
            goto L5a
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            e.b.c.b(r9)
            h.g.b.aq r9 = new h.g.b.aq
            r9.<init>()
            com.waze.sharedrive.c.p r2 = r5.f38161b
            r0.f38157d = r5
            r0.f38158e = r6
            r0.f38159f = r9
            r0.f38156c = r3
            java.lang.Object r7 = r2.g(r6, r7, r8, r0)
            if (r7 == r1) goto L6d
            r4 = r7
            r7 = r5
            r5 = r9
            r9 = r4
        L5a:
            com.waze.sharedrive.ab r9 = (com.waze.sharedrive.ab) r9
            java.lang.Object r8 = r9.c()
            if (r8 == 0) goto L6a
            com.waze.sharedrive.q r8 = (com.waze.sharedrive.q) r8
            com.waze.sharedrive.c.d r6 = r7.p(r8, r6)
            r5.f48105a = r6
        L6a:
            java.lang.Object r5 = r5.f48105a
            return r5
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.y.l(com.waze.sharedrive.c.y, java.lang.String, j$.time.Instant, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d p(com.waze.sharedrive.q qVar, String str) {
        boolean z = qVar instanceof com.waze.sharedrive.l;
        com.waze.shared_infra.i.e eVar = this.f38160a;
        if (!z) {
            Objects.toString(qVar);
            eVar.b("Failed to update shared drive: ".concat(qVar.toString()));
            return new c(qVar);
        }
        eVar.g("Shared drive " + str + " not found, ending observation");
        return a.f38054a;
    }

    public final Object c(String str, com.waze.sharedrive.c.a.l lVar, String str2, h.c.e eVar) {
        return d(this, str, lVar, str2, eVar);
    }

    public final Object e(com.waze.sharedrive.c.a.b bVar, Instant instant, String str, com.waze.shared_infra.h.c cVar, String str2, com.waze.sharedrive.c.a.e eVar, h.c.e eVar2) {
        return f(this, bVar, instant, str, cVar, str2, eVar, eVar2);
    }

    public final Object g(String str, h.c.e eVar) {
        return this.f38161b.c(str, eVar);
    }

    public final Object h(String str, h.c.e eVar) {
        Object objE = this.f38161b.e(str, eVar);
        return objE == h.c.a.a.f48038a ? objE : ab.f48028a;
    }

    public final Object i(String str, com.waze.shared_infra.h.c cVar, h.c.e eVar) {
        return j(this, str, cVar, eVar);
    }

    public final Object k(String str, Instant instant, String str2, h.c.e eVar) {
        return l(this, str, instant, str2, eVar);
    }

    public final kotlinx.coroutines.b.k m(String str) {
        h.g.b.x.f(str, "driveId");
        return ai.p(new v(this, str, null));
    }

    public final Object o(String str, com.waze.sharedrive.c.a.k kVar, com.waze.shared_infra.h.c cVar, h.c.e eVar) {
        if (kVar instanceof com.waze.sharedrive.c.a.h) {
            this.f38160a.g("joinSharedDrive: role is Driver but routeUuid is missing");
            return new z(com.waze.sharedrive.o.f38765a);
        }
        return this.f38161b.i(str, com.waze.sharedrive.a.s.j(kVar, null, null, cVar), eVar);
    }
}
