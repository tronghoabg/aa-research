package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sad implements android.os.IBinder.DeathRecipient {
    public final android.os.IBinder a;
    final /* synthetic */ java.lang.Object b;
    public final java.lang.Object c;
    private final /* synthetic */ int d;

    public sad(java.lang.Object obj, android.os.IBinder iBinder, java.lang.Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = iBinder;
        this.c = obj2;
    }

    public final java.util.concurrent.CopyOnWriteArrayList a() {
        int i = this.d;
        java.lang.Object obj = this.b;
        return i != 0 ? ((defpackage.jfu) obj).a : ((defpackage.sae) obj).b;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.d;
        java.lang.Object obj = this.b;
        if (i != 0) {
            ((defpackage.jfu) obj).a.remove(this);
        } else {
            ((defpackage.sae) obj).b.remove(this);
        }
    }
}
