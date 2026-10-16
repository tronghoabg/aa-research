package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ztv {
    public static final String a = "ztv";
    public final Executor b;
    public final zrt c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public vff h;
    public vfl i;
    public final CopyOnWriteArraySet j;
    private vfc k;
    private vfi l;

    public ztv() {
        Executor executorB = zrz.b();
        zrt zrtVar = zrt.a;
        this.b = executorB;
        zkt.n(zrtVar, "uiThreadChecker");
        this.c = zrtVar;
        this.d = false;
        this.e = false;
        this.f = -1;
        synchronized (this) {
            this.g = 0;
        }
        this.k = null;
        this.h = null;
        this.l = null;
        this.i = null;
        this.j = new CopyOnWriteArraySet();
    }

    public final void a() {
        if (g()) {
            return;
        }
        this.f = -1;
        vfc vfcVar = this.k;
        if (vfcVar != null) {
            try {
                vfcVar.e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public final void b() {
        this.c.a();
        if (!this.d || this.f == -4) {
            return;
        }
        boolean zU = addm.a.gu().u();
        vfi vfiVar = this.l;
        if (zU) {
            if (vfiVar != null) {
                try {
                    vfiVar.e();
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            return;
        }
        if (vfiVar != null) {
            try {
                vfiVar.e();
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }
    }

    public final void c(vfc vfcVar) {
        this.c.a();
        this.k = vfcVar;
    }

    public final void d(vff vffVar) {
        this.c.a();
        this.h = vffVar;
    }

    public final void e(vfi vfiVar) {
        this.c.a();
        this.l = vfiVar;
    }

    public final void f(vfl vflVar) {
        this.c.a();
        this.i = vflVar;
    }

    public final boolean g() {
        return this.d || this.e;
    }
}
