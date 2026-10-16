package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikr extends defpackage.qyk implements defpackage.jbn, defpackage.jbv {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.INST");
    public final defpackage.aba b = new defpackage.aba(0);
    public volatile boolean c;
    private final android.content.Context d;
    private final defpackage.rbz e;
    private final defpackage.jez f;
    private defpackage.jbo g;

    public ikr(android.content.Context context, defpackage.rbz rbzVar, defpackage.jez jezVar) {
        this.d = context;
        this.e = rbzVar;
        this.f = jezVar;
    }

    private static final void n(defpackage.qyo qyoVar) {
        if (qyoVar == null) {
            throw new java.lang.IllegalArgumentException("CarPhoneStatusEventListener is null");
        }
    }

    @Override // defpackage.jbv
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 512) == 0) {
            return null;
        }
        this.c = true;
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jbo(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    public final void f(defpackage.ikq ikqVar) {
        defpackage.qyo qyoVar = ikqVar.a;
        qyoVar.asBinder().unlinkToDeath(ikqVar, 0);
        this.b.remove(qyoVar.asBinder());
    }

    @Override // defpackage.qyl
    public final void g(com.google.android.gms.car.CarPhoneStatus carPhoneStatus) throws android.os.RemoteException {
        this.f.b();
        if (!this.c) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
        if (this.g == null) {
            throw new java.lang.IllegalStateException("PhoneStatusEndpoint not set.");
        }
        int i = 0;
        while (true) {
            com.google.android.gms.car.CarPhoneStatus.CarCall[] carCallArr = carPhoneStatus.a;
            if (i >= carCallArr.length) {
                break;
            }
            defpackage.rbz.d(carCallArr[i].f);
            i++;
        }
        defpackage.abor aborVarN = defpackage.xne.a.n();
        com.google.android.gms.car.CarPhoneStatus.CarCall[] carCallArr2 = carPhoneStatus.a;
        if (carCallArr2 != null) {
            for (com.google.android.gms.car.CarPhoneStatus.CarCall carCall : carCallArr2) {
                defpackage.xnd xndVarB = defpackage.xnd.b(carCall.a);
                defpackage.abor aborVarN2 = defpackage.xnc.a.n();
                defpackage.xnd xndVar = (defpackage.xnd) new defpackage.nub(xndVarB).i(defpackage.xnd.UNKNOWN);
                aborVarN2.t();
                defpackage.xnc xncVar = (defpackage.xnc) aborVarN2.b;
                xncVar.c = xndVar.h;
                xncVar.b |= 1;
                int i2 = carCall.b;
                aborVarN2.t();
                defpackage.xnc xncVar2 = (defpackage.xnc) aborVarN2.b;
                xncVar2.b |= 2;
                xncVar2.d = i2;
                java.lang.String str = carCall.c;
                if (str != null) {
                    aborVarN2.t();
                    defpackage.xnc xncVar3 = (defpackage.xnc) aborVarN2.b;
                    xncVar3.b |= 4;
                    xncVar3.e = str;
                }
                java.lang.String str2 = carCall.d;
                if (str2 != null) {
                    aborVarN2.t();
                    defpackage.xnc xncVar4 = (defpackage.xnc) aborVarN2.b;
                    xncVar4.b |= 8;
                    xncVar4.f = str2;
                }
                java.lang.String str3 = carCall.e;
                if (str3 != null) {
                    aborVarN2.t();
                    defpackage.xnc xncVar5 = (defpackage.xnc) aborVarN2.b;
                    xncVar5.b |= 16;
                    xncVar5.g = str3;
                }
                byte[] bArr = carCall.f;
                if (bArr != null) {
                    defpackage.abnv abnvVarV = defpackage.abnv.v(bArr);
                    aborVarN2.t();
                    defpackage.xnc xncVar6 = (defpackage.xnc) aborVarN2.b;
                    abnvVarV.getClass();
                    xncVar6.b |= 32;
                    xncVar6.h = abnvVarV;
                }
                aborVarN.t();
                defpackage.xne xneVar = (defpackage.xne) aborVarN.b;
                defpackage.xnc xncVar7 = (defpackage.xnc) aborVarN2.q();
                xncVar7.getClass();
                defpackage.abpj abpjVar = xneVar.c;
                if (!abpjVar.c()) {
                    xneVar.c = defpackage.abox.I(abpjVar);
                }
                xneVar.c.add(xncVar7);
            }
        }
        int i3 = carPhoneStatus.b;
        aborVarN.t();
        defpackage.xne xneVar2 = (defpackage.xne) aborVarN.b;
        xneVar2.b |= 1;
        xneVar2.d = i3;
        this.g.k(32769, (defpackage.xne) aborVarN.q());
    }

    @Override // defpackage.qyl
    public final void h(defpackage.qyo qyoVar, com.google.android.gms.car.CarPhoneStatus carPhoneStatus) throws android.os.RemoteException {
        n(qyoVar);
        g(carPhoneStatus);
    }

    @Override // defpackage.qyl
    public final boolean i() {
        return this.c;
    }

    @Override // defpackage.qyl
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean j(int i, defpackage.qyo qyoVar) {
        if (!this.e.l(this.d, getCallingUid())) {
            throw new java.lang.SecurityException("Wrong signature - go/gearhead-retail-device");
        }
        n(qyoVar);
        defpackage.aba abaVar = this.b;
        synchronized (abaVar) {
            if (!abaVar.containsKey(qyoVar.asBinder())) {
                defpackage.ikq ikqVar = new defpackage.ikq(this, i, qyoVar);
                try {
                    ikqVar.a.asBinder().linkToDeath(ikqVar, 0);
                    abaVar.put(qyoVar.asBinder(), ikqVar);
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai(174)).u("Adding listener failed");
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.qyl
    public final boolean k(defpackage.qyo qyoVar) {
        return j(0, qyoVar);
    }

    @Override // defpackage.qyl
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean l(defpackage.qyo qyoVar) {
        n(qyoVar);
        defpackage.aba abaVar = this.b;
        synchronized (abaVar) {
            defpackage.ikq ikqVar = (defpackage.ikq) abaVar.get(qyoVar.asBinder());
            if (ikqVar == null) {
                return false;
            }
            f(ikqVar);
            return true;
        }
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        this.g = (defpackage.jbo) jbqVar;
    }
}
