package com.waze.sharedrive.c;

import com.waze.sharedrive.a.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final ac f38123a;

    /* renamed from: b, reason: collision with root package name */
    private final q f38124b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38125c;

    public p(ac acVar, q qVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(acVar, "shareDriveGrpcService");
        h.g.b.x.f(qVar, "dataConverter");
        h.g.b.x.f(eVar, "logger");
        this.f38123a = acVar;
        this.f38124b = qVar;
        this.f38125c = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r9, h.g.a.p r10, h.c.e r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.j(java.lang.String, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, com.waze.sharedrive.c.a.l r8, java.lang.String r9, h.c.e r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.a(java.lang.String, com.waze.sharedrive.c.a.l, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.sharedrive.c.a.a r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.sharedrive.c.g
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sharedrive.c.g r0 = (com.waze.sharedrive.c.g) r0
            int r1 = r0.f38095c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38095c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.g r0 = new com.waze.sharedrive.c.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38093a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38095c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            e.b.c.b(r7)
            goto La5
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r7)
            com.waze.sharedrive.c.a.l r7 = r6.a()
            java.lang.String r2 = r6.b()
            com.waze.sharedrive.f.a.c r7 = com.waze.sharedrive.c.q.d(r7, r2)
            if (r7 != 0) goto L6c
            r7 = r5
            com.waze.sharedrive.c.p r7 = (com.waze.sharedrive.c.p) r7
            com.waze.shared_infra.i.e r5 = r5.f38125c
            com.waze.sharedrive.c.a.l r6 = r6.a()
            com.waze.sharedrive.c.a.q r6 = r6.c()
            java.lang.Object r6 = r6.b()
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Driver details missing when creating shared drive: "
            java.lang.String r6 = r7.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.g(r6)
            com.waze.sharedrive.z r5 = new com.waze.sharedrive.z
            com.waze.sharedrive.c r6 = com.waze.sharedrive.c.f38053a
            r5.<init>(r6)
            return r5
        L6c:
            com.waze.sharedrive.a.e r6 = com.waze.sharedrive.a.f.newBuilder()
            r6.a(r7)
            com.google.v.du r6 = r6.build()
            java.lang.String r7 = "build(...)"
            h.g.b.x.e(r6, r7)
            com.waze.sharedrive.a.f r6 = (com.waze.sharedrive.a.f) r6
            com.waze.shared_infra.i.e r7 = r5.f38125c
            java.util.Objects.toString(r6)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "Creating shared drive with request: "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.sharedrive.c.h r7 = new com.waze.sharedrive.c.h
            r2 = 0
            r4 = 0
            r7.<init>(r6, r2, r4)
            h.g.a.p r7 = (h.g.a.p) r7
            r0.f38095c = r3
            java.lang.String r6 = "createSharedDrive"
            java.lang.Object r7 = r5.j(r6, r7, r0)
            if (r7 == r1) goto Lf3
        La5:
            com.waze.sharedrive.ab r7 = (com.waze.sharedrive.ab) r7
            boolean r6 = r7 instanceof com.waze.sharedrive.aa
            if (r6 == 0) goto Le8
            com.waze.sharedrive.aa r7 = (com.waze.sharedrive.aa) r7
            java.lang.Object r6 = r7.a()
            com.waze.sharedrive.f.a.ai r6 = (com.waze.sharedrive.f.a.ai) r6
            com.waze.shared_infra.i.e r7 = r5.f38125c
            java.util.Objects.toString(r6)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Got a response for create request: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.a(r0)
            com.waze.sharedrive.c.q r5 = r5.f38124b
            com.waze.sharedrive.ab r5 = r5.a(r6)
            java.lang.Object r6 = r5.c()
            if (r6 == 0) goto Le7
            com.waze.sharedrive.i r6 = (com.waze.sharedrive.i) r6
            java.util.Objects.toString(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "Error converting response to domain model "
            java.lang.String r6 = r0.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7.g(r6)
        Le7:
            return r5
        Le8:
            boolean r5 = r7 instanceof com.waze.sharedrive.z
            if (r5 == 0) goto Led
            return r7
        Led:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        Lf3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.b(com.waze.sharedrive.c.a.a, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.sharedrive.c.i
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sharedrive.c.i r0 = (com.waze.sharedrive.c.i) r0
            int r1 = r0.f38102c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38102c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.i r0 = new com.waze.sharedrive.c.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38100a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38102c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            com.waze.sharedrive.a.m r7 = com.waze.sharedrive.a.n.newBuilder()
            r7.a(r6)
            com.google.v.du r6 = r7.build()
            java.lang.String r7 = "build(...)"
            h.g.b.x.e(r6, r7)
            com.waze.sharedrive.a.n r6 = (com.waze.sharedrive.a.n) r6
            com.waze.shared_infra.i.e r7 = r5.f38125c
            java.util.Objects.toString(r6)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "Sending request "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            com.waze.sharedrive.c.h r7 = new com.waze.sharedrive.c.h
            r2 = 0
            r4 = 2
            r7.<init>(r6, r2, r4)
            h.g.a.p r7 = (h.g.a.p) r7
            r0.f38102c = r3
            java.lang.String r6 = "previewSharedDrive"
            java.lang.Object r7 = r5.j(r6, r7, r0)
            if (r7 == r1) goto Ld6
        L6b:
            com.waze.sharedrive.ab r7 = (com.waze.sharedrive.ab) r7
            boolean r6 = r7 instanceof com.waze.sharedrive.aa
            if (r6 == 0) goto Lcb
            com.waze.sharedrive.aa r7 = (com.waze.sharedrive.aa) r7
            java.lang.Object r6 = r7.a()
            com.waze.sharedrive.f.a.ai r6 = (com.waze.sharedrive.f.a.ai) r6
            com.waze.shared_infra.i.e r7 = r5.f38125c
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = r6.getUrlForShare()
            int r2 = r6.getParticipantsCount()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Got a response for preview request: id="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " urlForShare="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " participantsCount: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.a(r0)
            com.waze.sharedrive.c.q r5 = r5.f38124b
            com.waze.sharedrive.ab r5 = r5.b(r6)
            java.lang.Object r6 = r5.c()
            if (r6 == 0) goto Lca
            com.waze.sharedrive.i r6 = (com.waze.sharedrive.i) r6
            java.util.Objects.toString(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "Error converting response to domain model "
            java.lang.String r6 = r0.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7.g(r6)
        Lca:
            return r5
        Lcb:
            boolean r5 = r7 instanceof com.waze.sharedrive.z
            if (r5 == 0) goto Ld0
            return r7
        Ld0:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.c(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.sharedrive.c.j
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sharedrive.c.j r0 = (com.waze.sharedrive.c.j) r0
            int r1 = r0.f38105c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38105c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.j r0 = new com.waze.sharedrive.c.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f38103a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38105c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            com.waze.sharedrive.a.al r7 = com.waze.sharedrive.a.am.newBuilder()
            r7.a(r6)
            com.google.v.du r6 = r7.build()
            java.lang.String r7 = "build(...)"
            h.g.b.x.e(r6, r7)
            com.waze.sharedrive.a.am r6 = (com.waze.sharedrive.a.am) r6
            com.waze.sharedrive.c.h r7 = new com.waze.sharedrive.c.h
            r2 = 0
            r4 = 3
            r7.<init>(r6, r2, r4)
            h.g.a.p r7 = (h.g.a.p) r7
            r0.f38105c = r3
            java.lang.String r6 = "viewSharedDrive"
            java.lang.Object r7 = r5.j(r6, r7, r0)
            if (r7 == r1) goto La5
        L57:
            com.waze.sharedrive.ab r7 = (com.waze.sharedrive.ab) r7
            boolean r6 = r7 instanceof com.waze.sharedrive.aa
            if (r6 == 0) goto L9a
            com.waze.sharedrive.aa r7 = (com.waze.sharedrive.aa) r7
            java.lang.Object r6 = r7.a()
            com.waze.sharedrive.f.a.ai r6 = (com.waze.sharedrive.f.a.ai) r6
            com.waze.shared_infra.i.e r7 = r5.f38125c
            java.util.Objects.toString(r6)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Got a response for view request: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.a(r0)
            com.waze.sharedrive.c.q r5 = r5.f38124b
            com.waze.sharedrive.ab r5 = r5.a(r6)
            java.lang.Object r6 = r5.c()
            if (r6 == 0) goto L99
            com.waze.sharedrive.i r6 = (com.waze.sharedrive.i) r6
            java.util.Objects.toString(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "Error converting response to domain model "
            java.lang.String r6 = r0.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7.g(r6)
        L99:
            return r5
        L9a:
            boolean r5 = r7 instanceof com.waze.sharedrive.z
            if (r5 == 0) goto L9f
            return r7
        L9f:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.d(java.lang.String, h.c.e):java.lang.Object");
    }

    public final Object e(String str, h.c.e eVar) {
        return j("leaveSharedDrive", new l(str, null, 0), eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, com.waze.shared_infra.h.c r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.sharedrive.c.n
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.sharedrive.c.n r0 = (com.waze.sharedrive.c.n) r0
            int r1 = r0.f38119c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38119c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.n r0 = new com.waze.sharedrive.c.n
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f38117a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38119c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L72
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            com.waze.sharedrive.a.ad r7 = com.waze.sharedrive.a.ae.newBuilder()
            r7.b(r5)
            i.b.s r5 = com.waze.sharedui.e.e.e(r6)
            r7.a(r5)
            com.google.v.du r5 = r7.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            com.waze.sharedrive.a.ae r5 = (com.waze.sharedrive.a.ae) r5
            com.waze.shared_infra.i.e r6 = r4.f38125c
            java.util.Objects.toString(r5)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Updating location with request: "
            java.lang.String r7 = r2.concat(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.a(r7)
            com.waze.sharedrive.c.h r6 = new com.waze.sharedrive.c.h
            r7 = 0
            r2 = 5
            r6.<init>(r5, r7, r2)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.f38119c = r3
            java.lang.String r5 = "updateLocation"
            java.lang.Object r7 = r4.j(r5, r6, r0)
            if (r7 == r1) goto L9e
        L72:
            com.waze.sharedrive.ab r7 = (com.waze.sharedrive.ab) r7
            boolean r5 = r7 instanceof com.waze.sharedrive.aa
            if (r5 == 0) goto L93
            com.waze.sharedrive.aa r7 = (com.waze.sharedrive.aa) r7
            java.lang.Object r5 = r7.a()
            com.waze.sharedrive.a.ag r5 = (com.waze.sharedrive.a.ag) r5
            com.waze.shared_infra.i.e r4 = r4.f38125c
            java.lang.String r5 = "Location updated to server successfully"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.a(r5)
            com.waze.sharedrive.aa r4 = new com.waze.sharedrive.aa
            h.ab r5 = h.ab.f48028a
            r4.<init>(r5)
            com.waze.sharedrive.ab r4 = (com.waze.sharedrive.ab) r4
            return r4
        L93:
            boolean r4 = r7 instanceof com.waze.sharedrive.z
            if (r4 == 0) goto L98
            return r7
        L98:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.f(java.lang.String, com.waze.shared_infra.h.c, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, j$.time.Instant r6, java.lang.String r7, h.c.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.waze.sharedrive.c.o
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.sharedrive.c.o r0 = (com.waze.sharedrive.c.o) r0
            int r1 = r0.f38122c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38122c = r1
            goto L18
        L13:
            com.waze.sharedrive.c.o r0 = new com.waze.sharedrive.c.o
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f38120a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f38122c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L75
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r8)
            com.waze.sharedrive.a.ah r8 = com.waze.sharedrive.a.ai.newBuilder()
            r8.b(r5)
            com.google.v.gc r5 = com.waze.sharedui.e.e.c(r6)
            r8.a(r5)
            r8.c(r7)
            com.google.v.du r5 = r8.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            com.waze.sharedrive.a.ai r5 = (com.waze.sharedrive.a.ai) r5
            com.waze.shared_infra.i.e r6 = r4.f38125c
            java.util.Objects.toString(r5)
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.lang.String r8 = "Updating route with request: "
            java.lang.String r7 = r8.concat(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.a(r7)
            com.waze.sharedrive.c.h r6 = new com.waze.sharedrive.c.h
            r7 = 0
            r8 = 6
            r6.<init>(r5, r7, r8)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.f38122c = r3
            java.lang.String r5 = "updateRoute"
            java.lang.Object r8 = r4.j(r5, r6, r0)
            if (r8 == r1) goto La1
        L75:
            com.waze.sharedrive.ab r8 = (com.waze.sharedrive.ab) r8
            boolean r5 = r8 instanceof com.waze.sharedrive.aa
            if (r5 == 0) goto L96
            com.waze.sharedrive.aa r8 = (com.waze.sharedrive.aa) r8
            java.lang.Object r5 = r8.a()
            com.waze.sharedrive.a.ak r5 = (com.waze.sharedrive.a.ak) r5
            com.waze.shared_infra.i.e r4 = r4.f38125c
            java.lang.String r5 = "Route updated to server successfully"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.a(r5)
            com.waze.sharedrive.aa r4 = new com.waze.sharedrive.aa
            h.ab r5 = h.ab.f48028a
            r4.<init>(r5)
            com.waze.sharedrive.ab r4 = (com.waze.sharedrive.ab) r4
            return r4
        L96:
            boolean r4 = r8 instanceof com.waze.sharedrive.z
            if (r4 == 0) goto L9b
            return r8
        L9b:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.g(java.lang.String, j$.time.Instant, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r5, com.waze.sharedrive.c.a.l r6, h.c.e r7) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.c.p.i(java.lang.String, com.waze.sharedrive.c.a.l, h.c.e):java.lang.Object");
    }
}
