package defpackage;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class iwr implements IBinder.DeathRecipient {
    public final qxd a;
    public int b;
    public int c;
    final /* synthetic */ iws d;

    public iwr(iws iwsVar, qxd qxdVar) {
        this.d = iwsVar;
        this.a = qxdVar;
    }

    public final void a() {
        this.a.asBinder().unlinkToDeath(this, 0);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = iws.g;
        a();
        this.d.g(this);
    }
}
