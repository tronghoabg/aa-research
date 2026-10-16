package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class qqs extends rbj {
    private boolean a;

    public qqs(qqt qqtVar, Looper looper) {
        super(qqtVar, looper);
        this.a = false;
    }

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        removeMessages(2);
    }

    public final synchronized void b(xhi xhiVar, int i) {
        if (this.a) {
            return;
        }
        sendMessageDelayed(obtainMessage(2, xhiVar.e, i), 500L);
    }

    public final synchronized void c(xhj xhjVar, boolean z, boolean z2) {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(0, xhjVar.i, z ? 1 : 0, Boolean.valueOf(z2)));
    }

    public final synchronized void d() {
        if (this.a) {
            return;
        }
        qqt.a.d().ai(7607).u("requestToReleaseFocusToCar");
        sendMessage(obtainMessage(1));
    }

    public final synchronized void e() {
        if (this.a) {
            return;
        }
        this.a = true;
    }

    public final synchronized boolean f() {
        if (!this.a) {
            if (hasMessages(2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void g() {
        if (this.a) {
            return;
        }
        sendMessageDelayed(obtainMessage(3), 100L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qqt qqtVar = (qqt) v();
        if (qqtVar == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            xhj xhjVarB = xhj.b(message.arg1);
            if (xhjVarB == null) {
                throw new IllegalArgumentException("AudioFocusStateType in msg is invalid.");
            }
            qqtVar.b(xhjVarB, message.arg2 == 1, ((Boolean) message.obj).booleanValue());
            return;
        }
        if (i == 1) {
            qqtVar.i(-1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (qqtVar.e.a()) {
                qqt.a.f().ai(7614).u("Still in call. Retry audio capture reset.");
                qqs qqsVar = qqtVar.k;
                qqsVar.getClass();
                qqsVar.g();
                return;
            }
            if (qqtVar.r.k()) {
                qpo[] qpoVarArr = ((qqv) qqtVar.c.gu()).k;
                int length = qpoVarArr.length;
                for (int i2 = 0; i2 < 3; i2++) {
                    qpo qpoVar = qpoVarArr[i2];
                    if (qpoVar != null && qpoVar.e != null && qpoVar.b) {
                        qpoVar.a.f().ai(7564).u("Resetting system capture");
                        qpoVar.f();
                        qpoVar.e();
                    }
                }
                return;
            }
            return;
        }
        int i3 = message.arg1;
        int i4 = message.arg2;
        xhi xhiVarB = xhi.b(i3);
        if (xhiVarB == null) {
            throw new IllegalArgumentException(a.bp(i3, "requestTypeFromMessage has invalid value: "));
        }
        yop yopVarAi = qqt.a.h().ai(7626);
        String strR = roc.r(xhiVarB);
        zjc zjcVar = zjc.a;
        yopVarAi.M("Car focus response time-out for focus request %s, attempt#: %s", new zjd(zjcVar, strR), new zjd(zjcVar, Integer.valueOf(i4)));
        if (qqtVar.e.b()) {
            return;
        }
        int i5 = xhiVarB != xhi.AUDIO_FOCUS_GAIN ? 1 : 3;
        rfi rfiVar = qqtVar.f;
        rfg rfgVarA = rfh.a();
        rfgVarA.a = xhiVarB;
        rfgVarA.d(true);
        rfgVarA.b(i4);
        rfgVarA.c(i5);
        rfiVar.a(rfgVarA.a());
        qqtVar.o++;
        qqtVar.p = SystemClock.elapsedRealtime();
        if (i4 < i5) {
            qqtVar.h(xhiVarB, i4 + 1);
            return;
        }
        qqtVar.g = xhj.AUDIO_FOCUS_STATE_LOSS;
        qqtVar.h = null;
        synchronized (qqtVar.l) {
            qqtVar.q = 0;
        }
        if (qqtVar.i && (xhiVarB == xhi.AUDIO_FOCUS_GAIN || xhiVarB == xhi.AUDIO_FOCUS_RELEASE)) {
            qqtVar.i = false;
        }
        qqtVar.b(qqtVar.g, true, true);
    }
}
