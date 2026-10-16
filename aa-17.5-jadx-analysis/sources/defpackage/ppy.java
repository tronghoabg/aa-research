package defpackage;

import com.google.android.apps.gmm.systems.accounts.GmmAccount;
import j$.util.Objects;

/* loaded from: classes2.dex */
final class ppy implements pqd, vae {
    final /* synthetic */ pqe a;
    private final ackk b;

    public ppy(pqe pqeVar, ackk ackkVar) {
        this.a = pqeVar;
        this.b = ackkVar;
    }

    @Override // defpackage.vae
    public final void a(uzy uzyVar) {
        GmmAccount gmmAccount = (GmmAccount) uzyVar.c();
        pqe pqeVar = this.a;
        synchronized (pqeVar.m) {
            if (Objects.equals(pqeVar.p, gmmAccount)) {
                return;
            }
            pqeVar.p = gmmAccount;
            ((ynz) ((ynz) pqe.a.d()).ai(6806)).y("Updating account id to %s", pqeVar.p.getD());
            pqeVar.d(0L, pxy.ACCOUNT_CHANGE, null, null, null);
        }
    }

    @Override // defpackage.pqd
    public final void b() {
        ((pjq) this.b.a()).a().d(this, zfq.a);
    }

    @Override // defpackage.pqd
    public final void c() {
        ((pjq) this.b.a()).a().f(this);
    }
}
