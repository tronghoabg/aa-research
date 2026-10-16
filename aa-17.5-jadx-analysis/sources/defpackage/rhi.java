package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class rhi {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rhi(Context context, Runnable runnable) {
        this.b = new sss(Looper.getMainLooper());
        this.c = new ral(this, 15);
        this.d = context;
        this.e = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void a() {
        KeyguardManager keyguardManager = (KeyguardManager) ((Context) this.d).getSystemService("keyguard");
        keyguardManager.getClass();
        if (!keyguardManager.isKeyguardLocked()) {
            this.e.run();
            b();
        } else {
            ((Handler) this.b).postDelayed(this.c, 50L);
        }
    }

    public final void b() {
        if (this.a) {
            ((Handler) this.b).removeCallbacksAndMessages(null);
            this.a = false;
        }
    }

    public rhi(bip bipVar, afdr afdrVar) {
        this.d = bipVar;
        this.c = afdrVar;
        this.e = new Object();
        this.b = new byw(new czc[16]);
    }
}
