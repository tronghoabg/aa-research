package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ikq implements android.os.IBinder.DeathRecipient {
    public final defpackage.qyo a;
    public final int b;
    final /* synthetic */ defpackage.ikr c;

    public ikq(defpackage.ikr ikrVar, int i, defpackage.qyo qyoVar) {
        this.c = ikrVar;
        this.a = qyoVar;
        this.b = i;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        defpackage.ikr ikrVar = this.c;
        synchronized (ikrVar.b) {
            ikrVar.f(this);
        }
    }
}
