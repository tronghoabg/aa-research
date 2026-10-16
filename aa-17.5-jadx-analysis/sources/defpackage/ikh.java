package defpackage;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class ikh implements IBinder.DeathRecipient {
    public final qxs a;
    public final int b;
    final /* synthetic */ iki c;

    public ikh(iki ikiVar, int i, qxs qxsVar) {
        this.c = ikiVar;
        this.a = qxsVar;
        this.b = i;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        iki ikiVar = this.c;
        synchronized (ikiVar.b) {
            ikiVar.f(this);
        }
    }
}
