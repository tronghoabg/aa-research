package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bxb implements defpackage.buv {
    private final defpackage.afer a;
    private final defpackage.ccu b = new defpackage.ccu();

    public bxb(defpackage.afer aferVar) {
        this.a = aferVar;
    }

    @Override // defpackage.buv
    public final void a() {
        if (this.b.compareAndSet(1, 1)) {
            return;
        }
        this.a.invoke();
    }
}
