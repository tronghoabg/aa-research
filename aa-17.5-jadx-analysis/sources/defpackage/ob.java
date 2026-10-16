package defpackage;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ob extends cs implements eqa, eru, epo, fbg, or, pd, dur, dus, duh, dui, ead {
    private final fbf a;
    private ert b;
    private final aezr c;
    private final CopyOnWriteArrayList d;
    private final CopyOnWriteArrayList e;
    public final ov g = new ov();
    public int h;
    public final AtomicInteger i;
    public final pc j;
    public final CopyOnWriteArrayList k;
    public final nz l;
    private final CopyOnWriteArrayList n;
    private final CopyOnWriteArrayList o;
    private final CopyOnWriteArrayList p;
    private boolean q;
    private boolean r;
    private final aezr s;
    private final CopyOnWriteArrayList sx;
    private final aezr t;
    private final aezr u;
    private final nfh v;

    public ob() {
        int i = 2;
        this.v = new nfh(new ne(this, i, null));
        fbf fbfVarL = ebi.l(this);
        this.a = fbfVarL;
        this.l = new nz(this);
        this.c = new aezy(new nx(this, 1));
        this.i = new AtomicInteger();
        this.j = new pc(this);
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.sx = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        int i2 = 0;
        this.s = new aezy(new nx(this, i2));
        eqc eqcVar = this.f;
        if (eqcVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        eqcVar.c(new ny(this, i2));
        this.f.c(new ny(this, i));
        int i3 = 3;
        this.f.c(new ny(this, 3, null));
        fbfVarL.a();
        erg.b(this);
        getSavedStateRegistry().c("android:support:activity-result", new bi((Object) this, i3));
        u(new eo(this, i));
        this.t = new aezy(new nx(this, i));
        this.u = new aezy(new nx(this, i3));
    }

    public static final void x(ob obVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!affa.f(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!affa.f(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.pd
    public final pc gA() {
        return this.j;
    }

    @Override // defpackage.dur
    public final void gB(dzg dzgVar) {
        dzgVar.getClass();
        this.d.add(dzgVar);
    }

    @Override // defpackage.duh
    public final void gC(dzg dzgVar) {
        dzgVar.getClass();
        this.sx.add(dzgVar);
    }

    @Override // defpackage.dui
    public final void gD(dzg dzgVar) {
        dzgVar.getClass();
        this.n.add(dzgVar);
    }

    @Override // defpackage.dus
    public final void gE(dzg dzgVar) {
        dzgVar.getClass();
        this.e.add(dzgVar);
    }

    @Override // defpackage.epo
    public final esc getDefaultViewModelCreationExtras() {
        ese eseVar = new ese((byte[]) null);
        if (getApplication() != null) {
            eseVar.b(erp.b, getApplication());
        }
        eseVar.b(erg.a, this);
        eseVar.b(erg.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            eseVar.b(erg.c, extras);
        }
        return eseVar;
    }

    @Override // defpackage.epo
    public final erq getDefaultViewModelProviderFactory() {
        return (erq) this.t.a();
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return (fbe) this.a.b;
    }

    @Override // defpackage.eru
    public final ert getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        v();
        ert ertVar = this.b;
        ertVar.getClass();
        return ertVar;
    }

    @Override // defpackage.dur
    public final void k(dzg dzgVar) {
        dzgVar.getClass();
        this.d.remove(dzgVar);
    }

    @Override // defpackage.duh
    public final void l(dzg dzgVar) {
        dzgVar.getClass();
        this.sx.remove(dzgVar);
    }

    @Override // defpackage.dui
    public final void m(dzg dzgVar) {
        dzgVar.getClass();
        this.n.remove(dzgVar);
    }

    @Override // defpackage.dus
    public final void n(dzg dzgVar) {
        dzgVar.getClass();
        this.e.remove(dzgVar);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.j.e(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((eww) this.s.a()).b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dzg) it.next()).a(configuration);
        }
    }

    @Override // defpackage.cs, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.a.b(bundle);
        this.g.c(this);
        super.onCreate(bundle);
        int i = era.b;
        epq.d(this);
        int i2 = this.h;
        if (i2 != 0) {
            setContentView(i2);
        }
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.v.j(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.v.l(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.q = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.q = false;
            Iterator it = this.sx.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((dzg) it.next()).a(new dul(z));
            }
        } catch (Throwable th) {
            this.q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dzg) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.v.c).iterator();
        while (it.hasNext()) {
            ((bt) ((izj) it.next()).a).z(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.r = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.r = false;
            Iterator it = this.n.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((dzg) it.next()).a(new dul(z));
            }
        } catch (Throwable th) {
            this.r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        dsz dszVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        if (Build.VERSION.SDK_INT >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            dszVar = new dsz();
        } else if (Build.VERSION.SDK_INT >= 31) {
            pictureInPictureUiState.isStashed();
            dszVar = new dsz();
        } else {
            dszVar = new dsz();
        }
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dzg) it.next()).a(dszVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.v.k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.j.e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ntn ntnVar;
        Object obj = this.b;
        if (obj == null && (ntnVar = (ntn) getLastNonConfigurationInstance()) != null) {
            obj = ntnVar.a;
        }
        if (obj == null) {
            return null;
        }
        ntn ntnVar2 = new ntn();
        ntnVar2.a = obj;
        return ntnVar2;
    }

    @Override // defpackage.cs, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        eqc eqcVar = this.f;
        if (eqcVar instanceof eqc) {
            eqcVar.getClass();
            eqcVar.f(eps.c);
        }
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dzg) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // defpackage.or
    public final bii r() {
        return (bii) this.u.a();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        fdi.b();
        super.reportFullyDrawn();
        jyk jykVarY = y();
        synchronized (jykVarY.b) {
            jykVarY.a = true;
            ?? r3 = jykVarY.c;
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                ((afdr) it.next()).invoke();
            }
            r3.clear();
        }
    }

    @Override // defpackage.ead
    public final void s(izj izjVar) {
        izjVar.getClass();
        this.v.C(izjVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // defpackage.ead
    public final void t(izj izjVar) {
        izjVar.getClass();
        this.v.D(izjVar);
    }

    public final void u(ow owVar) {
        this.g.a(owVar);
    }

    public final void v() {
        if (this.b == null) {
            ntn ntnVar = (ntn) getLastNonConfigurationInstance();
            if (ntnVar != null) {
                this.b = (ert) ntnVar.a;
            }
            if (this.b == null) {
                this.b = new ert();
            }
        }
    }

    public final void w() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final jyk y() {
        return (jyk) this.c.a();
    }

    public final void z(bii biiVar) {
        this.f.c(new op(biiVar, this, 1));
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.q) {
            return;
        }
        Iterator it = this.sx.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dzg) it.next()).a(new dul(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.r) {
            return;
        }
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((dzg) it.next()).a(new dul(z));
        }
    }
}
