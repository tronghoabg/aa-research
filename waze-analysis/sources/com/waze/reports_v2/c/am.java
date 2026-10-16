package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class am extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f34188a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f34189b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f34190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(an anVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34190c = i2;
        this.f34189b = anVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f34190c;
        return i2 != 0 ? i2 != 1 ? new am((bj) this.f34189b, eVar, 2) : new am((h.g.a.l) this.f34189b, eVar, 1) : new am((an) this.f34189b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f34190c;
        return i2 != 0 ? i2 != 1 ? ((am) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((am) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((am) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r7v23, types: [h.g.a.l, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f34190c;
        if (i2 != 0) {
            if (i2 != 1) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f34188a == 0) {
                    e.b.c.b(obj);
                    bj bjVar = (bj) this.f34189b;
                    this.f34188a = 1;
                    if (bjVar.m.g().collect(new bg(bjVar), this) == aVar) {
                        return aVar;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            }
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f34188a != 0) {
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            ?? r7 = this.f34189b;
            this.f34188a = 1;
            Object objInvoke = r7.invoke(this);
            return objInvoke == aVar2 ? aVar2 : objInvoke;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f34188a == 0) {
            e.b.c.b(obj);
            if (!((an) this.f34189b).f34194d.b()) {
                h.o.c cVar = h.o.a.f48264a;
                Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_DELAY_AFTER_NAVIGATION_START_SECONDS.b();
                h.g.b.x.e(lB, "getValue(...)");
                this.f34188a = 1;
                if (kotlinx.coroutines.aj.q(h.o.a.m(h.o.c.j(lB.longValue(), h.o.d.f48273d)), this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        e.b.c.b(obj);
        an anVar = (an) this.f34189b;
        if (an.e(anVar)) {
            anVar.f34194d.h();
            boolean z = false;
            if (ConfigValues.CONFIG_VALUE_COMPLIANCE_SHOULD_SHOW_REPORT_GENERAL_KNOWLEDGE_DISCLAIMER.b().booleanValue() && !ConfigValues.CONFIG_VALUE_COMPLIANCE_REPORT_GENERAL_KNOWLEDGE_DISCLAIMER_SHOWN.b().booleanValue()) {
                z = true;
            }
            kotlinx.coroutines.b.bn bnVar = anVar.f34197g;
            Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_USER_DECLINED_PERMISSION.b();
            h.g.b.x.e(boolB, "getValue(...)");
            bnVar.e(new ah(boolB.booleanValue(), z));
            if (z) {
                ConfigValues.CONFIG_VALUE_COMPLIANCE_REPORT_GENERAL_KNOWLEDGE_DISCLAIMER_SHOWN.d(true);
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(bj bjVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34190c = i2;
        this.f34189b = bjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    am(h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f34190c = i2;
        this.f34189b = lVar;
    }
}
