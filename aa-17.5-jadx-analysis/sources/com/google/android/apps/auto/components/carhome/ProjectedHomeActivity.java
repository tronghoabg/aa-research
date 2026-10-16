package com.google.android.apps.auto.components.carhome;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import com.google.android.projection.gearhead.R;
import defpackage.ep;
import defpackage.eqj;
import defpackage.hlg;
import defpackage.klt;
import defpackage.klx;
import defpackage.mow;
import defpackage.mox;
import defpackage.tss;
import defpackage.w;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class ProjectedHomeActivity extends ep {
    public static final yph m = yph.c("GH.HomeActivity");
    public klx n;
    public klt o;
    public boolean p = false;
    public Fragment q;

    public final void A() {
        ((ype) m.l().ai(3199)).y("updateActiveFragment fragment: %s", this.q);
        Fragment fragment = this.q;
        if (fragment == null) {
            tss.q("GH.HomeActivity", "Activity running, updateActivityFragment called with null fragment", new Object[0]);
        } else {
            if (fragment.isVisible()) {
                return;
            }
            w wVar = new w(a());
            wVar.q(R.id.container, this.q, null);
            wVar.i(false, true);
        }
    }

    @Override // defpackage.ep, defpackage.cs, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 24 || keyCode == 25) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.bc
    protected final void gz() {
        super.gz();
        ((ype) ((ype) m.f()).ai((char) 3197)).u("onResumeFragments");
        A();
    }

    @Override // defpackage.ob, android.app.Activity
    public final void onBackPressed() {
        if (this.p) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ep, defpackage.ob, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((ype) m.l().ai((char) 3193)).y("onConfigurationChange Activity will not be recreated. This is only intended for uiMode Night Mode config changes: %s", configuration);
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ype) ((ype) m.f()).ai((char) 3194)).u("onCreate");
        this.n = new klx();
        this.o = new klt();
        eqj eqjVarA = mox.b().a();
        if (eqjVarA.e() == null || eqjVarA.e() == mow.c) {
            eqjVarA.e();
            finish();
        } else {
            setContentView(R.layout.car_home_activity);
            eqjVarA.fE(this, new hlg(this, 19));
        }
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ((ype) ((ype) m.f()).ai((char) 3196)).u("onDestroy");
    }
}
