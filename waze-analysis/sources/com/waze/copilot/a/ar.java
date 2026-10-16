package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f22704a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f22705b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ as f22706c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f22707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(h.g.b.am amVar, boolean z, as asVar, String str, h.c.e eVar) {
        super(2, eVar);
        this.f22704a = amVar;
        this.f22705b = z;
        this.f22706c = asVar;
        this.f22707d = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ar(this.f22704a, this.f22705b, this.f22706c, this.f22707d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r10)
            boolean r10 = r9.f22705b
            com.waze.copilot.a.as r0 = r9.f22706c
            r1 = 1
            r2 = 0
            java.lang.String r3 = "/"
            if (r10 == 0) goto L5e
            java.lang.String r10 = r9.f22707d
            java.io.File r4 = new java.io.File
            java.lang.String r5 = com.waze.copilot.a.as.c(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r3)
            r6.append(r10)
            java.lang.String r5 = "_texture_normal.png"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            boolean r4 = r4.exists()
            java.io.File r5 = new java.io.File
            java.lang.String r0 = com.waze.copilot.a.as.c(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r3)
            r6.append(r10)
            java.lang.String r10 = "_model.obj"
            r6.append(r10)
            java.lang.String r10 = r6.toString()
            r5.<init>(r10)
            boolean r10 = r5.exists()
            if (r4 == 0) goto Lbe
            if (r10 == 0) goto Lbe
            goto Lbf
        L5e:
            com.waze.aa r10 = com.waze.copilot.a.as.a(r0)
            java.lang.String r10 = r10.a()
            java.lang.String r4 = r9.f22707d
            java.io.File r5 = new java.io.File
            java.lang.String r6 = com.waze.copilot.a.as.c(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r3)
            r7.append(r4)
            r7.append(r10)
            java.lang.String r6 = ".png"
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r5.<init>(r7)
            boolean r5 = r5.exists()
            java.io.File r7 = new java.io.File
            java.lang.String r0 = com.waze.copilot.a.as.c(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r3)
            r8.append(r4)
            java.lang.String r0 = "_3D"
            r8.append(r0)
            r8.append(r10)
            r8.append(r6)
            java.lang.String r10 = r8.toString()
            r7.<init>(r10)
            boolean r10 = r7.exists()
            if (r5 == 0) goto Lbe
            if (r10 == 0) goto Lbe
            goto Lbf
        Lbe:
            r1 = r2
        Lbf:
            h.g.b.am r9 = r9.f22704a
            r9.f48101a = r1
            h.ab r9 = h.ab.f48028a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.ar.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
