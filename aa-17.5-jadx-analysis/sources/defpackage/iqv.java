package defpackage;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class iqv extends rbj {
    private boolean a;

    public iqv(iqw iqwVar, Looper looper) {
        super(iqwVar, looper);
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
        ((ype) iqw.a.l().ai((char) 1147)).u("Send request to release focus to HU");
        sendMessage(obtainMessage(1));
    }

    public final synchronized void e() {
        if (this.a) {
            return;
        }
        this.a = true;
    }

    public final synchronized boolean f() {
        return this.a;
    }

    public final synchronized void g() {
        if (this.a) {
            return;
        }
        sendMessageDelayed(obtainMessage(3), 100L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        iqw iqwVar = (iqw) v();
        if (iqwVar == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            xhj xhjVarB = xhj.b(message.arg1);
            if (xhjVarB == null) {
                throw new IllegalArgumentException("AudioFocusStateType in msg is invalid.");
            }
            iqwVar.i(xhjVarB, message.arg2 == 1, ((Boolean) message.obj).booleanValue());
            return;
        }
        if (i == 1) {
            iqwVar.m(-1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (iqwVar.f.a()) {
                ((ype) ((ype) iqw.a.f()).ai((char) 1153)).u("Still in call. Retry audio capture reset.");
                iqv iqvVar = iqwVar.m;
                iqvVar.getClass();
                iqvVar.g();
                return;
            }
            if (iqwVar.d.bs()) {
                Object objGu = iqwVar.c.gu();
                for (int i2 = 0; i2 < 3; i2++) {
                    iqc iqcVar = ((irb) objGu).v[i2];
                    if (iqcVar != null && iqcVar.e != null && iqcVar.b) {
                        ((ype) ((ype) iqcVar.a.f()).ai((char) 1092)).u("Resetting system capture");
                        iqcVar.g();
                        iqcVar.e();
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
        if (iqwVar.f.b()) {
            ype ypeVar = (ype) ((ype) iqw.a.f()).ai(1171);
            String strR = roc.r(xhiVarB);
            zjc zjcVar = zjc.a;
            ypeVar.M("Car focus response time-out for focus request: %s, attempt#: %s. In phone call so not treating as error.", new zjd(zjcVar, strR), new zjd(zjcVar, Integer.valueOf(i4)));
            iqwVar.j = null;
            return;
        }
        yph yphVar = iqw.a;
        ype ypeVar2 = (ype) ((ype) yphVar.h()).ai(1169);
        String strR2 = roc.r(xhiVarB);
        zjc zjcVar2 = zjc.a;
        ypeVar2.M("Car focus response time-out for focus request: %s, attempt#: %s", new zjd(zjcVar2, strR2), new zjd(zjcVar2, Integer.valueOf(i4)));
        int i5 = xhiVarB == xhi.AUDIO_FOCUS_GAIN ? 10 : 1;
        irz irzVarA = isa.a();
        irzVarA.a = xhiVarB;
        irzVarA.d(true);
        irzVarA.b(i4);
        irzVarA.c(i5);
        iqwVar.v++;
        iqwVar.w = SystemClock.elapsedRealtime();
        if (i4 < i5) {
            iqwVar.g.a(irzVarA.a());
            iqwVar.l(xhiVarB, i4 + 1);
            return;
        }
        if (iqwVar.k.getAndSet(false)) {
            ((ype) ((ype) yphVar.f()).ai((char) 1170)).u("Reset pending recovery from transient loss due to GAIN request timeout");
            irzVarA.d = 5;
        }
        iqwVar.g.a(irzVarA.a());
        iqwVar.h = xhj.AUDIO_FOCUS_STATE_LOSS;
        iqwVar.j = null;
        synchronized (iqwVar.n) {
            iqwVar.x = 0;
        }
        iqwVar.i(xhj.AUDIO_FOCUS_STATE_LOSS, true, true);
    }
}
