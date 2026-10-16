package com.waze;

import android.content.Intent;
import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class CalendarApprovedActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13546f = 0;

    @Override // com.waze.ifs.ui.a
    protected final boolean f() {
        return false;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1031) {
            setResult(i3);
        }
        finish();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!NativeManager.isAppStarted()) {
            aA();
            return;
        }
        long longExtra = getIntent().getLongExtra("callback", 0L);
        long longExtra2 = getIntent().getLongExtra("context", 0L);
        boolean booleanExtra = getIntent().getBooleanExtra("granted", false);
        NativeManager nativeManager = NativeManager.getInstance();
        nativeManager.requestCalendarAccessCallback(longExtra, longExtra2, booleanExtra);
        if (booleanExtra) {
            aF(new com.google.android.libraries.phenotype.client.stable.x(this, nativeManager, 2));
        } else {
            finish();
        }
    }
}
