package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class snd implements defpackage.sof {
    public final defpackage.slr a;
    public final defpackage.smo b;
    public final /* synthetic */ defpackage.snf e;
    public spc f = null;
    public java.util.Set c = null;
    public boolean d = false;

    public snd(defpackage.snf snfVar, defpackage.slr slrVar, defpackage.smo smoVar) {
        this.e = snfVar;
        this.a = slrVar;
        this.b = smoVar;
    }

    @Override // defpackage.sof
    public final void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.e.q.post(new defpackage.kfq(this, connectionResult, 13));
    }

    public final void b(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.snb snbVar = (defpackage.snb) this.e.k.get(this.b);
        if (snbVar != null) {
            snbVar.l(connectionResult);
        }
    }

    public final void c() {
        spc spcVar;
        if (!this.d || (spcVar = this.f) == null) {
            return;
        }
        this.a.s(spcVar, this.c);
    }
}
