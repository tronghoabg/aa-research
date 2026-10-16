package com.waze.network;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bq implements bn {

    /* renamed from: a, reason: collision with root package name */
    private final ax f32167a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32168b;

    /* renamed from: c, reason: collision with root package name */
    private final okhttp3.ai f32169c;

    public bq(ax axVar, com.waze.shared_infra.i.e eVar, com.waze.network.b.bj bjVar) {
        h.g.b.x.f(axVar, "httpConfig");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bjVar, "okHttpClientBuilder");
        this.f32167a = axVar;
        this.f32168b = eVar;
        axVar.f();
        axVar.g();
        this.f32169c = bjVar.c().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.network.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, h.c.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.network.bo
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.network.bo r0 = (com.waze.network.bo) r0
            int r1 = r0.f32164c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32164c = r1
            goto L18
        L13:
            com.waze.network.bo r0 = new com.waze.network.bo
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f32162a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32164c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            e.b.c.b(r7)
            goto La1
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r7)
            com.waze.shared_infra.i.e r7 = r5.f32168b
            java.lang.String r2 = java.lang.String.valueOf(r6)
            java.lang.String r4 = "HTTP Get url = "
            java.lang.String r2 = r4.concat(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7.a(r2)
            kotlinx.coroutines.CompletableDeferred r7 = kotlinx.coroutines.bo.j()
            r2 = r5
            com.waze.network.bq r2 = (com.waze.network.bq) r2     // Catch: java.lang.Throwable -> L7b
            okhttp3.ak r2 = new okhttp3.ak     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            okhttp3.ak r2 = r2.b()     // Catch: java.lang.Throwable -> L7b
            okhttp3.ak r6 = r2.i(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "User-Agent"
            com.waze.network.ax r4 = r5.f32167a     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = r4.e()     // Catch: java.lang.Throwable -> L7b
            okhttp3.ak r6 = r6.a(r2, r4)     // Catch: java.lang.Throwable -> L7b
            okhttp3.al r6 = r6.k()     // Catch: java.lang.Throwable -> L7b
            okhttp3.ai r2 = r5.f32169c     // Catch: java.lang.Throwable -> L7b
            okhttp3.f r6 = r2.r(r6)     // Catch: java.lang.Throwable -> L7b
            com.waze.network.bp r2 = new com.waze.network.bp     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r5, r7)     // Catch: java.lang.Throwable -> L7b
            okhttp3.g r2 = (okhttp3.g) r2     // Catch: java.lang.Throwable -> L7b
            r6.d(r2)     // Catch: java.lang.Throwable -> L7b
            h.ab r5 = h.ab.f48028a     // Catch: java.lang.Throwable -> L7b
            goto L80
        L7b:
            r5 = move-exception
            java.lang.Object r5 = e.b.c.a(r5)
        L80:
            java.lang.Throwable r5 = h.m.c(r5)
            if (r5 == 0) goto L98
            java.io.IOException r5 = new java.io.IOException
            r5.<init>()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r5 = e.b.c.a(r5)
            h.m r5 = h.m.d(r5)
            r7.a(r5)
        L98:
            r0.f32164c = r3
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto La1
            return r1
        La1:
            h.m r7 = (h.m) r7
            java.lang.Object r5 = r7.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.bq.a(java.lang.String, h.c.e):java.lang.Object");
    }
}
