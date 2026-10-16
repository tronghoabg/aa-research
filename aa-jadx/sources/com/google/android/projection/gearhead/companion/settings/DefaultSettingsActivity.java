package com.google.android.projection.gearhead.companion.settings;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultSettingsActivity extends com.google.android.projection.gearhead.companion.settings.SettingsActivity {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.projection.gearhead.companion.settings.SettingsActivity, android.preference.PreferenceActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        finishAndRemoveTask();
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.google.android.projection.gearhead.companion.settings.Material3SettingsActivity.class);
        intent.addFlags(67108864);
        startActivity(intent);
        super.onCreate(bundle);
    }
}
