package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ivv extends java.lang.Thread {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.VIDEO");
    public final java.lang.Object b;
    public final java.util.concurrent.LinkedBlockingDeque c;
    private final defpackage.ivu d;
    private boolean e;

    public ivv(defpackage.ivu ivuVar) {
        super("VideoFocusHandler");
        this.b = new java.lang.Object();
        this.c = new java.util.concurrent.LinkedBlockingDeque();
        this.e = false;
        this.d = ivuVar;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x01d2  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        defpackage.ivt ivtVar;
        android.os.Process.setThreadPriority(-4);
        while (true) {
            try {
                ivtVar = (defpackage.ivt) this.c.take();
            } catch (java.lang.InterruptedException unused) {
                ivtVar = defpackage.ivt.d;
            }
            java.util.concurrent.LinkedBlockingDeque linkedBlockingDeque = this.c;
            int i = 4;
            if (!linkedBlockingDeque.isEmpty()) {
                synchronized (this.b) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(linkedBlockingDeque.size());
                    linkedBlockingDeque.drainTo(arrayList);
                    if (!j$.util.Collection.-EL.stream(arrayList).anyMatch(new defpackage.hmj(i))) {
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                ivtVar.getClass();
                                break;
                            } else if (arrayList.get(size) == ivtVar) {
                                break;
                            } else {
                                linkedBlockingDeque.addFirst((defpackage.ivt) arrayList.get(size));
                            }
                        }
                    } else {
                        ivtVar = defpackage.ivt.d;
                    }
                }
            }
            int iOrdinal = ivtVar.ordinal();
            boolean z = false;
            if (iOrdinal != 0) {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        break;
                    }
                } else {
                    boolean z2 = ivtVar == defpackage.ivt.c;
                    if (!this.e) {
                        if (!z2) {
                            z2 = false;
                        }
                    }
                    this.d.x(true, z2);
                    this.e = false;
                }
            } else if (!this.e) {
                defpackage.ivu ivuVar = this.d;
                defpackage.yqm yqmVar = defpackage.ivn.a;
                ((defpackage.yqj) yqmVar.l().ai((char) 1391)).u("doHandleVideoFocusGained");
                defpackage.abor aborVarN = defpackage.xpi.a.n();
                defpackage.ivn ivnVar = (defpackage.ivn) ivuVar;
                int i2 = ivnVar.c.a;
                aborVarN.t();
                defpackage.xpi xpiVar = (defpackage.xpi) aborVarN.b;
                xpiVar.b |= 2;
                xpiVar.d = i2;
                if (ivnVar.A.E(6, 0)) {
                    defpackage.xll xllVarD = ivnVar.k.d();
                    aborVarN.t();
                    defpackage.xpi xpiVar2 = (defpackage.xpi) aborVarN.b;
                    xllVarD.getClass();
                    xpiVar2.f = xllVarD;
                    xpiVar2.b |= 8;
                }
                if (ivnVar.x) {
                    aborVarN.t();
                    defpackage.xpi xpiVar3 = (defpackage.xpi) aborVarN.b;
                    xpiVar3.e = 2;
                    xpiVar3.b |= 4;
                }
                defpackage.jeu jeuVar = ivnVar.f;
                jeuVar.getClass();
                jeuVar.F(aborVarN);
                ((defpackage.yqj) yqmVar.l().ai(1406)).y("%s buffer pools in video encoder", true != defpackage.a.N() ? "Not using" : "Using");
                iwq iwbVar = null;
                if (ivnVar.p.c.getBoolean("car_save_video", false)) {
                    android.content.Context applicationContext = ivnVar.r.getApplicationContext();
                    defpackage.yqm yqmVar2 = iwb.a;
                    try {
                        iwbVar = new iwb(applicationContext);
                    } catch (java.io.IOException e) {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) iwb.a.f()).p(e)).ai((char) 1429)).u("Error creating MediaSaver");
                    }
                }
                ivnVar.g = ivnVar.D.b(ivnVar.m, iwbVar);
                defpackage.aczp aczpVar = defpackage.aczp.a;
                float f = (float) aczpVar.fF().f();
                if (f > 0.0f && ((double) new java.util.Random().nextFloat()) * 100.0d < f) {
                    z = true;
                }
                try {
                    defpackage.iwy iwyVar = ((defpackage.ivn) ivuVar).g;
                    iwyVar.getClass();
                    iwyVar.r(((defpackage.ivn) ivuVar).c, (int) (iwyVar.x ? aczpVar.fF().k() : defpackage.aczp.m()));
                    defpackage.iwy iwyVar2 = ((defpackage.ivn) ivuVar).g;
                    iwyVar2.getClass();
                    if (iwyVar2.v(new defpackage.ivl((defpackage.ivn) ivuVar), z)) {
                        defpackage.ivm ivmVar = ivnVar.b;
                        defpackage.iwy iwyVar3 = ivnVar.g;
                        iwyVar3.getClass();
                        android.view.Surface surface = iwyVar3.w;
                        surface.getClass();
                        ivmVar.sendMessage(ivmVar.obtainMessage(1, surface));
                    } else if (ivnVar.q.i() != 0) {
                        ((defpackage.ivc) ivnVar.d).e.ax(defpackage.zaj.COMPOSITION, defpackage.zak.VIDEO_ENCODING_INIT_FAIL, "cannot start video encoding");
                    } else {
                        defpackage.ivm ivmVar2 = ivnVar.b;
                        defpackage.iwy iwyVar4 = ivnVar.g;
                        iwyVar4.getClass();
                        android.view.Surface surface2 = iwyVar4.w;
                        surface2.getClass();
                        ivmVar2.sendMessage(ivmVar2.obtainMessage(1, surface2));
                    }
                } catch (java.lang.RuntimeException e2) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.ivn.a.h()).p(e2)).ai((char) 1407)).u("Failed to start encoding");
                }
                this.e = true;
            }
        }
        synchronized (this.b) {
            this.c.clear();
        }
        if (this.e) {
            this.d.x(false, false);
            this.e = false;
        }
    }
}
