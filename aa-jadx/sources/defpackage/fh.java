package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class fh extends defpackage.of {
    private defpackage.er a;
    private final defpackage.eaj b;

    public fh(android.content.Context context, int i) {
        super(context, a(context, i));
        this.b = new defpackage.eaj() { // from class: fg
            @Override // defpackage.eaj
            public final boolean fQ(android.view.KeyEvent keyEvent) {
                return this.a.d(keyEvent);
            }
        };
        defpackage.er erVarC = c();
        ((defpackage.ff) erVarC).E = a(context, i);
        erVarC.r();
    }

    private static int a(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.of, android.app.Dialog
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        f();
        c().e(view, layoutParams);
    }

    public final defpackage.er c() {
        if (this.a == null) {
            int i = defpackage.er.b;
            this.a = new defpackage.ff(getContext(), getWindow(), this);
        }
        return this.a;
    }

    final boolean d(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        getWindow().getDecorView();
        return defpackage.dtb.g(this.b, keyEvent);
    }

    public final void e() {
        c().t(1);
    }

    @Override // android.app.Dialog
    public final android.view.View findViewById(int i) {
        return c().d(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().g();
    }

    @Override // defpackage.of, android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        c().f();
        super.onCreate(bundle);
        c().r();
    }

    @Override // defpackage.of, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        c().j();
    }

    @Override // defpackage.of, android.app.Dialog
    public void setContentView(int i) {
        f();
        c().l(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().o(getContext().getString(i));
    }

    @Override // defpackage.of, android.app.Dialog
    public void setContentView(android.view.View view) {
        f();
        c().m(view);
    }

    @Override // defpackage.of, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        f();
        c().n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        c().o(charSequence);
    }
}
