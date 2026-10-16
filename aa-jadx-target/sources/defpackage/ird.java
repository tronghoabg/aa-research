package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ird extends defpackage.rce {
    private boolean a;

    public ird(defpackage.irf irfVar, android.os.Looper looper) {
        super(irfVar, looper);
        this.a = false;
    }

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        removeMessages(2);
    }

    public final synchronized void b(defpackage.xij xijVar, int i) {
        if (this.a) {
            return;
        }
        sendMessageDelayed(obtainMessage(2, xijVar.e, i), 500L);
    }

    public final synchronized void c(defpackage.xik xikVar, boolean z, boolean z2) {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(0, xikVar.i, z ? 1 : 0, java.lang.Boolean.valueOf(z2)));
    }

    public final synchronized void d() {
        if (this.a) {
            return;
        }
        ((defpackage.yqj) defpackage.irf.a.l().ai((char) 1147)).u("Send request to release focus to HU");
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
    public final void handleMessage(android.os.Message message) {
        defpackage.irf irfVar = (defpackage.irf) v();
        if (irfVar == null) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            defpackage.xik xikVarB = defpackage.xik.b(message.arg1);
            if (xikVarB == null) {
                throw new java.lang.IllegalArgumentException("AudioFocusStateType in msg is invalid.");
            }
            irfVar.i(xikVarB, message.arg2 == 1, ((java.lang.Boolean) message.obj).booleanValue());
            return;
        }
        if (i == 1) {
            irfVar.m(-1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (irfVar.f.a()) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.irf.a.f()).ai((char) 1153)).u("Still in call. Retry audio capture reset.");
                defpackage.ird irdVar = irfVar.m;
                irdVar.getClass();
                irdVar.g();
                return;
            }
            if (irfVar.d.bs()) {
                java.lang.Object objFF = irfVar.c.fF();
                for (int i2 = 0; i2 < 3; i2++) {
                    defpackage.iqj iqjVar = ((defpackage.irk) objFF).v[i2];
                    if (iqjVar != null && iqjVar.e != null && iqjVar.b) {
                        ((defpackage.yqj) ((defpackage.yqj) iqjVar.a.f()).ai((char) 1092)).u("Resetting system capture");
                        iqjVar.g();
                        iqjVar.e();
                    }
                }
                return;
            }
            return;
        }
        int i3 = message.arg1;
        int i4 = message.arg2;
        defpackage.xij xijVarB = defpackage.xij.b(i3);
        if (xijVarB == null) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(i3, "requestTypeFromMessage has invalid value: "));
        }
        if (irfVar.f.b()) {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.irf.a.f()).ai(1171);
            java.lang.String strB = defpackage.tna.B(xijVarB);
            defpackage.zke zkeVar = defpackage.zke.a;
            yqjVar.M("Car focus response time-out for focus request: %s, attempt#: %s. In phone call so not treating as error.", new defpackage.zkf(zkeVar, strB), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(i4)));
            irfVar.j = null;
            return;
        }
        defpackage.yqm yqmVar = defpackage.irf.a;
        defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(1169);
        java.lang.String strB2 = defpackage.tna.B(xijVarB);
        defpackage.zke zkeVar2 = defpackage.zke.a;
        yqjVar2.M("Car focus response time-out for focus request: %s, attempt#: %s", new defpackage.zkf(zkeVar2, strB2), new defpackage.zkf(zkeVar2, java.lang.Integer.valueOf(i4)));
        int i5 = xijVarB == defpackage.xij.AUDIO_FOCUS_GAIN ? 10 : 1;
        defpackage.ish ishVarA = defpackage.isi.a();
        ishVarA.a = xijVarB;
        ishVarA.d(true);
        ishVarA.b(i4);
        ishVarA.c(i5);
        irfVar.v++;
        irfVar.w = android.os.SystemClock.elapsedRealtime();
        if (i4 < i5) {
            irfVar.g.a(ishVarA.a());
            irfVar.l(xijVarB, i4 + 1);
            return;
        }
        if (irfVar.k.getAndSet(false)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1170)).u("Reset pending recovery from transient loss due to GAIN request timeout");
            ishVarA.d = 5;
        }
        irfVar.g.a(ishVarA.a());
        irfVar.h = defpackage.xik.AUDIO_FOCUS_STATE_LOSS;
        irfVar.j = null;
        synchronized (irfVar.n) {
            irfVar.x = 0;
        }
        irfVar.i(defpackage.xik.AUDIO_FOCUS_STATE_LOSS, true, true);
    }
}
