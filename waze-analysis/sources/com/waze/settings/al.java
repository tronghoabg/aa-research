package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.ix;
import com.waze.mg;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.view.popups.RequestAlwaysLocationDialogActivity;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f36777a;

    /* renamed from: b, reason: collision with root package name */
    private String f36778b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ al(com.waze.shared_infra.o.a aVar, List list) {
        com.waze.ui.ac.n nVarC = com.waze.ui.ad.b.c(Integer.valueOf(R.string.TIME_TO_LEAVE_REMINDER));
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_CALENDAR_RECEIVE_EARLY_REMINDERS;
        h.g.b.x.e(bVar, "CONFIG_VALUE_CALENDAR_RECEIVE_EARLY_REMINDERS");
        super("notification_type", "NOTIFICATION_TYPE_SETTINGS", nVarC, null, new com.waze.settings.tree.c.a(bVar), list, 8);
        this.f36777a = aVar;
        this.f36778b = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(com.waze.settings.tree.d.g gVar, dd ddVar, String str) {
        ds dsVarK;
        de deVar = ddVar instanceof de ? (de) ddVar : null;
        if (deVar != null && (dsVarK = deVar.k()) != null) {
            dsVarK.P(true);
        }
        E().c(null, gVar.s(), str);
        L(gVar, ddVar, str);
    }

    private final void L(com.waze.settings.tree.d.g gVar, dd ddVar, String str) {
        I(gVar);
        al alVar = this;
        com.waze.settings.tree.g gVarB = ddVar.b();
        String strR = gVarB != null ? gVarB.r() : null;
        com.waze.settings.tree.d.g gVarF = F();
        com.waze.search.v2.o.h(alVar, strR, str, gVarF != null ? gVarF.s() : null);
        ddVar.a().b(20001);
        for (com.waze.settings.tree.f fVar : i()) {
            h.g.b.x.d(fVar, "null cannot be cast to non-null type com.waze.settings.tree.nodes.SettingChoiceOption");
            com.waze.settings.tree.d.g gVar2 = (com.waze.settings.tree.d.g) fVar;
            String strS = fVar.s();
            com.waze.settings.tree.d.g gVarF2 = F();
            gVar2.f(h.g.b.x.n(strS, gVarF2 != null ? gVarF2.s() : null));
        }
    }

    private final void M(boolean z) {
        if (!z || !N()) {
            for (com.waze.settings.tree.f fVar : i()) {
                h.g.b.x.d(fVar, "null cannot be cast to non-null type com.waze.settings.tree.nodes.SettingChoiceOption");
                ((com.waze.settings.tree.d.g) fVar).f(h.g.b.x.n(fVar.s(), "none"));
            }
            this.f36778b = this.f36777a.c(R.string.CALENDAR_REMINDER_OPTIONS_NONE, new Object[0]);
            return;
        }
        String strB = E().b();
        if (strB == null) {
            strB = "";
        }
        for (com.waze.settings.tree.f fVar2 : i()) {
            h.g.b.x.d(fVar2, "null cannot be cast to non-null type com.waze.settings.tree.nodes.SettingChoiceOption");
            ((com.waze.settings.tree.d.g) fVar2).f(h.g.b.x.n(fVar2.s(), strB));
        }
        this.f36778b = G(strB);
    }

    private static final boolean N() {
        return ix.m(mg.f29780a.a());
    }

    static final h.ab c(al alVar, WazeSettingsView wazeSettingsView, Boolean bool) {
        alVar.M(h.g.b.x.n(bool, true));
        wazeSettingsView.P(alVar.f36778b);
        return h.ab.f48028a;
    }

    static final h.ab f(al alVar, Boolean bool) {
        alVar.M(h.g.b.x.n(bool, true));
        return h.ab.f48028a;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    public final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        final WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        deVar.k().e().observe(deVar.h(), new aw(new h.g.a.l() { // from class: com.waze.settings.aj
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return al.c(this.f36771a, wazeSettingsView, (Boolean) obj);
            }
        }, 1, (byte[]) null));
        return wazeSettingsView;
    }

    @Override // com.waze.settings.tree.d.d
    public final void d(com.waze.settings.tree.d.g gVar, dd ddVar) {
        ds dsVarK;
        h.g.b.x.f(gVar, "option");
        h.g.b.x.f(ddVar, "page");
        if (!com.waze.navigate.location_preview.ba.g(mg.f29780a.a())) {
            com.waze.ab.o oVar = new com.waze.ab.o();
            com.waze.shared_infra.o.a aVar = this.f36777a;
            oVar.Q(aVar.c(R.string.UHHOHE, new Object[0]));
            oVar.P(aVar.c(R.string.NETWORK_CONNECTION_PROBLEMS__PLEASE_TRY_AGAIN_LATER_, new Object[0]));
            oVar.M(aVar.c(R.string.OKAY, new Object[0]));
            oVar.y(false);
            oVar.f13808a = new com.waze.dc(ddVar, 14);
            com.waze.z.a.d.ai.q(oVar);
            return;
        }
        String strB = E().b();
        if (h.g.b.x.n(gVar.s(), "none")) {
            de deVar = ddVar instanceof de ? (de) ddVar : null;
            if (deVar != null && (dsVarK = deVar.k()) != null) {
                dsVarK.P(false);
            }
            L(gVar, ddVar, strB);
            return;
        }
        if (N()) {
            C(gVar, ddVar, strB);
            return;
        }
        de deVar2 = (de) ddVar;
        RequestAlwaysLocationDialogActivity.n(com.waze.network.f.ak.p(deVar2), com.waze.view.popups.n.f45330d, 15001);
        com.waze.ifs.ui.a aVarP = com.waze.network.f.ak.p(deVar2);
        if (aVarP != null) {
            aVarP.ax(new ak(this, gVar, deVar2, strB));
        }
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.g
    public final void h(de deVar) {
        h.g.b.x.f(deVar, "page");
        super.h(deVar);
        deVar.k().e().observe(deVar.h(), new aw((h.g.a.l) new am(this, 1), 1, (byte[]) null));
    }
}
