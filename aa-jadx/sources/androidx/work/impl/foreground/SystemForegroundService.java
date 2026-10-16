package androidx.work.impl.foreground;

/* JADX INFO: loaded from: classes2.dex */
public class SystemForegroundService extends defpackage.eqk implements defpackage.fno {
    public static final java.lang.String a = defpackage.fjv.b("SystemFgService");
    defpackage.fnp b;
    android.app.NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (android.app.NotificationManager) getApplicationContext().getSystemService("notification");
        defpackage.fnp fnpVar = new defpackage.fnp(getApplicationContext());
        this.b = fnpVar;
        if (fnpVar.h == null) {
            fnpVar.h = this;
        } else {
            defpackage.fjv.a();
            android.util.Log.e(defpackage.fnp.a, "A callback already exists.");
        }
    }

    @Override // defpackage.fno
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.fno
    public final void b(int i, android.app.Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.fno
    public final void c(int i, int i2, android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.fnq.a(this, i, notification, i2);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.fno
    public final void d(int i) {
        this.d = true;
        defpackage.fjv.a().c(a, "Shutting down.");
        stopForeground(true);
        stopSelf(i);
    }

    @Override // defpackage.eqk, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.eqk, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            defpackage.fjv.a();
            android.util.Log.i(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        defpackage.fnp fnpVar = this.b;
        java.lang.String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            defpackage.fjv.a();
            java.lang.String str = defpackage.fnp.a;
            java.util.Objects.toString(intent);
            android.util.Log.i(str, "Started foreground service ".concat(intent.toString()));
            fnpVar.j.e(new defpackage.etd(fnpVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 11));
            fnpVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            fnpVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            defpackage.fjv.a();
            android.util.Log.i(defpackage.fnp.a, "Stopping foreground service");
            defpackage.fno fnoVar = fnpVar.h;
            if (fnoVar == null) {
                return 3;
            }
            fnoVar.d(i2);
            return 3;
        }
        defpackage.fjv.a();
        java.lang.String str2 = defpackage.fnp.a;
        java.util.Objects.toString(intent);
        android.util.Log.i(str2, "Stopping foreground work for ".concat(intent.toString()));
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        defpackage.flv flvVar = fnpVar.b;
        java.util.UUID uuidFromString = java.util.UUID.fromString(stringExtra);
        uuidFromString.getClass();
        defpackage.dbc dbcVar = flvVar.c.h;
        ?? r6 = flvVar.k.e;
        r6.getClass();
        defpackage.dsx.f(dbcVar, "CancelWorkById", r6, new defpackage.bso(flvVar, uuidFromString, 18, null));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i, i2);
    }
}
