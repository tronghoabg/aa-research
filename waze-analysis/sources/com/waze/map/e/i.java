package com.waze.map.e;

import com.waze.map.b.ed;
import com.waze.map.g.x;
import com.waze.map.main.v;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i implements x {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28809a;

    /* renamed from: b, reason: collision with root package name */
    private final long f28810b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28811c;

    /* renamed from: d, reason: collision with root package name */
    private final v f28812d;

    public i(v vVar, a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(vVar, "locationListener");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f28812d = vVar;
        this.f28809a = eVar;
        this.f28810b = aVar.b();
        this.f28811c = aVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if (r9.emit(r10, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.map.e.i r9, kotlinx.coroutines.b.l r10, h.c.e r11) {
        /*
            boolean r0 = r11 instanceof com.waze.map.e.c
            if (r0 == 0) goto L13
            r0 = r11
            com.waze.map.e.c r0 = (com.waze.map.e.c) r0
            int r1 = r0.f28794d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28794d = r1
            goto L18
        L13:
            com.waze.map.e.c r0 = new com.waze.map.e.c
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f28792b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f28794d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            e.b.c.b(r11)
            goto L98
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.f28791a
            kotlinx.coroutines.b.l r9 = (kotlinx.coroutines.b.l) r9
            e.b.c.b(r11)
            goto L8b
        L3e:
            java.lang.Object r10 = r0.f28791a
            kotlinx.coroutines.b.l r10 = (kotlinx.coroutines.b.l) r10
            e.b.c.b(r11)
            goto L55
        L46:
            e.b.c.b(r11)
            long r7 = r9.f28810b
            r0.f28791a = r10
            r0.f28794d = r5
            java.lang.Object r11 = kotlinx.coroutines.aj.r(r7, r0)
            if (r11 == r1) goto L9b
        L55:
            r0.f28791a = r10
            r0.f28794d = r4
            com.waze.map.main.v r11 = r9.f28812d
            kotlinx.coroutines.b.k r11 = r11.a()
            com.waze.map.e.b r2 = new com.waze.map.e.b
            r2.<init>(r9, r6)
            h.g.a.p r2 = (h.g.a.p) r2
            kotlinx.coroutines.b.k r2 = kotlinx.coroutines.b.ai.E(r2)
            kotlinx.coroutines.b.k r2 = kotlinx.coroutines.b.ai.y(r2)
            com.waze.map.e.h r4 = new com.waze.map.e.h
            r4.<init>(r9, r6)
            h.g.a.q r4 = (h.g.a.q) r4
            kotlinx.coroutines.b.k r9 = kotlinx.coroutines.b.ai.q(r11, r2, r4)
            com.waze.map.e.g r11 = new com.waze.map.e.g
            r11.<init>(r9)
            kotlinx.coroutines.b.k r11 = (kotlinx.coroutines.b.k) r11
            java.lang.Object r9 = kotlinx.coroutines.b.ai.h(r11, r0)
            if (r9 == r1) goto L88
            h.ab r9 = h.ab.f48028a
        L88:
            if (r9 == r1) goto L9b
            r9 = r10
        L8b:
            h.ab r10 = h.ab.f48028a
            r0.f28791a = r6
            r0.f28794d = r3
            java.lang.Object r9 = r9.emit(r10, r0)
            if (r9 != r1) goto L98
            goto L9b
        L98:
            h.ab r9 = h.ab.f48028a
            return r9
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.e.i.c(com.waze.map.e.i, kotlinx.coroutines.b.l, h.c.e):java.lang.Object");
    }

    @Override // com.waze.map.g.x
    public final k d(ed edVar) {
        h.g.b.x.f(edVar, "mapController");
        return ai.R(edVar.g(), new d(this, new AtomicBoolean(false), new AtomicBoolean(false), null));
    }
}
