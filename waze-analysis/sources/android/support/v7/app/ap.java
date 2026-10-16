package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.core.view.KeyEventDispatcher;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ap extends ComponentDialog {

    /* renamed from: a, reason: collision with root package name */
    private t f540a;

    /* renamed from: b, reason: collision with root package name */
    private final KeyEventDispatcher.Component f541b;

    public ap(Context context, int i2) {
        super(context, a(context, i2));
        this.f541b = new KeyEventDispatcher.Component() { // from class: android.support.v7.app.ao
            @Override // androidx.core.view.KeyEventDispatcher.Component
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f539a.d(keyEvent);
            }
        };
        t tVarBA = bA();
        tVarBA.t(a(context, i2));
        tVarBA.y();
    }

    private static int a(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        bA().h(view, layoutParams);
    }

    public final t bA() {
        if (this.f540a == null) {
            int i2 = t.f623b;
            this.f540a = new an(this);
        }
        return this.f540a;
    }

    final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        bA().l();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.dispatchKeyEvent(this.f541b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i2) {
        return bA().e(i2);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        bA().j();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        bA().i();
        super.onCreate(bundle);
        bA().y();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStop() {
        super.onStop();
        bA().n();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i2) {
        initializeViewTreeOwners();
        bA().p(i2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i2) {
        super.setTitle(i2);
        bA().u(getContext().getString(i2));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view) {
        initializeViewTreeOwners();
        bA().q(view);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        bA().r(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        bA().u(charSequence);
    }
}
