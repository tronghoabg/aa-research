package com.waze.settings.tree;

import android.view.View;
import com.waze.R;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends com.waze.settings.tree.d.g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f37573b = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f37574a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, com.waze.ui.ac.n nVar) {
        super("loader", nVar, null, null, null, null, 60);
        this.f37574a = lVar;
    }

    @Override // com.waze.settings.tree.d.g, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(com.waze.shared_infra.o.b.a().c(R.string.___, new Object[0]));
        wazeSettingsView.G();
        l lVar = this.f37574a;
        lVar.f37575a.getLanguages(new com.waze.car_lib.i.a.v(lVar, deVar, 5, null));
        return wazeSettingsView;
    }
}
