package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class iof implements iod {
    public static final yph a = yph.c("CAR.IME");
    public rmf c;
    public rml e;
    public EditorInfo f;
    public ing g;
    public final rmh h;
    private final Context i;
    private final Intent j;
    private boolean k;
    private ing l;
    private final spi m;
    public final Handler b = new sss(Looper.getMainLooper(), (byte[]) null);
    public int d = 0;
    private final ServiceConnection n = new ioe(this);

    public iof(Context context, ComponentName componentName, spi spiVar, Point point) {
        this.i = context;
        this.m = spiVar;
        Intent intent = new Intent("com.google.android.gms.car.BIND_CAR_INPUT");
        this.j = intent;
        intent.setComponent(componentName);
        if (point != null) {
            intent.putExtra("touchpad_width", point.x);
            intent.putExtra("touchpad_height", point.y);
        }
        this.h = new rmh(this);
    }

    @Override // defpackage.iod
    public final void a(boolean z) {
        ((ype) a.l().ai((char) 814)).y("onVideoFocusChange hasFocus=%b", Boolean.valueOf(z));
        if (!z) {
            g();
        }
        this.k = z;
    }

    @Override // defpackage.iod
    public final void b() {
        ((ype) ((ype) a.f()).ai((char) 815)).u("Resetting input manager");
        g();
    }

    @Override // defpackage.iod
    public final void c(rml rmlVar, EditorInfo editorInfo, ing ingVar) {
        if (!this.k) {
            ((ype) a.l().ai((char) 817)).u("No video focus; ignoring startInput");
            return;
        }
        this.b.removeCallbacksAndMessages(null);
        int i = this.d;
        if (i == 2) {
            try {
                i(rmlVar, editorInfo, ingVar);
                return;
            } catch (RemoteException e) {
                h("Failed to notify input service of start", e);
                return;
            }
        }
        if (i == 0 && !this.m.d(this.i, this.j, this.n, 65)) {
            ((ype) ((ype) a.g()).ai((char) 816)).u("Could not bind to input service");
            ingVar.q();
            return;
        }
        ing ingVar2 = this.g;
        if (ingVar2 != null && ingVar2 != ingVar) {
            ingVar2.q();
        }
        this.e = rmlVar;
        this.f = editorInfo;
        this.g = ingVar;
        this.d = 1;
    }

    @Override // defpackage.iod
    public final void d(ing ingVar) {
        ((ype) a.l().ai((char) 818)).u("stopImeIfActiveClient");
        if (this.k) {
            if (this.l == ingVar || this.g == ingVar) {
                e(ingVar);
            }
        }
    }

    @Override // defpackage.iod
    public final void e(ing ingVar) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 820)).u("stopInput");
        if (this.l == ingVar || this.g == ingVar) {
            g();
        } else {
            ((ype) ((ype) yphVar.g()).ai((char) 821)).u("Client requested to stop input without starting input first.");
        }
    }

    public final void f() {
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void g() {
        int i = this.d;
        if (i == 0) {
            return;
        }
        if (i == 2) {
            this.l.q();
        }
        this.l = null;
        if (this.d == 1) {
            this.g.q();
        }
        f();
        rmf rmfVar = this.c;
        if (rmfVar != null) {
            try {
                rmfVar.e();
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 819)).u("Failed to notify input service of stop");
            }
        }
        this.c = null;
        this.m.b(this.i, this.n);
        this.d = 0;
    }

    public final void h(String str, RemoteException remoteException) {
        ((ype) ((ype) ((ype) a.g()).p(remoteException)).ai((char) 822)).y("%s", str);
        this.c = null;
        g();
    }

    public final void i(rml rmlVar, EditorInfo editorInfo, ing ingVar) throws RemoteException {
        ((ype) a.l().ai((char) 823)).u("updateClientConnection");
        ing ingVar2 = this.l;
        if (ingVar2 != null && ingVar2 != ingVar) {
            ingVar2.q();
        }
        this.l = ingVar;
        this.c.g(rmlVar, editorInfo, ingVar.z);
    }

    public final String toString() {
        return "CarImeManagerImpl " + Integer.toHexString(System.identityHashCode(this)) + "{mImeState=" + this.d + ", mInputService=" + this.c + ", mCurrentClient=" + this.l + ", mPendingClient=" + this.g + "}";
    }
}
