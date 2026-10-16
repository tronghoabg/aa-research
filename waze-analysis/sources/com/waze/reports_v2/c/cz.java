package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;
import com.waze.navigate.gn;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cz extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34382a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ db f34383b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cs f34384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(db dbVar, cs csVar, h.c.e eVar) {
        super(2, eVar);
        this.f34383b = dbVar;
        this.f34384c = csVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cz(this.f34383b, this.f34384c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f34382a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            db dbVar = this.f34383b;
            dbVar.f34395h.e(new cq(new com.waze.car_lib.i.b.d(dbVar, this.f34384c, 5, null), new gn(dbVar, 16)));
            h.o.c cVar = h.o.a.f48264a;
            Long lB = ConfigValues.CONFIG_VALUE_REPORTING_BUTTON_ANIMATION_OPEN_DURATION_SECONDS.b();
            h.g.b.x.e(lB, "getValue(...)");
            this.f34382a = 1;
            if (kotlinx.coroutines.aj.q(h.o.a.m(h.o.c.j(lB.longValue(), h.o.d.f48273d)), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
