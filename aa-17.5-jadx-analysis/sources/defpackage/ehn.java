package defpackage;

/* loaded from: classes.dex */
public final class ehn implements afcm {
    private final ehn a;
    private final egd b;

    public ehn(ehn ehnVar, egd egdVar) {
        this.a = ehnVar;
        this.b = egdVar;
    }

    public final void a(efa efaVar) {
        if (this.b == efaVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        ehn ehnVar = this.a;
        if (ehnVar != null) {
            ehnVar.a(efaVar);
        }
    }

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
        return bwi.c;
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
