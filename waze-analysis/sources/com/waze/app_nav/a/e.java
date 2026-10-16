package com.waze.app_nav.a;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends az {

    /* renamed from: a, reason: collision with root package name */
    private final k f15137a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15138b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15139d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f15140e;

    /* renamed from: f, reason: collision with root package name */
    private com.waze.sharedui.profile.b f15141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar) {
        super(null);
        h.g.b.x.f(kVar, "controller");
        this.f15137a = kVar;
        this.f15140e = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.app_nav.a.e r6, com.waze.app_nav.a.p r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.app_nav.a.d
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.app_nav.a.d r0 = (com.waze.app_nav.a.d) r0
            int r1 = r0.f15135c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15135c = r1
            goto L18
        L13:
            com.waze.app_nav.a.d r0 = new com.waze.app_nav.a.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15133a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f15135c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            com.waze.app_nav.a.p r6 = r0.f15136d
            com.waze.app_nav.a.p r6 = (com.waze.app_nav.a.p) r6
            e.b.c.b(r8)
            goto L71
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r8)
            boolean r8 = r6.f15139d
            if (r8 == 0) goto L3e
            h.ab r6 = h.ab.f48028a
            return r6
        L3e:
            r6.f15139d = r4
            r8 = r6
            com.waze.app_nav.a.az r8 = (com.waze.app_nav.a.az) r8
            org.a.d.k.b r8 = com.waze.app_nav.a.s.a()
            int r2 = h.g.b.ar.f48106a
            h.g.b.m r2 = new h.g.b.m
            java.lang.Class<com.waze.app_nav.a.an> r5 = com.waze.app_nav.a.an.class
            r2.<init>(r5)
            java.lang.Object r8 = r8.a(r2, r3, r3)
            com.waze.app_nav.a.az r8 = (com.waze.app_nav.a.az) r8
            com.waze.app_nav.a.ay r2 = com.waze.app_nav.a.ay.f15122a
            com.waze.shared_infra.coordinators.g r2 = (com.waze.shared_infra.coordinators.g) r2
            r8.E(r2)
            com.waze.app_nav.a.an r8 = (com.waze.app_nav.a.an) r8
            com.waze.shared_infra.coordinators.o r8 = (com.waze.shared_infra.coordinators.o) r8
            com.waze.mo r2 = new com.waze.mo
            r2.<init>(r4)
            r0.f15136d = r7
            r0.f15135c = r4
            java.lang.Object r8 = r6.x(r8, r2, r0)
            if (r8 != r1) goto L71
            return r1
        L71:
            com.waze.settings.tree.a.d r8 = (com.waze.settings.tree.a.d) r8
            boolean r6 = r8 instanceof com.waze.shared_infra.coordinators.d
            if (r6 != 0) goto L82
            boolean r6 = r8 instanceof com.waze.shared_infra.coordinators.e
            if (r6 == 0) goto L7c
            throw r3
        L7c:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        L82:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.app_nav.a.e.c(com.waze.app_nav.a.e, com.waze.app_nav.a.p, h.c.e):java.lang.Object");
    }

    public final k a() {
        return this.f15137a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* synthetic */ com.waze.shared_infra.coordinators.s b() {
        return this.f15137a;
    }

    @Override // com.waze.shared_infra.coordinators.o
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        Constructor constructor;
        b bVar;
        r rVar = (r) obj;
        h.g.b.x.f(rVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(rVar, q.f15158a)) {
            this.f15141f = J(new t(), false);
            return;
        }
        if (h.g.b.x.n(rVar, m.f15153a)) {
            this.f15140e.clear();
            com.waze.sharedui.profile.b bVar2 = this.f15141f;
            if (bVar2 != null) {
                bVar2.o();
            }
            B();
            return;
        }
        b bVar3 = null;
        if (!(rVar instanceof l)) {
            if (h.g.b.x.n(rVar, o.f15157a)) {
                kotlinx.coroutines.aj.z(A(), null, null, new i(this, (h.c.e) null, 1), 3);
                return;
            } else if (rVar instanceof n) {
                kotlinx.coroutines.aj.z(A(), null, null, new c(this, rVar, null, 1, null), 3);
                return;
            } else {
                if (!(rVar instanceof p)) {
                    throw new h.i();
                }
                kotlinx.coroutines.aj.z(A(), null, null, new c(this, rVar, (h.c.e) null, 0), 3);
                return;
            }
        }
        l lVar = (l) rVar;
        Map map = this.f15140e;
        com.waze.sharedui.profile.b bVar4 = (com.waze.sharedui.profile.b) map.get(Long.valueOf(lVar.a().a()));
        if (bVar4 != null) {
            bVar4.o();
            return;
        }
        com.waze.app_nav.m mVarA = lVar.a();
        Class clsC = mVarA.b().c();
        if (clsC != null && (constructor = clsC.getConstructor(null)) != null && (bVar = (b) constructor.newInstance(null)) != null) {
            Bundle bundleB = mVarA.b().b();
            bundleB.putLong("DESTINATION_ID", mVarA.a());
            bVar.setArguments(bundleB);
            bVar3 = bVar;
        }
        if (bVar3 != null) {
            map.put(Long.valueOf(lVar.a().a()), J(bVar3, true));
        } else {
            map.clear();
            this.f15137a.c();
        }
    }
}
