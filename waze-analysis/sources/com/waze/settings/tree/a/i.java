package com.waze.settings.tree.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.waze.R;
import com.waze.design_components.button.WazeButton;
import com.waze.sdk.au;
import com.waze.settings.bp;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends com.waze.settings.tree.d.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ au f37475a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(au auVar, String str, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, bp bpVar) {
        super(str, null, nVar, dVar, null, bpVar, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
        this.f37475a = auVar;
    }

    @Override // com.waze.settings.tree.d.h, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = (WazeSettingsView) super.O(deVar);
        this.f37475a.d(wazeSettingsView.getContext(), new j(wazeSettingsView, 1));
        View viewInflate = LayoutInflater.from(deVar.g()).inflate(R.layout.waze_settings_install_button, (ViewGroup) null);
        WazeButton wazeButton = (WazeButton) viewInflate.findViewById(R.id.button);
        wazeButton.h(com.waze.shared_infra.o.b.a().c(R.string.AUDIO_SDK_SETTINGS_DISCONNECT, new Object[0]));
        wazeButton.e(com.waze.design_components.button.e.f23350b);
        wazeButton.setOnClickListener(new com.waze.profile.m(wazeSettingsView, 2));
        wazeSettingsView.x(viewInflate);
        return wazeSettingsView;
    }
}
