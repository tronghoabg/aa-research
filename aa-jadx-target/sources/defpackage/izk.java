package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class izk implements defpackage.izv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public final int b;
    public final defpackage.izg c;
    public final defpackage.ize d;
    public final int e;
    public final defpackage.jei f;
    public final defpackage.izs g;
    public final android.os.Handler m;
    public final java.util.concurrent.atomic.AtomicInteger h = new java.util.concurrent.atomic.AtomicInteger(4);
    public final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicLong k = new java.util.concurrent.atomic.AtomicLong(0);
    public final java.lang.Object l = new java.lang.Object();
    public final defpackage.izi j = new defpackage.izi(this);

    public izk(int i, int i2, defpackage.jei jeiVar, defpackage.izs izsVar, defpackage.izg izgVar, defpackage.ize izeVar, android.os.Handler handler) {
        this.b = i;
        this.e = i2;
        this.f = jeiVar;
        this.d = izeVar;
        this.g = izsVar;
        this.c = izgVar;
        this.m = handler;
    }

    @Override // defpackage.izv
    public final int a() {
        throw null;
    }

    public final void b() {
        if (this.h.compareAndSet(0, 1)) {
            defpackage.izs izsVar = this.g;
            int i = this.b;
            int i2 = this.e;
            defpackage.abor aborVarN = defpackage.xjr.a.n();
            int iQ = defpackage.ebm.q(java.lang.Integer.valueOf(i2));
            aborVarN.t();
            defpackage.xjr xjrVar = (defpackage.xjr) aborVarN.b;
            xjrVar.b |= 1;
            xjrVar.c = iQ;
            int iQ2 = defpackage.ebm.q(java.lang.Integer.valueOf(i));
            aborVarN.t();
            defpackage.xjr xjrVar2 = (defpackage.xjr) aborVarN.b;
            xjrVar2.b |= 2;
            xjrVar2.d = iQ2;
            defpackage.xjr xjrVar3 = (defpackage.xjr) aborVarN.q();
            defpackage.jcu jcuVar = new defpackage.jcu(java.nio.ByteBuffer.allocate(xjrVar3.e(null) + 2), null, false);
            jcuVar.v((short) 7);
            jcuVar.s(xjrVar3.h());
            izsVar.g(i, jcuVar, false, true, new defpackage.izu(true, false, 0));
        }
    }

    public final void c() {
        a.l().ai(1669).w("Force closing channel %d", this.b);
        if (this.h.getAndSet(4) == 2) {
            this.d.P(1);
        }
    }

    @Override // defpackage.izv
    public final void d(defpackage.jcu jcuVar, defpackage.izu izuVar) {
        if (this.h.get() != 2) {
            throw new java.lang.IllegalStateException("Channel must be open before sending a message.");
        }
        defpackage.izs izsVar = this.g;
        int i = this.b;
        if (izsVar.f.get()) {
            jcuVar.close();
        } else {
            izsVar.g(i, jcuVar, true, false, izuVar);
        }
    }
}
