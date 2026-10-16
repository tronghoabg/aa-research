package com.waze;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.waze.gas.GasNativeManager;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.view.title.TitleBar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class SimpleListMenuActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13560f = 0;

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_simple_list_menu);
        aE();
        ld ldVar = new ld(this);
        Bundle extras = getIntent().getExtras();
        String string = extras.getString(GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        String[] stringArray = extras.getStringArray("actions");
        String[] stringArray2 = extras.getStringArray("labels");
        extras.clear();
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        titleBar.p(string);
        titleBar.l(false);
        titleBar.m(new com.google.android.material.datepicker.ac(this, 4));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        View viewFindViewById = findViewById(android.R.id.content);
        viewFindViewById.post(new com.google.android.libraries.phenotype.client.stable.x(viewFindViewById, linearLayout, 7));
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            WazeSettingsView wazeSettingsView = new WazeSettingsView(this);
            wazeSettingsView.N(stringArray2[i2]);
            wazeSettingsView.P(null);
            wazeSettingsView.setLayoutParams(layoutParams);
            wazeSettingsView.K(0);
            wazeSettingsView.setOnClickListener(ldVar);
            wazeSettingsView.setTag(stringArray[i2]);
            linearLayout.addView(wazeSettingsView);
        }
    }
}
