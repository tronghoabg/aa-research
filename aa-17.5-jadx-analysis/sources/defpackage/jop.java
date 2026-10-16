package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class jop implements Runnable {
    final /* synthetic */ jnh a;
    final /* synthetic */ zhc b;
    final /* synthetic */ rws c;

    public jop(jnh jnhVar, zhc zhcVar, rws rwsVar) {
        this.a = jnhVar;
        this.b = zhcVar;
        this.c = rwsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jnh jnhVar = this.a;
        joi joiVar = (joi) jnhVar;
        if (joiVar.v) {
            ((ype) ((ype) jou.a.h()).ai(2516)).x("Unable to getSensorServiceProxy for session %d because it has been torn down.", joiVar.c);
            this.b.p(new IllegalStateException("Blow up if called in the wrong state. Called before Handoff."));
            return;
        }
        zhc zhcVar = this.b;
        rws rwsVar = this.c;
        joiVar.c();
        joiVar.e();
        try {
            zhcVar.o(((joi) jnhVar).y.b(((joi) jnhVar).l, rwsVar));
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) joi.a.g()).p(e)).ai((char) 2472)).u("Protocol manager getting exception");
            zhcVar.p(e);
        }
    }
}
