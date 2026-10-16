package e.a.b.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.UserHandle;
import e.a.ee;
import e.a.ef;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ap implements ServiceConnection, a {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46345a = Logger.getLogger(ap.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Intent f46346b;

    /* renamed from: c, reason: collision with root package name */
    private final UserHandle f46347c;

    /* renamed from: d, reason: collision with root package name */
    private final int f46348d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f46349e;

    /* renamed from: f, reason: collision with root package name */
    private Context f46350f;

    /* renamed from: g, reason: collision with root package name */
    private int f46351g;

    /* renamed from: h, reason: collision with root package name */
    private int f46352h;

    /* renamed from: i, reason: collision with root package name */
    private final e f46353i;

    ap(Executor executor, Context context, Intent intent, UserHandle userHandle, int i2, e eVar) {
        synchronized (this) {
            this.f46346b = intent;
            this.f46348d = i2;
            this.f46353i = eVar;
            this.f46350f = context;
            this.f46349e = executor;
            this.f46347c = userHandle;
            this.f46351g = 1;
            this.f46352h = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(ee eeVar) {
        Logger logger = f46345a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", eeVar);
        this.f46350f = null;
        if (this.f46352h != 4) {
            this.f46352h = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.f46353i.q(eeVar);
        }
    }

    private final Context g() throws ef {
        com.google.d.b.an.v(this.f46350f != null, "Already unbound!");
        try {
            UserHandle userHandle = this.f46347c;
            Context context = this.f46350f;
            return userHandle == null ? context : ar.a(context, userHandle);
        } catch (ReflectiveOperationException unused) {
            throw new ef(ee.f47410j.g("Cross-user pre-auth".concat(" requires SDK_INT >= R and @SystemApi visibility")));
        }
    }

    @Override // e.a.b.a.a
    public final ServiceInfo a() throws ef {
        PackageManager packageManager = g().getPackageManager();
        Intent intent = this.f46346b;
        ResolveInfo resolveInfoResolveService = packageManager.resolveService(intent, 268435456);
        if (resolveInfoResolveService != null) {
            return resolveInfoResolveService.serviceInfo;
        }
        throw new ef(ee.f47409i.g("resolveService(" + String.valueOf(intent) + " / " + String.valueOf(this.f46347c) + ") was null"));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #5 {all -> 0x0108, blocks: (B:28:0x006a, B:46:0x00d7, B:48:0x00dd, B:49:0x00df, B:54:0x00f2, B:53:0x00e5, B:19:0x003b, B:27:0x0066, B:42:0x00a3, B:45:0x00bf, B:62:0x0106, B:20:0x0040, B:21:0x004b, B:23:0x0050, B:24:0x0055, B:25:0x005f), top: B:70:0x0001, inners: #4 }] */
    @Override // e.a.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.b.a.ap.b():void");
    }

    final void e(final ee eeVar) {
        Context context;
        synchronized (this) {
            int i2 = this.f46351g;
            context = (i2 == 2 || i2 == 3) ? this.f46350f : null;
            this.f46351g = 4;
        }
        this.f46349e.execute(new Runnable() { // from class: e.a.b.a.an
            @Override // java.lang.Runnable
            public final void run() {
                this.f46338a.f(eeVar);
            }
        });
        if (context != null) {
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        e(ee.f47411k.g("Remote Service component " + componentName.getClassName() + " was disabled, or its package " + componentName.getPackageName() + " was disabled, force-stopped, replaced or uninstalled (onBindingDied)."));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        Intent intent = this.f46346b;
        e(ee.f47409i.g("Remote Service returned null from onBind() for " + String.valueOf(intent) + " (onNullBinding): " + String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.f46351g == 2) {
                this.f46351g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.f46352h == 1) {
            this.f46352h = 3;
            f46345a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.f46353i.p(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e(ee.f47411k.g("Server process crashed, exited or was killed (onServiceDisconnected): ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}
