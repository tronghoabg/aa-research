package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bus implements defpackage.bwq {
    public final defpackage.ccw a = new defpackage.ccw();
    private final defpackage.afer c;

    public bus(defpackage.afer aferVar) {
        this.c = aferVar;
    }

    @Override // defpackage.bwq
    public final java.lang.Object a(defpackage.affc affcVar, defpackage.afdk afdkVar) {
        aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
        aiugVar.z();
        aiugVar.d(new defpackage.adv(this.a.a(new defpackage.bur(affcVar, aiugVar), this.c), 3));
        return aiugVar.k();
    }

    public final void b(long j) {
        this.a.b(new defpackage.bdl(j, 2));
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
