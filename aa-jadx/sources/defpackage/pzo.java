package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pzo {
    public volatile defpackage.zif a = new defpackage.zif();

    public pzo() {
        this.a.o(java.lang.Boolean.TRUE);
    }

    public final synchronized void a() {
        if (this.a.isDone()) {
            return;
        }
        this.a.o(java.lang.Boolean.TRUE);
    }
}
