package defpackage;

/* loaded from: classes3.dex */
final class txm implements Runnable {
    protected final ufj a;
    protected final ufj b;
    final /* synthetic */ txn c;

    public txm(txn txnVar, ufj ufjVar, ufj ufjVar2) {
        this.c = txnVar;
        this.a = ufjVar;
        this.b = ufjVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.n(this.a, this.b, true);
    }
}
