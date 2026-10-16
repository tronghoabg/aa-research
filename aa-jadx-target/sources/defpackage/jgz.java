package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jgz extends defpackage.rce {
    public jgz(defpackage.jha jhaVar) {
        super(jhaVar, android.os.Looper.getMainLooper());
    }

    final void a() {
        sendMessage(obtainMessage(4));
    }

    final void b() {
        sendMessage(obtainMessage(5));
    }

    final void c(android.graphics.Rect rect) {
        if (hasMessages(13)) {
            ((defpackage.yqj) defpackage.jha.a.l().ai((char) 2015)).y("Canceling old inset notification in favor of %s", rect);
            removeMessages(13);
        }
        sendMessage(obtainMessage(13, new android.graphics.Rect(rect)));
    }

    final void d(android.view.MotionEvent motionEvent) {
        sendMessage(obtainMessage(7, motionEvent));
    }

    public final void e(android.graphics.Rect rect) {
        sendMessage(obtainMessage(14, new android.graphics.Rect(rect)));
    }

    final void f(int i, int i2) {
        sendMessage(obtainMessage(1, i, i2));
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        defpackage.jha jhaVar = (defpackage.jha) v();
        if (jhaVar == null) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            jhaVar.bo(message.arg1, message.arg2);
            return;
        }
        switch (i) {
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                jhaVar.q.b(jhaVar);
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                jhaVar.q.l(jhaVar);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                jhaVar.q.i(jhaVar, (com.google.android.gms.car.InputFocusChangedEvent) message.obj);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                jhaVar.q.g(jhaVar, (android.view.MotionEvent) message.obj);
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                jhaVar.q.f(jhaVar, (android.view.KeyEvent) message.obj);
                break;
            case 9:
                jhaVar.q.h(message.arg1);
                break;
            case 10:
                jhaVar.q.j(jhaVar);
                break;
            case 11:
                jhaVar.q.m(jhaVar);
                break;
            case 12:
                jhaVar.q.k(jhaVar);
                break;
            case 13:
                jhaVar.q.c(jhaVar, (android.graphics.Rect) message.obj);
                break;
            case 14:
                jhaVar.q.n((android.graphics.Rect) message.obj);
                break;
        }
    }
}
