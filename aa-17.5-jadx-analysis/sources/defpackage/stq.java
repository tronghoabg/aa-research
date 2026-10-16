package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class stq implements smy, sty {
    final /* synthetic */ str a;
    private final stp b;
    private smr c;
    private boolean d = true;

    public stq(str strVar, smr smrVar, stp stpVar) {
        this.a = strVar;
        this.c = smrVar;
        this.b = stpVar;
    }

    @Override // defpackage.smy
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) throws RemoteException {
        smp smpVar;
        boolean z;
        sua suaVar = (sua) obj;
        synchronized (this) {
            smpVar = this.c.a;
            z = this.d;
            this.c.a();
        }
        if (smpVar == null) {
            ((nok) obj2).e(false);
        } else {
            this.b.a(suaVar, smpVar, z, (nok) obj2);
        }
    }

    @Override // defpackage.sty
    public final synchronized smr b() {
        return this.c;
    }

    @Override // defpackage.sty
    public final void c() {
        smp smpVar;
        synchronized (this) {
            this.d = false;
            smpVar = this.c.a;
        }
        if (smpVar != null) {
            this.a.v(smpVar, 2441);
        }
    }

    @Override // defpackage.sty
    public final synchronized void d(smr smrVar) {
        smr smrVar2 = this.c;
        if (smrVar2 != smrVar) {
            smrVar2.a();
            this.c = smrVar;
        }
    }
}
