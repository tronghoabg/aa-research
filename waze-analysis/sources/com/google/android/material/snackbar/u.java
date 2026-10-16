package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private static u f6789a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6790b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f6791c = new Handler(Looper.getMainLooper(), new s(this));

    /* renamed from: d, reason: collision with root package name */
    private t f6792d;

    /* renamed from: e, reason: collision with root package name */
    private t f6793e;

    private u() {
    }

    static u a() {
        u uVar = f6789a;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u();
        f6789a = uVar2;
        return uVar2;
    }

    private final void j(t tVar) {
        int i2 = tVar.f6787b;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f6791c;
        handler.removeCallbacksAndMessages(tVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, tVar), i2);
    }

    private final void k() {
        t tVar = this.f6793e;
        if (tVar != null) {
            this.f6792d = tVar;
            this.f6793e = null;
            h hVar = (h) tVar.f6786a.get();
            if (hVar == null) {
                this.f6792d = null;
                return;
            }
            o oVar = hVar.f6752a;
            Handler handler = o.f6770a;
            handler.sendMessage(handler.obtainMessage(0, oVar));
        }
    }

    private final boolean l(t tVar, int i2) {
        h hVar = (h) tVar.f6786a.get();
        if (hVar == null) {
            return false;
        }
        this.f6791c.removeCallbacksAndMessages(tVar);
        o oVar = hVar.f6752a;
        Handler handler = o.f6770a;
        handler.sendMessage(handler.obtainMessage(1, i2, 0, oVar));
        return true;
    }

    private final boolean m(h hVar) {
        t tVar = this.f6792d;
        return tVar != null && tVar.a(hVar);
    }

    private final boolean n(h hVar) {
        t tVar = this.f6793e;
        return tVar != null && tVar.a(hVar);
    }

    final void b(t tVar) {
        synchronized (this.f6790b) {
            if (this.f6792d == tVar || this.f6793e == tVar) {
                l(tVar, 2);
            }
        }
    }

    public final void c(h hVar, int i2) {
        synchronized (this.f6790b) {
            if (m(hVar)) {
                l(this.f6792d, i2);
            } else if (n(hVar)) {
                l(this.f6793e, i2);
            }
        }
    }

    public final void d(h hVar) {
        synchronized (this.f6790b) {
            if (m(hVar)) {
                this.f6792d = null;
                if (this.f6793e != null) {
                    k();
                }
            }
        }
    }

    public final void e(h hVar) {
        synchronized (this.f6790b) {
            if (m(hVar)) {
                j(this.f6792d);
            }
        }
    }

    public final void f(h hVar) {
        synchronized (this.f6790b) {
            if (m(hVar)) {
                t tVar = this.f6792d;
                if (!tVar.f6788c) {
                    tVar.f6788c = true;
                    this.f6791c.removeCallbacksAndMessages(tVar);
                }
            }
        }
    }

    public final void g(h hVar) {
        synchronized (this.f6790b) {
            if (m(hVar)) {
                t tVar = this.f6792d;
                if (tVar.f6788c) {
                    tVar.f6788c = false;
                    j(tVar);
                }
            }
        }
    }

    public final void h(int i2, h hVar) {
        synchronized (this.f6790b) {
            if (m(hVar)) {
                t tVar = this.f6792d;
                tVar.f6787b = i2;
                this.f6791c.removeCallbacksAndMessages(tVar);
                j(this.f6792d);
                return;
            }
            if (n(hVar)) {
                this.f6793e.f6787b = i2;
            } else {
                this.f6793e = new t(i2, hVar);
            }
            t tVar2 = this.f6792d;
            if (tVar2 == null || !l(tVar2, 4)) {
                this.f6792d = null;
                k();
            }
        }
    }

    public final boolean i(h hVar) {
        boolean z;
        synchronized (this.f6790b) {
            z = true;
            if (!m(hVar) && !n(hVar)) {
                z = false;
            }
        }
        return z;
    }
}
