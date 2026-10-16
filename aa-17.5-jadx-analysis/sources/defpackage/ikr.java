package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class ikr extends rwr {
    final /* synthetic */ iks a;

    public ikr(iks iksVar) {
        this.a = iksVar;
    }

    @Override // defpackage.rws
    public final void a(int i, byte[] bArr) {
        this.a.e.j(xny.b(i), jbw.i(xny.b(i), bArr));
    }

    @Override // defpackage.rws
    public final void b() {
        iks iksVar = this.a;
        iksVar.e.k();
        synchronized (iksVar) {
            if (iksVar.b != null) {
                try {
                    iksVar.b.g(this);
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) ikt.a.h()).p(e)).ai(198)).u("Removing proxyCallback failed");
                }
            }
        }
    }

    @Override // defpackage.rws
    public final void c() {
        iks iksVar = this.a;
        synchronized (iksVar) {
            iksVar.d = true;
        }
    }
}
