package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.bsh;
import defpackage.dsr;
import defpackage.dsy;
import defpackage.eqe;
import defpackage.esx;
import defpackage.fjo;
import defpackage.flo;
import defpackage.fnh;
import defpackage.fni;
import defpackage.fnj;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public class SystemForegroundService extends eqe implements fnh {
    public static final String a = fjo.b("SystemFgService");
    fni b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        fni fniVar = new fni(getApplicationContext());
        this.b = fniVar;
        if (fniVar.h == null) {
            fniVar.h = this;
        } else {
            fjo.a();
            Log.e(fni.a, "A callback already exists.");
        }
    }

    @Override // defpackage.fnh
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.fnh
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.fnh
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            fnj.a(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.fnh
    public final void d(int i) {
        this.d = true;
        fjo.a().c(a, "Shutting down.");
        stopForeground(true);
        stopSelf(i);
    }

    @Override // defpackage.eqe, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.eqe, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            fjo.a();
            Log.i(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        fni fniVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            fjo.a();
            String str = fni.a;
            Objects.toString(intent);
            Log.i(str, "Started foreground service ".concat(intent.toString()));
            fniVar.j.e(new esx(fniVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 11));
            fniVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            fniVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            fjo.a();
            Log.i(fni.a, "Stopping foreground service");
            fnh fnhVar = fniVar.h;
            if (fnhVar == null) {
                return 3;
            }
            fnhVar.d(i2);
            return 3;
        }
        fjo.a();
        String str2 = fni.a;
        Objects.toString(intent);
        Log.i(str2, "Stopping foreground work for ".concat(intent.toString()));
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        flo floVar = fniVar.b;
        UUID uuidFromString = UUID.fromString(stringExtra);
        uuidFromString.getClass();
        dsr dsrVar = floVar.c.h;
        ?? r6 = floVar.k.e;
        r6.getClass();
        dsy.g(dsrVar, "CancelWorkById", r6, new bsh(floVar, uuidFromString, 18, null));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i, i2);
    }
}
