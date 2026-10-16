package android.support.v7.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class o extends android.support.v4.app.av implements TaskStackBuilder.SupportParentable {
    private t aaV;

    public o() {
        getSavedStateRegistry().registerSavedStateProvider("androidx:appcompat", new m(this));
        addOnContextAvailableListener(new n(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d().h(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(d().b(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        e();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final t d() {
        if (this.aaV == null) {
            int i2 = t.f623b;
            this.aaV = new an(this);
        }
        return this.aaV;
    }

    @Override // android.support.v4.app.dd, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        e();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final android.support.a.i e() {
        return d().C();
    }

    @Override // android.app.Activity
    public final View findViewById(int i2) {
        return d().e(i2);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return d().d();
    }

    @Override // androidx.core.app.TaskStackBuilder.SupportParentable
    public final Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        d().j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d().B();
    }

    @Override // android.support.v4.app.av, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        d().l();
    }

    @Override // android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent parentActivityIntent;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        android.support.a.i iVarE = e();
        if (menuItem.getItemId() != 16908332 || iVarE == null || (((az) iVarE).p.a() & 4) == 0 || (parentActivityIntent = NavUtils.getParentActivityIntent(this)) == null) {
            return false;
        }
        if (!NavUtils.shouldUpRecreateTask(this, parentActivityIntent)) {
            NavUtils.navigateUpTo(this, parentActivityIntent);
            return true;
        }
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this);
        taskStackBuilderCreate.addParentStack(this);
        taskStackBuilderCreate.startActivities();
        try {
            ActivityCompat.finishAffinity(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        d().z();
    }

    @Override // android.support.v4.app.av, android.app.Activity
    protected void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        android.support.a.i iVarC = ((an) d()).C();
        if (iVarC != null) {
            iVarC.h(true);
        }
    }

    @Override // android.support.v4.app.av, android.app.Activity
    protected void onStart() {
        super.onStart();
        d().m();
    }

    @Override // android.support.v4.app.av, android.app.Activity
    protected void onStop() {
        super.onStop();
        d().n();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        d().u(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        e();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i2) {
        initializeViewTreeOwners();
        d().p(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        d().t(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view) {
        initializeViewTreeOwners();
        d().q(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d().r(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
