package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class qgc extends ovp {
    private static final yph a = yph.c("ADU.ImeController");
    private ovn b;

    public final void a() {
        if (c()) {
            b();
        }
        try {
            this.b.e();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7105)).u("Error starting IME");
        }
    }

    public final void b() {
        try {
            this.b.f();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7106)).u("Error stopping IME");
        }
    }

    public final boolean c() {
        try {
            return this.b.g();
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 7103)).u("Error querying IME visibility");
            return false;
        }
    }

    @Override // defpackage.ovq
    public final void e(ovn ovnVar) {
        ((ype) a.l().ai((char) 7104)).y("setImeCallback %s", ovnVar);
        this.b = ovnVar;
    }
}
