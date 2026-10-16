package com.waze.settings;

import android.os.Bundle;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SettingsNotificationActivity extends SimpleWebActivity {
    public SettingsNotificationActivity() {
        MyWazeNativeManager.getInstance();
    }

    @Override // com.waze.web.SimpleWebActivity
    protected final boolean br() {
        return false;
    }

    @Override // com.waze.web.SimpleWebActivity
    public final void n() {
        v(ConfigValues.CONFIG_VALUE_DISPLAY_NOTIFICATIONSETTINGSURL.b());
    }

    @Override // com.waze.web.SimpleWebActivity, com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f45476h.C("SettingsNotificationActivity");
        w(com.waze.shared_infra.o.b.a().c(R.string.NOTIFICATIONS, new Object[0]));
    }

    @Override // com.waze.web.SimpleWebActivity, com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        ((SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class)).getNotificationPreferences();
        super.onDestroy();
    }
}
