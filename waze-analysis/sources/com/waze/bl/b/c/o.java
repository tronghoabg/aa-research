package com.waze.bl.b.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements com.waze.bl.c.c.c, com.waze.reports_v2.c.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.c.s f16969a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.config.c f16970b;

    public o(com.waze.reports_v2.c.s sVar) {
        h.g.b.x.f(sVar, "commonConfig");
        this.f16969a = sVar;
        this.f16970b = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_FTE_HINT_SHOWN_COUNT;
    }

    @Override // com.waze.bl.c.c.c
    public final int a() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_CLOSURE_CANDIDATES_CAPPING.b().longValue();
    }

    @Override // com.waze.t.b.c
    public final String b() {
        return "REPORTING_AGENT_ERROR_TTS_TEXT";
    }

    @Override // com.waze.t.b.c
    public final void c() {
        com.waze.config.c cVar = this.f16970b;
        cVar.d(Long.valueOf(cVar.b().longValue() + 1));
    }

    @Override // com.waze.bl.c.c.c
    public final boolean d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_ACTION_HANDLING_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.t.b.c
    public final boolean e() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_SOUND_CUE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.reports_v2.c.s
    public final void f(boolean z) {
        this.f16969a.f(z);
    }

    @Override // com.waze.bl.c.c.c
    public final boolean g() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_DYNAMIC_CONTENT_CHANGES_ANDROID_INCAR_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean h() {
        return this.f16969a.h();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean i() {
        return this.f16969a.i();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean j() {
        return this.f16969a.j();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean k() {
        return this.f16969a.k();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean l() {
        return this.f16969a.l();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean m() {
        return this.f16969a.m();
    }

    @Override // com.waze.t.b.c
    public final boolean q() {
        return ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_FTE_HINT_ENABLED.b().booleanValue() && ((int) this.f16970b.b().longValue()) < ((int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_FTE_HINT_MAX_TIMES.b().longValue());
    }
}
