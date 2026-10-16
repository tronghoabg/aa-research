package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkm {
    public volatile long b;
    public java.util.ArrayDeque i;
    final /* synthetic */ defpackage.jko k;
    public volatile defpackage.jkm a = null;
    public volatile long c = 0;
    public volatile long d = 0;
    public volatile long e = 0;
    public volatile long f = 0;
    public volatile long g = 0;
    public volatile long h = 0;
    public boolean j = false;

    public jkm(defpackage.jko jkoVar) {
        this.k = jkoVar;
    }

    public final void a() {
        b();
        if (this.g != 0) {
            defpackage.jko jkoVar = this.k;
            com.google.android.gms.car.FrameDebugInfo frameDebugInfo = new com.google.android.gms.car.FrameDebugInfo(this.b, this.g, this.d, this.e, this.f);
            defpackage.inc incVar = ((defpackage.inh) jkoVar.b).ar.b;
            if (incVar != null) {
                try {
                    java.lang.Object obj = incVar.a;
                    android.os.Parcel parcelFp = ((defpackage.ijv) obj).fp();
                    defpackage.ijx.g(parcelFp, frameDebugInfo);
                    ((defpackage.ijv) obj).fs(1, parcelFp);
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.inh.a.h()).p(e)).ai((char) 531)).u("Client disconnected before frame callback");
                }
            }
            this.g = 0L;
        }
    }

    public final synchronized void b() {
        this.j = true;
        java.util.ArrayDeque<defpackage.xpq> arrayDeque = this.i;
        if (arrayDeque != null) {
            for (defpackage.xpq xpqVar : arrayDeque) {
                ((defpackage.yqj) defpackage.jko.a.l().ai((char) 2248)).u("sendUpdateUiConfigReply");
                this.k.c.I(xpqVar);
            }
            this.i = null;
        }
    }

    public final synchronized boolean c(defpackage.xpq xpqVar) {
        if (this.j) {
            return false;
        }
        java.util.ArrayDeque arrayDeque = this.i;
        if (arrayDeque == null) {
            arrayDeque = new java.util.ArrayDeque();
            this.i = arrayDeque;
        }
        arrayDeque.add(xpqVar);
        return true;
    }
}
