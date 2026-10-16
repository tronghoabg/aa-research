package defpackage;

/* loaded from: classes.dex */
final class bup implements afcm {
    public static final bwi a = new bwi();

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final /* bridge */ <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final afcn<?> getKey() {
        return a;
    }

    @Override // defpackage.afco
    public final /* bridge */ afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final /* bridge */ afco plus(afco afcoVar) {
        return affa.v(this, afcoVar);
    }
}
