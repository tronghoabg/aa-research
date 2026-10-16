package com.waze.settings.tree.b;

import android.view.View;
import com.waze.settings.de;
import com.waze.settings.tree.d.g;
import com.waze.settings.tree.d.o;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.ui.ac.n;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.settings.tree.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f37520a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f37521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar, int[] iArr, n nVar, com.waze.settings.tree.d dVar, List list) {
        super("quick_gas_settings", "QUICK_GAS_SETTINGS_SETTINGS", nVar, dVar, list);
        this.f37520a = fVar;
        this.f37521b = iArr;
    }

    @Override // com.waze.settings.tree.e, com.waze.settings.tree.f
    protected final View O(de deVar) {
        x.f(deVar, "page");
        b bVarB = f.d(this.f37520a).b();
        Object obj = i().get(0);
        x.d(obj, "null cannot be cast to non-null type com.waze.settings.tree.nodes.SettingScrollingCardSelector");
        ((o) obj).g(bVarB.c());
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        wazeSettingsView.K(bVarB.a());
        this.f37521b[0] = bVarB.b();
        if (bVarB.c().isEmpty()) {
            wazeSettingsView.setClickable(false);
            wazeSettingsView.setEnabled(false);
        } else {
            wazeSettingsView.P(((g) bVarB.c().get(bVarB.b())).t());
        }
        return wazeSettingsView;
    }
}
