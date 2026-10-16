package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
abstract class rng implements smq {
    private final String a;

    public rng(String str) {
        this.a = str;
    }

    public abstract void a(qwa qwaVar) throws RemoteException;

    @Override // defpackage.smq
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            a((qwa) obj);
        } catch (RemoteException e) {
            rrd.d(5, "CAR.TEL.CLIENT", e, "Remote Exception during %s", this.a);
        }
    }

    @Override // defpackage.smq
    public final void c() {
        rrd.d(5, "CAR.TEL.CLIENT", new Exception(), "Notify failed", new Object[0]);
    }
}
