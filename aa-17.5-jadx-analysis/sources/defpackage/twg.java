package defpackage;

/* loaded from: classes3.dex */
public final class twg extends txk implements tpx {
    public final typ a;
    boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twg(typ typVar, tyh tyhVar, abdr abdrVar, int i) {
        super(tyhVar, ukh.m(abdrVar, new ukg(false)), i);
        yob yobVar = ukh.c;
        this.b = false;
        this.a = typVar;
    }

    @Override // defpackage.txk, defpackage.tqo
    public final int a() {
        synchronized (this) {
            if (this.b) {
                return -1;
            }
            return this.e;
        }
    }

    @Override // defpackage.txk
    public final ukf d() {
        synchronized (this) {
            if (!this.b) {
                return super.d();
            }
            return ukf.a;
        }
    }

    @Override // defpackage.txk
    public final void e() {
        synchronized (this) {
            this.b = true;
        }
    }
}
