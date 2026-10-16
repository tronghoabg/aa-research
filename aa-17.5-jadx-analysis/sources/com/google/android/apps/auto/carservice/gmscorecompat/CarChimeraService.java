package com.google.android.apps.auto.carservice.gmscorecompat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Process;
import com.google.android.apps.auto.components.bugreport.BugreporterReceiver;
import com.google.android.projection.gearhead.R;
import defpackage.acvh;
import defpackage.dsx;
import defpackage.dup;
import defpackage.jmv;
import defpackage.jmw;
import defpackage.jmx;
import defpackage.kgi;
import defpackage.qrm;
import defpackage.rxp;
import defpackage.wdu;
import defpackage.xxh;
import defpackage.xxm;

/* loaded from: classes.dex */
public class CarChimeraService extends qrm {
    private BroadcastReceiver c;

    @Override // defpackage.qrm
    protected final rxp a() {
        return new jmx(1);
    }

    @Override // defpackage.qrm
    protected final xxh b() {
        return new xxm(new jmw(1));
    }

    @Override // defpackage.qrm
    protected final void c(Context context, dsx dsxVar) {
        if (kgi.i()) {
            dsxVar.f(0, context.getText(R.string.android_auto_bugreport_action_text), wdu.c(context, 0, BugreporterReceiver.c("ORIGIN_NOTIFICATION", null), 201326592));
            dsxVar.f(0, context.getText(R.string.android_auto_screenshot_action_text), wdu.c(context, 0, BugreporterReceiver.d(), 201326592));
        }
    }

    @Override // defpackage.qrm
    protected final boolean d() {
        if (Binder.getCallingPid() == Process.myPid() && Binder.getCallingUid() == Process.myUid()) {
            return true;
        }
        return super.d();
    }

    @Override // defpackage.qrm, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (acvh.a.gu().x()) {
            this.c = new jmv(this);
            dup.e(this.b, this.c, new IntentFilter("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION"), null, 2);
        }
    }

    @Override // defpackage.qrm, android.app.Service
    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }
}
