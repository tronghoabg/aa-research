package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class iwc extends qwt implements jau, jbo {
    public static final yph a = yph.c("CAR.INST");
    public final Object b = new Object();
    public volatile boolean c;
    public ikf d;
    private final jer e;
    private jaw f;

    public iwc(jer jerVar) {
        this.e = jerVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qwx] */
    private final void j(qwx qwxVar) throws IllegalStateException {
        this.e.b();
        if (!this.c) {
            throw new IllegalStateException("CarNotConnected");
        }
        if (this.f == null) {
            throw new IllegalStateException("MediaBrowserEndpoint not set.");
        }
        if (qwxVar == null) {
            throw new IllegalArgumentException("CarMediaPlaybackStatusEventListener is null");
        }
        synchronized (this.b) {
            ikf ikfVar = this.d;
            if (ikfVar != null && ikfVar.a.asBinder() != qwxVar.asBinder()) {
                throw new IllegalArgumentException("Media playback service already in use.");
            }
        }
    }

    @Override // defpackage.jbo
    public final iyw a(xnz xnzVar) {
        if ((xnzVar.b & 256) == 0) {
            return null;
        }
        this.c = true;
        return this;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jav(this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return roc.aH();
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return roc.aH();
    }

    @Override // defpackage.qwu
    public final void f(qwx qwxVar, String str, String str2, String str3, byte[] bArr, String str4, int i, int i2) throws IllegalStateException, RemoteException {
        j(qwxVar);
        rbe.d(bArr);
        this.f.h(str, str2, str3, bArr, str4, i, i2);
    }

    @Override // defpackage.qwu
    public final void g(qwx qwxVar, int i, String str, int i2, boolean z, boolean z2, boolean z3) throws IllegalStateException, RemoteException {
        j(qwxVar);
        this.f.i(a.ar(i), str, i2, z, z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, qwx] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, qwx] */
    @Override // defpackage.qwu
    public final boolean h(qwx qwxVar) {
        synchronized (this.b) {
            if (this.d != null) {
                ((ype) a.l().ai(1448)).u("Unregistering existing listener.");
                ikf ikfVar = this.d;
                ikfVar.getClass();
                i(ikfVar.a);
            }
            try {
                ikf ikfVar2 = new ikf(this, qwxVar, 4);
                this.d = ikfVar2;
                IBinder iBinderAsBinder = ikfVar2.a.asBinder();
                ikf ikfVar3 = this.d;
                ikfVar3.getClass();
                iBinderAsBinder.linkToDeath(ikfVar3, 0);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai(1447)).u("Adding listener failed.");
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qwx] */
    @Override // defpackage.qwu
    public final boolean i(qwx qwxVar) throws IllegalStateException {
        j(qwxVar);
        synchronized (this.b) {
            ikf ikfVar = this.d;
            if (ikfVar == null) {
                return false;
            }
            IBinder iBinderAsBinder = ikfVar.a.asBinder();
            ikf ikfVar2 = this.d;
            ikfVar2.getClass();
            iBinderAsBinder.unlinkToDeath(ikfVar2, 0);
            this.d = null;
            return true;
        }
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.f = (jaw) jbjVar;
    }
}
