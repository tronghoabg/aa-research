package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jlf extends defpackage.rxh implements defpackage.jcc, defpackage.jbv {
    private final defpackage.jbu c;
    private defpackage.xoy e;
    private defpackage.jcd f;
    private boolean g;
    private final java.lang.Object d = new java.lang.Object();
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.Set b = new defpackage.zf(0);
    private int h = 13;
    private long i = 0;

    public jlf(defpackage.jbu jbuVar) {
        this.c = jbuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final defpackage.iko p(defpackage.rxl rxlVar) {
        synchronized (this.a) {
            defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.b);
            while (zeVar.hasNext()) {
                defpackage.iko ikoVar = (defpackage.iko) zeVar.next();
                if (ikoVar.a == rxlVar) {
                    return ikoVar;
                }
            }
            return null;
        }
    }

    @Override // defpackage.jbv
    public final defpackage.izd a(defpackage.xpa xpaVar) {
        if ((xpaVar.b & 2) == 0) {
            return null;
        }
        defpackage.xoy xoyVar = xpaVar.d;
        if (xoyVar == null) {
            xoyVar = defpackage.xoy.c;
        }
        this.e = xoyVar;
        return this;
    }

    @Override // defpackage.izd
    public final defpackage.jbq b(defpackage.jbu jbuVar) {
        return new defpackage.jcd(this.e, this, this.c);
    }

    @Override // defpackage.izd
    public final defpackage.jdc c() {
        return defpackage.jdc.b;
    }

    @Override // defpackage.izd
    public final defpackage.jdc d() {
        return defpackage.jdc.b;
    }

    @Override // defpackage.rxi
    public final void f(defpackage.rxl rxlVar) throws android.os.RemoteException {
        if (rxlVar == null) {
            return;
        }
        synchronized (this.a) {
            if (p(rxlVar) == null) {
                this.b.add(new defpackage.iko(this, rxlVar, 5));
            }
        }
    }

    @Override // defpackage.rxi
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean fu(int i, long j) {
        boolean zL;
        synchronized (this.d) {
            zL = l(i, j);
        }
        return zL;
    }

    @Override // defpackage.rxi
    public final void g(defpackage.rxl rxlVar) throws android.os.RemoteException {
        synchronized (this.a) {
            defpackage.iko ikoVarP = p(rxlVar);
            if (ikoVarP != null) {
                rxlVar.asBinder().unlinkToDeath(ikoVarP, 0);
                this.b.remove(ikoVarP);
            }
        }
    }

    @Override // defpackage.rxi
    public final boolean h() {
        defpackage.jcd jcdVar;
        synchronized (this.d) {
            jcdVar = this.f;
        }
        return jcdVar.a;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rxl] */
    @Override // defpackage.jcc
    public final void j(defpackage.xoz xozVar, defpackage.abpy abpyVar) {
        java.util.ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new java.util.ArrayList(this.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((defpackage.iko) arrayList.get(i)).a.a(xozVar.A, abpyVar.h());
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, rxl] */
    @Override // defpackage.jcc
    public final void k() {
        java.util.ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new java.util.ArrayList(this.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((defpackage.iko) arrayList.get(i)).a.b();
            } catch (android.os.RemoteException unused) {
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean l(int i, long j) {
        synchronized (this.d) {
            defpackage.jcd jcdVar = this.f;
            if (jcdVar != null) {
                return jcdVar.s(defpackage.xoz.b(i), j);
            }
            this.h = i;
            this.i = j;
            this.g = true;
            return true;
        }
    }

    @Override // defpackage.izd
    public final void m(java.io.PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.rxi
    public final byte[] n(int i) {
        defpackage.jcd jcdVar;
        synchronized (this.d) {
            jcdVar = this.f;
        }
        defpackage.abpy abpyVarH = jcdVar.h(i);
        if (abpyVarH != null) {
            return abpyVarH.h();
        }
        return null;
    }

    @Override // defpackage.rxi
    public final int[] o() {
        defpackage.jcd jcdVar;
        synchronized (this.d) {
            jcdVar = this.f;
        }
        return jcdVar.t();
    }

    @Override // defpackage.izd
    public final void q() {
        throw null;
    }

    @Override // defpackage.izd
    public final void r(defpackage.jbq jbqVar) {
        synchronized (this.d) {
            this.f = (defpackage.jcd) jbqVar;
            if (this.g) {
                l(this.h, this.i);
                this.g = false;
            }
        }
    }
}
