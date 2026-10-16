package com.waze.reports_v2.presentation;

import android.content.Context;
import com.waze.sound.fm;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f34800a = h.a.r.k(new h.k(ai.f34789a, h.a.r.k(new h.k(aj.f34794b, "conversational_minimalist_confirmation"), new h.k(aj.f34793a, "conversational_minimalist_error"))), new h.k(ai.f34790b, h.a.r.k(new h.k(aj.f34794b, "conversational_popcorn_confirmation"), new h.k(aj.f34793a, "conversational_popcorn_error"))));

    /* renamed from: b, reason: collision with root package name */
    private final Context f34801b;

    /* renamed from: c, reason: collision with root package name */
    private final fm f34802c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34803d;

    public al(Context context, fm fmVar, com.waze.network.b.bf bfVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(fmVar, "soundPlayer");
        h.g.b.x.f(bfVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f34801b = context;
        this.f34802c = fmVar;
        this.f34803d = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.waze.reports_v2.presentation.aj r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.reports_v2.presentation.ak
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.reports_v2.presentation.ak r0 = (com.waze.reports_v2.presentation.ak) r0
            int r1 = r0.f34798c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34798c = r1
            goto L18
        L13:
            com.waze.reports_v2.presentation.ak r0 = new com.waze.reports_v2.presentation.ak
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f34796a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f34798c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.waze.reports_v2.presentation.aj r8 = r0.f34799d
            r0 = r8
            com.waze.reports_v2.presentation.aj r0 = (com.waze.reports_v2.presentation.aj) r0
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L2c
            goto L73
        L2c:
            r9 = move-exception
            goto L77
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            e.b.c.b(r9)
            java.util.Map r9 = com.waze.reports_v2.presentation.al.f34800a
            com.waze.reports_v2.presentation.ai r2 = com.waze.network.b.bf.g()
            java.lang.Object r9 = r9.get(r2)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto La0
            java.lang.Object r9 = r9.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto La0
            r2 = r7
            com.waze.reports_v2.presentation.al r2 = (com.waze.reports_v2.presentation.al) r2     // Catch: java.lang.Throwable -> L2c
            android.content.Context r2 = r7.f34801b     // Catch: java.lang.Throwable -> L2c
            java.lang.String r9 = com.waze.resources.h.e(r2, r9)     // Catch: java.lang.Throwable -> L2c
            h.o.c r2 = h.o.a.f48264a     // Catch: java.lang.Throwable -> L2c
            h.o.d r2 = h.o.d.f48273d     // Catch: java.lang.Throwable -> L2c
            r4 = 2
            long r4 = h.o.c.i(r4, r2)     // Catch: java.lang.Throwable -> L2c
            com.waze.reports_v2.presentation.bl r2 = new com.waze.reports_v2.presentation.bl     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            r2.<init>(r7, r9, r6, r3)     // Catch: java.lang.Throwable -> L2c
            h.g.a.p r2 = (h.g.a.p) r2     // Catch: java.lang.Throwable -> L2c
            r0.f34799d = r8     // Catch: java.lang.Throwable -> L2c
            r0.f34798c = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = kotlinx.coroutines.aj.J(r4, r2, r0)     // Catch: java.lang.Throwable -> L2c
            if (r9 == r1) goto L76
        L73:
            h.ab r9 = (h.ab) r9     // Catch: java.lang.Throwable -> L2c
            goto L7b
        L76:
            return r1
        L77:
            java.lang.Object r9 = e.b.c.a(r9)
        L7b:
            java.lang.Throwable r9 = h.m.c(r9)
            if (r9 == 0) goto La0
            com.waze.shared_infra.i.e r7 = r7.f34803d
            com.waze.reports_v2.presentation.ai r0 = com.waze.network.b.bf.g()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Exception when playing sound with option: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", type: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.c(r8, r9)
        La0:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.al.g(com.waze.reports_v2.presentation.aj, h.c.e):java.lang.Object");
    }

    public final Object b(h.c.e eVar) {
        Object objG = g(aj.f34793a, eVar);
        return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
    }

    public final Object c(h.c.e eVar) {
        Object objG = g(aj.f34794b, eVar);
        return objG == h.c.a.a.f48038a ? objG : h.ab.f48028a;
    }

    public final String d(Context context, aj ajVar) {
        String str;
        h.g.b.x.f(context, "context");
        h.g.b.x.f(ajVar, "soundType");
        Map map = (Map) f34800a.get(com.waze.network.b.bf.g());
        if (map == null || (str = (String) map.get(ajVar)) == null) {
            return null;
        }
        return com.waze.resources.h.e(context, str);
    }

    public final void e() {
        this.f34802c.e();
    }
}
