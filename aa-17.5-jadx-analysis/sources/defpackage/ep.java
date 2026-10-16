package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ep extends bc {
    private er m;

    public ep(byte[] bArr) {
        super(null);
        A();
    }

    private final void A() {
        getSavedStateRegistry().c("androidx:appcompat", new bi((ContextWrapper) this, 2));
        u(new eo((ContextWrapper) this, 0));
    }

    @Override // defpackage.ob, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        p().e(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void attachBaseContext(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ef efVarO = o();
        if (getWindow().hasFeature(0)) {
            if (efVarO == null || !efVarO.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.cs, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ef efVarO = o();
        if (keyCode == 82 && efVarO != null && efVarO.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return p().d(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return p().c();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        p().g();
    }

    public final ef o() {
        return p().b();
    }

    @Override // defpackage.ob, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p().s();
    }

    @Override // defpackage.bc, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        p().h();
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentQ;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ef efVarO = o();
        if (menuItem.getItemId() != 16908332 || efVarO == null || (efVarO.a() & 4) == 0 || (intentQ = dln.q(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentQ)) {
            navigateUpTo(intentQ);
            return true;
        }
        duo duoVar = new duo(this);
        Intent intentQ2 = dln.q(this);
        if (intentQ2 == null) {
            intentQ2 = dln.q(this);
        }
        if (intentQ2 != null) {
            ComponentName component = intentQ2.getComponent();
            if (component == null) {
                component = intentQ2.resolveActivity(duoVar.a.getPackageManager());
            }
            duoVar.b(component);
            duoVar.a(intentQ2);
        }
        duoVar.c();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((fe) p()).H();
    }

    @Override // defpackage.bc, android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        p().i();
    }

    @Override // defpackage.bc, android.app.Activity
    protected void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        ((fe) p()).S(true, false);
    }

    @Override // defpackage.bc, android.app.Activity
    protected void onStop() {
        super.onStop();
        p().j();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        p().o(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ef efVarO = o();
        if (getWindow().hasFeature(0)) {
            if (efVarO == null || !efVarO.q()) {
                super.openOptionsMenu();
            }
        }
    }

    public final er p() {
        if (this.m == null) {
            int i = er.b;
            this.m = new fe(this, null, this);
        }
        return this.m;
    }

    public final void q(Toolbar toolbar) {
        fe feVar = (fe) p();
        if (feVar.j instanceof Activity) {
            ef efVarB = feVar.b();
            if (efVarB instanceof fr) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            feVar.o = null;
            if (efVarB != null) {
                efVarB.e();
            }
            feVar.n = null;
            if (toolbar != null) {
                fl flVar = new fl(toolbar, feVar.B(), feVar.m);
                feVar.n = flVar;
                feVar.m.d = flVar.d;
                if (!toolbar.A) {
                    toolbar.A = true;
                    toolbar.w();
                }
            } else {
                feVar.m.d = null;
            }
            feVar.g();
        }
    }

    @Override // defpackage.ob, android.app.Activity
    public final void setContentView(int i) {
        w();
        p().l(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((fe) p()).E = i;
    }

    public ep() {
        A();
    }

    @Override // defpackage.ob, android.app.Activity
    public final void setContentView(View view) {
        w();
        p().m(view);
    }

    @Override // defpackage.ob, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        p().n(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
