package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
final class qrk extends rht {
    private qrl a;
    private final Object b = new Object();

    public qrk(qrl qrlVar) {
        this.a = qrlVar;
    }

    @Override // defpackage.rht
    public final void a(Intent intent) {
        synchronized (this.b) {
            ypf ypfVar = qrm.a;
            this.a.a(intent);
        }
    }

    final void b(qrl qrlVar) {
        synchronized (this.b) {
            this.a = qrlVar;
        }
    }
}
