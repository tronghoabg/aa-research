package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iwz implements android.os.IBinder.DeathRecipient {
    public final qxz a;
    public int b;
    public int c;
    final /* synthetic */ defpackage.ixa d;

    public iwz(defpackage.ixa ixaVar, qxz qxzVar) {
        this.d = ixaVar;
        this.a = qxzVar;
    }

    public final void a() {
        this.a.asBinder().unlinkToDeath(this, 0);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = defpackage.ixa.g;
        a();
        this.d.g(this);
    }
}
