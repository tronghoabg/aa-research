package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class of extends android.app.Dialog implements defpackage.eqg, defpackage.ou, defpackage.fbm {
    private defpackage.eqi a;
    private final defpackage.fbl b;
    private final defpackage.afar c;
    private final defpackage.afar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(android.content.Context context, int i) {
        super(context, i);
        context.getClass();
        this.b = defpackage.ebq.h(this);
        this.c = defpackage.afga.cA(new defpackage.oe(this, 1));
        this.d = defpackage.afga.cA(new defpackage.oe(this, 0));
    }

    private final defpackage.eqi a() {
        defpackage.eqi eqiVar = this.a;
        if (eqiVar != null) {
            return eqiVar;
        }
        defpackage.eqi eqiVar2 = new defpackage.eqi(this, true);
        this.a = eqiVar2;
        return eqiVar2;
    }

    public static final void g(defpackage.of ofVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    public final void f() {
        android.view.Window window = getWindow();
        window.getClass();
        android.view.View decorView = window.getDecorView();
        decorView.getClass();
        defpackage.edd.d(decorView, this);
        android.view.Window window2 = getWindow();
        window2.getClass();
        android.view.View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131429871, this);
        android.view.Window window3 = getWindow();
        window3.getClass();
        android.view.View decorView3 = window3.getDecorView();
        decorView3.getClass();
        defpackage.ebq.g(decorView3, this);
        android.view.Window window4 = getWindow();
        window4.getClass();
        android.view.View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131429870, this);
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return a();
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return (defpackage.fbk) this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((defpackage.exc) this.c.a()).b();
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            defpackage.bil bilVarR = r();
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ag$.ExternalSyntheticApiModelOutline0.m(this);
            onBackInvokedDispatcherM.getClass();
            bilVarR.z(onBackInvokedDispatcherM);
        }
        this.b.b(bundle);
        a().e(defpackage.epw.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
        android.os.Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        a().e(defpackage.epw.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().e(defpackage.epw.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // defpackage.ou
    public final defpackage.bil r() {
        return (defpackage.bil) this.d.a();
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View view) {
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
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }
}
