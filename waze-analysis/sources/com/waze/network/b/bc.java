package com.waze.network.b;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bc implements ab {

    /* renamed from: a, reason: collision with root package name */
    private final String f31997a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.q.n f31998b;

    /* renamed from: c, reason: collision with root package name */
    private final bg f31999c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32000d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f32001e;

    /* renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap f32002f;

    /* renamed from: g, reason: collision with root package name */
    private final bn f32003g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.network.h.e f32004h;

    public bc(String str, com.waze.shared_infra.q.n nVar, kotlinx.coroutines.ab abVar, bg bgVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(nVar, NotificationCompat.CATEGORY_STOPWATCH);
        h.g.b.x.f(abVar, "dispatcher");
        h.g.b.x.f(bgVar, "commandClient");
        h.g.b.x.f(eVar, "logger");
        this.f31997a = str;
        this.f31998b = nVar;
        this.f31999c = bgVar;
        this.f32000d = eVar;
        kotlinx.coroutines.af afVarG = kotlinx.coroutines.aj.g(kotlinx.coroutines.aj.e(abVar), kotlinx.coroutines.aj.Q());
        this.f32001e = afVarG;
        this.f32004h = new com.waze.network.h.e();
        this.f32002f = new ConcurrentHashMap();
        this.f32003g = ck.b(new ac(0L, 0L, 0L, 0L, 0L, 0L, 0L));
        kotlinx.coroutines.aj.z(afVarG, null, null, new an(this, (h.c.e) null, 2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.network.b.bc r26, com.waze.network.b.w r27, h.c.e r28) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.b.bc.d(com.waze.network.b.bc, com.waze.network.b.w, h.c.e):java.lang.Object");
    }

    @Override // com.waze.network.b.ab
    public final com.waze.shared_infra.s.d a(com.waze.network.g.a aVar, aa aaVar) {
        Object objD;
        ac acVar;
        long jC;
        Object objD2;
        ac acVar2;
        h.g.b.x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        h.g.b.x.f(aaVar, "resultHandler");
        ConcurrentHashMap concurrentHashMap = this.f32002f;
        if (concurrentHashMap.size() < 64) {
            final w wVar = new w(aVar, aaVar, this.f31998b.a());
            com.waze.shared_infra.s.d dVar = new com.waze.shared_infra.s.d() { // from class: com.waze.network.b.az
                @Override // com.waze.shared_infra.s.d
                public final void a() {
                    wVar.d(new bd(false, false, false, null, 0, null, false, 127));
                }
            };
            concurrentHashMap.put(aVar, dVar);
            this.f32004h.d(aVar.f(), new bb(this, wVar, null));
            bn bnVar = this.f32003g;
            do {
                objD = bnVar.d();
                acVar = (ac) objD;
                jC = acVar.c() + 1;
            } while (!bnVar.f(objD, ac.h(acVar, Math.max(acVar.d(), jC - acVar.b()), jC, 0L, 0L, 0L, 0L, 0L, 124)));
            return dVar;
        }
        com.waze.shared_infra.i.e eVar = this.f32000d;
        Objects.toString(aVar);
        eVar.g("queue overflow msg=".concat(aVar.toString()));
        aaVar.a(aVar, new bd(false, false, false, null, 0, null, false, 127));
        bn bnVar2 = this.f32003g;
        do {
            objD2 = bnVar2.d();
            acVar2 = (ac) objD2;
        } while (!bnVar2.f(objD2, ac.h(acVar2, 0L, 0L, 0L, acVar2.e() + 1, 0L, 0L, 0L, 119)));
        return null;
    }

    @Override // com.waze.network.b.ab
    public final Map b() {
        return h.a.r.e(new h.k(this.f31997a, this.f32003g.d()));
    }

    @Override // com.waze.network.b.ab
    public final void c(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "predicate");
        Iterator it = this.f32002f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            com.waze.network.g.a aVar = (com.waze.network.g.a) entry.getKey();
            com.waze.shared_infra.s.d dVar = (com.waze.shared_infra.s.d) entry.getValue();
            if (((Boolean) lVar.invoke(aVar)).booleanValue()) {
                com.waze.shared_infra.i.e eVar = this.f32000d;
                Objects.toString(aVar);
                eVar.g("cancelling msg=".concat(String.valueOf(aVar)));
                dVar.a();
            }
        }
    }
}
