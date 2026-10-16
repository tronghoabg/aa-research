package com.google.android.projection.gearhead.companion.settings;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aczy;
import defpackage.ef;
import defpackage.er;
import defpackage.fe;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public class SettingsActivity extends PreferenceActivity {
    private er a;

    private final er a() {
        if (this.a == null) {
            int i = er.b;
            this.a = new fe(this, null, this);
        }
        return this.a;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().e(view, layoutParams);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return a().c();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        a().g();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (aczy.c() && i == 0) {
            recreate();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().s();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a().f();
        a().r();
        super.onCreate(bundle);
        ef efVarB = a().b();
        if (efVarB != null) {
            efVarB.g(true);
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        a().h();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || getIntent().getStringExtra(":android:show_fragment") != null) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((fe) a()).H();
    }

    @Override // android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        a().i();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected final void onStop() {
        super.onStop();
        a().j();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().o(charSequence);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        a().l(i);
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        a().m(view);
    }
}
