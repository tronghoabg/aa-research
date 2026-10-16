package com.google.android.projection.gearhead.service;

import android.app.PendingIntent;
import android.app.Service;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity;
import defpackage.acqa;
import defpackage.dsx;
import defpackage.ebe;
import defpackage.mas;
import defpackage.mbm;
import defpackage.mki;
import defpackage.mnc;
import defpackage.tez;
import defpackage.uxu;
import defpackage.wdu;
import defpackage.ype;
import defpackage.yph;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class GearheadService extends Service {
    private static final yph b = yph.c("GH.GearheadService");
    boolean a = false;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (acqa.c()) {
            printWriter.println("Dumping BuildConfig flags for the PROJECTION process");
            ebe.p(printWriter);
        }
        mbm.c(printWriter, new uxu(this, 3));
        printWriter.println("Dumping logs for the PROJECTION process");
        tez.c(printWriter);
        printWriter.println("============");
        mnc.a().h(printWriter);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ((ype) b.l().ai((char) 10183)).u("onBind");
        return new Binder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 10184)).u("onCreate");
        if (Build.VERSION.SDK_INT < 29) {
            int i = DefaultSettingsActivity.a;
            Intent flags = new Intent(mki.a.c, (Class<?>) DefaultSettingsActivity.class).setFlags(335544320);
            ClipData clipData = wdu.a;
            PendingIntent pendingIntentB = wdu.b(this, R.id.pending_intent_request_code_id, flags, 201326592);
            mas.c();
            dsx dsxVar = new dsx(this, "gearhead_connection_status");
            dsxVar.e(2, true);
            dsxVar.l();
            dsxVar.u = 1;
            dsxVar.n(R.drawable.gs_android_auto_vd_24);
            dsxVar.r = "service";
            dsxVar.i = 1;
            dsxVar.h(getString(R.string.tap_to_open_settings_notification_message));
            dsxVar.t = getColor(R.color.gearhead_sdk_light_blue_800);
            dsxVar.g = pendingIntentB;
            startForeground(R.id.foreground_projection_id, dsxVar.a());
            ((ype) ((ype) yphVar.f()).ai((char) 10186)).u("started foreground service");
            this.a = true;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 10185)).u("onDestroy");
        if (this.a) {
            this.a = false;
            stopForeground(true);
            ((ype) ((ype) yphVar.f()).ai((char) 10187)).u("stopped foreground service");
        }
    }
}
