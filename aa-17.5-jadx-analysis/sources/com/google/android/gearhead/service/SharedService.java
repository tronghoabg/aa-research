package com.google.android.gearhead.service;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager;
import defpackage.acqa;
import defpackage.ebe;
import defpackage.kio;
import defpackage.kzd;
import defpackage.lcq;
import defpackage.lnm;
import defpackage.mbm;
import defpackage.mjz;
import defpackage.mki;
import defpackage.olm;
import defpackage.oya;
import defpackage.qjo;
import defpackage.tez;
import defpackage.tfm;
import defpackage.vla;
import defpackage.ype;
import defpackage.yph;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes.dex */
public class SharedService extends Service {
    public static final yph a = yph.c("GH.SharedService");
    public qjo b;
    public final Set c = new ConcurrentSkipListSet();
    public String d = "UNINITIALIZED_BLUETOOTH_ADDRESS";
    public String e = "UNINITIALIZED_BLUETOOTH_ADDRESS";
    mjz f;

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (acqa.c()) {
            printWriter.println("Dumping BuildConfig flags for the SHARED process");
            ebe.p(printWriter);
        }
        mbm.c(printWriter, new oya(this, 13));
        tez.c(printWriter);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new mjz(this);
        this.b = new qjo(this);
        if (Build.VERSION.SDK_INT < 30) {
            yph yphVar = kio.a;
            ((kio) mki.a.i(kio.class)).c();
        }
        yph yphVar2 = tfm.a;
        vla.a().h();
        ((ype) ((ype) a.f()).ai((char) 7407)).u("Shared Service created");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        FirstDriveNotificationManager.a().d();
        lnm.K().d();
        lnm.S().d();
        lcq.a().d();
        kzd.j().d();
        if (Build.VERSION.SDK_INT < 30) {
            kio.b().d();
        }
        olm.d().b();
        ((ype) ((ype) a.f()).ai((char) 7408)).u("Shared Service destroyed");
    }
}
