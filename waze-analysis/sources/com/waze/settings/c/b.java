package com.waze.settings.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.sharedui.utils.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ev.n f36925a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.b.d f36926b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f36927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.waze.ev.n nVar, com.waze.sharedui.b.d dVar, com.waze.shared_infra.o.a aVar) {
        super("ev_connectors", "EV_CONNECTORS_SETTINGS", com.waze.ui.ad.b.c(Integer.valueOf(R.string.EV_CONNECTORS_SETTINGS_TITLE)), (com.waze.settings.tree.d) null, (List) null, 56);
        x.f(nVar, "evRepository");
        x.f(dVar, "auditReporter");
        x.f(aVar, "stringProvider");
        this.f36925a = nVar;
        this.f36926b = dVar;
        this.f36927c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Context context) {
        com.waze.settings.tree.d.l lVar = new com.waze.settings.tree.d.l("connector_types_disclaimer", com.waze.ui.ad.b.c(Integer.valueOf(R.string.EV_CONNECTORS_SETTINGS_DISCLAIMER)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.waze.ev.n nVar = this.f36925a;
        for (com.waze.ev.f fVar : nVar.d()) {
            com.waze.settings.tree.a aVar = new com.waze.settings.tree.a(fVar.a());
            int color = ContextCompat.getColor(context, R.color.content_p1);
            x.f(aVar, "<this>");
            x.f(context, "context");
            Drawable drawableP = com.waze.nightmode.e.p(aVar, context);
            if (drawableP != null) {
                DrawableCompat.setTint(drawableP, color);
            }
            b bVar = this;
            a aVar2 = new a(bVar, fVar, fVar.d(), fVar.b(), com.waze.nightmode.e.r(drawableP), fVar.d());
            if (((com.waze.ev.m) nVar.g().d()).b().contains(fVar.d())) {
                aVar2.f(true);
            }
            arrayList2.add(aVar2);
            this = bVar;
        }
        arrayList.addAll(arrayList2);
        arrayList.add(lVar);
        this.B(arrayList);
    }

    @Override // com.waze.settings.tree.d.n, com.waze.settings.tree.f
    protected final View O(de deVar) {
        String strA;
        x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) com.waze.speech.k.d(deVar, this);
        com.waze.ev.n nVar = this.f36925a;
        Set setB = ((com.waze.ev.m) nVar.g().d()).b();
        com.waze.shared_infra.o.a aVar = this.f36927c;
        String strC = aVar.c(R.string.EV_PROFILE_SETTINGS_NONE_SELECTED, new Object[0]);
        if (!setB.isEmpty()) {
            if (setB.size() == 1) {
                com.waze.ev.f fVarA = nVar.a((String) h.a.i.O(setB));
                com.waze.ui.ac.n nVarB = fVarA != null ? fVarA.b() : null;
                if (nVarB != null && (strA = o.a(aVar, nVarB)) != null) {
                    strC = strA;
                }
            } else {
                strC = aVar.c(R.string.EV_PROFILE_SETTINGS_MULTIPLE_SELECTED_PD, Integer.valueOf(setB.size()));
            }
        }
        wazeSettingsView.P(strC);
        return wazeSettingsView;
    }

    public final Integer e() {
        Set setB = ((com.waze.ev.m) this.f36925a.g().d()).b();
        if (setB.isEmpty()) {
            return Integer.valueOf(R.string.EV_PROFILE_SETTINGS_NONE_SELECTED);
        }
        if (setB.size() == 1) {
            return null;
        }
        return Integer.valueOf(R.string.EV_PROFILE_SETTINGS_MULTIPLE_SELECTED_PD);
    }

    @Override // com.waze.settings.tree.g
    public final void h(de deVar) {
        x.f(deVar, "page");
        super.h(deVar);
        ai.m(ai.K(this.f36925a.g(), new e(this, deVar, (h.c.e) null, 1)), ak.q(deVar));
        E(deVar.g());
    }
}
