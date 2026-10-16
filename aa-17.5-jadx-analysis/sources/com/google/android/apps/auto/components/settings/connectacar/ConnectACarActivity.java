package com.google.android.apps.auto.components.settings.connectacar;

import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import defpackage.bf;
import defpackage.kqb;
import defpackage.lgv;
import defpackage.lsh;
import defpackage.mki;
import defpackage.mks;
import defpackage.mku;
import defpackage.mlc;
import defpackage.mlg;
import defpackage.rxf;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxo;

/* loaded from: classes2.dex */
public class ConnectACarActivity extends mks {
    private static final yph o = yph.c("GH.ConnectACarAct");

    @Override // defpackage.mks
    protected final int A() {
        return R.string.android_auto_connect_a_car;
    }

    @Override // defpackage.mks
    protected final mku B() {
        return (mku) new bf().a(getClassLoader(), getIntent().getIntExtra("key_wireless", 0) != 1 ? mlc.class.getName() : mlg.class.getName());
    }

    @Override // defpackage.mks, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        kqb.a().fE(this, new lsh(this, 16));
    }

    @Override // defpackage.bc, defpackage.ob, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((ype) o.l().ai(5050)).R("onRequestPermissionsResult: requestCode %s, permissions %s, grantResults %s", Integer.valueOf(i), strArr, iArr);
        if (lgv.c().g()) {
            return;
        }
        rxf.j(this, mki.a.d, yxo.BLUETOOTH_CONNECT_PERMISSION_MISSING);
    }
}
