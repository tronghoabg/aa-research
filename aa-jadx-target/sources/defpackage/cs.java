package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class cs extends android.app.Activity implements defpackage.eqg, defpackage.eaj {
    public final defpackage.eqi f;

    public cs() {
        new defpackage.aba(0);
        this.f = new defpackage.eqi(this, true);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = defpackage.ebt.a;
        return dtb.g(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = defpackage.ebt.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.eaj
    public final boolean fQ(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.f;
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = defpackage.erg.b;
        defpackage.ere.b(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.getClass();
        this.f.f(defpackage.epx.c);
        super.onSaveInstanceState(bundle);
    }
}
