package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class das implements defpackage.bwq {
    public final android.view.Choreographer a;
    private final defpackage.dap c;

    public das(android.view.Choreographer choreographer, defpackage.dap dapVar) {
        this.a = choreographer;
        this.c = dapVar;
    }

    @Override // defpackage.bwq
    public final java.lang.Object a(defpackage.affc affcVar, defpackage.afdk afdkVar) {
        aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
        aiugVar.z();
        defpackage.dar darVar = new defpackage.dar(aiugVar, affcVar);
        defpackage.dap dapVar = this.c;
        android.view.Choreographer choreographer = dapVar.c;
        android.view.Choreographer choreographer2 = this.a;
        if (defpackage.afga.f(choreographer, choreographer2)) {
            synchronized (dapVar.e) {
                dapVar.f.add(darVar);
                if (!dapVar.h) {
                    dapVar.h = true;
                    choreographer.postFrameCallback(dapVar.i);
                }
            }
            aiugVar.d(new defpackage.bet(dapVar, darVar, 4));
        } else {
            choreographer2.postFrameCallback(darVar);
            aiugVar.d(new defpackage.daq(this, darVar, 0));
        }
        return aiugVar.k();
    }

    @Override // defpackage.afdo
    public final <R> R fold(R r, defpackage.affg<? super R, ? super defpackage.afdm, ? extends R> affgVar) {
        return affgVar.invoke(r, this);
    }

    @Override // defpackage.afdm, defpackage.afdo
    public final <E extends defpackage.afdm> E get(defpackage.afdn<E> afdnVar) {
        return (E) defpackage.afga.t(this, afdnVar);
    }

    @Override // defpackage.afdm
    public final /* synthetic */ defpackage.afdn getKey() {
        return defpackage.bwq.b;
    }

    @Override // defpackage.afdo
    public final defpackage.afdo minusKey(defpackage.afdn<?> afdnVar) {
        return defpackage.afga.u(this, afdnVar);
    }

    @Override // defpackage.afdo
    public final defpackage.afdo plus(defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return defpackage.afga.w(this, afdoVar);
    }
}
