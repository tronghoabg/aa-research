package com.google.android.apps.auto.components.permission.impl;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.projection.gearhead.R;
import defpackage.dsx;
import defpackage.jrl;
import defpackage.mas;
import defpackage.mdl;
import defpackage.mdm;
import defpackage.mdn;
import defpackage.mdu;
import defpackage.wer;
import defpackage.woy;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class PermissionPollerImpl implements mdm {
    public static final yph a = yph.c("GH.PermissionPoller");
    public final Context b;
    public final ArrayList c = new ArrayList();
    public final Handler d = new Handler(Looper.getMainLooper());
    public final Intent e;

    public static class KeepAliveService extends Service {
        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public final void onCreate() {
            super.onCreate();
            mas.c();
            dsx dsxVar = new dsx(this, "gearhead_connection_status");
            dsxVar.e(2, true);
            dsxVar.l();
            dsxVar.u = -1;
            dsxVar.n(R.drawable.gs_android_auto_vd_24);
            dsxVar.r = "service";
            dsxVar.i = 0;
            dsxVar.i(getString(R.string.permission_poller_service_notification_title));
            dsxVar.t = getColor(R.color.gearhead_sdk_light_blue_800);
            dsxVar.m(0, 0, true);
            startForeground(R.id.permission_notification_id, dsxVar.a());
        }

        @Override // android.app.Service
        public final void onTimeout(int i) {
            ((ype) ((ype) PermissionPollerImpl.a.h()).ai((char) 4795)).w("KeepAliveService timed out. Stopping service. startId: %d", i);
            stopSelf();
        }
    }

    public PermissionPollerImpl(Context context) {
        this.b = context;
        this.e = new Intent(context, (Class<?>) KeepAliveService.class);
    }

    @Override // defpackage.mdm
    public final void a(mdn mdnVar, mdl mdlVar, Object obj) {
        wer.c();
        mdnVar.getClass();
        woy.Z(jrl.a() == jrl.PROJECTION);
        mdu mduVar = new mdu(this, mdnVar, mdlVar, obj);
        mduVar.a(yzy.qh);
        if (mduVar.b.d()) {
            mduVar.b();
            return;
        }
        PermissionPollerImpl permissionPollerImpl = mduVar.g;
        Runnable runnable = mduVar.e;
        Handler handler = permissionPollerImpl.d;
        handler.postDelayed(runnable, 100L);
        handler.postDelayed(mduVar.f, mduVar.a);
        ArrayList arrayList = permissionPollerImpl.c;
        if (arrayList.isEmpty()) {
            permissionPollerImpl.b.startForegroundService(permissionPollerImpl.e);
        }
        arrayList.add(mduVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdm
    public final void b(Object obj) {
        wer.c();
        yfq yfqVarO = yfq.o(this.c);
        int size = yfqVarO.size();
        for (int i = 0; i < size; i++) {
            mdu mduVar = (mdu) yfqVarO.get(i);
            if (Objects.equals(mduVar.d, obj)) {
                mduVar.a(yzy.qk);
                mduVar.c();
            }
        }
    }
}
