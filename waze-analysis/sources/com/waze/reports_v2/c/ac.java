package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends h.c.b.a.g implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    int f34159a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f34160b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f34161c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f34162d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f34163e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f34164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ad adVar, String str, String str2, com.waze.reports_v2.b.ac acVar, h.c.e eVar, int i2) {
        super(1, eVar);
        this.f34164f = i2;
        this.f34160b = adVar;
        this.f34161c = str;
        this.f34162d = str2;
        this.f34163e = acVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(h.c.e eVar) {
        if (this.f34164f != 0) {
            Object obj = this.f34162d;
            Object obj2 = this.f34161c;
            return new ac((k) obj, (com.waze.sharedui.e.c) obj2, (com.waze.reports_v2.b.af) this.f34160b, (com.waze.reports_v2.b.h) this.f34163e, eVar, 1);
        }
        Object obj3 = this.f34160b;
        Object obj4 = this.f34161c;
        return new ac((ad) obj3, (String) obj4, (String) this.f34162d, (com.waze.reports_v2.b.ac) this.f34163e, eVar, 0);
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        return this.f34164f != 0 ? ((ac) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a) : ((ac) create((h.c.e) obj)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        if (this.f34164f == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f34159a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            Object obj2 = this.f34160b;
            Object obj3 = this.f34161c;
            Object obj4 = this.f34162d;
            Object obj5 = this.f34163e;
            ad adVar = (ad) obj2;
            this.f34159a = 1;
            Object objB = adVar.f34167c.b(adVar.d(), (String) obj3, (String) obj4, (com.waze.reports_v2.b.ac) obj5, this);
            return objB == aVar ? aVar : objB;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f34159a != 0) {
            e.b.c.b(obj);
            objA = obj;
        } else {
            e.b.c.b(obj);
            Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_MAP_ISSUE_NEW_API_ENABLED.b();
            h.g.b.x.e(boolB, "getValue(...)");
            boolean zBooleanValue = boolB.booleanValue();
            Object obj6 = this.f34162d;
            if (!zBooleanValue) {
                Object obj7 = this.f34163e;
                ((k) obj6).f34513e.reportMapIssue(obj7 != null ? ((com.waze.reports_v2.b.h) obj7).a() : null, ((com.waze.reports_v2.b.af) this.f34160b).a(), false);
                return new c(0L);
            }
            Object obj8 = this.f34161c;
            Object obj9 = this.f34160b;
            Object obj10 = this.f34163e;
            com.waze.reports_v2.b.am amVar = ((k) obj6).f34511c;
            String strA = obj10 != null ? ((com.waze.reports_v2.b.h) obj10).a() : null;
            Boolean boolB2 = ConfigValues.CONFIG_VALUE_REPORTING_MAP_ISSUE_USER_DID_SEE_DISCLAIMER.b();
            h.g.b.x.e(boolB2, "getValue(...)");
            this.f34159a = 1;
            objA = amVar.a(new com.waze.reports_v2.b.aj((com.waze.sharedui.e.c) obj8, (com.waze.reports_v2.b.af) obj9, strA, boolB2.booleanValue(), com.waze.reports_v2.b.ai.f34052a), this);
            if (objA == aVar2) {
                return aVar2;
            }
        }
        com.waze.reports_v2.a.a.a.d dVar = (com.waze.reports_v2.a.a.a.d) objA;
        if (h.g.b.x.n(dVar, com.waze.reports_v2.b.ak.f34060a)) {
            return b.f34229a;
        }
        if (h.g.b.x.n(dVar, com.waze.reports_v2.b.al.f34061a)) {
            return new c(0L);
        }
        throw new h.i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(k kVar, com.waze.sharedui.e.c cVar, com.waze.reports_v2.b.af afVar, com.waze.reports_v2.b.h hVar, h.c.e eVar, int i2) {
        super(1, eVar);
        this.f34164f = i2;
        this.f34162d = kVar;
        this.f34161c = cVar;
        this.f34160b = afVar;
        this.f34163e = hVar;
    }
}
