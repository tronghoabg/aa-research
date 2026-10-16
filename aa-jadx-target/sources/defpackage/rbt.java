package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rbt implements android.os.IBinder.DeathRecipient {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rbt(com.google.android.apps.auto.components.lifetime.service.GhLifetimeService ghLifetimeService, defpackage.rqh rqhVar, int i) {
        this.c = i;
        this.b = ghLifetimeService;
        this.a = rqhVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.c;
        if (i == 0) {
            defpackage.rbz.h(new defpackage.qnf(this.a, this.b, 9, (short[]) null));
            return;
        }
        java.lang.Object obj = this.b;
        int i2 = 1;
        if (i != 1) {
            defpackage.rbz.h(new defpackage.rft(this.a, obj, i2));
        } else {
            ((com.google.android.apps.auto.components.lifetime.service.GhLifetimeService) obj).b.remove(this.a);
        }
    }

    public /* synthetic */ rbt(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
