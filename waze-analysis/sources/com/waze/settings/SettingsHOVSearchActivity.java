package com.waze.settings;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.design_components.header_view.WazeHeaderView;
import com.waze.navigate.DriveToNativeManager;
import com.waze.view.text.WazeEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SettingsHOVSearchActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f36686f = 0;

    /* renamed from: g, reason: collision with root package name */
    private NativeManager.HOVPermitDescriptor[] f36687g;

    /* renamed from: h, reason: collision with root package name */
    private List f36688h;

    /* renamed from: k, reason: collision with root package name */
    private List f36689k;

    /* renamed from: l, reason: collision with root package name */
    private android.support.v7.widget.eb f36690l;
    private boolean m = false;
    private final com.waze.shared_infra.o.a n = com.waze.shared_infra.o.b.a();

    static /* bridge */ /* synthetic */ void p(SettingsHOVSearchActivity settingsHOVSearchActivity, boolean z) {
        if (z) {
            NativeManager.getInstance().closeAndOpenProgressPopup(settingsHOVSearchActivity.n.c(R.string.HOV_PERMITS_ADDED, new Object[0]), R.drawable.bigblue_v_icon);
        } else {
            NativeManager.getInstance().closeAndOpenProgressPopup(settingsHOVSearchActivity.n.c(R.string.HOV_PERMITS_REMOVED, new Object[0]), R.drawable.bigblue_x_icon);
        }
        settingsHOVSearchActivity.aG(new com.waze.navigate.ay(3), 2000L);
    }

    static /* bridge */ /* synthetic */ void q(SettingsHOVSearchActivity settingsHOVSearchActivity, String str) {
        int iIndexOf = settingsHOVSearchActivity.f36689k.indexOf(str);
        if (iIndexOf >= 0) {
            settingsHOVSearchActivity.f36689k.remove(iIndexOf);
        } else {
            settingsHOVSearchActivity.f36689k.add(str);
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : settingsHOVSearchActivity.f36689k) {
            if (sb.length() > 0) {
                sb.append('|');
            }
            sb.append(str2);
        }
        settingsHOVSearchActivity.m = true;
        ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS, sb.toString());
    }

    public static /* synthetic */ void v(SettingsHOVSearchActivity settingsHOVSearchActivity) {
        if (settingsHOVSearchActivity.m) {
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).reroute(false);
        }
        settingsHOVSearchActivity.setResult(-1);
        settingsHOVSearchActivity.finish();
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.m) {
            setResult(5006);
        } else {
            setResult(0);
        }
        super.onBackPressed();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        if (!NativeManager.isAppStarted()) {
            aA();
            return;
        }
        setContentView(R.layout.settings_hov_search);
        WazeHeaderView wazeHeaderView = (WazeHeaderView) findViewById(R.id.headerView);
        com.waze.shared_infra.o.a aVar = this.n;
        wazeHeaderView.h(aVar.c(R.string.HOV_PERMITS_SEARCH_TITLE, new Object[0]));
        wazeHeaderView.f(new com.waze.planned_drive.af(this, 16));
        WazeEditText wazeEditText = (WazeEditText) findViewById(R.id.searchBar);
        wazeEditText.setHint(aVar.c(R.string.HOV_PERMITS_SEARCH_HINT, new Object[0]));
        wazeEditText.addTextChangedListener(new by(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.searchResultsRecycler);
        NativeManager.HOVPermitDescriptor[] hOVPermitDescriptorArrConfigGetHOVPermitDescriptors = NativeManager.getInstance().configGetHOVPermitDescriptors();
        this.f36687g = hOVPermitDescriptorArrConfigGetHOVPermitDescriptors;
        if (hOVPermitDescriptorArrConfigGetHOVPermitDescriptors == null || hOVPermitDescriptorArrConfigGetHOVPermitDescriptors.length == 0) {
            finish();
            return;
        }
        String[] strArrSplit = ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS).split("\\|");
        Arrays.sort(this.f36687g, new bz(this));
        this.f36688h = new ArrayList(Arrays.asList(this.f36687g));
        Arrays.sort(strArrSplit);
        this.f36689k = new ArrayList(Arrays.asList(strArrSplit));
        cd cdVar = new cd(this);
        this.f36690l = cdVar;
        recyclerView.ak(cdVar);
        recyclerView.al(new LinearLayoutManager());
        com.waze.shared_infra.g.e.d((ViewGroup) findViewById(R.id.settingsHOVLayout), recyclerView);
    }
}
