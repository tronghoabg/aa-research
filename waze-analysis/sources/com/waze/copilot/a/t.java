package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f22861a;

    /* renamed from: b, reason: collision with root package name */
    int f22862b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f22863c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.copilot.data.ag f22864d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.mywaze.ag f22865e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f22866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, com.waze.copilot.data.ag agVar, com.waze.mywaze.ag agVar2, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f22863c = uVar;
        this.f22864d = agVar;
        this.f22865e = agVar2;
        this.f22866f = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new t(this.f22863c, this.f22864d, this.f22865e, this.f22866f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((t) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        if (r1.d(r2, r8) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.f22862b
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 == r2) goto L10
            java.lang.Object r0 = r8.f22861a
            e.b.c.b(r9)
            goto L91
        L10:
            e.b.c.b(r9)
            h.m r9 = (h.m) r9
            java.lang.Object r9 = r9.b()
            goto L46
        L1a:
            e.b.c.b(r9)
            com.waze.copilot.a.u r9 = r8.f22863c
            com.waze.copilot.data.ag r1 = r8.f22864d
            com.waze.shared_infra.i.e r3 = com.waze.copilot.a.u.b(r9)
            java.util.Objects.toString(r1)
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "Starting to download prompt file for voice asset "
            java.lang.String r4 = r5.concat(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.a(r4)
            com.waze.copilot.data.l r9 = com.waze.copilot.a.u.a(r9)
            r3 = r8
            h.c.e r3 = (h.c.e) r3
            r8.f22862b = r2
            java.lang.Object r9 = r9.a(r1, r2, r3)
            if (r9 == r0) goto La5
        L46:
            com.waze.copilot.a.u r1 = r8.f22863c
            com.waze.copilot.data.ag r2 = r8.f22864d
            com.waze.mywaze.ag r3 = r8.f22865e
            boolean r4 = r8.f22866f
            boolean r5 = h.m.e(r9)
            if (r5 == 0) goto L90
            r5 = r9
            h.ab r5 = (h.ab) r5
            com.waze.shared_infra.i.e r5 = com.waze.copilot.a.u.b(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Prompt file downloaded for voice asset "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " completed successfully"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.a(r6)
            com.waze.copilot.a.u.d(r1, r2, r3)
            if (r4 == 0) goto L80
            com.waze.sound.a.c r3 = com.waze.copilot.a.u.c(r1)
            r4 = 0
            r3.g(r4)
        L80:
            com.waze.sound.a.c r1 = com.waze.copilot.a.u.c(r1)
            r8.f22861a = r9
            r3 = 2
            r8.f22862b = r3
            java.lang.Object r1 = r1.d(r2, r8)
            if (r1 != r0) goto L90
            goto La5
        L90:
            r0 = r9
        L91:
            com.waze.copilot.a.u r8 = r8.f22863c
            java.lang.Throwable r9 = h.m.c(r0)
            if (r9 == 0) goto La2
            com.waze.shared_infra.i.e r8 = com.waze.copilot.a.u.b(r8)
            java.lang.String r0 = "Prompt voice zip file download failed"
            com.waze.settings.tree.c.f.e(r8, r0, r9)
        La2:
            h.ab r8 = h.ab.f48028a
            return r8
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
