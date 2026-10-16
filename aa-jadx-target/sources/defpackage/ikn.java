package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikn extends defpackage.rij implements defpackage.jbv, defpackage.iza {
    public static final defpackage.yqm a = defpackage.yqm.c("CarLocalMediaService");
    private static final j$.time.Duration g = j$.time.Duration.ofSeconds(-1);
    public volatile boolean c;
    private final defpackage.jez h;
    private izb i;
    public final java.lang.Object b = new java.lang.Object();
    public xjm d = null;
    public defpackage.xjk e = defpackage.xjk.a;
    public final java.util.Set f = new java.util.HashSet();

    public ikn(defpackage.jez jezVar) {
        this.h = jezVar;
    }

    public static final void i(rin rinVar, defpackage.xjk xjkVar) {
        try {
            int i = xjkVar.b;
            rinVar.e(new com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackMetadata((i & 1) != 0 ? xjkVar.c : null, (i & 2) != 0 ? xjkVar.d : null, (i & 4) != 0 ? xjkVar.e : null, xjkVar.f.D(), (xjkVar.b & 16) != 0 ? xjkVar.g : -1));
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.f()).p(e)).ai((char) 155)).u("Remote exception");
        }
    }

    public static final void j(rin rinVar, xjm xjmVar) {
        try {
            rig rigVar = new rig();
            int iAv = defpackage.a.av(xjmVar.d);
            if (iAv == 0) {
                iAv = 1;
            }
            rigVar.a = iAv;
            rigVar.b = xjmVar.e;
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(new defpackage.abph(xjmVar.g, xjm.a)).map(new defpackage.ikc(4));
            int i = defpackage.ygw.d;
            java.util.List list = (java.util.List) map.collect(defpackage.yds.a);
            defpackage.ygr ygrVar = rigVar.d;
            ygrVar.k(list);
            if ((xjmVar.c & 4) != 0) {
                rigVar.a(j$.time.Duration.ofSeconds(xjmVar.f));
            } else {
                rigVar.a(g);
            }
            rinVar.f(new com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackStatus(rigVar.a, rigVar.b, rigVar.c, ygrVar.g()));
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.f()).p(e)).ai((char) 156)).u("Remote exception");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, rin] */
    public static final void l(defpackage.iko ikoVar) {
        try {
            ikoVar.a.asBinder().unlinkToDeath(ikoVar, 0);
        } catch (java.util.NoSuchElementException unused) {
        }
    }

    @Override // defpackage.jbv
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 32768) != 0) {
            return this;
        }
        return null;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new izb(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.rik
    public final void f(rin rinVar) {
        synchronized (this.b) {
            if (k(rinVar) != null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(154)).u("Callback already registered.");
                return;
            }
            defpackage.iko ikoVar = new defpackage.iko(this, rinVar, 1);
            try {
                rinVar.asBinder().linkToDeath(ikoVar, 0);
                this.f.add(ikoVar);
                xjm xjmVar = this.d;
                if (xjmVar != null) {
                    j(rinVar, xjmVar);
                    i(rinVar, this.e);
                }
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai(153)).u("Failed to register callback");
            }
        }
    }

    @Override // defpackage.rik
    public final void g(com.google.android.gms.car.carlocalmedia.CarLocalMediaPlaybackRequest carLocalMediaPlaybackRequest) {
        this.h.b();
        if (!this.c) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
        izb izbVar = this.i;
        izbVar.getClass();
        xjj xjjVarB = xjj.b(carLocalMediaPlaybackRequest.a);
        if (xjjVarB == null) {
            throw new java.lang.IllegalArgumentException("Invalid Action");
        }
        defpackage.abor aborVarN = xjl.a.n();
        aborVarN.t();
        xjl xjlVar = aborVarN.b;
        xjlVar.c = xjjVarB.f;
        xjlVar.b |= 1;
        xjl xjlVarQ = aborVarN.q();
        izb.a.f().ai(1666).y("Sending CarLocalMediaPlaybackRequest: %s", xjlVarQ);
        izbVar.k(32771, xjlVarQ);
    }

    @Override // defpackage.rik
    public final void h(rin rinVar) {
        synchronized (this.b) {
            defpackage.iko ikoVarK = k(rinVar);
            if (ikoVarK == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(157)).u("Callback not registered.");
            } else {
                l(ikoVarK);
                this.f.remove(ikoVarK);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rin] */
    final defpackage.iko k(rin rinVar) {
        synchronized (this.b) {
            for (defpackage.iko ikoVar : this.f) {
                if (ikoVar.a.asBinder().equals(rinVar.asBinder())) {
                    return ikoVar;
                }
            }
            return null;
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
        this.i = (izb) jbqVar;
        this.c = true;
    }
}
