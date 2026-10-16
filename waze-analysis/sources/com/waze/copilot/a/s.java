package com.waze.copilot.a;

import android.content.Context;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22857a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f22858b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.copilot.data.b.a f22859c;

    /* renamed from: d, reason: collision with root package name */
    private final List f22860d;

    public s(com.waze.shared_infra.i.e eVar, Context context, com.waze.copilot.data.b.a aVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(aVar, "carsRepository");
        this.f22857a = eVar;
        this.f22858b = context;
        this.f22859c = aVar;
        this.f22860d = h.a.i.i("motorbike_model.obj", "motorbike_texture.png");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.waze.copilot.a.q
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.copilot.a.q r0 = (com.waze.copilot.a.q) r0
            int r1 = r0.f22853c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22853c = r1
            goto L18
        L13:
            com.waze.copilot.a.q r0 = new com.waze.copilot.a.q
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f22851a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22853c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L5e
            goto L62
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            e.b.c.b(r8)
            r8 = r7
            com.waze.copilot.a.s r8 = (com.waze.copilot.a.s) r8     // Catch: java.lang.Throwable -> L5e
            com.waze.copilot.data.b.a r8 = r7.f22859c     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r8.d()     // Catch: java.lang.Throwable -> L5e
            com.waze.copilot.data.c r8 = r8.a()     // Catch: java.lang.Throwable -> L5e
            r4 = 0
            if (r8 == 0) goto L47
            java.lang.String r8 = r8.e()     // Catch: java.lang.Throwable -> L5e
            goto L48
        L47:
            r8 = r4
        L48:
            kotlinx.coroutines.ab r5 = kotlinx.coroutines.av.b()     // Catch: java.lang.Throwable -> L5e
            h.c.j r5 = (h.c.j) r5     // Catch: java.lang.Throwable -> L5e
            com.waze.copilot.a.r r6 = new com.waze.copilot.a.r     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r7, r8, r2, r4)     // Catch: java.lang.Throwable -> L5e
            h.g.a.p r6 = (h.g.a.p) r6     // Catch: java.lang.Throwable -> L5e
            r0.f22853c = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = kotlinx.coroutines.aj.v(r5, r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L62
            return r1
        L5e:
            r7 = move-exception
            e.b.c.a(r7)
        L62:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.s.b(h.c.e):java.lang.Object");
    }
}
