package com.waze.reports_v2.a.b;

import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.af;
import com.waze.reports_v2.c.bk;
import com.waze.reports_v2.c.bw;
import com.waze.reports_v2.c.s;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    private final bw f33991a;

    /* renamed from: b, reason: collision with root package name */
    private final af f33992b;

    /* renamed from: c, reason: collision with root package name */
    private final bk f33993c;

    public a(bw bwVar, af afVar, bk bkVar) {
        x.f(bwVar, "consent");
        x.f(afVar, "localeSupport");
        x.f(bkVar, "enabledConfig");
        this.f33991a = bwVar;
        this.f33992b = afVar;
        this.f33993c = bkVar;
    }

    @Override // com.waze.reports_v2.c.s
    public final void f(boolean z) {
        bw bwVar = this.f33991a;
        if (z) {
            bwVar.c();
        } else {
            bwVar.d();
        }
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean h() {
        return l() && m();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean i() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_COMPLIANCE_SHOULD_SHOW_REPORT_GENERAL_KNOWLEDGE_DISCLAIMER.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean j() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_ANIMATED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean k() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_LARGE_REPORT_MENU_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean l() {
        return this.f33993c.a() && this.f33992b.a();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean m() {
        return this.f33991a.a().c();
    }
}
