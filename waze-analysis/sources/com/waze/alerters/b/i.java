package com.waze.alerters.b;

import com.waze.alerters.a.ac;
import com.waze.alerters.a.z;
import com.waze.an.a.x;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.InsightPriority;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements com.waze.alerters.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f14242a;

    /* renamed from: b, reason: collision with root package name */
    private final ac f14243b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.k f14244c;

    /* renamed from: d, reason: collision with root package name */
    private final x f14245d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f14246e;

    public i(p pVar, com.waze.j jVar, ac acVar) {
        InsightPriority insightPriorityE;
        h.g.b.x.f(jVar, "data");
        h.g.b.x.f(acVar, "zoneAlertState");
        this.f14242a = pVar;
        this.f14243b = acVar;
        this.f14244c = jVar.f();
        z zVarA = pVar.f14264f.a();
        this.f14245d = (zVarA == null || (insightPriorityE = zVarA.e()) == null) ? x.f14612a : com.waze.destination_cell.b.e.d(insightPriorityE);
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_ALERTS_ZONE_ALERT_DURATION_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f14246e = ai.U(ck.b(com.waze.j.z(jVar, null, null, new com.waze.i(h.o.c.j(lB.longValue(), h.o.d.f48273d), com.waze.h.f24304a), null, -16385)));
    }

    @Override // com.waze.alerters.a.c
    public final com.waze.k a() {
        return this.f14244c;
    }

    @Override // com.waze.alerters.a.c
    public final /* synthetic */ com.waze.alerters.a.b b() {
        return new com.waze.alerters.a.b(false, false, null);
    }

    @Override // com.waze.alerters.a.c
    public final x c() {
        return this.f14245d;
    }

    @Override // com.waze.alerters.a.c
    public final ch d() {
        return this.f14246e;
    }

    @Override // com.waze.alerters.a.c
    public final void e(com.waze.alerters.a.a aVar) {
        h.g.b.x.f(aVar, "action");
        if (this.f14243b == ac.f14150c) {
            p pVar = this.f14242a;
            pVar.f14260b.a(this.f14244c, aVar);
        }
    }

    @Override // com.waze.alerters.a.c
    public final void f() {
        if (this.f14243b == ac.f14150c) {
            p pVar = this.f14242a;
            pVar.f14260b.b(this.f14244c);
        }
    }

    @Override // com.waze.alerters.a.c
    public final void g() {
    }

    @Override // com.waze.alerters.a.c
    public final void h(com.waze.f fVar) {
        h.g.b.x.f(fVar, "rejectedAlertReason");
    }

    @Override // com.waze.alerters.a.c
    public final void i() {
    }

    @Override // com.waze.alerters.a.c
    public final void j() {
    }

    @Override // com.waze.alerters.a.c
    public final void k() {
        ac acVar = ac.f14148a;
        int iOrdinal = this.f14243b.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            this.f14242a.f14260b.g();
        } else {
            p pVar = this.f14242a;
            com.waze.k kVar = this.f14244c;
            pVar.f14260b.d(kVar);
            pVar.f14260b.f(kVar);
        }
    }
}
