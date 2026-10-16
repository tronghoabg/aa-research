package com.waze.authentication;

import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ah implements i {

    /* renamed from: a, reason: collision with root package name */
    private final w f15707a;

    /* renamed from: b, reason: collision with root package name */
    private final f f15708b;

    /* renamed from: c, reason: collision with root package name */
    private final l f15709c;

    /* renamed from: d, reason: collision with root package name */
    private final h f15710d;

    /* renamed from: e, reason: collision with root package name */
    private final ay f15711e;

    /* renamed from: f, reason: collision with root package name */
    private final ao f15712f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15713g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f15714h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.h.a f15715i;

    /* renamed from: j, reason: collision with root package name */
    private g f15716j;

    /* renamed from: k, reason: collision with root package name */
    private int f15717k;

    /* renamed from: l, reason: collision with root package name */
    private final bn f15718l;
    private final ch m;
    private final ch n;

    public /* synthetic */ ah(w wVar, f fVar, l lVar, h hVar, ay ayVar, ao aoVar, com.waze.shared_infra.i.e eVar, int i2) {
        ayVar = (i2 & 16) != 0 ? ab.f15685a : ayVar;
        aoVar = (i2 & 32) != 0 ? ac.f15686a : aoVar;
        if ((i2 & 64) != 0) {
            eVar = com.waze.shared_infra.i.a.d("WazeNetwork");
            h.g.b.x.e(eVar, "create(...)");
        }
        h.g.b.x.f(wVar, "networkClient");
        h.g.b.x.f(fVar, "tokenStorage");
        h.g.b.x.f(lVar, "credentialProvider");
        h.g.b.x.f(hVar, "errorHandler");
        h.g.b.x.f(ayVar, "tokenFetchCallback");
        h.g.b.x.f(aoVar, "geoConfigValidator");
        h.g.b.x.f(eVar, "logger");
        this.f15707a = wVar;
        this.f15708b = fVar;
        this.f15709c = lVar;
        this.f15710d = hVar;
        this.f15711e = ayVar;
        this.f15712f = aoVar;
        this.f15713g = eVar;
        g gVar = g.f15760a;
        bn bnVarB = ck.b(gVar);
        this.f15714h = bnVarB;
        this.f15715i = kotlinx.coroutines.h.i.c();
        this.f15716j = gVar;
        bn bnVarB2 = ck.b(null);
        this.f15718l = bnVarB2;
        this.m = kotlinx.coroutines.b.ai.U(bnVarB2);
        this.n = bnVarB;
        bnVarB2.e(fVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r7.a(r8, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.waze.authentication.x r7, h.c.e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.authentication.ad
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.authentication.ad r0 = (com.waze.authentication.ad) r0
            int r1 = r0.f15690d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15690d = r1
            goto L18
        L13:
            com.waze.authentication.ad r0 = new com.waze.authentication.ad
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15688b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15690d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r7 = r0.f15687a
            e.b.c.b(r8)
            goto L95
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L38
            goto L6f
        L38:
            r7 = move-exception
            goto L6b
        L3a:
            e.b.c.b(r8)
            com.waze.shared_infra.i.e r8 = r6.f15713g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "fetchToken, fetching token (options="
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r5 = ")"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            r8 = r6
            com.waze.authentication.ah r8 = (com.waze.authentication.ah) r8     // Catch: java.lang.Throwable -> L38
            com.waze.authentication.w r8 = r6.f15707a     // Catch: java.lang.Throwable -> L38
            com.waze.authentication.l r2 = r6.f15709c     // Catch: java.lang.Throwable -> L38
            com.waze.authentication.ax r2 = r2.a()     // Catch: java.lang.Throwable -> L38
            r0.f15690d = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r8.b(r2, r7, r0)     // Catch: java.lang.Throwable -> L38
            if (r8 == r1) goto L93
            goto L6f
        L6b:
            java.lang.Object r8 = e.b.c.a(r7)
        L6f:
            boolean r7 = h.m.e(r8)
            if (r7 == 0) goto L94
            com.waze.shared_infra.i.e r7 = r6.f15713g
            java.lang.String r2 = "fetchToken, token received"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            int r7 = r6.f15717k
            int r7 = r7 + r4
            r6.f15717k = r7
            r6.h(r8)
            com.waze.authentication.ay r7 = r6.f15711e
            r0.f15687a = r8
            r0.f15690d = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 == r1) goto L93
            goto L94
        L93:
            return r1
        L94:
            r7 = r8
        L95:
            java.lang.Throwable r8 = h.m.c(r7)
            if (r8 != 0) goto L9c
            return r7
        L9c:
            com.waze.shared_infra.i.e r7 = r6.f15713g
            java.lang.String r0 = "fetchToken, failed to get the token"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.b(r0)
            boolean r7 = r8 instanceof com.waze.authentication.v
            if (r7 == 0) goto Lb8
            com.waze.authentication.h r7 = r6.f15710d
            r0 = r8
            com.waze.authentication.v r0 = (com.waze.authentication.v) r0
            int r1 = r6.f15717k
            com.waze.authentication.g r7 = r7.a(r0, r1)
            r6.i(r7)
            throw r8
        Lb8:
            com.waze.authentication.p r6 = com.waze.authentication.p.f15769a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.authentication.ah.g(com.waze.authentication.x, h.c.e):java.lang.Object");
    }

    private final void h(Object obj) {
        bn bnVar;
        do {
            bnVar = this.f15718l;
        } while (!bnVar.f(bnVar.d(), obj));
        this.f15708b.b(obj);
    }

    private final void i(g gVar) {
        if (this.f15716j != gVar) {
            this.f15714h.c(gVar);
        }
        this.f15716j = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009d, code lost:
    
        if (r10 != r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.authentication.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.authentication.x r9, h.c.e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.waze.authentication.ae
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.authentication.ae r0 = (com.waze.authentication.ae) r0
            int r1 = r0.f15695e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15695e = r1
            goto L18
        L13:
            com.waze.authentication.ae r0 = new com.waze.authentication.ae
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f15693c
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15695e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L58
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.f15691a
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L33
            goto La1
        L33:
            r9 = move-exception
            goto Lab
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r9 = r0.f15692b
            kotlinx.coroutines.h.a r9 = (kotlinx.coroutines.h.a) r9
            java.lang.Object r2 = r0.f15691a
            com.waze.authentication.x r2 = (com.waze.authentication.x) r2
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> L4a
            goto L93
        L4a:
            r8 = move-exception
            goto La8
        L4c:
            java.lang.Object r9 = r0.f15692b
            kotlinx.coroutines.h.a r9 = (kotlinx.coroutines.h.a) r9
            java.lang.Object r2 = r0.f15691a
            com.waze.authentication.x r2 = (com.waze.authentication.x) r2
            e.b.c.b(r10)
            goto L6b
        L58:
            e.b.c.b(r10)
            kotlinx.coroutines.h.a r10 = r8.f15715i
            r0.f15691a = r9
            r0.f15692b = r10
            r0.f15695e = r5
            java.lang.Object r2 = r10.lock(r6, r0)
            if (r2 == r1) goto Laf
            r2 = r9
            r9 = r10
        L6b:
            boolean r10 = r2.a()     // Catch: java.lang.Throwable -> L4a
            if (r10 == 0) goto L76
            com.waze.authentication.g r10 = com.waze.authentication.g.f15760a     // Catch: java.lang.Throwable -> L4a
            r8.i(r10)     // Catch: java.lang.Throwable -> L4a
        L76:
            com.waze.authentication.g r10 = r8.f15716j     // Catch: java.lang.Throwable -> L4a
            com.waze.authentication.g r5 = com.waze.authentication.g.f15761b     // Catch: java.lang.Throwable -> L4a
            if (r10 == r5) goto La5
            kotlinx.coroutines.b.bn r10 = r8.f15718l     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r10 = r10.d()     // Catch: java.lang.Throwable -> L4a
            if (r10 == 0) goto L85
            goto La0
        L85:
            com.waze.authentication.ao r10 = r8.f15712f     // Catch: java.lang.Throwable -> L4a
            r0.f15691a = r2     // Catch: java.lang.Throwable -> L4a
            r0.f15692b = r9     // Catch: java.lang.Throwable -> L4a
            r0.f15695e = r4     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r10 = r10.a(r0)     // Catch: java.lang.Throwable -> L4a
            if (r10 == r1) goto Laf
        L93:
            r0.f15691a = r9     // Catch: java.lang.Throwable -> L4a
            r0.f15692b = r6     // Catch: java.lang.Throwable -> L4a
            r0.f15695e = r3     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r10 = r8.g(r2, r0)     // Catch: java.lang.Throwable -> L4a
            if (r10 != r1) goto La0
            goto Laf
        La0:
            r8 = r9
        La1:
            r8.unlock(r6)
            return r10
        La5:
            com.waze.authentication.r r8 = com.waze.authentication.r.f15771a     // Catch: java.lang.Throwable -> L4a
            throw r8     // Catch: java.lang.Throwable -> L4a
        La8:
            r7 = r9
            r9 = r8
            r8 = r7
        Lab:
            r8.unlock(r6)
            throw r9
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.authentication.ah.a(com.waze.authentication.x, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.authentication.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.authentication.af
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.authentication.af r0 = (com.waze.authentication.af) r0
            int r1 = r0.f15699d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15699d = r1
            goto L18
        L13:
            com.waze.authentication.af r0 = new com.waze.authentication.af
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f15697b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15699d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.f15696a
            kotlinx.coroutines.h.a r0 = (kotlinx.coroutines.h.a) r0
            e.b.c.b(r6)
            goto L44
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            e.b.c.b(r6)
            kotlinx.coroutines.h.a r6 = r5.f15715i
            r0.f15696a = r6
            r0.f15699d = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 == r1) goto L63
            r0 = r6
        L44:
            com.waze.shared_infra.i.e r6 = r5.f15713g     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "Clearing access token"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> L5e
            r6.g(r1)     // Catch: java.lang.Throwable -> L5e
            com.waze.authentication.g r6 = com.waze.authentication.g.f15760a     // Catch: java.lang.Throwable -> L5e
            r5.i(r6)     // Catch: java.lang.Throwable -> L5e
            r6 = 0
            r5.f15717k = r6     // Catch: java.lang.Throwable -> L5e
            r5.h(r4)     // Catch: java.lang.Throwable -> L5e
            r0.unlock(r4)
            h.ab r5 = h.ab.f48028a
            return r5
        L5e:
            r5 = move-exception
            r0.unlock(r4)
            throw r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.authentication.ah.b(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #1 {all -> 0x00f6, blocks: (B:45:0x00d3, B:47:0x00d9, B:26:0x0080, B:27:0x0082, B:29:0x008c, B:31:0x00a6, B:33:0x00ac), top: B:60:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.authentication.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r11, boolean r12, h.c.e r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.authentication.ah.c(java.lang.Object, boolean, h.c.e):java.lang.Object");
    }

    @Override // com.waze.authentication.i
    public final ch d() {
        return this.m;
    }

    @Override // com.waze.authentication.i
    public final ch e() {
        return this.n;
    }
}
