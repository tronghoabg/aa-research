package com.waze.settings;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fu extends com.waze.settings.tree.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.o.a f37278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fu(com.waze.shared_infra.o.a aVar) {
        super("clear_calendars", Integer.valueOf(R.string.CALENDAR_SETTINGS_CLEAR), "CLEAR_CALENDARS_SETTINGS");
        this.f37278a = aVar;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(t());
        wazeSettingsView.r(ContextCompat.getColor(deVar.g(), R.color.alarming_variant));
        wazeSettingsView.K(0);
        wazeSettingsView.setOnClickListener(new com.waze.sdk.i(this, deVar, this.f37278a, 3));
        return wazeSettingsView;
    }
}
