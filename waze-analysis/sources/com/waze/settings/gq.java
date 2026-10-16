package com.waze.settings;

import android.view.View;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gq extends com.waze.settings.tree.d.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37327a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gq(gr grVar, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, com.waze.ui.ac.n nVar2) {
        super("waze_voice", "WAZE_VOICE_SETTINGS", nVar, nVar2, dVar, 32);
        this.f37327a = grVar;
    }

    @Override // com.waze.settings.tree.d.i, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        kotlinx.coroutines.aj.z(com.waze.network.f.ak.q(deVar), null, null, new di(this.f37327a, wazeSettingsView, (h.c.e) null, 12), 3);
        return wazeSettingsView;
    }
}
