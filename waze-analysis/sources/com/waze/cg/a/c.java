package com.waze.cg.a;

import android.content.Context;
import android.support.v4.app.av;
import android.support.v4.app.dd;
import androidx.core.app.NotificationCompat;
import com.waze.ap.b.n;
import com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m;
import com.waze.sharedui.g.p;
import com.waze.uid.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22254a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22255b;

    public c(n nVar) {
        x.f(nVar, "insightsServingGrpcService");
        this.f22254a = nVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeToGoalGrpcApi");
        x.e(eVarD, "create(...)");
        this.f22255b = eVarD;
    }

    public static final /* synthetic */ n a(c cVar) {
        return (n) cVar.f22254a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b(com.waze.cg.a.c r5, h.c.e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.waze.cg.a.a
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.cg.a.a r0 = (com.waze.cg.a.a) r0
            int r1 = r0.f22251c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22251c = r1
            goto L18
        L13:
            com.waze.cg.a.a r0 = new com.waze.cg.a.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22249a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22251c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            com.waze.cg.a.c r5 = r0.f22252d
            r0 = r5
            com.waze.cg.a.c r0 = (com.waze.cg.a.c) r0
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L5a
        L2d:
            r6 = move-exception
            goto L5e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            e.b.c.b(r6)
            java.lang.Object r6 = r5.f22255b
            java.lang.String r2 = "requesting live scores"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6.a(r2)
            kotlinx.coroutines.ab r6 = kotlinx.coroutines.av.b()     // Catch: java.lang.Throwable -> L2d
            h.c.j r6 = (h.c.j) r6     // Catch: java.lang.Throwable -> L2d
            com.waze.cg.a.b r2 = new com.waze.cg.a.b     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5, r3)     // Catch: java.lang.Throwable -> L2d
            h.g.a.p r2 = (h.g.a.p) r2     // Catch: java.lang.Throwable -> L2d
            r0.f22252d = r5     // Catch: java.lang.Throwable -> L2d
            r0.f22251c = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = kotlinx.coroutines.aj.v(r6, r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r6 == r1) goto L5d
        L5a:
            com.waze.ap.b.h r6 = (com.waze.ap.b.h) r6     // Catch: java.lang.Throwable -> L2d
            goto L62
        L5d:
            return r1
        L5e:
            java.lang.Object r6 = e.b.c.a(r6)
        L62:
            java.lang.Throwable r0 = h.m.c(r6)
            if (r0 == 0) goto L6e
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L6d
            goto L6e
        L6d:
            throw r0
        L6e:
            boolean r0 = h.m.e(r6)
            if (r0 == 0) goto L80
            r0 = r6
            com.waze.ap.b.h r0 = (com.waze.ap.b.h) r0
            java.lang.Object r5 = r5.f22255b
            java.lang.String r0 = "getLiveScore: successfully got scores"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.a(r0)
        L80:
            boolean r5 = r6 instanceof h.l
            if (r5 == 0) goto L85
            return r3
        L85:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cg.a.c.b(com.waze.cg.a.c, h.c.e):java.lang.Object");
    }

    public final void c(u uVar) {
        x.f(uVar, NotificationCompat.CATEGORY_EVENT);
        Object obj = this.f22254a;
        p pVar = new p((Context) obj);
        pVar.h(uVar.m());
        pVar.e(uVar.b());
        if (uVar.a() != null) {
            pVar.c(uVar.a(), new m(uVar, this, 11));
        }
        if (uVar.c() != null) {
            pVar.g(uVar.c(), new m(uVar, this, 12));
        }
        pVar.f(new com.google.firebase.messaging.m(this, uVar, 8));
        pVar.a(((dd) obj).getLifecycle());
        pVar.i();
    }

    public c(av avVar, com.waze.uid.b.h hVar) {
        x.f(avVar, "activity");
        x.f(hVar, "controller");
        this.f22254a = avVar;
        this.f22255b = hVar;
    }
}
