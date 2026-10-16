package defpackage;

/* loaded from: classes.dex */
public final class bul implements bwj {
    public final ccq a = new ccq();
    private final afdr c;

    public bul(afdr afdrVar) {
        this.c = afdrVar;
    }

    @Override // defpackage.bwj
    public final Object a(afec afecVar, afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        aitgVar.d(new ado(this.a.a(new buk(afecVar, aitgVar), this.c), 3));
        return aitgVar.k();
    }

    public final void b(long j) {
        this.a.b(new bdg(j, 2));
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final /* synthetic */ afcn getKey() {
        return bwj.b;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }
}
