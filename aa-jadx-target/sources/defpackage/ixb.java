package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixb implements android.os.IBinder.DeathRecipient {
    public final android.content.Context a;
    public final qwa b;
    public final int c;
    public final java.util.List d = new java.util.ArrayList();
    public int e = 0;
    public final ajnd f;

    public ixb(android.content.Context context, qwa qwaVar, ajnd ajndVar, int i) {
        this.a = context;
        this.b = qwaVar;
        this.f = ajndVar;
        this.c = i;
    }

    public final void a() {
        this.b.asBinder().unlinkToDeath(this, 0);
        java.util.List<defpackage.ixe> list = this.d;
        synchronized (list) {
            for (defpackage.ixe ixeVar : list) {
                java.lang.String str = ixeVar.b;
                ixeVar.j();
                ixeVar.b();
            }
            list.clear();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a();
        this.f.I(this);
    }
}
