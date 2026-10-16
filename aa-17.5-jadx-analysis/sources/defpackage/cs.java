package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public class cs extends Activity implements eqa, eac {
    public final eqc f;

    public cs() {
        new aat(0);
        this.f = new eqc(this, true);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = ebm.a;
        return dsr.l(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = ebm.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.eac
    public final boolean gF(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.f;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = era.b;
        epq.d(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.f.f(eps.c);
        super.onSaveInstanceState(bundle);
    }
}
