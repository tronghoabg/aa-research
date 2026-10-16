package com.waze.settings;

import android.view.View;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ez extends com.waze.settings.tree.d.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37203a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gr f37204b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ez(ds dsVar, gr grVar) {
        super(NotificationCompat.CATEGORY_EMAIL, R.string.EMAIL, null, 0, null);
        this.f37203a = dsVar;
        this.f37204b = grVar;
    }

    @Override // com.waze.settings.tree.d.h, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        kotlinx.coroutines.af afVarQ = com.waze.network.f.ak.q(deVar);
        gr grVar = this.f37204b;
        ds dsVar = this.f37203a;
        kotlinx.coroutines.aj.z(afVarQ, null, null, new gf(dsVar, wazeSettingsView, grVar, (h.c.e) null, 1), 3);
        wazeSettingsView.setOnClickListener(new com.waze.planned_drive.af(dsVar, 19));
        return wazeSettingsView;
    }
}
