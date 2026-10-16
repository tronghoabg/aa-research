package defpackage;

/* loaded from: classes.dex */
public abstract class cew implements cev {
    private final cco a = new cco();

    @Override // defpackage.cev
    public /* synthetic */ cex g(cex cexVar, cex cexVar2, cex cexVar3) {
        return null;
    }

    public final void i(int i) {
        cco ccoVar;
        int i2;
        do {
            ccoVar = this.a;
            i2 = ccoVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!ccoVar.compareAndSet(i2, i2 | i));
    }

    public final boolean j(int i) {
        return (this.a.get() & i) != 0;
    }
}
