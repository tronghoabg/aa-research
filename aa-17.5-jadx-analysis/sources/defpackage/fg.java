package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class fg extends oc {
    private er a;
    private final eac b;

    public fg(Context context, int i) {
        super(context, a(context, i));
        this.b = new eac() { // from class: ff
            @Override // defpackage.eac
            public final boolean gF(KeyEvent keyEvent) {
                return this.a.d(keyEvent);
            }
        };
        er erVarC = c();
        ((fe) erVarC).E = a(context, i);
        erVarC.r();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.oc, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        c().e(view, layoutParams);
    }

    public final er c() {
        if (this.a == null) {
            int i = er.b;
            this.a = new fe(getContext(), getWindow(), this);
        }
        return this.a;
    }

    final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return dsr.l(this.b, keyEvent);
    }

    public final void e() {
        c().t(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return c().d(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().g();
    }

    @Override // defpackage.oc, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        c().f();
        super.onCreate(bundle);
        c().r();
    }

    @Override // defpackage.oc, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        c().j();
    }

    @Override // defpackage.oc, android.app.Dialog
    public void setContentView(int i) {
        f();
        c().l(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().o(getContext().getString(i));
    }

    @Override // defpackage.oc, android.app.Dialog
    public void setContentView(View view) {
        f();
        c().m(view);
    }

    @Override // defpackage.oc, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        c().n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().o(charSequence);
    }
}
