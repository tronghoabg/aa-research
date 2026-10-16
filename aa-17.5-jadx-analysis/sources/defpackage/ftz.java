package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ftz implements ComponentCallbacks2 {
    public final WeakReference a;
    public volatile boolean b;
    private final Context c;
    private final fsn d;
    private final AtomicBoolean e;

    public ftz(ugn ugnVar, Context context) {
        fsn fslVar;
        this.c = context;
        this.a = new WeakReference(ugnVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || dup.c(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            fslVar = new fsl();
        } else {
            try {
                fslVar = new fsp(connectivityManager, this);
            } catch (Exception unused) {
                fslVar = new fsl();
            }
        }
        this.d = fslVar;
        this.b = fslVar.b();
        this.e = new AtomicBoolean(false);
        this.c.registerComponentCallbacks(this);
    }

    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.c.unregisterComponentCallbacks(this);
        this.d.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        if (((ugn) this.a.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fsj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aezr, java.lang.Object] */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ugn ugnVar = (ugn) this.a.get();
        if (ugnVar == null) {
            a();
            return;
        }
        ieb iebVar = (ieb) ugnVar.i.a();
        if (iebVar != null) {
            iebVar.a.c(i);
            ((ajju) iebVar.b).q(i);
        }
    }
}
