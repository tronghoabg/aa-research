package com.waze.settings.tree.a;

import android.view.View;
import com.waze.R;
import com.waze.network.f.ak;
import com.waze.settings.bs;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t extends com.waze.settings.tree.d.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f37497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(z zVar, com.waze.ui.ac.n nVar) {
        super("loader", nVar, null, null, null, null, 60);
        this.f37497a = zVar;
    }

    @Override // com.waze.settings.tree.d.g, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(com.waze.shared_infra.o.b.a().c(R.string.___, new Object[0]));
        wazeSettingsView.P(ak.l((bs) this.f37497a.c().A().d()));
        wazeSettingsView.G();
        return wazeSettingsView;
    }
}
