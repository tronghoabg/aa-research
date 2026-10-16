package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
final class jgr extends rbj {
    public jgr(jgs jgsVar) {
        super(jgsVar, Looper.getMainLooper());
    }

    final void a() {
        sendMessage(obtainMessage(4));
    }

    final void b() {
        sendMessage(obtainMessage(5));
    }

    final void c(Rect rect) {
        if (hasMessages(13)) {
            ((ype) jgs.a.l().ai((char) 2015)).y("Canceling old inset notification in favor of %s", rect);
            removeMessages(13);
        }
        sendMessage(obtainMessage(13, new Rect(rect)));
    }

    final void d(MotionEvent motionEvent) {
        sendMessage(obtainMessage(7, motionEvent));
    }

    final void e(Rect rect) {
        sendMessage(obtainMessage(14, new Rect(rect)));
    }

    final void f(int i, int i2) {
        sendMessage(obtainMessage(1, i, i2));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        jgs jgsVar = (jgs) v();
        if (jgsVar == null) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            jgsVar.bm(message.arg1, message.arg2);
            return;
        }
        switch (i) {
            case 4:
                jgsVar.p.b(jgsVar);
                break;
            case 5:
                jgsVar.p.l(jgsVar);
                break;
            case 6:
                jgsVar.p.i(jgsVar, (InputFocusChangedEvent) message.obj);
                break;
            case 7:
                jgsVar.p.g(jgsVar, (MotionEvent) message.obj);
                break;
            case 8:
                jgsVar.p.f(jgsVar, (KeyEvent) message.obj);
                break;
            case 9:
                jgsVar.p.h(message.arg1);
                break;
            case 10:
                jgsVar.p.j(jgsVar);
                break;
            case 11:
                jgsVar.p.m(jgsVar);
                break;
            case 12:
                jgsVar.p.k(jgsVar);
                break;
            case 13:
                jgsVar.p.c(jgsVar, (Rect) message.obj);
                break;
            case 14:
                jgsVar.p.n((Rect) message.obj);
                break;
        }
    }
}
