package com.waze.config;

import android.support.v7.widget.fe;
import android.view.View;
import android.widget.LinearLayout;
import com.waze.R;
import com.waze.settings.tree.views.SettingsTitleText;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class da extends fe {

    /* renamed from: a, reason: collision with root package name */
    private final SettingsTitleText f22600a;

    /* renamed from: b, reason: collision with root package name */
    private final WazeSettingsView f22601b;

    da(LinearLayout linearLayout) {
        super(linearLayout);
        this.f22600a = (SettingsTitleText) linearLayout.findViewById(R.id.configListItemSettingsSectionHeaderView);
        this.f22601b = (WazeSettingsView) linearLayout.findViewById(R.id.configListItemSettingsView);
    }

    static /* bridge */ /* synthetic */ void c(da daVar, int i2) {
        WazeSettingsView wazeSettingsView = daVar.f22601b;
        if (i2 == 0) {
            wazeSettingsView.K(0);
        } else {
            wazeSettingsView.K(i2);
            wazeSettingsView.z();
        }
    }

    static /* bridge */ /* synthetic */ void d(da daVar, String str, String str2) {
        WazeSettingsView wazeSettingsView = daVar.f22601b;
        wazeSettingsView.N(str);
        wazeSettingsView.P(str2);
    }

    static /* bridge */ /* synthetic */ void e(da daVar, String str) {
        SettingsTitleText settingsTitleText = daVar.f22600a;
        settingsTitleText.a(str);
        settingsTitleText.setVisibility(0);
    }

    static /* bridge */ /* synthetic */ void f(final da daVar, boolean z, com.waze.sharedui.views.w wVar) {
        WazeSettingsView wazeSettingsView = daVar.f22601b;
        wazeSettingsView.B(2);
        wazeSettingsView.s(null);
        wazeSettingsView.D(z);
        wazeSettingsView.s(wVar);
        wazeSettingsView.setOnClickListener(new View.OnClickListener() { // from class: com.waze.config.cz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22599a.f22601b.D(!r0.H());
            }
        });
    }

    public final void g(View.OnClickListener onClickListener) {
        this.f22601b.setOnClickListener(onClickListener);
    }

    public final void h(View.OnLongClickListener onLongClickListener) {
        this.f22601b.setOnLongClickListener(onLongClickListener);
    }
}
