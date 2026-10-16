package defpackage;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class lex extends ler {
    public static final yph o = yph.c("GH.WifiPreflight");
    static final IntentFilter p = new IntentFilter("com.google.android.apps.auto.components.frx.phonescreen.WirelessFrxPhonescreenBottomSheetActivity.CLOSE");
    lew q;
    public boolean r = false;

    public static void D(yzz yzzVar, yzy yzyVar) {
        ebf.j().f(rrc.h(yxy.FRX, yzzVar, yzyVar));
    }

    protected IntentFilter C() {
        return p;
    }

    public final void E() {
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // defpackage.ler, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ype) o.l().ai((char) 3827)).u("registering close broadcast receiver");
        woy.N(this.q == null);
        this.q = new lew(this);
        int i = Build.VERSION.SDK_INT;
        lew lewVar = this.q;
        if (i >= 33) {
            registerReceiver(lewVar, C(), 2);
        } else {
            registerReceiver(lewVar, C());
        }
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ype) o.l().ai((char) 3828)).u("unregistering close broadcast receiver");
        lew lewVar = this.q;
        if (lewVar != null) {
            unregisterReceiver(lewVar);
            this.q = null;
        }
        if (!isFinishing() || this.r) {
            return;
        }
        B();
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public void B() {
    }
}
