package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iwk extends defpackage.qxp implements defpackage.jbb, defpackage.jbv {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.INST");
    public final java.lang.Object b = new java.lang.Object();
    public volatile boolean c;
    public defpackage.iko d;
    private final defpackage.jez e;
    private defpackage.jbd f;

    public iwk(defpackage.jez jezVar) {
        this.e = jezVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qxt] */
    private final void j(qxt qxtVar) throws java.lang.IllegalStateException {
        this.e.b();
        if (!this.c) {
            throw new java.lang.IllegalStateException("CarNotConnected");
        }
        if (this.f == null) {
            throw new java.lang.IllegalStateException("MediaBrowserEndpoint not set.");
        }
        if (qxtVar == null) {
            throw new java.lang.IllegalArgumentException("CarMediaPlaybackStatusEventListener is null");
        }
        synchronized (this.b) {
            defpackage.iko ikoVar = this.d;
            if (ikoVar != null && ikoVar.a.asBinder() != qxtVar.asBinder()) {
                throw new java.lang.IllegalArgumentException("Media playback service already in use.");
            }
        }
    }

    @Override // defpackage.jbv
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 256) == 0) {
            return null;
        }
        this.c = true;
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jbc(this, jbuVar);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.tna.aR();
    }

    @Override // defpackage.qxq
    public final void f(qxt qxtVar, java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, java.lang.String str4, int i, int i2) throws android.os.RemoteException {
        j(qxtVar);
        defpackage.rbz.d(bArr);
        this.f.h(str, str2, str3, bArr, str4, i, i2);
    }

    @Override // defpackage.qxq
    public final void g(qxt qxtVar, int i, java.lang.String str, int i2, boolean z, boolean z2, boolean z3) throws android.os.RemoteException {
        j(qxtVar);
        this.f.i(defpackage.a.aq(i), str, i2, z, z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, qxt] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, qxt] */
    @Override // defpackage.qxq
    public final boolean h(qxt qxtVar) {
        synchronized (this.b) {
            if (this.d != null) {
                ((defpackage.yqj) a.l().ai(1448)).u("Unregistering existing listener.");
                defpackage.iko ikoVar = this.d;
                ikoVar.getClass();
                i(ikoVar.a);
            }
            try {
                defpackage.iko ikoVar2 = new defpackage.iko(this, qxtVar, 4);
                this.d = ikoVar2;
                android.os.IBinder iBinderAsBinder = ikoVar2.a.asBinder();
                defpackage.iko ikoVar3 = this.d;
                ikoVar3.getClass();
                iBinderAsBinder.linkToDeath(ikoVar3, 0);
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai(1447)).u("Adding listener failed.");
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qxt] */
    @Override // defpackage.qxq
    public final boolean i(qxt qxtVar) {
        j(qxtVar);
        synchronized (this.b) {
            defpackage.iko ikoVar = this.d;
            if (ikoVar == null) {
                return false;
            }
            android.os.IBinder iBinderAsBinder = ikoVar.a.asBinder();
            defpackage.iko ikoVar2 = this.d;
            ikoVar2.getClass();
            iBinderAsBinder.unlinkToDeath(ikoVar2, 0);
            this.d = null;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        this.f = (defpackage.jbd) jbqVar;
    }
}
