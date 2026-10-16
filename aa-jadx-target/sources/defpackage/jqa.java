package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jqa extends defpackage.qxb {
    public final defpackage.jqb a;
    private final android.os.Handler b;

    public jqa(defpackage.jqb jqbVar, android.os.Handler handler) {
        this.a = jqbVar;
        this.b = handler;
    }

    @Override // defpackage.qxc
    public final void a(int i) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.f()).ai((char) 2579)).y("onCarConnectionFailure(...) received with carConnectionError: %s", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(i)));
        this.b.post(new defpackage.hif(this, i, 8));
    }

    @Override // defpackage.qxc
    public final void b(int i) {
        defpackage.yqm yqmVar = defpackage.jqb.a;
        defpackage.ypu ypuVarF = yqmVar.f();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        defpackage.zke zkeVar = defpackage.zke.a;
        ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 2580)).y("onConnected(...) received with connectionType: %s", new defpackage.zkf(zkeVar, numValueOf));
        java.util.concurrent.atomic.AtomicMarkableReference atomicMarkableReference = this.a.i;
        if (atomicMarkableReference.compareAndSet(numValueOf, numValueOf, false, true)) {
            this.b.post(new defpackage.hif(this, i, 7));
        } else {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(2583)).M("onCarConnectionReadyForClients connection type mismatch. expected %s but was %s.", new defpackage.zkf(zkeVar, numValueOf), new defpackage.zkf(zkeVar, atomicMarkableReference.getReference()));
        }
    }

    @Override // defpackage.qxc
    public final void c() {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.jqb.a.f()).ai((char) 2581)).u("onDisconnected() received");
    }
}
