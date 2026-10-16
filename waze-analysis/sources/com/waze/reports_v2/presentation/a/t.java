package com.waze.reports_v2.presentation.a;

import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34750a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f34751b;

    /* renamed from: c, reason: collision with root package name */
    private at f34752c;

    /* renamed from: d, reason: collision with root package name */
    private at f34753d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f34754e;

    public t(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eVar, "logger");
        this.f34750a = eVar;
        bn bnVarB = ck.b(null);
        this.f34751b = bnVarB;
        this.f34754e = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    private final void e() {
        at atVar = this.f34753d;
        if (atVar == null) {
            atVar = this.f34752c;
        }
        this.f34751b.e(atVar);
    }

    @Override // com.waze.reports_v2.presentation.a.s
    public final ch a() {
        return this.f34754e;
    }

    @Override // com.waze.reports_v2.presentation.a.s
    public final void b() {
        this.f34750a.a("clearing report later button");
        this.f34753d = null;
        e();
    }

    @Override // com.waze.reports_v2.presentation.a.s
    public final void c() {
        this.f34750a.a("clearing sos button");
        this.f34752c = null;
        e();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34750a.g("closing report later");
    }

    @Override // com.waze.reports_v2.presentation.a.s
    public final void d(at atVar) {
        h.g.b.x.f(atVar, "button");
        com.waze.reports_v2.b.ad adVarD = atVar.d();
        Objects.toString(adVarD);
        this.f34750a.a("setting report later to ".concat(String.valueOf(adVarD)));
        com.waze.reports_v2.b.ad adVarD2 = atVar.d();
        com.waze.reports_v2.b.ad adVar = com.waze.reports_v2.b.ad.f34017a;
        if (adVarD2.ordinal() != 1) {
            this.f34753d = atVar;
        } else {
            this.f34752c = atVar;
        }
        e();
    }
}
