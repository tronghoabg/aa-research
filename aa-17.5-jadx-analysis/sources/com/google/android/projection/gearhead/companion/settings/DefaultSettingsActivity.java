package com.google.android.projection.gearhead.companion.settings;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class DefaultSettingsActivity extends SettingsActivity {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.projection.gearhead.companion.settings.SettingsActivity, android.preference.PreferenceActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        finishAndRemoveTask();
        Intent intent = new Intent(this, (Class<?>) Material3SettingsActivity.class);
        intent.addFlags(67108864);
        startActivity(intent);
        super.onCreate(bundle);
    }
}
