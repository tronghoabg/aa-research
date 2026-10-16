package com.waze.settings.tree;

import android.view.View;
import com.waze.R;
import com.waze.settings.de;
import h.g.b.aq;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ de f37587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f37588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37590d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f37591e;

    public /* synthetic */ t(com.waze.settings.c.a aVar, com.waze.settings.c.b bVar, com.waze.ev.f fVar, de deVar, int i2) {
        this.f37591e = i2;
        this.f37588b = aVar;
        this.f37589c = bVar;
        this.f37590d = fVar;
        this.f37587a = deVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f37591e;
        f fVar = this.f37588b;
        if (i2 == 0) {
            de deVar = this.f37587a;
            com.waze.search.v2.o.g(fVar, deVar);
            aq aqVar = (aq) this.f37589c;
            Object obj = aqVar.f48105a;
            if (obj == null || ((br) obj).u()) {
                aqVar.f48105a = ((ab) fVar).d(deVar, (com.waze.ifs.ui.x) this.f37590d);
            }
            deVar.k().ab();
            return;
        }
        com.waze.settings.tree.d.g gVar = (com.waze.settings.tree.d.g) fVar;
        boolean zG = gVar.g();
        Object obj2 = this.f37590d;
        Object obj3 = this.f37589c;
        if (zG) {
            ((com.waze.settings.c.b) obj3).f36925a.k(((com.waze.ev.f) obj2).d());
        } else {
            ((com.waze.settings.c.b) obj3).f36925a.i(((com.waze.ev.f) obj2).d(), true);
        }
        com.waze.search.v2.o.g(fVar, this.f37587a);
        ((com.waze.settings.c.b) obj3).f36926b.reportAuditEvent(new com.waze.sharedui.b.a(i.b.a.p.WAZE_EV_CONNECTOR, i.b.a.m.SETTINGS_MENU, gVar.g() ? i.b.a.o.ENABLED : i.b.a.o.DISABLED, ((com.waze.ev.f) obj2).d(), h.a.i.i(Integer.valueOf(R.string.EV_CONNECTORS_SETTINGS_TITLE), Integer.valueOf(R.string.EV_CONNECTORS_SETTINGS_DISCLAIMER))));
    }

    public /* synthetic */ t(ab abVar, de deVar, aq aqVar, com.waze.ifs.ui.x xVar, int i2) {
        this.f37591e = i2;
        this.f37588b = abVar;
        this.f37587a = deVar;
        this.f37589c = aqVar;
        this.f37590d = xVar;
    }
}
