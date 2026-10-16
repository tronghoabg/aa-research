package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class oc extends Dialog implements eqa, or, fbg {
    private eqc a;
    private final fbf b;
    private final aezr c;
    private final aezr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(Context context, int i) {
        super(context, i);
        context.getClass();
        this.b = ebi.l(this);
        this.c = new aezy(new nx(this, 4));
        this.d = new aezy(new nx(this, 5));
    }

    private final eqc a() {
        eqc eqcVar = this.a;
        if (eqcVar != null) {
            return eqcVar;
        }
        eqc eqcVar2 = new eqc(this, true);
        this.a = eqcVar2;
        return eqcVar2;
    }

    public static final void g(oc ocVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    public final void f() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return a();
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return (fbe) this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((eww) this.c.a()).b();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            bii biiVarR = r();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            biiVarR.z(onBackInvokedDispatcher);
        }
        this.b.b(bundle);
        a().e(epr.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a().e(epr.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().e(epr.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // defpackage.or
    public final bii r() {
        return (bii) this.d.a();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }
}
