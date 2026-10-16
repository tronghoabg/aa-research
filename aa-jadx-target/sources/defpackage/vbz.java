package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vbz extends defpackage.adkb {
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.vwp b;
    public boolean c;
    public int d;
    public int e;

    public vbz(defpackage.vwp vwpVar) {
        this.b = vwpVar;
    }

    @Override // defpackage.adkb
    public final void c() {
        synchronized (this.a) {
            if (!this.c) {
                defpackage.vwp vwpVar = this.b;
                vwpVar.b = android.os.SystemClock.elapsedRealtime() - vwpVar.a;
            }
        }
    }

    @Override // defpackage.adrq
    public final void d(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.adrq
    public final void e(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.adkb
    public final void f(defpackage.adjs adjsVar) {
        synchronized (this.a) {
            defpackage.vwp vwpVar = this.b;
            java.net.SocketAddress socketAddress = (java.net.SocketAddress) adjsVar.a(defpackage.adle.a);
            if (!(socketAddress instanceof java.net.InetSocketAddress)) {
                if (socketAddress instanceof adsf) {
                    vwpVar.t = 2;
                } else if (socketAddress instanceof defpackage.adpe) {
                    vwpVar.t = 3;
                }
            }
        }
    }
}
