package com.waze.profile;

import com.waze.MoodManager;
import com.waze.gj;
import com.waze.shared_infra.r.y;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final y f33399a;

    /* renamed from: b, reason: collision with root package name */
    private final MoodManager f33400b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f33401c;

    public l(y yVar, MoodManager moodManager, gj gjVar) {
        x.f(yVar, "userState");
        x.f(moodManager, "moodManager");
        x.f(gjVar, "nativeDispatcherProvider");
        this.f33399a = yVar;
        this.f33400b = moodManager;
        this.f33401c = gjVar.getNativeDispatcher();
    }

    public static final /* synthetic */ Object d(l lVar, h.c.e eVar) {
        Object objV = aj.v(lVar.f33401c, new k(lVar, null), eVar);
        return objV == h.c.a.a.f48038a ? objV : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.profile.i
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.profile.i r0 = (com.waze.profile.i) r0
            int r1 = r0.f33396c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33396c = r1
            goto L18
        L13:
            com.waze.profile.i r0 = new com.waze.profile.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f33394a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f33396c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r5)
            goto L48
        L2f:
            e.b.c.b(r5)
            com.waze.shared_infra.r.y r5 = r4.f33399a
            kotlinx.coroutines.b.ch r5 = r5.a()
            com.waze.profile.j r2 = new com.waze.profile.j
            r2.<init>(r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f33396c = r3
            java.lang.Object r4 = r5.collect(r2, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.profile.l.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return "MoodLoginRefresher";
    }
}
