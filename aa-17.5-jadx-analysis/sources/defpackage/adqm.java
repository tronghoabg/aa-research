package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.UserHandle;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class adqm implements ServiceConnection, adop {
    private static final Logger c = Logger.getLogger(adqm.class.getName());
    public final Intent a;
    public final UserHandle b;
    private final int d;
    private final Executor e;
    private Context f;
    private int g;
    private int h;
    private final ador i;

    public adqm(Executor executor, Context context, Intent intent, UserHandle userHandle, ador adorVar) {
        synchronized (this) {
            this.a = intent;
            this.d = 1;
            this.i = adorVar;
            this.f = context;
            this.e = executor;
            this.b = userHandle;
            this.g = 1;
            this.h = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fe, TryCatch #8 {all -> 0x00fe, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fc, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fe, TryCatch #8 {all -> 0x00fe, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fc, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[Catch: RuntimeException -> 0x0092, SecurityException -> 0x0094, all -> 0x00fe, PHI: r6
  0x006c: PHI (r6v16 adqm) = (r6v15 adqm), (r6v20 adqm) binds: [B:30:0x0067, B:19:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #8 {all -> 0x00fe, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fc, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #8 {all -> 0x00fe, blocks: (B:32:0x006c, B:46:0x00cb, B:48:0x00d1, B:49:0x00d3, B:54:0x00e6, B:53:0x00d9, B:23:0x003e, B:31:0x0069, B:41:0x009a, B:45:0x00b5, B:62:0x00fc, B:24:0x0043, B:25:0x004e, B:27:0x0053, B:28:0x0058, B:29:0x0062), top: B:70:0x0001, inners: #3 }] */
    @Override // defpackage.adop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adqm.a():void");
    }

    public final void b(adnq adnqVar) {
        Logger logger = c;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", adnqVar);
        this.f = null;
        if (this.h != 4) {
            this.h = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.i.n(adnqVar);
        }
    }

    final void c(adnq adnqVar) {
        Context context;
        synchronized (this) {
            int i = this.g;
            context = (i == 2 || i == 3) ? this.f : null;
            this.g = 4;
        }
        this.e.execute(new adsy(this, adnqVar, 1, (byte[]) null));
        if (context != null) {
            context.unbindService(this);
        }
    }

    public final Context d() throws adnr {
        woy.aa(this.f != null, "Already unbound!");
        try {
            UserHandle userHandle = this.b;
            Context context = this.f;
            return userHandle == null ? context : adqq.p(context, userHandle);
        } catch (ReflectiveOperationException unused) {
            throw new adnr(adnq.l.e("Cross-user pre-auth requires SDK_INT >= R and @SystemApi visibility"));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        c(adnq.m.e("Remote Service component " + componentName.getClassName() + " was disabled, or its package " + componentName.getPackageName() + " was disabled, force-stopped, replaced or uninstalled (onBindingDied)."));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        Intent intent = this.a;
        c(adnq.k.e("Remote Service returned null from onBind() for " + String.valueOf(intent) + " (onNullBinding): " + String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.h == 1) {
            this.h = 3;
            c.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.i.l(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c(adnq.m.e("Server process crashed, exited or was killed (onServiceDisconnected): ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}
