package com.waze.speech;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.settings.de;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class k {
    public k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View d(de deVar, com.waze.settings.tree.f fVar) {
        h.g.b.x.f(deVar, "page");
        h.g.b.x.f(fVar, "setting");
        boolean z = fVar instanceof com.waze.settings.tree.d.q;
        Context contextG = deVar.g();
        if (z) {
            return new com.waze.settings.tree.views.l(contextG);
        }
        if (fVar instanceof com.waze.settings.tree.d.k) {
            com.waze.settings.tree.views.s sVar = new com.waze.settings.tree.views.s(contextG);
            sVar.a((com.waze.settings.tree.d.k) fVar, deVar);
            return sVar;
        }
        if (fVar instanceof com.waze.settings.tree.d.s) {
            com.waze.settings.tree.views.p pVar = new com.waze.settings.tree.views.p(contextG);
            pVar.a((com.waze.settings.tree.d.s) fVar, deVar);
            return pVar;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (fVar instanceof com.waze.settings.tree.d.m) {
            com.waze.settings.tree.views.g gVar = new com.waze.settings.tree.views.g(contextG);
            com.waze.settings.tree.d.m mVar = (com.waze.settings.tree.d.m) fVar;
            h.g.b.x.f(mVar, "setting");
            h.g.b.x.f(deVar, "page");
            gVar.removeAllViews();
            SettingsTitleText settingsTitleText = new SettingsTitleText(deVar.g(), null);
            settingsTitleText.a(mVar.t());
            settingsTitleText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            gVar.addView(settingsTitleText);
            View view = null;
            for (com.waze.settings.tree.f fVar2 : mVar.i()) {
                View viewK = fVar2.k(deVar);
                if (viewK != null) {
                    viewK.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    viewK.setTag(fVar2.s());
                    gVar.addView(viewK);
                    if ((view instanceof WazeSettingsView) && !(viewK instanceof WazeSettingsView)) {
                        ((WazeSettingsView) view).M();
                    }
                    view = viewK;
                }
            }
            WazeSettingsView wazeSettingsView = view instanceof WazeSettingsView ? (WazeSettingsView) view : null;
            if (wazeSettingsView != null) {
                wazeSettingsView.M();
            }
            gVar.setTag(mVar.s());
            return gVar;
        }
        if (fVar instanceof com.waze.settings.tree.d.r) {
            com.waze.settings.tree.views.p pVar2 = new com.waze.settings.tree.views.p(contextG, (byte[]) null);
            pVar2.b((com.waze.settings.tree.d.r) fVar, deVar);
            return pVar2;
        }
        if (fVar instanceof com.waze.settings.tree.d.l) {
            com.waze.settings.tree.views.t tVar = new com.waze.settings.tree.views.t(contextG);
            com.waze.settings.tree.d.l lVar = (com.waze.settings.tree.d.l) fVar;
            h.g.b.x.f(lVar, "setting");
            h.g.b.x.f(deVar, "page");
            tVar.c(lVar.t());
            tVar.setTag(lVar.s());
            tVar.a(lVar.c());
            tVar.b(lVar.c());
            return tVar;
        }
        if (fVar instanceof com.waze.settings.tree.d.p) {
            com.waze.settings.tree.views.k kVar = new com.waze.settings.tree.views.k(contextG);
            kVar.a((com.waze.settings.tree.d.p) fVar, deVar);
            return kVar;
        }
        if (fVar instanceof com.waze.settings.tree.i) {
            com.waze.settings.tree.views.p pVar3 = new com.waze.settings.tree.views.p(contextG, (char[]) null);
            ((com.waze.settings.tree.i) fVar).d();
            pVar3.c((com.waze.settings.tree.d.n) fVar, deVar);
            return pVar3;
        }
        if (fVar instanceof com.waze.settings.tree.d.n) {
            com.waze.settings.tree.views.p pVar4 = new com.waze.settings.tree.views.p(contextG, (char[]) null);
            pVar4.c((com.waze.settings.tree.d.n) fVar, deVar);
            return pVar4;
        }
        if (fVar instanceof com.waze.settings.tree.d.j) {
            com.waze.settings.tree.views.p pVar5 = new com.waze.settings.tree.views.p(contextG, (byte[]) null, (byte[]) null);
            com.waze.settings.tree.d.j jVar = (com.waze.settings.tree.d.j) fVar;
            h.g.b.x.f(jVar, "setting");
            h.g.b.x.f(deVar, "page");
            pVar5.A(jVar.t());
            com.waze.nightmode.e.q(pVar5, jVar.m());
            pVar5.B(0);
            pVar5.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(deVar, jVar, 7));
            pVar5.setTag(jVar.s());
            return pVar5;
        }
        if (fVar instanceof com.waze.settings.tree.d.i) {
            com.waze.settings.tree.views.p pVar6 = new com.waze.settings.tree.views.p(contextG, (short[]) null);
            com.waze.settings.tree.d.i iVar = (com.waze.settings.tree.d.i) fVar;
            h.g.b.x.f(iVar, "setting");
            h.g.b.x.f(deVar, "page");
            pVar6.A(iVar.t());
            pVar6.P(iVar.P());
            com.waze.nightmode.e.q(pVar6, iVar.m());
            pVar6.B(0);
            pVar6.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(iVar, deVar, 6, objArr3 == true ? 1 : 0));
            pVar6.setTag(iVar.s());
            return pVar6;
        }
        if (fVar instanceof com.waze.settings.tree.d.h) {
            com.waze.settings.tree.views.p pVar7 = new com.waze.settings.tree.views.p(contextG, (byte[]) null, (char[]) null);
            com.waze.settings.tree.d.h hVar = (com.waze.settings.tree.d.h) fVar;
            h.g.b.x.f(hVar, "setting");
            h.g.b.x.f(deVar, "page");
            pVar7.A(hVar.t());
            pVar7.B(0);
            pVar7.setTag(hVar.s());
            Integer numO = hVar.o();
            if (numO != null) {
                pVar7.o(numO.intValue());
            }
            com.waze.nightmode.e.q(pVar7, hVar.m());
            pVar7.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(hVar, deVar, 5, objArr2 == true ? 1 : 0));
            return pVar7;
        }
        if (fVar instanceof com.waze.settings.tree.d.a) {
            com.waze.settings.tree.views.b bVar = new com.waze.settings.tree.views.b(contextG);
            bVar.h((com.waze.settings.tree.d.a) fVar, deVar);
            return bVar;
        }
        if (fVar instanceof com.waze.settings.tree.d.o) {
            com.waze.settings.tree.views.i iVar2 = new com.waze.settings.tree.views.i(contextG);
            com.waze.settings.tree.d.o oVar = (com.waze.settings.tree.d.o) fVar;
            h.g.b.x.f(oVar, "setting");
            h.g.b.x.f(deVar, "page");
            for (com.waze.settings.tree.d.g gVar2 : oVar.f()) {
                String strT = gVar2.t();
                String strP = gVar2.P();
                com.waze.settings.tree.d dVarM = gVar2.m();
                Context context = iVar2.getContext();
                h.g.b.x.e(context, "getContext(...)");
                Drawable drawableP = com.waze.nightmode.e.p(dVarM, context);
                com.waze.settings.tree.d dVarD = gVar2.d();
                Context context2 = iVar2.getContext();
                h.g.b.x.e(context2, "getContext(...)");
                iVar2.e(strT, strP, drawableP, com.waze.nightmode.e.p(dVarD, context2));
            }
            int iC = oVar.c();
            iVar2.j(new com.waze.settings.tree.views.h(oVar, iC, iVar2, deVar));
            if (oVar.h()) {
                iVar2.h();
            }
            iVar2.f();
            iVar2.g(iC != -1 ? iC : 0);
            iVar2.setTag(oVar.s());
            return iVar2;
        }
        if (!(fVar instanceof com.waze.settings.tree.d.d)) {
            if (fVar instanceof com.waze.settings.tree.d.e) {
                com.waze.settings.tree.views.e eVar = new com.waze.settings.tree.views.e(contextG);
                eVar.a((com.waze.settings.tree.d.e) fVar, deVar);
                return eVar;
            }
            if (fVar instanceof com.waze.settings.tree.d.g) {
                com.waze.settings.tree.views.p pVar8 = new com.waze.settings.tree.views.p(contextG, null, null, null);
                pVar8.d((com.waze.settings.tree.d.g) fVar, deVar);
                return pVar8;
            }
            if (fVar instanceof com.waze.settings.tree.d.b) {
                com.waze.settings.tree.views.c cVar = new com.waze.settings.tree.views.c(contextG);
                cVar.f((com.waze.settings.tree.d.b) fVar, deVar);
                return cVar;
            }
            throw new IllegalArgumentException("Setting of type:" + fVar.getClass().getName() + " has no view associated with it");
        }
        com.waze.settings.tree.views.p pVar9 = new com.waze.settings.tree.views.p(contextG, (char[]) null, (byte[]) null);
        com.waze.settings.tree.d.d dVar = (com.waze.settings.tree.d.d) fVar;
        h.g.b.x.f(dVar, "setting");
        h.g.b.x.f(deVar, "page");
        pVar9.A(dVar.t());
        String strB = dVar.E().b();
        if (strB == null) {
            strB = "";
        }
        pVar9.P(dVar.G(strB));
        com.waze.nightmode.e.q(pVar9, dVar.m());
        pVar9.B(0);
        pVar9.setTag(dVar.s());
        pVar9.setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(dVar, deVar, 4, objArr == true ? 1 : 0));
        if (dVar.o() != null && dVar.p() != null) {
            Integer numO2 = dVar.o();
            h.g.b.x.c(numO2);
            int iIntValue = numO2.intValue();
            Integer numP = dVar.p();
            h.g.b.x.c(numP);
            numP.intValue();
            pVar9.Q(iIntValue);
        }
        return pVar9;
    }

    public static int e() {
        return (int) ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_SHOWN_COUNT.b().longValue();
    }

    public static boolean f() {
        Boolean boolA = ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_FEATURE_ENABLED.b();
        h.g.b.x.e(boolA, "getValue(...)");
        return boolA.booleanValue();
    }

    public static void g(boolean z) {
        ConfigValues.CONFIG_VALUE_WAZE_TO_GOAL_IS_USER_OPTED_IN.d(Boolean.valueOf(z));
    }

    public static String h(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        String strA = ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_MESSAGE.b();
        h.g.b.x.c(strA);
        if (true == h.n.o.G(strA)) {
            strA = null;
        }
        if (strA == null) {
            return aVar.c(R.string.END_OF_DRIVE_SETTINGS_CUSTOM_MESSAGE_DEFAULT, new Object[0]);
        }
        return "\"" + strA + "\"";
    }

    public /* synthetic */ k(byte[] bArr) {
    }
}
