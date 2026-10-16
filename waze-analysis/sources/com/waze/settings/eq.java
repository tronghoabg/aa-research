package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eq extends com.waze.settings.tree.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37194a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eq(ds dsVar) {
        super("sign_out_from_aaos", Integer.valueOf(R.string.SETTING_SIGN_OUT_FROM_AAOS), "IN_CAR_SIGN_OUT");
        this.f37194a = dsVar;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(t());
        wazeSettingsView.K(0);
        wazeSettingsView.setOnClickListener(new com.waze.planned_drive.af(this.f37194a, 18));
        return wazeSettingsView;
    }
}
