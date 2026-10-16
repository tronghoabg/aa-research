package defpackage;

/* loaded from: classes2.dex */
final class joq implements Runnable {
    final /* synthetic */ zhc a;
    final /* synthetic */ rws b;
    final /* synthetic */ jou c;

    public joq(jou jouVar, zhc zhcVar, rws rwsVar) {
        this.a = zhcVar;
        this.b = rwsVar;
        this.c = jouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jou jouVar = this.c;
        if (jouVar.j()) {
            jouVar.e.post(new jop(jouVar.d(), this.a, this.b));
        } else {
            ((ype) ((ype) jou.a.h()).ai((char) 2517)).u("Unable to getSensorServiceProxy because there is no active session.");
            this.a.p(new IllegalStateException("Blow up if called in the wrong state. Called before Handoff."));
        }
    }
}
