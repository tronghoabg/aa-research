package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class wvw {
    private static wvw e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new wvu(this));
    public wvv c;
    public wvv d;

    private wvw() {
    }

    public static wvw a() {
        wvw wvwVar = e;
        if (wvwVar != null) {
            return wvwVar;
        }
        wvw wvwVar2 = new wvw();
        e = wvwVar2;
        return wvwVar2;
    }

    public final void b(wvv wvvVar) {
        int i = wvvVar.a;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(wvvVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, wvvVar), i);
    }

    public final void c() {
        wvv wvvVar = this.d;
        if (wvvVar != null) {
            this.c = wvvVar;
            this.d = null;
            ykd ykdVar = (ykd) ((WeakReference) wvvVar.c).get();
            if (ykdVar == null) {
                this.c = null;
                return;
            }
            Object obj = ykdVar.a;
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(0, obj));
        }
    }

    public final boolean d(wvv wvvVar, int i) {
        ykd ykdVar = (ykd) ((WeakReference) wvvVar.c).get();
        if (ykdVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(wvvVar);
        Object obj = ykdVar.a;
        Handler handler = BaseTransientBottomBar.a;
        handler.sendMessage(handler.obtainMessage(1, i, 0, obj));
        return true;
    }

    public final void e(ykd ykdVar) {
        synchronized (this.a) {
            if (g(ykdVar)) {
                wvv wvvVar = this.c;
                if (!wvvVar.b) {
                    wvvVar.b = true;
                    this.b.removeCallbacksAndMessages(wvvVar);
                }
            }
        }
    }

    public final void f(ykd ykdVar) {
        synchronized (this.a) {
            if (g(ykdVar)) {
                wvv wvvVar = this.c;
                if (wvvVar.b) {
                    wvvVar.b = false;
                    b(wvvVar);
                }
            }
        }
    }

    public final boolean g(ykd ykdVar) {
        wvv wvvVar = this.c;
        return wvvVar != null && wvvVar.a(ykdVar);
    }

    public final boolean h(ykd ykdVar) {
        wvv wvvVar = this.d;
        return wvvVar != null && wvvVar.a(ykdVar);
    }
}
