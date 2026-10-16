package com.waze.utils;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class DismissNotificationActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((NotificationManager) getSystemService("notification")).cancel(getIntent().getIntExtra("NOTIFICATION_ID", -1));
        finish();
    }
}
