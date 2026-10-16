package com.google.android.apps.auto.carservice.gmscorecompat;

import android.content.Intent;
import defpackage.jmw;
import defpackage.jmx;
import defpackage.rxr;
import defpackage.xxm;

/* loaded from: classes.dex */
public class FirstActivityImpl extends com.google.android.gms.carsetup.FirstActivityImpl {
    @Override // com.google.android.gms.carsetup.FirstActivityImpl
    protected final rxr o() {
        return rxr.b(this, new xxm(new jmw(2)), new jmx(2));
    }

    @Override // com.google.android.gms.carsetup.FirstActivityImpl
    protected final void p(Intent intent) {
        intent.putExtra("start_foreground_immediately", true);
        startForegroundService(intent);
    }
}
