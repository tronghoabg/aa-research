package androidx.work.impl.foreground;

import J3.r;
import K3.q;
import L7.b;
import R3.a;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC1460y;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC1460y {

    /* renamed from: f, reason: collision with root package name */
    public static final String f19084f = r.f("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f19085b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19086c;

    /* renamed from: d, reason: collision with root package name */
    public a f19087d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f19088e;

    public final void a() {
        this.f19085b = new Handler(Looper.getMainLooper());
        this.f19088e = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f19087d = aVar;
        if (aVar.f10222j != null) {
            r.d().b(a.k, "A callback already exists.");
        } else {
            aVar.f10222j = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC1460y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC1460y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f19087d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        super.onStartCommand(intent, i5, i10);
        boolean z2 = this.f19086c;
        String str = f19084f;
        if (z2) {
            r.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f19087d.g();
            a();
            this.f19086c = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f19087d;
        aVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.k;
        if (zEquals) {
            r.d().e(str2, "Started foreground service " + intent);
            aVar.f10215c.v(new b(aVar, false, intent.getStringExtra("KEY_WORKSPEC_ID"), 5));
            aVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            r.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f10222j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f19086c = true;
            r.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        r.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        q qVar = aVar.f10214b;
        qVar.getClass();
        qVar.f6504d.v(new T3.b(qVar, uuidFromString));
        return 3;
    }
}
