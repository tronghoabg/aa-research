package com.waze.map.isolated;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ah implements ad, n {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicLong f29221b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private final ad f29222c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29223d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f29224e;

    /* renamed from: f, reason: collision with root package name */
    private Long f29225f;

    public ah(ad adVar) {
        h.g.b.x.f(adVar, "rendererFactory");
        this.f29222c = adVar;
        this.f29223d = com.waze.shared_infra.i.a.d("MobileCanvasRendererFactory");
        this.f29224e = new LinkedHashMap();
    }

    public static final /* synthetic */ void h(ah ahVar, long j2, ab abVar) {
        Long l2 = ahVar.f29225f;
        if (l2 == null || l2.longValue() != j2) {
            ahVar.f29224e.remove(Long.valueOf(j2));
            return;
        }
        abVar.v();
        ahVar.f29225f = null;
        LinkedHashMap linkedHashMap = ahVar.f29224e;
        Set setKeySet = linkedHashMap.keySet();
        h.g.b.x.e(setKeySet, "<get-keys>(...)");
        Long l3 = (Long) h.a.i.Q(setKeySet);
        if (l3 != null) {
            Long lValueOf = Long.valueOf(l3.longValue());
            ab abVar2 = (ab) linkedHashMap.remove(lValueOf);
            if (abVar2 != null) {
                abVar2.u();
                ahVar.f29225f = lValueOf;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j2, ab abVar) {
        Long l2 = this.f29225f;
        if (l2 != null && l2.longValue() == j2) {
            return;
        }
        if (this.f29225f != null) {
            this.f29224e.put(Long.valueOf(j2), abVar);
        } else {
            this.f29225f = Long.valueOf(j2);
            abVar.u();
        }
    }

    @Override // com.waze.map.isolated.ad
    public final ab a(String str, d dVar) {
        h.g.b.x.f(str, "canvasTag");
        h.g.b.x.f(dVar, "view");
        return new af(this, str, this.f29222c.a(str, dVar));
    }

    @Override // com.waze.map.isolated.n
    public final ag b() {
        ae aeVar = new ae();
        i(f29221b.incrementAndGet(), aeVar);
        return new ag(aeVar);
    }
}
