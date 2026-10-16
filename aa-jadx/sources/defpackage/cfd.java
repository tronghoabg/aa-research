package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cfd implements defpackage.cfc {
    private final defpackage.ccu a = new defpackage.ccu();

    @Override // defpackage.cfc
    public /* synthetic */ defpackage.cfe g(defpackage.cfe cfeVar, defpackage.cfe cfeVar2, defpackage.cfe cfeVar3) {
        return null;
    }

    public final void i(int i) {
        defpackage.ccu ccuVar;
        int i2;
        do {
            ccuVar = this.a;
            i2 = ccuVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!ccuVar.compareAndSet(i2, i2 | i));
    }

    public final boolean j(int i) {
        return (this.a.get() & i) != 0;
    }
}
