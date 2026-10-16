package com.waze.settings;

import android.view.View;
import com.waze.settings.tree.views.WazeSettingsView;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fi extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f37257a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gr f37258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fi(List list, gr grVar, com.waze.ui.ac.n nVar, com.waze.settings.tree.c.h hVar, com.waze.settings.tree.d dVar) {
        super("gas_type", "GAS_TYPE_SETTINGS", nVar, dVar, hVar, list);
        this.f37257a = list;
        this.f37258b = grVar;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        if (this.f37257a.isEmpty()) {
            wazeSettingsView.setClickable(false);
            wazeSettingsView.setEnabled(false);
        } else {
            wazeSettingsView.P(this.f37258b.f37335h.f());
        }
        wazeSettingsView.K(this.f37258b.f37335h.a());
        return wazeSettingsView;
    }
}
