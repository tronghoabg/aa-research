package defpackage;

/* loaded from: classes.dex */
public class afcg implements afcm {
    private final afcn<?> key;

    public afcg(afcn<?> afcnVar) {
        afcnVar.getClass();
        this.key = afcnVar;
    }

    @Override // defpackage.afco
    public <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        afegVar.getClass();
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public /* bridge */ <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public afcn<?> getKey() {
        return this.key;
    }

    @Override // defpackage.afco
    public /* bridge */ afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }
}
