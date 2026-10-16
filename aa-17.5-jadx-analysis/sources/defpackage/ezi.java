package defpackage;

/* loaded from: classes2.dex */
public final class ezi implements afcm {
    public static final ezh a = new ezh();
    public final afcl b;

    public ezi(afcl afclVar) {
        this.b = afclVar;
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
    public final afcn<ezi> getKey() {
        return a;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        return affa.v(this, afcoVar);
    }
}
